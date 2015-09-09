package org.yeastrc.proteomics.percolator.in;

import java.util.Collection;
import java.util.Map;

public class PercolatorInputTSVPSM {

	private String spectrumId;
	private int label;
	private Integer scanNumber;
	private Map<String, String> featureMap;
	private String peptide;
	private Collection<String> proteins;
	
	
	public String getSpectrumId() {
		return spectrumId;
	}
	public void setSpectrumId(String spectrumId) {
		this.spectrumId = spectrumId;
	}
	public int getLabel() {
		return label;
	}
	public void setLabel(int label) {
		this.label = label;
	}
	public Integer getScanNumber() {
		return scanNumber;
	}
	public void setScanNumber(Integer scanNumber) {
		this.scanNumber = scanNumber;
	}
	public Map<String, String> getFeatureMap() {
		return featureMap;
	}
	public void setFeatureMap(Map<String, String> featureMap) {
		this.featureMap = featureMap;
	}
	public String getPeptide() {
		return peptide;
	}
	public void setPeptide(String peptide) {
		this.peptide = peptide;
	}
	public Collection<String> getProteins() {
		return proteins;
	}
	public void setProteins(Collection<String> proteins) {
		this.proteins = proteins;
	}
	
	
}
