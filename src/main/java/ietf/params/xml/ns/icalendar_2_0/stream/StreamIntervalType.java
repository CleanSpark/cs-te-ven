//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package ietf.params.xml.ns.icalendar_2_0.stream;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ietf.params.xml.ns.icalendar_2.ActionPropType;
import ietf.params.xml.ns.icalendar_2.AttachPropType;
import ietf.params.xml.ns.icalendar_2.AttendeePropType;
import ietf.params.xml.ns.icalendar_2.BasePropertyType;
import ietf.params.xml.ns.icalendar_2.CalscalePropType;
import ietf.params.xml.ns.icalendar_2.CategoriesPropType;
import ietf.params.xml.ns.icalendar_2.ClassPropType;
import ietf.params.xml.ns.icalendar_2.CommentPropType;
import ietf.params.xml.ns.icalendar_2.CompletedPropType;
import ietf.params.xml.ns.icalendar_2.ContactPropType;
import ietf.params.xml.ns.icalendar_2.CreatedPropType;
import ietf.params.xml.ns.icalendar_2.DescriptionPropType;
import ietf.params.xml.ns.icalendar_2.DtendPropType;
import ietf.params.xml.ns.icalendar_2.DtstampPropType;
import ietf.params.xml.ns.icalendar_2.DtstartPropType;
import ietf.params.xml.ns.icalendar_2.DuePropType;
import ietf.params.xml.ns.icalendar_2.DurationPropType;
import ietf.params.xml.ns.icalendar_2.ExdatePropType;
import ietf.params.xml.ns.icalendar_2.ExrulePropType;
import ietf.params.xml.ns.icalendar_2.FreebusyPropType;
import ietf.params.xml.ns.icalendar_2.GeoPropType;
import ietf.params.xml.ns.icalendar_2.LastModifiedPropType;
import ietf.params.xml.ns.icalendar_2.LinkPropType;
import ietf.params.xml.ns.icalendar_2.LocationPropType;
import ietf.params.xml.ns.icalendar_2.MethodPropType;
import ietf.params.xml.ns.icalendar_2.OrganizerPropType;
import ietf.params.xml.ns.icalendar_2.PercentCompletePropType;
import ietf.params.xml.ns.icalendar_2.PriorityPropType;
import ietf.params.xml.ns.icalendar_2.ProdidPropType;
import ietf.params.xml.ns.icalendar_2.RdatePropType;
import ietf.params.xml.ns.icalendar_2.RecurrenceIdPropType;
import ietf.params.xml.ns.icalendar_2.RelatedToPropType;
import ietf.params.xml.ns.icalendar_2.RepeatPropType;
import ietf.params.xml.ns.icalendar_2.RequestStatusPropType;
import ietf.params.xml.ns.icalendar_2.ResourcesPropType;
import ietf.params.xml.ns.icalendar_2.RrulePropType;
import ietf.params.xml.ns.icalendar_2.SequencePropType;
import ietf.params.xml.ns.icalendar_2.StatusPropType;
import ietf.params.xml.ns.icalendar_2.SummaryPropType;
import ietf.params.xml.ns.icalendar_2.TolerancePropType;
import ietf.params.xml.ns.icalendar_2.TranspPropType;
import ietf.params.xml.ns.icalendar_2.TriggerPropType;
import ietf.params.xml.ns.icalendar_2.TznamePropType;
import ietf.params.xml.ns.icalendar_2.TzoffsetfromPropType;
import ietf.params.xml.ns.icalendar_2.TzoffsettoPropType;
import ietf.params.xml.ns.icalendar_2.TzurlPropType;
import ietf.params.xml.ns.icalendar_2.UidPropType;
import ietf.params.xml.ns.icalendar_2.UrlPropType;
import ietf.params.xml.ns.icalendar_2.VersionPropType;
import ietf.params.xml.ns.icalendar_2.WsCalendarAttachType;
import ietf.params.xml.ns.icalendar_2.WsCalendarTypeType;
import ietf.params.xml.ns.icalendar_2.XBedeworkCostPropType;
import ietf.params.xml.ns.icalendar_2.XBedeworkExsynchEndtzidPropType;
import ietf.params.xml.ns.icalendar_2.XBedeworkExsynchLastmodPropType;
import ietf.params.xml.ns.icalendar_2.XBedeworkExsynchStarttzidPropType;
import ietf.params.xml.ns.icalendar_2.XMicrosoftCdoBusystatusPropType;
import ietf.params.xml.ns.icalendar_2.XMicrosoftCdoIntendedstatusPropType;
import org.oasis_open.docs.ns.energyinterop._201110.EventBaselinePayloadType;
import org.oasis_open.docs.ns.energyinterop._201110.IntervalType;
import org.oasis_open.docs.ns.energyinterop._201110.ReportPayloadType;
import org.oasis_open.docs.ns.energyinterop._201110.SignalPayloadType;
import org.oasis_open.docs.ns.energyinterop._201110.XIntervalQualificationType;


