//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.28 at 07:52:39 AM CEST 
//


package com.tas.EDS_Library.diagram;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for externalEntity complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="externalEntity">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.tas.org/tas-schemas}externalEntity">
 *       &lt;redefine>
 *         &lt;complexType name="externalEntity">
 *           &lt;complexContent>
 *             &lt;extension base="{https://www.tas.org/tas-schemas}blockElement">
 *               &lt;attribute name="sanitizeInput" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *               &lt;attribute name="sanitizeOutput" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *               &lt;attribute name="isThreadSafe" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *             &lt;/extension>
 *           &lt;/complexContent>
 *         &lt;/complexType>
 *       &lt;/redefine>
 *       &lt;attGroup ref="{https://www.tas.org/tas-schemas}additionalExternalEntityProperties"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "externalEntity")
@XmlSeeAlso({
    com.tas.EDS_Library.diagram.Diagram.Elements.Browser.class
})
public class ExternalEntity
    extends OriginalExternalEntity
{


}