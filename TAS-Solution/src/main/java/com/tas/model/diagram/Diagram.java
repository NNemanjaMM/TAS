//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.08.09 at 12:02:54 PM CEST 
//


package com.tas.model.diagram;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="elements">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;group ref="{https://www.tas.org/tas-schemas}processes"/>
 *                   &lt;group ref="{https://www.tas.org/tas-schemas}dataStores"/>
 *                   &lt;group ref="{https://www.tas.org/tas-schemas}externalEntities"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="flows">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;group ref="{https://www.tas.org/tas-schemas}flows"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="boundaries">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;group ref="{https://www.tas.org/tas-schemas}boundaries"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="sections">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice maxOccurs="unbounded" minOccurs="0">
 *                   &lt;group ref="{https://www.tas.org/tas-schemas}networkSections"/>
 *                   &lt;group ref="{https://www.tas.org/tas-schemas}trustSections"/>
 *                 &lt;/choice>
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
    "elements",
    "flows",
    "boundaries",
    "sections"
})
@XmlRootElement(name = "diagram")
public class Diagram {

    @XmlElement(required = true)
    protected Diagram.Elements elements;
    @XmlElement(required = true)
    protected Diagram.Flows flows;
    @XmlElement(required = true)
    protected Diagram.Boundaries boundaries;
    @XmlElement(required = true)
    protected Diagram.Sections sections;

    /**
     * Gets the value of the elements property.
     * 
     * @return
     *     possible object is
     *     {@link Diagram.Elements }
     *     
     */
    public Diagram.Elements getElements() {
        return elements;
    }

    /**
     * Sets the value of the elements property.
     * 
     * @param value
     *     allowed object is
     *     {@link Diagram.Elements }
     *     
     */
    public void setElements(Diagram.Elements value) {
        this.elements = value;
    }

    /**
     * Gets the value of the flows property.
     * 
     * @return
     *     possible object is
     *     {@link Diagram.Flows }
     *     
     */
    public Diagram.Flows getFlows() {
        return flows;
    }

    /**
     * Sets the value of the flows property.
     * 
     * @param value
     *     allowed object is
     *     {@link Diagram.Flows }
     *     
     */
    public void setFlows(Diagram.Flows value) {
        this.flows = value;
    }

    /**
     * Gets the value of the boundaries property.
     * 
     * @return
     *     possible object is
     *     {@link Diagram.Boundaries }
     *     
     */
    public Diagram.Boundaries getBoundaries() {
        return boundaries;
    }

    /**
     * Sets the value of the boundaries property.
     * 
     * @param value
     *     allowed object is
     *     {@link Diagram.Boundaries }
     *     
     */
    public void setBoundaries(Diagram.Boundaries value) {
        this.boundaries = value;
    }

    /**
     * Gets the value of the sections property.
     * 
     * @return
     *     possible object is
     *     {@link Diagram.Sections }
     *     
     */
    public Diagram.Sections getSections() {
        return sections;
    }

