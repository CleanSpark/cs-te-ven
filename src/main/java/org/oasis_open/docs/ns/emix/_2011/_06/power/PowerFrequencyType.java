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
 * measured Power frequency, e.g. 50.4, 59.9, measured as per referenced measurement protocol. 0 for DC
 * 					
 * 
 * <p>Java class for PowerFrequencyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerFrequencyType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/emix/2011/06/power}BasePowerQualityIndicatorType">
 *       &lt;sequence>
 *         &lt;element name="frequency" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerFrequencyType", propOrder = {
    "frequency"
})
public class PowerFrequencyType
    extends BasePowerQualityIndicatorType
{

    protected float frequency;

    /**
     * Gets the value of the frequency property.
     * 
     */
    public float getFrequency() {
        return frequency;
    }

    /**
     * Sets the value of the frequency property.
     * 
     */
    public void setFrequency(float value) {
        this.frequency = value;
    }

    public boolean isSetFrequency() {
        return true;
    }

}
