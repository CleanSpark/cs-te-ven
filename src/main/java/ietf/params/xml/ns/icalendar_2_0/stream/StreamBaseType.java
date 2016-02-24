//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package ietf.params.xml.ns.icalendar_2_0.stream;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import ietf.params.xml.ns.icalendar_2.DtstartPropType;
import ietf.params.xml.ns.icalendar_2.DurationPropType;
import ietf.params.xml.ns.icalendar_2.RelatedToPropType;
import org.oasis_open.docs.ns.energyinterop._201110.EiEventBaselineType;
import org.oasis_open.docs.ns.energyinterop._201110.EiEventSignalType;
import org.oasis_open.docs.ns.energyinterop._201110.EiReportType;


/**
 * abstract base for communication of schedules for signals and observations
 * 
 * <p>Java class for StreamBaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StreamBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}dtstart" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}duration" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}related-to" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0:stream}intervals" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StreamBaseType", propOrder = {
    "dtstart",
    "duration",
    "relatedTo",
    "intervals"
})
@XmlSeeAlso({
    EiEventBaselineType.class,
    EiEventSignalType.class,
    EiReportType.class
})
public abstract class StreamBaseType {

    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0")
    protected DtstartPropType dtstart;
    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0")
    protected DurationPropType duration;
    @XmlElement(name = "related-to", namespace = "urn:ietf:params:xml:ns:icalendar-2.0")
    protected RelatedToPropType relatedTo;
    protected ArrayofStreamIntervals intervals;

    /**
     * Indicates when the Designated Interval of the Stream begins. May be inherited from containing artifact.
     * 
     * @return
     *     possible object is
     *     {@link DtstartPropType }
     *     
     */
    public DtstartPropType getDtstart() {
        return dtstart;
    }

    /**
     * Sets the value of the dtstart property.
     * 
     * @param value
     *     allowed object is
     *     {@link DtstartPropType }
     *     
     */
    public void setDtstart(DtstartPropType value) {
        this.dtstart = value;
    }

    public boolean isSetDtstart() {
        return (this.dtstart!= null);
    }

    /**
     * Indicates the duration inherited by the intervals. May be inherited from containing artifact.
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getDuration() {
        return duration;
    }

    /**
     * Sets the value of the duration property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setDuration(DurationPropType value) {
        this.duration = value;
    }

    public boolean isSetDuration() {
        return (this.duration!= null);
    }

    /**
     * References an interval in the Stream as the Designated Interval. Optional. Default behavior is that the "first" interval is the Desgnated Interval
     * 
     * @return
     *     possible object is
     *     {@link RelatedToPropType }
     *     
     */
    public RelatedToPropType getRelatedTo() {
        return relatedTo;
    }

    /**
     * Sets the value of the relatedTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedToPropType }
     *     
     */
    public void setRelatedTo(RelatedToPropType value) {
        this.relatedTo = value;
    }

    public boolean isSetRelatedTo() {
        return (this.relatedTo!= null);
    }

    /**
     * Gets the value of the intervals property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayofStreamIntervals }
     *     
     */
    public ArrayofStreamIntervals getIntervals() {
        return intervals;
    }

    /**
     * Sets the value of the intervals property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayofStreamIntervals }
     *     
     */
    public void setIntervals(ArrayofStreamIntervals value) {
        this.intervals = value;
    }

    public boolean isSetIntervals() {
        return (this.intervals!= null);
    }

}