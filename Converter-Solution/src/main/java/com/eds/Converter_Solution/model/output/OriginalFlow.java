//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.05 at 10:41:57 AM CEST 
//


package com.eds.Converter_Solution.model.output;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
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
 *     &lt;extension base="{https://www.eds.org/eds-schemas}element">
 *       &lt;sequence>
 *         &lt;element name="boundariesCrossed" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="boundaryCross" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="boundary" use="required" type="{https://www.eds.org/eds-schemas}typeIdRef" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="assets" type="{https://www.eds.org/eds-schemas}assets" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="source" type="{https://www.eds.org/eds-schemas}typeIdRef" />
 *       &lt;attribute name="destination" type="{https://www.eds.org/eds-schemas}typeIdRef" />
 *       &lt;attribute name="containsCookies" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *       &lt;attribute name="containsXML" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "boundariesCrossed",
    "assets"
})
@XmlSeeAlso({
    Flow.class
})
public class OriginalFlow
    extends Element
{

    protected OriginalFlow.BoundariesCrossed boundariesCrossed;
    protected Assets assets;
    @XmlAttribute(name = "source")
    @XmlIDREF
    protected Object source;
    @XmlAttribute(name = "destination")
    @XmlIDREF
    protected Object destination;
    @XmlAttribute(name = "containsCookies")
    protected Boolean containsCookies;
    @XmlAttribute(name = "containsXML")
    protected Boolean containsXML;

    /**
     * Gets the value of the boundariesCrossed property.
     * 
     * @return
     *     possible object is
     *     {@link OriginalFlow.BoundariesCrossed }
     *     
     */
    public OriginalFlow.BoundariesCrossed getBoundariesCrossed() {
        return boundariesCrossed;
    }

    /**
     * Sets the value of the boundariesCrossed property.
     * 
     * @param value
     *     allowed object is
     *     {@link OriginalFlow.BoundariesCrossed }
     *     
     */
    public void setBoundariesCrossed(OriginalFlow.BoundariesCrossed value) {
        this.boundariesCrossed = value;
    }

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
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSource(Object value) {
        this.source = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDestination(Object value) {
        this.destination = value;
    }

    /**
     * Gets the value of the containsCookies property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isContainsCookies() {
        if (containsCookies == null) {
            return false;
        } else {
            return containsCookies;
        }
    }

    /**
     * Sets the value of the containsCookies property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainsCookies(Boolean value) {
        this.containsCookies = value;
    }

    /**
     * Gets the value of the containsXML property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isContainsXML() {
        if (containsXML == null) {
            return false;
        } else {
            return containsXML;
        }
    }

    /**
     * Sets the value of the containsXML property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContainsXML(Boolean value) {
        this.containsXML = value;
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
     *       &lt;sequence>
     *         &lt;element name="boundaryCross" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="boundary" use="required" type="{https://www.eds.org/eds-schemas}typeIdRef" />
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
    @XmlType(name = "", propOrder = {
        "boundaryCross"
    })
    public static class BoundariesCrossed {

        @XmlElement(required = true)
        protected List<OriginalFlow.BoundariesCrossed.BoundaryCross> boundaryCross;

        /**
         * Gets the value of the boundaryCross property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the boundaryCross property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBoundaryCross().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OriginalFlow.BoundariesCrossed.BoundaryCross }
         * 
         * 
         */
        public List<OriginalFlow.BoundariesCrossed.BoundaryCross> getBoundaryCross() {
            if (boundaryCross == null) {
                boundaryCross = new ArrayList<OriginalFlow.BoundariesCrossed.BoundaryCross>();
            }
            return this.boundaryCross;
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
         *       &lt;attribute name="boundary" use="required" type="{https://www.eds.org/eds-schemas}typeIdRef" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class BoundaryCross {

            @XmlAttribute(name = "boundary", required = true)
            @XmlIDREF
            protected Object boundary;

            /**
             * Gets the value of the boundary property.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getBoundary() {
                return boundary;
            }

            /**
             * Sets the value of the boundary property.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setBoundary(Object value) {
                this.boundary = value;
            }

        }

    }

}
