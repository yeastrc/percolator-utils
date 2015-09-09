package org.yeastrc.proteomics.percolator.in;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.OutputStreamWriter;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class PercolatorInputTSVWriter {

	// must use our public method for getting new instances
	private PercolatorInputTSVWriter() { }
	
	/**
	 * Get an instance of PercolatorInputTSVWriter
	 * @param file The file to write to. If null, will write to standard out
	 * @param features The list of features to include for each psm
	 * @param includeScanNumber Whether or not to print the scan number column
	 * @return
	 * @throws Exception
	 */
	public static PercolatorInputTSVWriter createInstance( File file, List<String> features, boolean includeScanNumber ) throws Exception {
		PercolatorInputTSVWriter writer =  new PercolatorInputTSVWriter();
		
		if( file != null )
			writer.bw = new BufferedWriter( new FileWriter( file ) );
		else
			writer.bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
		
		writer.includeScanNumber = includeScanNumber;
		writer.features = features;
		
		return writer;
	}
	
	/**
	 * Writes the supplied PercolatorInputTSVPSM to the percolator input file (or stdout)
	 * 
	 * @param file The file to write to, if null, will write to standard out
	 * @param psms
	 * @throws Exception
	 */
	public void write( PercolatorInputTSVPSM psm ) throws Exception {
		
		// ensure we have written the headers before first write
		if( !haveWrittenHeader) {
			writeHeader();
		}
				
		// write out data for this PSM
		StringBuilder sb = new StringBuilder();
				
		sb.append( psm.getSpectrumId() + "\t" );
		sb.append( psm.getLabel() + "\t" );
				
		if( includeScanNumber )
			sb.append( psm.getScanNumber() + "\t" );
				
		for( String f : features ) {
			sb.append( psm.getFeatureMap().get( f ) + "\t" );
		}
				
		sb.append( psm.getPeptide() + "\t" );
		sb.append( StringUtils.join( psm.getProteins(), "\t" ) );
				
		bw.write( sb.toString() + "\n" );
	}

	// write the headers
	public void writeHeader() throws Exception {
		// write out header line as we know we are on the first PSM
		StringBuilder sb = new StringBuilder();
		
		sb.append( "PSMId\tLabel\t" );
		
		if( includeScanNumber )
			sb.append( "ScanNr\t" );
		
		for( String f : features ) {
			sb.append( f + "\t" );
		}
		
		sb.append( "Peptide\t" );
		sb.append( "Proteins\n" );
		
		bw.write( sb.toString() );
		
		haveWrittenHeader = true;
	}
	
	
	// close this PercolatorInputTSVWriter
	public void close() {
		if( this.bw != null ) {
			try { this.bw.close(); this.bw = null; }
			catch( Exception e ) { ; }
		}
	}
	
	private BufferedWriter bw;
	private List<String> features;
	private boolean haveWrittenHeader = false;
	private boolean includeScanNumber;
	
}
