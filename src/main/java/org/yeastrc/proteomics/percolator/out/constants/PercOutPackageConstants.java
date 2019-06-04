package org.yeastrc.proteomics.percolator.out.constants;

public class PercOutPackageConstants {

	public static final String PERC_OUT_13_PACKAGE_PATH = "com.per_colator.percolator_out._13";
	public static final String PERC_OUT_14_PACKAGE_PATH = "com.per_colator.percolator_out._14";
	public static final String PERC_OUT_15_PACKAGE_PATH = "com.per_colator.percolator_out._15";

	public static final String JAXB_PACKAGE_DELIMITER = ":";
	
	public static final String PERC_OUT_PACKAGE_PATH_ALL_COLON_DELIM = PERC_OUT_13_PACKAGE_PATH
			+ JAXB_PACKAGE_DELIMITER + PERC_OUT_14_PACKAGE_PATH
			+ JAXB_PACKAGE_DELIMITER + PERC_OUT_15_PACKAGE_PATH;

}
