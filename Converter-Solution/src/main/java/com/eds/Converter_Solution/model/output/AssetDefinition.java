//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.05 at 10:41:57 AM CEST 
//


package com.eds.Converter_Solution.model.output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for assetDefinition complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="assetDefinition">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="assetId" use="required" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *       &lt;attribute name="assetTitle" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="44"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="protectConfidentiality" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="protectIntegrity" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="protectAvailability" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="impactConfidentiality" type="{https://www.eds.org/eds-schemas}impactType" />
 *       &lt;attribute name="impactIntegrity" type="{https://www.eds.org/eds-schemas}impactType" />
 *       &lt;attribute name="impactAvailability" type="{https://www.eds.org/eds-schemas}impactType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "assetDefinition")
public class AssetDefinition {

    @XmlAttribute(name = "assetId", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String assetId;
    @XmlAttribute(name = "assetTitle", required = true)
    protected String assetTitle;
    @XmlAttribute(name = "protectConfidentiality")
    protected Boolean protectConfidentiality;
    @XmlAttribute(name = "protectIntegrity")
    protected Boolean protectIntegrity;
    @XmlAttribute(name = "protectAvailability")
    protected Boolean protectAvailability;
    @XmlAttribute(name = "impactConfidentiality")
    protected Integer impactConfidentiality;
    @XmlAttribute(name = "impactIntegrity")
    protected Integer impactIntegrity;
    @XmlAttribute(name = "impactAvailability")
    protected Integer impactAvailability;

    /**
     * Gets the value of the assetId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetId() {
        return assetId;
    }

    /**
     * Sets the value of the assetId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetId(String value) {
        this.assetId = value;
    }

    /**
     * Gets the value of the assetTitle property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAssetTitle() {
        return assetTitle;
    }

    /**
     * Sets the value of the assetTitle property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAssetTitle(String value) {
        this.assetTitle = value;
    }

    /**
     * Gets the value of the protectConfidentiality property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProtectConfidentiality() {
        if (protectConfidentiality == null) {
            return false;
        } else {
            return protectConfidentiality;
        }
    }

    /**
     * Sets the value of the protectConfidentiality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProtectConfidentiality(Boolean value) {
        this.protectConfidentiality = value;
    }

    /**
     * Gets the value of the protectIntegrity property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProtectIntegrity() {
        if (protectIntegrity == null) {
            return false;
        } else {
            return protectIntegrity;
        }
    }

    /**
     * Sets the value of the protectIntegrity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProtectIntegrity(Boolean value) {
        this.protectIntegrity = value;
    }

    /**
     * Gets the value of the protectAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isProtectAvailability() {
        if (protectAvailability == null) {
            return false;
        } else {
            return protectAvailability;
        }
    }

    /**
     * Sets the value of the protectAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setProtectAvailability(Boolean value) {
        this.protectAvailability = value;
    }

    /**
     * Gets the value of the impactConfidentiality property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImpactConfidentiality() {
        return impactConfidentiality;
    }

    /**
     * Sets the value of the impactConfidentiality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImpactConfidentiality(Integer value) {
        this.impactConfidentiality = value;
    }

    /**
     * Gets the value of the impactIntegrity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImpactIntegrity() {
        return impactIntegrity;
    }

    /**
     * Sets the value of the impactIntegrity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImpactIntegrity(Integer value) {
        this.impactIntegrity = value;
    }

    /**
     * Gets the value of the impactAvailability property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getImpactAvailability() {
        return impactAvailability;
    }

    /**
     * Sets the value of the impactAvailability property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setImpactAvailability(Integer value) {
        this.impactAvailability = value;
    }

}
