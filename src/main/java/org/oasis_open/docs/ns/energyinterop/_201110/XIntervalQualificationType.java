//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package org.oasis_open.docs.ns.energyinterop._201110;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import ietf.params.xml.ns.icalendar_2.BasePropertyType;


/**
 * Interval Qualification is a WS-Calendar derived property that conveys several values that indicate something abvout interpreting the accuracy of the information in the payload. An application that relies on this information should profile precise meaings of these values withithn their domain.
 * 
 * <p>Java class for X-IntervalQualificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="X-IntervalQualificationType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:icalendar-2.0}BasePropertyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}confidence"/>
 *           &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}readingType"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}accuracy" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X-IntervalQualificationType", propOrder = {
    "confidence",
    "readingType",
    "accuracy"
})
public class XIntervalQualificationType
    extends BasePropertyType
{

    protected Long confidence;
    protected String readingType;
    protected Float accuracy;

    /**
     * Gets the value of the confidence property.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getConfidence() {
        return confidence;
    }

    /**
     * Sets the value of the confidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setConfidence(Long value) {
        this.confidence = value;
    }

    public boolean isSetConfidence() {
        return (this.confidence!= null);
    }

    /**
     * Gets the value of the readingType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReadingType() {
        return readingType;
    }

    /**
     * Sets the value of the readingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReadingType(String value) {
        this.readingType = value;
    }

    public boolean isSetReadingType() {
        return (this.readingType!= null);
    }

    /**
     * Gets the value of the accuracy property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAccuracy() {
        return accuracy;
    }

    /**
     * Sets the value of the accuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAccuracy(Float value) {
        this.accuracy = value;
    }

    public boolean isSetAccuracy() {
        return (this.accuracy!= null);
    }

}
