//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package org.oasis_open.docs.ns.emix._2011._06.power;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A number indicating Mains Signaling Voltage, relating generally to power line communications systems.
 * 		
 * 
 * <p>Java class for MainsSignallingVoltageType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MainsSignallingVoltageType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/emix/2011/06/power}BasePowerQualityIndicatorType">
 *       &lt;sequence>
 *         &lt;element name="voltage" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MainsSignallingVoltageType", propOrder = {
    "voltage"
})
public class MainsSignallingVoltageType
    extends BasePowerQualityIndicatorType
{

    protected float voltage;

    /**
     * Gets the value of the voltage property.
     * 
     */
    public float getVoltage() {
        return voltage;
    }

    /**
     * Sets the value of the voltage property.
     * 
     */
    public void setVoltage(float value) {
        this.voltage = value;
    }

    public boolean isSetVoltage() {
        return true;
    }

}
