package org.yeastrc.proteomics.percolator.out.perc_out_common_interfaces;

import java.util.List;

public interface IPsms {

	/**
	 * Gets the value of the psm property.
	 * 
	 * <p>
	 * This accessor method returns a reference to the live list,
	 * not a snapshot. Therefore any modification you make to the
	 * returned list will be present inside the JAXB object.
	 * This is why there is not a <CODE>set</CODE> method for the psm property.
	 * 
	 * <p>
	 * For example, to add a new item, do as follows:
	 * <pre>
	 *    getPsm().add(newItem);
	 * </pre>
	 * 
	 * 
	 * <p>
	 * Objects of the following type(s) are allowed in the list
	 * {@link Psm }
	 * 
	 * 
	 */
	public abstract List<? extends IPsm> getPsm();

}