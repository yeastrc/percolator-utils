//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.06.05 at 12:02:11 PM PDT 
//


package com.per_colator.percolator_out._15;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.yeastrc.proteomics.percolator.out.perc_out_common_interfaces.*;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://per-colator.com/percolator_out/15}pep"/>
 *         &lt;element ref="{http://per-colator.com/percolator_out/15}q_value"/>
 *         &lt;element ref="{http://per-colator.com/percolator_out/15}q_value_emp" minOccurs="0"/>
 *         &lt;element ref="{http://per-colator.com/percolator_out/15}p_value" minOccurs="0"/>
 *         &lt;element ref="{http://per-colator.com/percolator_out/15}peptide_seq" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://per-colator.com/percolator_out/15}protein_id use="required""/>
 *       &lt;attribute ref="{http://per-colator.com/percolator_out/15}decoy"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "pep",
    "qValue",
    "qValueEmp",
    "pValue",
    "peptideSeq"
})
@XmlRootElement(name = "protein")
public class Protein implements IProtein {

    @XmlElement(required = true)
    protected String pep;
    @XmlElement(name = "q_value", required = true)
    protected String qValue;
    @XmlElement(name = "q_value_emp")
    protected String qValueEmp;
    @XmlElement(name = "p_value")
    protected String pValue;
    @XmlElement(name = "peptide_seq", required = true)
    protected List<PeptideSeq> peptideSeq;
    @XmlAttribute(name = "protein_id", namespace = "http://per-colator.com/percolator_out/15", required = true)
    protected String proteinId;
    @XmlAttribute(name = "decoy", namespace = "http://per-colator.com/percolator_out/15")
    protected Boolean decoy;

    /**
     * Gets the value of the pep property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPep() {
        return pep;
    }

    /**
     * Sets the value of the pep property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPep(String value) {
        this.pep = value;
    }

    /**
     * Gets the value of the qValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQValue() {
        return qValue;
    }

    /**
     * Sets the value of the qValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQValue(String value) {
        this.qValue = value;
    }

    /**
     * Gets the value of the qValueEmp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQValueEmp() {
        return qValueEmp;
    }

    /**
     * Sets the value of the qValueEmp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQValueEmp(String value) {
        this.qValueEmp = value;
    }

    /**
     * Gets the value of the pValue property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPValue() {
        return pValue;
    }

    /**
     * Sets the value of the pValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPValue(String value) {
        this.pValue = value;
    }

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
    public List<PeptideSeq> getPeptideSeq() {
        if (peptideSeq == null) {
            peptideSeq = new ArrayList<PeptideSeq>();
        }
        return this.peptideSeq;
    }

    /**
     * Gets the value of the proteinId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProteinId() {
        return proteinId;
    }

    /**
     * Sets the value of the proteinId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProteinId(String value) {
        this.proteinId = value;
    }

    /**
     * Gets the value of the decoy property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDecoy() {
        return decoy;
    }

    /**
     * Sets the value of the decoy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDecoy(Boolean value) {
        this.decoy = value;
    }

}
