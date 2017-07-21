package com.tas.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;

import javax.xml.bind.JAXBElement;

import com.tas.model.diagram.Assets;
import com.tas.model.diagram.BlockElement;
import com.tas.model.diagram.Diagram;
import com.tas.model.diagram.Element;
import com.tas.model.diagram.Flow;
import com.tas.model.risk_pattern.DiagramPattern;

public class Decomposer {
	
	private List<JAXBElement<? extends BlockElement>> diagramElements;
	private List<JAXBElement<? extends Flow>> diagramFlows;
	
	
	public Decomposer(Diagram diagram) {
		this.diagramElements = diagram.getElements().getOrWebApplicationOrWebServiceOrWebServer();
		this.diagramFlows = diagram.getFlows().getOrBinaryOrHttpOrHttps();
	}

	
	public List<DiagramPattern> decomposeAllPatterns() {
		ArrayList<DiagramPattern> patterns = new ArrayList<DiagramPattern>();

		for (JAXBElement<? extends BlockElement> blockElement : diagramElements) {
			patterns.addAll(decomposePattern(blockElement.getValue()));
		}
		
		return patterns;
	}
	
	public List<DiagramPattern> decomposeSinglePatterns(BlockElement blockElement) {
		return decomposePattern(blockElement);
	}

	private List<DiagramPattern> decomposePattern(BlockElement blockElement) {

		//List<DiagramPattern> traces = getPatternsForElement(blockElement);	
		//List<DiagramPattern> patterns = getPatternsForElement(blockElement);	
			
	
		return getPatternsForElement(blockElement);
	}
	
	private List<DiagramPattern> getPatternsForElement(BlockElement baseAnalyzeElement) {
		List<DiagramPattern> patterns = new ArrayList<DiagramPattern>();
		
		HashSet<String> analyzedElements = new HashSet<>();
		HashSet<String> addedElements = new HashSet<>();
		Stack<BlockElement> toAnalyzeElements = new Stack<BlockElement>();
		Stack<Element> analyzingRow = new Stack<Element>();
		
		toAnalyzeElements.push(baseAnalyzeElement);	
		analyzedElements.add(baseAnalyzeElement.getId());

		while (!toAnalyzeElements.isEmpty()) {
			
			boolean discoveredNew = false;
			BlockElement analyzeElement = toAnalyzeElements.peek();
			
			List<JAXBElement<? extends Flow>> flows = diagramFlows.stream().filter(f -> ((BlockElement)f.getValue().getDestination()).getId().equals(analyzeElement.getId())).collect(Collectors.toList());
			Flow linkingFlow = null;
			
			for (JAXBElement<? extends Flow> flow : flows) {
				if (!analyzedElements.contains(((BlockElement)flow.getValue().getSource()).getId())) {
					discoveredNew = true;
					linkingFlow = flow.getValue();
					toAnalyzeElements.push((BlockElement) flow.getValue().getSource());
					analyzedElements.add(((BlockElement) flow.getValue().getSource()).getId());
					break;
				}
			}

			analyzingRow.push(analyzeElement);	
			if (linkingFlow != null) {
				analyzingRow.push(linkingFlow);
			}
			
			if (baseAnalyzeElement.getId() != analyzeElement.getId() && !addedElements.contains(analyzeElement.getId())) {
				@SuppressWarnings({ "unchecked", "rawtypes" })
				List<Element> traceList = new ArrayList(analyzingRow);
				traceList.remove(0);	//	uklanja se element do kog vodi trace (onaj koji se analizira)
				Collections.reverse(traceList);
				if (traceList.get(0) instanceof Flow) {
					traceList.remove(0);
				}
				DiagramPattern pattern = new DiagramPattern(baseAnalyzeElement, analyzeElement, traceList);
				patterns.add(pattern);
				addedElements.add(((BlockElement)traceList.get(0)).getId());
			}

			if (!discoveredNew && !analyzingRow.isEmpty()) {
				toAnalyzeElements.pop();
				analyzingRow.pop();	
				if (!analyzingRow.isEmpty()) {
					analyzingRow.pop();
					if (!analyzingRow.isEmpty()) {
						analyzingRow.pop();
					}
				}
			}
		
		}	
		
		return patterns;
	}
	
}
