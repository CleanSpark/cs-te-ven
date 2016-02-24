//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package org.oasis_open.docs.ns.emix._2011._06.power.resource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A Power Ramp is an Array of of Ramp Segments that describing a Resource�s ability to change level. A Power Ramp is either monotonically increasing or monotonically decreasing.
 * 
 * <p>Java class for PowerRampType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerRampType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power/resource}rampSegments"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerRampType", propOrder = {
    "rampSegments"
})
public class PowerRampType {

    @XmlElement(required = true)
    protected ArrayOfRampSegments rampSegments;

    /**
     * Gets the value of the rampSegments property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRampSegments }
     *     
     */
    public ArrayOfRampSegments getRampSegments() {
        return rampSegments;
    }

    /**
     * Sets the value of the rampSegments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRampSegments }
     *     
     */
    public void setRampSegments(ArrayOfRampSegments value) {
        this.rampSegments = value;
    }

    public boolean isSetRampSegments() {
        return (this.rampSegments!= null);
    }

}
