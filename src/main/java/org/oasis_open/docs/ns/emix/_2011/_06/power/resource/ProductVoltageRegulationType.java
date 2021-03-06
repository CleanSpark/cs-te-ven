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
import ietf.params.xml.ns.icalendar_2.DurationPropType;


/**
 * Voltage Regulation
 * 
 * <p>Java class for ProductVoltageRegulationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProductVoltageRegulationType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/emix/2011/06/power/resource}ResourceDescriptionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power/resource}rampTime"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power/resource}window"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductVoltageRegulationType", propOrder = {
    "rampTime",
    "window"
})
public class ProductVoltageRegulationType
    extends ResourceDescriptionType
{

    @XmlElement(required = true)
    protected DurationPropType rampTime;
    @XmlElement(required = true)
    protected DurationPropType window;

    /**
     * Requested ramp time to move from the current setpoint to the new setpoint
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getRampTime() {
        return rampTime;
    }

    /**
     * Sets the value of the rampTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setRampTime(DurationPropType value) {
        this.rampTime = value;
    }

    public boolean isSetRampTime() {
        return (this.rampTime!= null);
    }

    /**
     * Time window within which to randomly execute the command. If the time window is zero, the command will be executed immediately, (if not included, then default time window for this function will be used)
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getWindow() {
        return window;
    }

    /**
     * Sets the value of the window property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setWindow(DurationPropType value) {
        this.window = value;
    }

    public boolean isSetWindow() {
        return (this.window!= null);
    }

}
