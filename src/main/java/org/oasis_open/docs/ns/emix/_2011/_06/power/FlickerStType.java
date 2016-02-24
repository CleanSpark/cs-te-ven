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
 * A measurement of Short Term Rapid Voltage Change. The actual periods for measurement are defined in the measurement protocol documents.
 * 
 * <p>Java class for FlickerStType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FlickerStType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/emix/2011/06/power}BasePowerQualityIndicatorType">
 *       &lt;sequence>
 *         &lt;element name="flickerPSt" type="{http://www.w3.org/2001/XMLSchema}float"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlickerStType", propOrder = {
    "flickerPSt"
})
public class FlickerStType
    extends BasePowerQualityIndicatorType
{

    protected float flickerPSt;

    /**
     * Gets the value of the flickerPSt property.
     * 
     */
    public float getFlickerPSt() {
        return flickerPSt;
    }

    /**
     * Sets the value of the flickerPSt property.
     * 
     */
    public void setFlickerPSt(float value) {
        this.flickerPSt = value;
    }

    public boolean isSetFlickerPSt() {
        return true;
    }

}