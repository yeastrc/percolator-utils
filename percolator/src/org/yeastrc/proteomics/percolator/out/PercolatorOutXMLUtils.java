package org.yeastrc.proteomics.percolator.out;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author Michael Riffle <mriffle@uw.edu>
 *
 */
public class PercolatorOutXMLUtils {

	/**
	 * Attempts to get XSD version for the supplied percolator output XML file
	 * @param file
	 * @return
	 */
	public static String getXSDVersion( File file ) throws Exception {
		
		BufferedReader br = null;
		String xsdVersion = null;
		
		try {
			
			br = new BufferedReader( new FileReader( file ) );
			
			// go to 3rd line
			br.readLine();
			br.readLine();
			br.readLine();
			
			String line = br.readLine();
			
			// Syntax of desired line:
			// xmlns:p="http://per-colator.com/percolator_out/15"

			line = line.trim();
			
			Pattern p = Pattern.compile( "^.+\\/(\\d+)\"$" );
			Matcher m = p.matcher( line );
			
			if( m.matches() ) {
				xsdVersion = m.group( 1 );
			} else {
				throw new RuntimeException( "Could not determine XSD version." );
			}
			
		} finally {
			if( br != null ) {
				try { br.close(); br = null; }
				catch( Exception e ) { ; }
			}
		}
		
		return xsdVersion;
	}
	
	/**
	 * Returns a string representing the correct JAXB context to use for
	 * unmarshalling the supplied percolator output XML file
	 * @param file
	 * @return
	 * @throws Exception
	 */
	public static String getJAXBContext( File file ) throws Exception {
		return "com.per_colator.percolator_out._" + getXSDVersion( file );
	}
	
	public static String getJAXBContext( String xsdVersion ) {
		return "com.per_colator.percolator_out._" + xsdVersion;
	}
}
