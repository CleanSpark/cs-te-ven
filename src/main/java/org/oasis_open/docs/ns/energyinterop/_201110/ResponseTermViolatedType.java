//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package org.oasis_open.docs.ns.energyinterop._201110;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.ns.emix._2011._06.AvailabilityScheduleType;
import org.oasis_open.docs.ns.emix._2011._06.BaseTermType;
import org.oasis_open.docs.ns.emix._2011._06.MarketGranularityType;
import org.oasis_open.docs.ns.emix._2011._06.MaximumConsecutiveDurationsType;
import org.oasis_open.docs.ns.emix._2011._06.MaximumInvocationsPerDurationType;
import org.oasis_open.docs.ns.emix._2011._06.MaximumNotificationDurationType;
import org.oasis_open.docs.ns.emix._2011._06.MaximumResponseDurationType;
import org.oasis_open.docs.ns.emix._2011._06.MaximumRunDurationType;
import org.oasis_open.docs.ns.emix._2011._06.MinimumDurationBetweenInvocationsType;
import org.oasis_open.docs.ns.emix._2011._06.MinimumEconomicRequirementType;
import org.oasis_open.docs.ns.emix._2011._06.MinimumNotificationDurationType;
import org.oasis_open.docs.ns.emix._2011._06.MinimumRecoveryDurationType;
import org.oasis_open.docs.ns.emix._2011._06.MinimumRemunerationRateType;
import org.oasis_open.docs.ns.emix._2011._06.MinimumResponseDurationType;
import org.oasis_open.docs.ns.emix._2011._06.MinimumRunDurationType;
import org.oasis_open.docs.ns.emix._2011._06.MinimumStartsPerDurationType;
import org.oasis_open.docs.ns.emix._2011._06.NotificationScheduleType;
import org.oasis_open.docs.ns.emix._2011._06.RequiredStartupRemunerationType;
import org.oasis_open.docs.ns.emix._2011._06.ResponseTimeType;
import org.oasis_open.docs.ns.emix._2011._06.UnavailabilityScheduleType;
import org.oasis_open.docs.ns.emix._2011._06.power.resource.MaximumEnergyType;
import org.oasis_open.docs.ns.emix._2011._06.power.resource.MaximumPowerType;
import org.oasis_open.docs.ns.emix._2011._06.power.resource.MinimumLoadReductionType;
import org.oasis_open.docs.ns.emix._2011._06.power.resource.MinimumLoadType;
import org.oasis_open.docs.ns.emix._2011._06.power.resource.OfferCurveType;


/**
 * <p>Java class for ResponseTermViolatedType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ResponseTermViolatedType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}responseDescription"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}baseTerm"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResponseTermViolatedType", propOrder = {
    "responseDescription",
    "baseTerm"
})
public class ResponseTermViolatedType {

    @XmlElement(required = true)
    protected String responseDescription;
    @XmlElementRef(name = "baseTerm", namespace = "http://docs.oasis-open.org/ns/emix/2011/06", type = JAXBElement.class)
    protected JAXBElement<? extends BaseTermType> baseTerm;

    /**
     * Gets the value of the responseDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseDescription() {
        return responseDescription;
    }

    /**
     * Sets the value of the responseDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseDescription(String value) {
        this.responseDescription = value;
    }

    public boolean isSetResponseDescription() {
        return (this.responseDescription!= null);
    }

    /**
     * Gets the value of the baseTerm property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link OfferCurveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumRunDurationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumDurationBetweenInvocationsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RequiredStartupRemunerationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResponseTimeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MaximumResponseDurationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumLoadType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BaseTermType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MaximumPowerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MaximumInvocationsPerDurationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarketGranularityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MaximumNotificationDurationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MaximumRunDurationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumResponseDurationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumStartsPerDurationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EiResponseSmoothingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumEconomicRequirementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NotificationScheduleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumLoadReductionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AvailabilityScheduleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MaximumConsecutiveDurationsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumRecoveryDurationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MaximumEnergyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumRemunerationRateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumNotificationDurationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnavailabilityScheduleType }{@code >}
     *     
     */
    public JAXBElement<? extends BaseTermType> getBaseTerm() {
        return baseTerm;
    }

    /**
     * Sets the value of the baseTerm property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link OfferCurveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumRunDurationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumDurationBetweenInvocationsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RequiredStartupRemunerationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ResponseTimeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MaximumResponseDurationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumLoadType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BaseTermType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MaximumPowerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MaximumInvocationsPerDurationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MarketGranularityType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MaximumNotificationDurationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MaximumRunDurationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumResponseDurationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumStartsPerDurationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EiResponseSmoothingType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumEconomicRequirementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link NotificationScheduleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumLoadReductionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AvailabilityScheduleType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MaximumConsecutiveDurationsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumRecoveryDurationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MaximumEnergyType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumRemunerationRateType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MinimumNotificationDurationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link UnavailabilityScheduleType }{@code >}
     *     
     */
    public void setBaseTerm(JAXBElement<? extends BaseTermType> value) {
        this.baseTerm = value;
    }

    public boolean isSetBaseTerm() {
        return (this.baseTerm!= null);
    }

}
