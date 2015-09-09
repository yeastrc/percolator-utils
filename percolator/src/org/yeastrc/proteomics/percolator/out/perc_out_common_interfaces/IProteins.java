package org.yeastrc.proteomics.percolator.out.perc_out_common_interfaces;

import java.util.List;

public interface IProteins {

	/**
	 * Gets the value of the protein property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the protein property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getProtein().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Protein }
	 * 
	 * 
	 */
	public abstract List<? extends IProtein> getProtein();

}