//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package org.oasis_open.docs.ns.energyinterop._201110;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import ietf.params.xml.ns.icalendar_2.DurationPropType;
import ietf.params.xml.ns.icalendar_2.WsCalendarIntervalType;


/**
 * Parameters that define the content of a Report Stream
 * 
 * <p>Java class for ReportSpecifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReportSpecifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}reportSpecifierID"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}marketContext" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}granularity"/>
 *         &lt;element name="reportBackDuration" type="{urn:ietf:params:xml:ns:icalendar-2.0}DurationValueType" minOccurs="0"/>
 *         &lt;element name="reportInterval" type="{urn:ietf:params:xml:ns:icalendar-2.0}WsCalendarIntervalType" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}specifierPayload" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ReportSpecifierType", propOrder = {
    "reportSpecifierID",
    "marketContext",
    "granularity",
    "reportBackDuration",
    "reportInterval",
    "specifierPayload"
})
public class ReportSpecifierType {

    @XmlElement(required = true)
    protected String reportSpecifierID;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/emix/2011/06")
    protected String marketContext;
    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0", required = true)
    protected DurationPropType granularity;
    protected String reportBackDuration;
    protected WsCalendarIntervalType reportInterval;
    @XmlElement(required = true)
    protected List<SpecifierPayloadType> specifierPayload;

    /**
     * Gets the value of the reportSpecifierID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportSpecifierID() {
        return reportSpecifierID;
    }

    /**
     * Sets the value of the reportSpecifierID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportSpecifierID(String value) {
        this.reportSpecifierID = value;
    }

    public boolean isSetReportSpecifierID() {
        return (this.reportSpecifierID!= null);
    }

    /**
     * Gets the value of the marketContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketContext() {
        return marketContext;
    }

    /**
     * Sets the value of the marketContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketContext(String value) {
        this.marketContext = value;
    }

    public boolean isSetMarketContext() {
        return (this.marketContext!= null);
    }

    /**
     * How frequently the [measurement] is to be recorded.
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getGranularity() {
        return granularity;
    }

    /**
     * Sets the value of the granularity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setGranularity(DurationPropType value) {
        this.granularity = value;
    }

    public boolean isSetGranularity() {
        return (this.granularity!= null);
    }

    /**
     * Gets the value of the reportBackDuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReportBackDuration() {
        return reportBackDuration;
    }

    /**
     * Sets the value of the reportBackDuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReportBackDuration(String value) {
        this.reportBackDuration = value;
    }

    public boolean isSetReportBackDuration() {
        return (this.reportBackDuration!= null);
    }

    /**
     * Gets the value of the reportInterval property.
     * 
     * @return
     *     possible object is
     *     {@link WsCalendarIntervalType }
     *     
     */
    public WsCalendarIntervalType getReportInterval() {
        return reportInterval;
    }

    /**
     * Sets the value of the reportInterval property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsCalendarIntervalType }
     *     
     */
    public void setReportInterval(WsCalendarIntervalType value) {
        this.reportInterval = value;
    }

    public boolean isSetReportInterval() {
        return (this.reportInterval!= null);
    }

    /**
     * Gets the value of the specifierPayload property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the specifierPayload property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSpecifierPayload().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecifierPayloadType }
     * 
     * 
     */
    public List<SpecifierPayloadType> getSpecifierPayload() {
        if (specifierPayload == null) {
            specifierPayload = new ArrayList<SpecifierPayloadType>();
        }
        return this.specifierPayload;
    }

    public boolean isSetSpecifierPayload() {
        return ((this.specifierPayload!= null)&&(!this.specifierPayload.isEmpty()));
    }

    public void unsetSpecifierPayload() {
        this.specifierPayload = null;
    }

}