/**
 * Restricted variant of ws-calendar interval for streams. Stream Intervals are restricted expressions of the WS-Calendar Interval that are transformable to but not identical to WS-Calendar Intervals.
 * 
 * <p>Java class for StreamIntervalType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StreamIntervalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}baseProperty" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0:stream}streamPayloadBase"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamIntervalType", propOrder = {
    "baseProperty",
    "streamPayloadBase"
})
@XmlSeeAlso({
    IntervalType.class
})
public abstract class StreamIntervalType {

    @XmlElementRef(name = "baseProperty", namespace = "urn:ietf:params:xml:ns:icalendar-2.0", type = JAXBElement.class, required = false)
    protected List<JAXBElement<? extends BasePropertyType>> baseProperty;
    @XmlElementRef(name = "streamPayloadBase", namespace = "urn:ietf:params:xml:ns:icalendar-2.0:stream", type = JAXBElement.class)
    protected JAXBElement<? extends StreamPayloadBaseType> streamPayloadBase;

    /**
     * Gets the value of the baseProperty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the baseProperty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBaseProperty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link RecurrenceIdPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link DuePropType }{@code >}
     * {@link JAXBElement }{@code <}{@link TzurlPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProdidPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link DtstampPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link DurationPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link WsCalendarTypeType }{@code >}
     * {@link JAXBElement }{@code <}{@link LocationPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link SequencePropType }{@code >}
     * {@link JAXBElement }{@code <}{@link BasePropertyType }{@code >}
     * {@link JAXBElement }{@code <}{@link RelatedToPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link UrlPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExrulePropType }{@code >}
     * {@link JAXBElement }{@code <}{@link XMicrosoftCdoBusystatusPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link XBedeworkExsynchLastmodPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link SummaryPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link RequestStatusPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link RdatePropType }{@code >}
     * {@link JAXBElement }{@code <}{@link MethodPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link DurationPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganizerPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link AttachPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link TzoffsetfromPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link DurationPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link DtendPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link CalscalePropType }{@code >}
     * {@link JAXBElement }{@code <}{@link TzoffsettoPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link VersionPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link XMicrosoftCdoIntendedstatusPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link XBedeworkCostPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link OrganizerPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link XBedeworkExsynchEndtzidPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link TriggerPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link XBedeworkExsynchStarttzidPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link TznamePropType }{@code >}
     * {@link JAXBElement }{@code <}{@link WsCalendarAttachType }{@code >}
     * {@link JAXBElement }{@code <}{@link RepeatPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link PercentCompletePropType }{@code >}
     * {@link JAXBElement }{@code <}{@link DurationPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link DurationPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link LinkPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link StatusPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link CompletedPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link XIntervalQualificationType }{@code >}
     * {@link JAXBElement }{@code <}{@link RrulePropType }{@code >}
     * {@link JAXBElement }{@code <}{@link DescriptionPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link FreebusyPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link ExdatePropType }{@code >}
     * {@link JAXBElement }{@code <}{@link LastModifiedPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link CreatedPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link GeoPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link AttendeePropType }{@code >}
     * {@link JAXBElement }{@code <}{@link TranspPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link ActionPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link UidPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link TolerancePropType }{@code >}
     * {@link JAXBElement }{@code <}{@link ContactPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link PriorityPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link ResourcesPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link CategoriesPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link CommentPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link ClassPropType }{@code >}
     * {@link JAXBElement }{@code <}{@link DtstartPropType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends BasePropertyType>> getBaseProperty() {
        if (baseProperty == null) {
            baseProperty = new ArrayList<JAXBElement<? extends BasePropertyType>>();
        }
        return this.baseProperty;
    }

    public boolean isSetBaseProperty() {
        return ((this.baseProperty!= null)&&(!this.baseProperty.isEmpty()));
    }

    public void unsetBaseProperty() {
        this.baseProperty = null;
    }

    /**
     * Gets the value of the streamPayloadBase property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ReportPayloadType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StreamPayloadBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SignalPayloadType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EventBaselinePayloadType }{@code >}
     *     
     */
    public JAXBElement<? extends StreamPayloadBaseType> getStreamPayloadBase() {
        return streamPayloadBase;
    }

    /**
     * Sets the value of the streamPayloadBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ReportPayloadType }{@code >}
     *     {@link JAXBElement }{@code <}{@link StreamPayloadBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link SignalPayloadType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EventBaselinePayloadType }{@code >}
     *     
     */
    public void setStreamPayloadBase(JAXBElement<? extends StreamPayloadBaseType> value) {
        this.streamPayloadBase = value;
    }

    public boolean isSetStreamPayloadBase() {
        return (this.streamPayloadBase!= null);
    }

}
