//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.10 at 01:02:14 PM CEST 
//


package com.tas.model.diagram;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for flow complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="flow">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.tas.org/tas-schemas}flow">
 *       &lt;redefine>
 *         &lt;complexType name="flow">
 *           &lt;complexContent>
 *             &lt;extension base="{https://www.tas.org/tas-schemas}element">
 *               &lt;sequence>
 *                 &lt;element name="boundariesCrossed" minOccurs="0">
 *                   &lt;complexType>
 *                     &lt;complexContent>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                         &lt;sequence>
 *                           &lt;element name="boundaryCross" maxOccurs="unbounded">
 *                             &lt;complexType>
 *                               &lt;complexContent>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                   &lt;attribute name="boundary" use="required" type="{https://www.tas.org/tas-schemas}typeIdRef" />
 *                                 &lt;/restriction>
 *                               &lt;/complexContent>
 *                             &lt;/complexType>
 *                           &lt;/element>
 *                         &lt;/sequence>
 *                       &lt;/restriction>
 *                     &lt;/complexContent>
 *                   &lt;/complexType>
 *                 &lt;/element>
 *                 &lt;element name="assets" type="{https://www.tas.org/tas-schemas}assets" minOccurs="0"/>
 *               &lt;/sequence>
 *               &lt;attribute name="source" use="required" type="{https://www.tas.org/tas-schemas}typeIdRef" />
 *               &lt;attribute name="destination" use="required" type="{https://www.tas.org/tas-schemas}typeIdRef" />
 *               &lt;attribute name="containsCookies" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *               &lt;attribute name="containsXML" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *             &lt;/extension>
 *           &lt;/complexContent>
 *         &lt;/complexType>
 *       &lt;/redefine>
 *       &lt;attGroup ref="{https://www.tas.org/tas-schemas}additionalFlowProperties"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flow")
@XmlSeeAlso({
    com.tas.model.diagram.Diagram.Flows.Binary.class,
    com.tas.model.diagram.Diagram.Flows.Http.class,
    com.tas.model.diagram.Diagram.Flows.Https.class
})
public class Flow
    extends OriginalFlow
{


}
