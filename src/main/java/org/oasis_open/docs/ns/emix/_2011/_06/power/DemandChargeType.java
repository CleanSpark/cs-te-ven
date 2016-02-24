//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package org.oasis_open.docs.ns.emix._2011._06.power;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ietf.params.xml.ns.icalendar_2.DurationPropType;
import org.oasis_open.docs.ns.emix._2011._06.PriceBaseType;


/**
 * <p>Java class for DemandChargeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DemandChargeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/emix/2011/06/power}BaseChargeType">
 *       &lt;sequence>
 *         &lt;element name="consumptionUnits" type="{http://docs.oasis-open.org/ns/emix/2011/06/power}PowerItemType"/>
 *         &lt;element name="consumptionCeiling" type="{http://docs.oasis-open.org/ns/emix/2011/06}QuantityType"/>
 *         &lt;element name="overconsumptionPenalty" type="{http://docs.oasis-open.org/ns/emix/2011/06}PriceBaseType"/>
 *         &lt;element name="measurementInterval" type="{urn:ietf:params:xml:ns:icalendar-2.0}DurationPropType"/>
 *         &lt;element name="collectionInterval" type="{urn:ietf:params:xml:ns:icalendar-2.0}DurationPropType"/>
 *         &lt;element name="penaltyPeriod" type="{urn:ietf:params:xml:ns:icalendar-2.0}DurationPropType"/>
 *         &lt;element name="penaltyDuration" type="{urn:ietf:params:xml:ns:icalendar-2.0}DurationPropType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DemandChargeType", propOrder = {
    "consumptionUnits",
    "consumptionCeiling",
    "overconsumptionPenalty",
    "measurementInterval",
    "collectionInterval",
    "penaltyPeriod",
    "penaltyDuration"
})
public class DemandChargeType
    extends BaseChargeType
{

    @XmlElement(required = true)
    protected PowerItemType consumptionUnits;
    protected float consumptionCeiling;
    @XmlElement(required = true)
    protected PriceBaseType overconsumptionPenalty;
    @XmlElement(required = true)
    protected DurationPropType measurementInterval;
    @XmlElement(required = true)
    protected DurationPropType collectionInterval;
    @XmlElement(required = true)
    protected DurationPropType penaltyPeriod;
    @XmlElement(required = true)
    protected DurationPropType penaltyDuration;

    /**
     * Gets the value of the consumptionUnits property.
     * 
     * @return
     *     possible object is
     *     {@link PowerItemType }
     *     
     */
    public PowerItemType getConsumptionUnits() {
        return consumptionUnits;
    }

    /**
     * Sets the value of the consumptionUnits property.
     * 
     * @param value
     *     allowed object is
     *     {@link PowerItemType }
     *     
     */
    public void setConsumptionUnits(PowerItemType value) {
        this.consumptionUnits = value;
    }

    public boolean isSetConsumptionUnits() {
        return (this.consumptionUnits!= null);
    }

    /**
     * Gets the value of the consumptionCeiling property.
     * 
     */
    public float getConsumptionCeiling() {
        return consumptionCeiling;
    }

    /**
     * Sets the value of the consumptionCeiling property.
     * 
     */
    public void setConsumptionCeiling(float value) {
        this.consumptionCeiling = value;
    }

    public boolean isSetConsumptionCeiling() {
        return true;
    }

    /**
     * Gets the value of the overconsumptionPenalty property.
     * 
     * @return
     *     possible object is
     *     {@link PriceBaseType }
     *     
     */
    public PriceBaseType getOverconsumptionPenalty() {
        return overconsumptionPenalty;
    }

    /**
     * Sets the value of the overconsumptionPenalty property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceBaseType }
     *     
     */
    public void setOverconsumptionPenalty(PriceBaseType value) {
        this.overconsumptionPenalty = value;
    }

    public boolean isSetOverconsumptionPenalty() {
        return (this.overconsumptionPenalty!= null);
    }

    /**
     * Gets the value of the measurementInterval property.
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getMeasurementInterval() {
        return measurementInterval;
    }

    /**
     * Sets the value of the measurementInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setMeasurementInterval(DurationPropType value) {
        this.measurementInterval = value;
    }

    public boolean isSetMeasurementInterval() {
        return (this.measurementInterval!= null);
    }

    /**
     * Gets the value of the collectionInterval property.
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getCollectionInterval() {
        return collectionInterval;
    }

    /**
     * Sets the value of the collectionInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setCollectionInterval(DurationPropType value) {
        this.collectionInterval = value;
    }

    public boolean isSetCollectionInterval() {
        return (this.collectionInterval!= null);
    }

    /**
     * Gets the value of the penaltyPeriod property.
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getPenaltyPeriod() {
        return penaltyPeriod;
    }

    /**
     * Sets the value of the penaltyPeriod property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setPenaltyPeriod(DurationPropType value) {
        this.penaltyPeriod = value;
    }

    public boolean isSetPenaltyPeriod() {
        return (this.penaltyPeriod!= null);
    }

    /**
     * Gets the value of the penaltyDuration property.
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getPenaltyDuration() {
        return penaltyDuration;
    }

    /**
     * Sets the value of the penaltyDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setPenaltyDuration(DurationPropType value) {
        this.penaltyDuration = value;
    }

    public boolean isSetPenaltyDuration() {
        return (this.penaltyDuration!= null);
    }

}
