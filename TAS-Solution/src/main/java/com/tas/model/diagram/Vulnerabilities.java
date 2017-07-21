//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.21 at 06:31:20 PM CEST 
//


package com.tas.model.diagram;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for vulnerabilities complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="vulnerabilities">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vulnerability" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="vulnerabilityId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "vulnerabilities", propOrder = {
    "vulnerability"
})
public class Vulnerabilities {

    protected List<Vulnerabilities.Vulnerability> vulnerability;

    /**
     * Gets the value of the vulnerability property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vulnerability property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVulnerability().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Vulnerabilities.Vulnerability }
     * 
     * 
     */
    public List<Vulnerabilities.Vulnerability> getVulnerability() {
        if (vulnerability == null) {
            vulnerability = new ArrayList<Vulnerabilities.Vulnerability>();
        }
        return this.vulnerability;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="vulnerabilityId" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Vulnerability {

        @XmlAttribute(name = "vulnerabilityId", required = true)
        protected String vulnerabilityId;

        /**
         * Gets the value of the vulnerabilityId property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVulnerabilityId() {
            return vulnerabilityId;
        }

        /**
         * Sets the value of the vulnerabilityId property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVulnerabilityId(String value) {
            this.vulnerabilityId = value;
        }

    }

}