    /**
     * Sets the value of the sections property.
     * 
     * @param value
     *     allowed object is
     *     {@link Diagram.Sections }
     *     
     */
    public void setSections(Diagram.Sections value) {
        this.sections = value;
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
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;group ref="{https://www.tas.org/tas-schemas}boundaries"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orInternetBoundaryOrMachineBoundaryOrLocalDMZBoundary"
    })
    public static class Boundaries {

        @XmlElementRefs({
            @XmlElementRef(name = "localDMZBoundary", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "machineBoundary", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "appContainerBoundary", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "internetBoundary", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<Shape>> orInternetBoundaryOrMachineBoundaryOrLocalDMZBoundary;

        /**
         * Gets the value of the orInternetBoundaryOrMachineBoundaryOrLocalDMZBoundary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orInternetBoundaryOrMachineBoundaryOrLocalDMZBoundary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrInternetBoundaryOrMachineBoundaryOrLocalDMZBoundary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link Shape }{@code >}
         * {@link JAXBElement }{@code <}{@link Shape }{@code >}
         * {@link JAXBElement }{@code <}{@link Shape }{@code >}
         * {@link JAXBElement }{@code <}{@link Shape }{@code >}
         * 
         * 
         */
        public List<JAXBElement<Shape>> getOrInternetBoundaryOrMachineBoundaryOrLocalDMZBoundary() {
            if (orInternetBoundaryOrMachineBoundaryOrLocalDMZBoundary == null) {
                orInternetBoundaryOrMachineBoundaryOrLocalDMZBoundary = new ArrayList<JAXBElement<Shape>>();
            }
            return this.orInternetBoundaryOrMachineBoundaryOrLocalDMZBoundary;
        }

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
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;group ref="{https://www.tas.org/tas-schemas}processes"/>
     *         &lt;group ref="{https://www.tas.org/tas-schemas}dataStores"/>
     *         &lt;group ref="{https://www.tas.org/tas-schemas}externalEntities"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orWebApplicationOrWebServiceOrWebServer"
    })
    public static class Elements {

        @XmlElementRefs({
            @XmlElementRef(name = "securityGateway", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "managedApplication", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "browser", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "sqlDatabase", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "externalWebService", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "logFile", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "webServer", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "fileSystem", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "webService", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "cloudStorage", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "externalWebApplication", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "authorizedProvider", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "specialApplication", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "noSqlDatabase", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "thickClient", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "html5LocalStorage", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "webApplication", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "smartPhone", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "user", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "cache", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "configurationFile", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<? extends BlockElement>> orWebApplicationOrWebServiceOrWebServer;

        /**
         * Gets the value of the orWebApplicationOrWebServiceOrWebServer property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orWebApplicationOrWebServiceOrWebServer property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrWebApplicationOrWebServiceOrWebServer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link ExternalEntity }{@code >}
         * {@link JAXBElement }{@code <}{@link Process }{@code >}
         * {@link JAXBElement }{@code <}{@link Diagram.Elements.Browser }{@code >}
         * {@link JAXBElement }{@code <}{@link Diagram.Elements.SqlDatabase }{@code >}
         * {@link JAXBElement }{@code <}{@link ExternalEntity }{@code >}
         * {@link JAXBElement }{@code <}{@link Diagram.Elements.LogFile }{@code >}
         * {@link JAXBElement }{@code <}{@link Diagram.Elements.WebServer }{@code >}
         * {@link JAXBElement }{@code <}{@link DataStore }{@code >}
         * {@link JAXBElement }{@code <}{@link Diagram.Elements.WebService }{@code >}
         * {@link JAXBElement }{@code <}{@link Diagram.Elements.CloudStorage }{@code >}
         * {@link JAXBElement }{@code <}{@link ExternalEntity }{@code >}
         * {@link JAXBElement }{@code <}{@link ExternalEntity }{@code >}
         * {@link JAXBElement }{@code <}{@link Process }{@code >}
         * {@link JAXBElement }{@code <}{@link Diagram.Elements.NoSqlDatabase }{@code >}
         * {@link JAXBElement }{@code <}{@link Process }{@code >}
         * {@link JAXBElement }{@code <}{@link DataStore }{@code >}
         * {@link JAXBElement }{@code <}{@link Diagram.Elements.WebApplication }{@code >}
         * {@link JAXBElement }{@code <}{@link ExternalEntity }{@code >}
         * {@link JAXBElement }{@code <}{@link ExternalEntity }{@code >}
         * {@link JAXBElement }{@code <}{@link DataStore }{@code >}
         * {@link JAXBElement }{@code <}{@link DataStore }{@code >}
         * 
         * 
         */
        public List<JAXBElement<? extends BlockElement>> getOrWebApplicationOrWebServiceOrWebServer() {
            if (orWebApplicationOrWebServiceOrWebServer == null) {
                orWebApplicationOrWebServiceOrWebServer = new ArrayList<JAXBElement<? extends BlockElement>>();
            }
            return this.orWebApplicationOrWebServiceOrWebServer;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{https://www.tas.org/tas-schemas}externalEntity">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Browser
            extends ExternalEntity
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{https://www.tas.org/tas-schemas}dataStore">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CloudStorage
            extends DataStore
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{https://www.tas.org/tas-schemas}dataStore">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class LogFile
            extends DataStore
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{https://www.tas.org/tas-schemas}dataStore">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class NoSqlDatabase
            extends DataStore
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{https://www.tas.org/tas-schemas}dataStore">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SqlDatabase
            extends DataStore
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{https://www.tas.org/tas-schemas}process">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class WebApplication
            extends Process
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{https://www.tas.org/tas-schemas}process">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class WebServer
            extends Process
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{https://www.tas.org/tas-schemas}process">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class WebService
            extends Process
        {


        }

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
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;group ref="{https://www.tas.org/tas-schemas}flows"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orBinaryOrHttpOrHttps"
    })
    public static class Flows {

        @XmlElementRefs({
            @XmlElementRef(name = "smb", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "sql", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "namedPipe", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "rpcOrDcom", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ssl", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "udp", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "binary", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "https", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "tcp", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "http", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "ipSec", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<? extends Flow>> orBinaryOrHttpOrHttps;

        /**
         * Gets the value of the orBinaryOrHttpOrHttps property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orBinaryOrHttpOrHttps property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrBinaryOrHttpOrHttps().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link Flow }{@code >}
         * {@link JAXBElement }{@code <}{@link Flow }{@code >}
         * {@link JAXBElement }{@code <}{@link Flow }{@code >}
         * {@link JAXBElement }{@code <}{@link Flow }{@code >}
         * {@link JAXBElement }{@code <}{@link Flow }{@code >}
         * {@link JAXBElement }{@code <}{@link Flow }{@code >}
         * {@link JAXBElement }{@code <}{@link Diagram.Flows.Binary }{@code >}
         * {@link JAXBElement }{@code <}{@link Diagram.Flows.Https }{@code >}
         * {@link JAXBElement }{@code <}{@link Flow }{@code >}
         * {@link JAXBElement }{@code <}{@link Diagram.Flows.Http }{@code >}
         * {@link JAXBElement }{@code <}{@link Flow }{@code >}
         * 
         * 
         */
        public List<JAXBElement<? extends Flow>> getOrBinaryOrHttpOrHttps() {
            if (orBinaryOrHttpOrHttps == null) {
                orBinaryOrHttpOrHttps = new ArrayList<JAXBElement<? extends Flow>>();
            }
            return this.orBinaryOrHttpOrHttps;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{https://www.tas.org/tas-schemas}flow">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Binary
            extends Flow
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{https://www.tas.org/tas-schemas}flow">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Http
            extends Flow
        {


        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{https://www.tas.org/tas-schemas}flow">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Https
            extends Flow
        {


        }

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
     *       &lt;choice maxOccurs="unbounded" minOccurs="0">
     *         &lt;group ref="{https://www.tas.org/tas-schemas}networkSections"/>
     *         &lt;group ref="{https://www.tas.org/tas-schemas}trustSections"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orInternetDmzOrOfficeNetworkOrSharedNetwork"
    })
    public static class Sections {

        @XmlElementRefs({
            @XmlElementRef(name = "officeNetwork", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "otherTrustSection", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "internetDmz", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "companyTrustSection", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "sharedNetwork", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false),
            @XmlElementRef(name = "sandboxTrustSection", namespace = "https://www.tas.org/tas-schemas", type = JAXBElement.class, required = false)
        })
        protected List<JAXBElement<BlockShape>> orInternetDmzOrOfficeNetworkOrSharedNetwork;

        /**
         * Gets the value of the orInternetDmzOrOfficeNetworkOrSharedNetwork property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the orInternetDmzOrOfficeNetworkOrSharedNetwork property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOrInternetDmzOrOfficeNetworkOrSharedNetwork().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JAXBElement }{@code <}{@link BlockShape }{@code >}
         * {@link JAXBElement }{@code <}{@link BlockShape }{@code >}
         * {@link JAXBElement }{@code <}{@link BlockShape }{@code >}
         * {@link JAXBElement }{@code <}{@link BlockShape }{@code >}
         * {@link JAXBElement }{@code <}{@link BlockShape }{@code >}
         * {@link JAXBElement }{@code <}{@link BlockShape }{@code >}
         * 
         * 
         */
        public List<JAXBElement<BlockShape>> getOrInternetDmzOrOfficeNetworkOrSharedNetwork() {
            if (orInternetDmzOrOfficeNetworkOrSharedNetwork == null) {
                orInternetDmzOrOfficeNetworkOrSharedNetwork = new ArrayList<JAXBElement<BlockShape>>();
            }
            return this.orInternetDmzOrOfficeNetworkOrSharedNetwork;
        }

    }

}
