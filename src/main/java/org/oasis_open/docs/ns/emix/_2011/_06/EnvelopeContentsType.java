//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package org.oasis_open.docs.ns.emix._2011._06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EnvelopeContentsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EnvelopeContentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}warrants" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnvelopeContentsType", propOrder = {
    "warrants"
})
public class EnvelopeContentsType {

    protected ArrayOfWarrants warrants;

    /**
     * Gets the value of the warrants property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfWarrants }
     *     
     */
    public ArrayOfWarrants getWarrants() {
        return warrants;
    }

    /**
     * Sets the value of the warrants property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfWarrants }
     *     
     */
    public void setWarrants(ArrayOfWarrants value) {
        this.warrants = value;
    }

    public boolean isSetWarrants() {
        return (this.warrants!= null);
    }

}
