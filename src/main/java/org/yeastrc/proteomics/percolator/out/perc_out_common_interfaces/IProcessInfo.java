package org.yeastrc.proteomics.percolator.out.perc_out_common_interfaces;

import java.util.List;

import com.per_colator.percolator_out._13.ProcessInfo.Comment;

public interface IProcessInfo {

	/**
	 * Gets the value of the commandLine property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public abstract String getCommandLine();

	/**
	 * Gets the value of the otherCommandLine property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public abstract String getOtherCommandLine();

	/**
	 * Gets the value of the pi0Psms property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public abstract String getPi0Psms();

	/**
	 * Gets the value of the pi0Peptides property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public abstract String getPi0Peptides();

	/**
	 * Gets the value of the pi0Proteins property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link String }
	 *     
	 */
	public abstract String getPi0Proteins();

	/**
	 * Gets the value of the averageDeltaMass property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Double }
	 *     
	 */
	public abstract Double getAverageDeltaMass();

	/**
	 * Gets the value of the averagePi property.
	 * 
	 * @return
	 *     possible object is
	 *     {@link Double }
	 *     
	 */
	public abstract Double getAveragePi();

	/**
	 * Gets the value of the comment property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the comment property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getComment().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link ProcessInfo.Comment }
	 * 
	 * 
	 */
	public abstract List<? extends IProcessInfo_Comment> getComment();

}