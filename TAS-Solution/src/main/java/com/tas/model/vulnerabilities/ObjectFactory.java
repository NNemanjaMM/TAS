//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.06.27 at 09:54:01 AM CEST 
//


package com.tas.model.vulnerabilities;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.tas.model.vulnerabilities package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _StringAndLinkLink_QNAME = new QName("https://www.tas.org/tas-schemas", "link");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.tas.model.vulnerabilities
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link StringAndLink }
     * 
     */
    public StringAndLink createStringAndLink() {
        return new StringAndLink();
    }

    /**
     * Create an instance of {@link VulnerabilitiesDefinitions }
     * 
     */
    public VulnerabilitiesDefinitions createVulnerabilitiesDefinitions() {
        return new VulnerabilitiesDefinitions();
    }

    /**
     * Create an instance of {@link VulnerabilityDefinition }
     * 
     */
    public VulnerabilityDefinition createVulnerabilityDefinition() {
        return new VulnerabilityDefinition();
    }

    /**
     * Create an instance of {@link StringAndLink.Link }
     * 
     */
    public StringAndLink.Link createStringAndLinkLink() {
        return new StringAndLink.Link();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link StringAndLink.Link }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "https://www.tas.org/tas-schemas", name = "link", scope = StringAndLink.class)
    public JAXBElement<StringAndLink.Link> createStringAndLinkLink(StringAndLink.Link value) {
        return new JAXBElement<StringAndLink.Link>(_StringAndLinkLink_QNAME, StringAndLink.Link.class, StringAndLink.class, value);
    }

}
