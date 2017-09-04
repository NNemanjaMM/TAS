//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.04 at 01:10:46 PM CEST 
//


package com.eds.Converter_Solution.model.output;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for blockElement complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="blockElement">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.eds.org/eds-schemas}element">
 *       &lt;sequence>
 *         &lt;element name="assets" type="{https://www.eds.org/eds-schemas}assets" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="section" type="{https://www.eds.org/eds-schemas}typeIdRef" />
 *       &lt;attribute name="runLevel" default="HIGH_PRIVILEGE">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="SANDBOX"/>
 *             &lt;enumeration value="LOW_PRIVILEGE"/>
 *             &lt;enumeration value="HIGH_PRIVILEGE"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "blockElement", propOrder = {
    "assets"
})
@XmlSeeAlso({
    OriginalProcess.class,
    OriginalExternalEntity.class,
    OriginalDataStore.class
})
public abstract class BlockElement
    extends Element
{

    protected Assets assets;
    @XmlAttribute(name = "section")
    @XmlIDREF
    protected Object section;
    @XmlAttribute(name = "runLevel")
    protected String runLevel;

    /**
     * Gets the value of the assets property.
     * 
     * @return
     *     possible object is
     *     {@link Assets }
     *     
     */
    public Assets getAssets() {
        return assets;
    }

    /**
     * Sets the value of the assets property.
     * 
     * @param value
     *     allowed object is
     *     {@link Assets }
     *     
     */
    public void setAssets(Assets value) {
        this.assets = value;
    }

    /**
     * Gets the value of the section property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSection() {
        return section;
    }

    /**
     * Sets the value of the section property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSection(Object value) {
        this.section = value;
    }

    /**
     * Gets the value of the runLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRunLevel() {
        if (runLevel == null) {
            return "HIGH_PRIVILEGE";
        } else {
            return runLevel;
        }
    }

    /**
     * Sets the value of the runLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRunLevel(String value) {
        this.runLevel = value;
    }

}
