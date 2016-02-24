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
import ietf.params.xml.ns.icalendar_2.ArtifactBaseType;


/**
 * Quality Measure is a collection of Power Quality Indicators. The Quality Measure is placed in a WS-Calendar Artifact so it can populate a schedule. Note: Quality Measure can be applied EITHER in the intervals of the schedule in emixBase inherited from the emix:QualityWarrant OR in external to the Intervals, but not both.
 * 
 * <p>Java class for QualityMeasureType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QualityMeasureType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:icalendar-2.0}ArtifactBaseType">
 *       &lt;sequence>
 *         &lt;element name="qualities" type="{http://docs.oasis-open.org/ns/emix/2011/06/power}ArrayOfQualityIndicators"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QualityMeasureType", propOrder = {
    "qualities"
})
public class QualityMeasureType
    extends ArtifactBaseType
{

    @XmlElement(required = true)
    protected ArrayOfQualityIndicators qualities;

    /**
     * Gets the value of the qualities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfQualityIndicators }
     *     
     */
    public ArrayOfQualityIndicators getQualities() {
        return qualities;
    }

    /**
     * Sets the value of the qualities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfQualityIndicators }
     *     
     */
    public void setQualities(ArrayOfQualityIndicators value) {
        this.qualities = value;
    }

    public boolean isSetQualities() {
        return (this.qualities!= null);
    }

}