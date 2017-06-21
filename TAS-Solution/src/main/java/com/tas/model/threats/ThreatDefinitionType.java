//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.21 at 12:10:28 PM CEST 
//


package com.tas.model.threats;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for threatDefinitionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="threatDefinitionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="confidentialityThreats" type="{https://www.tas.org/tas-schemas}threatsForCIA"/>
 *         &lt;element name="integrityThreats" type="{https://www.tas.org/tas-schemas}threatsForCIA"/>
 *         &lt;element name="availabilityThreats" type="{https://www.tas.org/tas-schemas}threatsForCIA"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="assetId" use="required" type="{http://www.w3.org/2001/XMLSchema}IDREF" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "threatDefinitionType", propOrder = {
    "confidentialityThreats",
    "integrityThreats",
    "availabilityThreats"
})
public class ThreatDefinitionType {

    @XmlElement(required = true)
    protected ThreatsForCIA confidentialityThreats;
    @XmlElement(required = true)
    protected ThreatsForCIA integrityThreats;
    @XmlElement(required = true)
    protected ThreatsForCIA availabilityThreats;
    @XmlAttribute(name = "id", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;
    @XmlAttribute(name = "assetId", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object assetId;

    /**
     * Gets the value of the confidentialityThreats property.
     * 
     * @return
     *     possible object is
     *     {@link ThreatsForCIA }
     *     
     */
    public ThreatsForCIA getConfidentialityThreats() {
        return confidentialityThreats;
    }

    /**
     * Sets the value of the confidentialityThreats property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreatsForCIA }
     *     
     */
    public void setConfidentialityThreats(ThreatsForCIA value) {
        this.confidentialityThreats = value;
    }

    /**
     * Gets the value of the integrityThreats property.
     * 
     * @return
     *     possible object is
     *     {@link ThreatsForCIA }
     *     
     */
    public ThreatsForCIA getIntegrityThreats() {
        return integrityThreats;
    }

    /**
     * Sets the value of the integrityThreats property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreatsForCIA }
     *     
     */
    public void setIntegrityThreats(ThreatsForCIA value) {
        this.integrityThreats = value;
    }

    /**
     * Gets the value of the availabilityThreats property.
     * 
     * @return
     *     possible object is
     *     {@link ThreatsForCIA }
     *     
     */
    public ThreatsForCIA getAvailabilityThreats() {
        return availabilityThreats;
    }

    /**
     * Sets the value of the availabilityThreats property.
     * 
     * @param value
     *     allowed object is
     *     {@link ThreatsForCIA }
     *     
     */
    public void setAvailabilityThreats(ThreatsForCIA value) {
        this.availabilityThreats = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the assetId property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getAssetId() {
        return assetId;
    }

    /**
     * Sets the value of the assetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setAssetId(Object value) {
        this.assetId = value;
    }

}
