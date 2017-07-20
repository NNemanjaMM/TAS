package com.tas.model.risk_pattern;

import java.util.ArrayList;
import java.util.List;

import com.tas.model.diagram.Assets;
import com.tas.model.diagram.BlockElement;
import com.tas.model.diagram.Element;
import com.tas.model.diagram.VulnerabilityDefinition;

public class DiagramPattern {

	private BlockElement element;
	private List<Assets.Asset> assets;

	private BlockElement traceStart;
	private List<Element> trace;	
	private List<String> vulnerabilities;
	private List<VulnerabilityDefinition> vulnerabilityValues;
	
	
	public DiagramPattern(BlockElement element, BlockElement traceStart, List<Element> trace) {
		this.element = element;
		this.assets = element.getAssets().getAsset();
		this.traceStart = traceStart;
		this.trace = trace;
		
		vulnerabilities = new ArrayList<>();
		vulnerabilityValues = new ArrayList<>();
	}


	public BlockElement getElement() {
		return element;
	}

	public List<Assets.Asset> getAssets() {
		return assets;
	}

	public BlockElement getTraceStart() {
		return traceStart;
	}

	public List<Element> getTrace() {
		return trace;
	}

	public List<String> getVulnerabilities() {
		return vulnerabilities;
	}

	public List<VulnerabilityDefinition> getVulnerabilityValues() {
		return vulnerabilityValues;
	}

	public void setElement(BlockElement element) {
		this.element = element;
	}

	public void setAssets(List<Assets.Asset> assets) {
		this.assets = assets;
	}

	public void setTraceStart(BlockElement traceStart) {
		this.traceStart = traceStart;
	}

	public void setTrace(List<Element> trace) {
		this.trace = trace;
	}

	public void setVulnerabilities(List<String> vulnerabilities) {
		this.vulnerabilities = vulnerabilities;
	}

	public void setVulnerabilityValues(List<VulnerabilityDefinition> vulnerabilityValues) {
		this.vulnerabilityValues = vulnerabilityValues;
	}

	public void addVulnerability(String vulnerability) {
		this.vulnerabilities.add(vulnerability);
	}

	public void addVulnerabilityValue(VulnerabilityDefinition vulnerabilityDefinition) {
		this.vulnerabilityValues.add(vulnerabilityDefinition);		
	}
	
}
