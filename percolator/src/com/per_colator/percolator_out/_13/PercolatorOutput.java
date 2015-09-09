//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.01.15 at 04:16:28 PM PST 
//


package com.per_colator.percolator_out._13;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element ref="{http://per-colator.com/percolator_out/13}process_info"/>
 *         &lt;element ref="{http://per-colator.com/percolator_out/13}psms"/>
 *         &lt;element ref="{http://per-colator.com/percolator_out/13}peptides" minOccurs="0"/>
 *         &lt;element ref="{http://per-colator.com/percolator_out/13}proteins" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{http://per-colator.com/percolator_out/13}percolator_version use="required""/>
 *       &lt;attribute ref="{http://per-colator.com/percolator_out/13}majorVersion use="required" fixed="2""/>
 *       &lt;attribute ref="{http://per-colator.com/percolator_out/13}minorVersion use="required""/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "processInfo",
    "psms",
    "peptides",
    "proteins"
})
@XmlRootElement(name = "percolator_output")
public class PercolatorOutput implements IPercolatorOutput {

    @XmlElement(name = "process_info", required = true)
    protected ProcessInfo processInfo;
    @XmlElement(required = true)
    protected Psms psms;
    protected Peptides peptides;
    protected Proteins proteins;
    @XmlAttribute(name = "percolator_version", namespace = "http://per-colator.com/percolator_out/13", required = true)
    protected String percolatorVersion;
    @XmlAttribute(name = "majorVersion", namespace = "http://per-colator.com/percolator_out/13", required = true)
    @XmlSchemaType(name = "unsignedShort")
    protected int majorVersion;
    @XmlAttribute(name = "minorVersion", namespace = "http://per-colator.com/percolator_out/13", required = true)
    @XmlSchemaType(name = "unsignedShort")
    protected int minorVersion;

    /* (non-Javadoc)
	 * @see com.per_colator.percolator_out._13.IPercolatorOutput#getProcessInfo()
	 */
    @Override
	public ProcessInfo getProcessInfo() {
        return processInfo;
    }

    /**
     * Sets the value of the processInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessInfo }
     *     
     */
    public void setProcessInfo(ProcessInfo value) {
        this.processInfo = value;
    }

    /* (non-Javadoc)
	 * @see com.per_colator.percolator_out._13.IPercolatorOutput#getPsms()
	 */
    @Override
	public Psms getPsms() {
        return psms;
    }

    /**
     * Sets the value of the psms property.
     * 
     * @param value
     *     allowed object is
     *     {@link Psms }
     *     
     */
    public void setPsms(Psms value) {
        this.psms = value;
    }

    /* (non-Javadoc)
	 * @see com.per_colator.percolator_out._13.IPercolatorOutput#getPeptides()
	 */
    @Override
	public Peptides getPeptides() {
        return peptides;
    }

    /**
     * Sets the value of the peptides property.
     * 
     * @param value
     *     allowed object is
     *     {@link Peptides }
     *     
     */
    public void setPeptides(Peptides value) {
        this.peptides = value;
    }

    /* (non-Javadoc)
	 * @see com.per_colator.percolator_out._13.IPercolatorOutput#getProteins()
	 */
    @Override
	public Proteins getProteins() {
        return proteins;
    }

    /**
     * Sets the value of the proteins property.
     * 
     * @param value
     *     allowed object is
     *     {@link Proteins }
     *     
     */
    public void setProteins(Proteins value) {
        this.proteins = value;
    }

    /* (non-Javadoc)
	 * @see com.per_colator.percolator_out._13.IPercolatorOutput#getPercolatorVersion()
	 */
    @Override
	public String getPercolatorVersion() {
        return percolatorVersion;
    }

    /**
     * Sets the value of the percolatorVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPercolatorVersion(String value) {
        this.percolatorVersion = value;
    }

    /* (non-Javadoc)
	 * @see com.per_colator.percolator_out._13.IPercolatorOutput#getMajorVersion()
	 */
    @Override
	public int getMajorVersion() {
        return majorVersion;
    }

    /**
     * Sets the value of the majorVersion property.
     * 
     */
    public void setMajorVersion(int value) {
        this.majorVersion = value;
    }

    /* (non-Javadoc)
	 * @see com.per_colator.percolator_out._13.IPercolatorOutput#getMinorVersion()
	 */
    @Override
	public int getMinorVersion() {
        return minorVersion;
    }

    /**
     * Sets the value of the minorVersion property.
     * 
     */
    public void setMinorVersion(int value) {
        this.minorVersion = value;
    }

}