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
import org.oasis_open.docs.ns.emix._2011._06.power.PowerAttributesType;


/**
 * Regulation Service
 * 
 * <p>Java class for RegulationServiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RegulationServiceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/emix/2011/06/power/resource}ResourceDescriptionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power/resource}productTypeRegulation"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power/resource}targetRegulation"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power/resource}dispatchUp"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power/resource}dispatchDown"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}autonomous"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RegulationServiceType", propOrder = {
    "productTypeRegulation",
    "targetRegulation",
    "dispatchUp",
    "dispatchDown",
    "autonomous"
})
public class RegulationServiceType
    extends ResourceDescriptionType
{

    @XmlElement(required = true)
    protected ProductTypeRegulationType productTypeRegulation;
    @XmlElement(required = true)
    protected PowerAttributesType targetRegulation;
    @XmlElement(required = true)
    protected DurationPropType dispatchUp;
    @XmlElement(required = true)
    protected DurationPropType dispatchDown;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/emix/2011/06")
    protected boolean autonomous;

    /**
     * Gets the value of the productTypeRegulation property.
     * 
     * @return
     *     possible object is
     *     {@link ProductTypeRegulationType }
     *     
     */
    public ProductTypeRegulationType getProductTypeRegulation() {
        return productTypeRegulation;
    }

    /**
     * Sets the value of the productTypeRegulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductTypeRegulationType }
     *     
     */
    public void setProductTypeRegulation(ProductTypeRegulationType value) {
        this.productTypeRegulation = value;
    }

    public boolean isSetProductTypeRegulation() {
        return (this.productTypeRegulation!= null);
    }

    /**
     * Gets the value of the targetRegulation property.
     * 
     * @return
     *     possible object is
     *     {@link PowerAttributesType }
     *     
     */
    public PowerAttributesType getTargetRegulation() {
        return targetRegulation;
    }

    /**
     * Sets the value of the targetRegulation property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerAttributesType }
     *     
     */
    public void setTargetRegulation(PowerAttributesType value) {
        this.targetRegulation = value;
    }

    public boolean isSetTargetRegulation() {
        return (this.targetRegulation!= null);
    }

    /**
     * Gets the value of the dispatchUp property.
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getDispatchUp() {
        return dispatchUp;
    }

    /**
     * Sets the value of the dispatchUp property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setDispatchUp(DurationPropType value) {
        this.dispatchUp = value;
    }

    public boolean isSetDispatchUp() {
        return (this.dispatchUp!= null);
    }

    /**
     * Gets the value of the dispatchDown property.
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getDispatchDown() {
        return dispatchDown;
    }

    /**
     * Sets the value of the dispatchDown property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setDispatchDown(DurationPropType value) {
        this.dispatchDown = value;
    }

    public boolean isSetDispatchDown() {
        return (this.dispatchDown!= null);
    }

    /**
     * Gets the value of the autonomous property.
     * 
     */
    public boolean isAutonomous() {
        return autonomous;
    }

    /**
     * Sets the value of the autonomous property.
     * 
     */
    public void setAutonomous(boolean value) {
        this.autonomous = value;
    }

    public boolean isSetAutonomous() {
        return true;
    }

}
