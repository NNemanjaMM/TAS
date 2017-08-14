//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.14 at 07:44:07 AM CEST 
//


package com.tas.model.diagram;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *     &lt;extension base="{https://www.tas.org/tas-schemas}blockElement">
 *       &lt;attribute name="sanitizeInput" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="sanitizeOutput" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="isThreadSafe" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlSeeAlso({
    ExternalEntity.class
})
public class OriginalExternalEntity
    extends BlockElement
{

    @XmlAttribute(name = "sanitizeInput")
    protected Boolean sanitizeInput;
    @XmlAttribute(name = "sanitizeOutput")
    protected Boolean sanitizeOutput;
    @XmlAttribute(name = "isThreadSafe")
    protected Boolean isThreadSafe;

    /**
     * Gets the value of the sanitizeInput property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSanitizeInput() {
        if (sanitizeInput == null) {
            return false;
        } else {
            return sanitizeInput;
        }
    }

    /**
     * Sets the value of the sanitizeInput property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSanitizeInput(Boolean value) {
        this.sanitizeInput = value;
    }

    /**
     * Gets the value of the sanitizeOutput property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSanitizeOutput() {
        if (sanitizeOutput == null) {
            return false;
        } else {
            return sanitizeOutput;
        }
    }

    /**
     * Sets the value of the sanitizeOutput property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSanitizeOutput(Boolean value) {
        this.sanitizeOutput = value;
    }

    /**
     * Gets the value of the isThreadSafe property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsThreadSafe() {
        if (isThreadSafe == null) {
            return false;
        } else {
            return isThreadSafe;
        }
    }

    /**
     * Sets the value of the isThreadSafe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsThreadSafe(Boolean value) {
        this.isThreadSafe = value;
    }

}
