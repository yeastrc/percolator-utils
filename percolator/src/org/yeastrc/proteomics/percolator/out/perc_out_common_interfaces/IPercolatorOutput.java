package org.yeastrc.proteomics.percolator.out.perc_out_common_interfaces;

public interface IPercolatorOutput {

	/**
	 * Gets the value of the processInfo property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link ProcessInfo }
	 *     
	 */
	public abstract IProcessInfo getProcessInfo();

	/**
	 * Gets the value of the psms property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Psms }
	 *     
	 */
	public abstract IPsms getPsms();

	/**
	 * Gets the value of the peptides property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Peptides }
	 *     
	 */
	public abstract IPeptides getPeptides();

	/**
	 * Gets the value of the proteins property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Proteins }
	 *     
	 */
	public abstract IProteins getProteins();

	/**
	 * Gets the value of the percolatorVersion property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public abstract String getPercolatorVersion();

	/**
	 * Gets the value of the majorVersion property.
	 * 
	 */
	public abstract int getMajorVersion();

	/**
	 * Gets the value of the minorVersion property.
	 * 
	 */
	public abstract int getMinorVersion();

}