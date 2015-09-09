package org.yeastrc.proteomics.percolator.out.utils;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

import org.yeastrc.proteomics.percolator.out.constants.PercOutPackageConstants;

public class GetPercolatorJAXBContextObject {

	/**
	 * Currently for Percolator output 13, 14, and 15
	 * @return
	 * @throws JAXBException 
	 */
	public static JAXBContext getPercolatorJAXBContextObjectForAllFormats() throws JAXBException {
		
		JAXBContext jaxbContext = JAXBContext.newInstance( PercOutPackageConstants.PERC_OUT_PACKAGE_PATH_ALL_COLON_DELIM );
	
		return jaxbContext;
	}
}
