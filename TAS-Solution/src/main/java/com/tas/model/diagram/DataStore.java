//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.07.21 at 09:10:53 AM CEST 
//


package com.tas.model.diagram;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for dataStore complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="dataStore">
 *   &lt;complexContent>
 *     &lt;extension base="{https://www.tas.org/tas-schemas}dataStore">
 *       &lt;redefine>
 *         &lt;complexType name="dataStore">
 *           &lt;complexContent>
 *             &lt;extension base="{https://www.tas.org/tas-schemas}blockElement">
 *               &lt;attribute name="dataIsEncrypted" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *               &lt;attribute name="dataIsSigned" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *               &lt;attribute name="storeCredentials" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *               &lt;attribute name="hasBackup" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *             &lt;/extension>
 *           &lt;/complexContent>
 *         &lt;/complexType>
 *       &lt;/redefine>
 *       &lt;attGroup ref="{https://www.tas.org/tas-schemas}additionaDatastoreProperties"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "dataStore")
@XmlSeeAlso({
    com.tas.model.diagram.Diagram.Elements.CloudStorage.class,
    com.tas.model.diagram.Diagram.Elements.SqlDatabase.class,
    com.tas.model.diagram.Diagram.Elements.NoSqlDatabase.class,
    com.tas.model.diagram.Diagram.Elements.LogFile.class
})
public class DataStore
    extends OriginalDataStore
{


}
