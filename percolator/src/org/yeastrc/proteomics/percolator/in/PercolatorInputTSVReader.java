package org.yeastrc.proteomics.percolator.in;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PercolatorInputTSVReader {

	public static PercolatorInputTSVReader createInstance( File file ) throws Exception {
		PercolatorInputTSVReader reader = new PercolatorInputTSVReader();
		reader.br = new BufferedReader( new FileReader( file ) );
		reader.file = file;
		
		return reader;
	}
	
	public static PercolatorInputTSVReader createInstance( String filename ) throws Exception {
		return PercolatorInputTSVReader.createInstance( new File( filename ) );
	}

	
	/**
	 * Get the next PSM from the Percolator TSV input file
	 * @return
	 * @throws Exception
	 */
	public PercolatorInputTSVPSM readNext() throws Exception {
		
		// we need to read the first line to determine which features are present and where
		if( this.features == null ) { readHeaderLine(); }

		String line = br.readLine();
		
		// we've reached the end of the file
		if( line == null )
			return null;
		
		String[] fields = line.split( "\t" );
		PercolatorInputTSVPSM psm = new PercolatorInputTSVPSM();
		
		psm.setSpectrumId( fields[ 0 ] );
		psm.setLabel( Integer.parseInt( fields[ 1 ] ) );
		
		if( haveScanNumber )
			psm.setScanNumber( Integer.parseInt( fields[ 2 ] ) );
		
		Map<String, String> featureMap = new HashMap<String, String>();
		for( int i = 0; i < features.size(); i++ ) {
			featureMap.put( features.get( i ), fields[ featureStartIndex + i ] );
		}
		
		psm.setFeatureMap( featureMap );
		psm.setPeptide( fields[ featureStartIndex + features.size() ]);
		
		List<String> proteins = new ArrayList<String>( fields.length - ( featureStartIndex + features.size()  + 1 ) );
		for( int i = featureStartIndex + features.size() + 1; i < fields.length; i++ ) {
			proteins.add( fields[ i ] );
		}
		
		psm.setProteins( proteins );
		
		return psm;
	}
	
	/**
	 * Read the header line of the percolator input TSV determine which features are present
	 * @throws Exception
	 */
	private void readHeaderLine() throws Exception {
		
		String line = br.readLine();
		features = new ArrayList<String>();
		
		System.err.println( "Reading headers for " + file.getAbsolutePath() );
		
		String[] fields = line.split( "\t" );
		
		if( !fields[ 0 ].equals( "SpecId" ) )
			throw new RuntimeException( "First column is not 'SpecId', do not know how to proceed so stopping." );
		
		if( !fields[ 1 ].equals( "Label" ) )
			throw new RuntimeException( "Second column is not 'Label', do not know how to proceed so stopping." );
		
		if( !fields[ fields.length - 1 ].equals( "Proteins" ) )
			throw new RuntimeException( "Last column is not 'Proteins', do not know how to proceed so stopping." );
		
		if( !fields[ fields.length - 2 ].equals( "Peptide" ) )
			throw new RuntimeException( "Second-to-last column is not 'Peptide', do not know how to proceed so stopping." );
		
		if( fields[ 2 ].equals( "Scannum" ) ) {
			featureStartIndex = 3;
			haveScanNumber = true;
		}
		
		for( int i = featureStartIndex; i < fields.length - 2; i++ ) {
			System.err.println( "\tFound feature: " + fields[ i ] );
			features.add( fields[ i ] );
		}
	}
	
	public List<String> getFeatures() {
		return features;
	}
	
	/**
	 * Close the connection with the  file
	 * @throws Exception
	 */
	public void close() throws Exception {
		if( this.br != null )
			this.br.close();
		
		this.br = null;
	}

	
	private BufferedReader br;
	private File file;
	private List<String> features;
	private boolean haveScanNumber;
	int featureStartIndex = 2;
}
