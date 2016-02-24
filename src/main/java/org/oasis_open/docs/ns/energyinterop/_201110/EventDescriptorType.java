//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package org.oasis_open.docs.ns.energyinterop._201110;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EventDescriptorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventDescriptorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eventID"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}modificationNumber"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}modificationDateTime" minOccurs="0"/>
 *         &lt;element name="modificationReason" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}priority" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eiMarketContext"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}createdDateTime" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eventStatus" minOccurs="0"/>
 *         &lt;element name="operatingDay" type="{urn:ietf:params:xml:ns:icalendar-2.0}DateTimeType" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}testEvent" minOccurs="0"/>
 *         &lt;element name="vtnComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventDescriptorType", propOrder = {
    "eventID",
    "modificationNumber",
    "modificationDateTime",
    "modificationReason",
    "priority",
    "eiMarketContext",
    "createdDateTime",
    "eventStatus",
    "operatingDay",
    "testEvent",
    "vtnComment"
})
public class EventDescriptorType {

    @XmlElement(required = true)
    protected String eventID;
    @XmlSchemaType(name = "unsignedInt")
    protected long modificationNumber;
    protected XMLGregorianCalendar modificationDateTime;
    protected String modificationReason;
    @XmlSchemaType(name = "unsignedInt")
    protected Long priority;
    @XmlElement(required = true)
    protected EiMarketContextType eiMarketContext;
    protected XMLGregorianCalendar createdDateTime;
    protected String eventStatus;
    protected XMLGregorianCalendar operatingDay;
    protected String testEvent;
    protected String vtnComment;

    /**
     * Gets the value of the eventID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventID() {
        return eventID;
    }

    /**
     * Sets the value of the eventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventID(String value) {
        this.eventID = value;
    }

    public boolean isSetEventID() {
        return (this.eventID!= null);
    }

    /**
     * Gets the value of the modificationNumber property.
     * 
     */
    public long getModificationNumber() {
        return modificationNumber;
    }

    /**
     * Sets the value of the modificationNumber property.
     * 
     */
    public void setModificationNumber(long value) {
        this.modificationNumber = value;
    }

    public boolean isSetModificationNumber() {
        return true;
    }

    /**
     * Gets the value of the modificationDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getModificationDateTime() {
        return modificationDateTime;
    }

    /**
     * Sets the value of the modificationDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setModificationDateTime(XMLGregorianCalendar value) {
        this.modificationDateTime = value;
    }

    public boolean isSetModificationDateTime() {
        return (this.modificationDateTime!= null);
    }

    /**
     * Gets the value of the modificationReason property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModificationReason() {
        return modificationReason;
    }

    /**
     * Sets the value of the modificationReason property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModificationReason(String value) {
        this.modificationReason = value;
    }

    public boolean isSetModificationReason() {
        return (this.modificationReason!= null);
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setPriority(Long value) {
        this.priority = value;
    }

    public boolean isSetPriority() {
        return (this.priority!= null);
    }

    /**
     * Gets the value of the eiMarketContext property.
     * 
     * @return
     *     possible object is
     *     {@link EiMarketContextType }
     *     
     */
    public EiMarketContextType getEiMarketContext() {
        return eiMarketContext;
    }

    /**
     * Sets the value of the eiMarketContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link EiMarketContextType }
     *     
     */
    public void setEiMarketContext(EiMarketContextType value) {
        this.eiMarketContext = value;
    }

    public boolean isSetEiMarketContext() {
        return (this.eiMarketContext!= null);
    }

    /**
     * Gets the value of the createdDateTime property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreatedDateTime() {
        return createdDateTime;
    }

    /**
     * Sets the value of the createdDateTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreatedDateTime(XMLGregorianCalendar value) {
        this.createdDateTime = value;
    }

    public boolean isSetCreatedDateTime() {
        return (this.createdDateTime!= null);
    }

    /**
     * Gets the value of the eventStatus property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventStatus() {
        return eventStatus;
    }

    /**
     * Sets the value of the eventStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventStatus(String value) {
        this.eventStatus = value;
    }

    public boolean isSetEventStatus() {
        return (this.eventStatus!= null);
    }

    /**
     * Gets the value of the operatingDay property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getOperatingDay() {
        return operatingDay;
    }

    /**
     * Sets the value of the operatingDay property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setOperatingDay(XMLGregorianCalendar value) {
        this.operatingDay = value;
    }

    public boolean isSetOperatingDay() {
        return (this.operatingDay!= null);
    }

    /**
     * testEvent can be treated as a boolean by either not including it (= = false) or using the null string. For new work, indicated the Operation Payload. SUpports backward compatibility with OpenADR 1.0.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTestEvent() {
        return testEvent;
    }

    /**
     * Sets the value of the testEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTestEvent(String value) {
        this.testEvent = value;
    }

    public boolean isSetTestEvent() {
        return (this.testEvent!= null);
    }

    /**
     * Gets the value of the vtnComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVtnComment() {
        return vtnComment;
    }

    /**
     * Sets the value of the vtnComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVtnComment(String value) {
        this.vtnComment = value;
    }

    public boolean isSetVtnComment() {
        return (this.vtnComment!= null);
    }

}
