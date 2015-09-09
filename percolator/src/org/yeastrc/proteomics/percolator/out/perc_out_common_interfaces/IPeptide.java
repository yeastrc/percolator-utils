package org.yeastrc.proteomics.percolator.out.perc_out_common_interfaces;

import java.util.List;

public interface IPeptide {

	/**
	 * Gets the value of the svmScore property.
	 * 
	 */
	public abstract double getSvmScore();

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
	 * Gets the value of the pep property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public abstract String getPep();

	/**
	 * Gets the value of the expMass property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Double }
	 *     
	 */
	public abstract Double getExpMass();

	/**
	 * Gets the value of the calcMass property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Double }
	 *     
	 */
	public abstract Double getCalcMass();

	/**
	 * Gets the value of the retentionTime property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link RetentionTime }
	 *     
	 */
	public abstract IRetentionTime getRetentionTime();

	/**
	 * Gets the value of the proteinId property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the proteinId property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getProteinId().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link String }
	 * 
	 * 
	 */
	public abstract List<String> getProteinId();

	/**
	 * Gets the value of the pValue property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public abstract String getPValue();

	/**
	 * Gets the value of the psmIds property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link PsmIds }
	 *     
	 */
	public abstract IPsmIds getPsmIds();

	/**
	 * Gets the value of the peptideId property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public abstract String getPeptideId();

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