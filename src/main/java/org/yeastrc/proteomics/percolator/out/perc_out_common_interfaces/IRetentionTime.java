package org.yeastrc.proteomics.percolator.out.perc_out_common_interfaces;

public interface IRetentionTime {

	/**
	 * Gets the value of the predicted property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Double }
	 *     
	 */
	public abstract Double getPredicted();

	/**
	 * Gets the value of the observed property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Double }
	 *     
	 */
	public abstract Double getObserved();

}