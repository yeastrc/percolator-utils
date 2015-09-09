package org.yeastrc.proteomics.percolator.out.perc_out_common_interfaces;

import java.util.List;

public interface IProtein {

	/**
	 * Gets the value of the pep property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public abstract String getPep();

	/**
	 * Gets the value of the qValue property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public abstract String getQValue();

	/**
	 * Gets the value of the peptideSeq property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the peptideSeq property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getPeptideSeq().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link PeptideSeq }
	 * 
	 * 
	 */
	public abstract List<? extends IPeptideSeq> getPeptideSeq();

	/**
	 * Gets the value of the proteinId property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public abstract String getProteinId();

	/**
	 * Gets the value of the decoy property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Boolean }
	 *     
	 */
	public abstract Boolean isDecoy();

}