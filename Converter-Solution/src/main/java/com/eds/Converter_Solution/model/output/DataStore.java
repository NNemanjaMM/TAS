//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.09.04 at 01:10:46 PM CEST 
//


package com.eds.Converter_Solution.model.output;

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
 *     &lt;extension base="{https://www.eds.org/eds-schemas}dataStore">
 *       &lt;redefine>
 *         &lt;complexType name="dataStore">
 *           &lt;complexContent>
 *             &lt;extension base="{https://www.eds.org/eds-schemas}blockElement">
 *               &lt;attribute name="dataIsEncrypted" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *               &lt;attribute name="dataIsSigned" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *               &lt;attribute name="storeCredentials" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *               &lt;attribute name="hasBackup" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *             &lt;/extension>
 *           &lt;/complexContent>
 *         &lt;/complexType>
 *       &lt;/redefine>
 *       &lt;attGroup ref="{https://www.eds.org/eds-schemas}additionaDatastoreProperties"/>
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
    com.eds.Converter_Solution.model.output.Diagram.Elements.CloudStorage.class,
    com.eds.Converter_Solution.model.output.Diagram.Elements.SqlDatabase.class,
    com.eds.Converter_Solution.model.output.Diagram.Elements.NoSqlDatabase.class,
    com.eds.Converter_Solution.model.output.Diagram.Elements.FileSystem.class,
    com.eds.Converter_Solution.model.output.Diagram.Elements.LogFile.class
})
public class DataStore
    extends OriginalDataStore
{


}
