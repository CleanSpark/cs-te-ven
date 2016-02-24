//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package org.isotc211._2005.gmd;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.IntegerPropertyType;
import org.isotc211._2005.gco.RealPropertyType;
import org.isotc211._2005.gco.UomLengthPropertyType;


/**
 * <p>Java class for MD_Band_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MD_Band_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}MD_RangeDimension_Type">
 *       &lt;sequence>
 *         &lt;element name="maxValue" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         &lt;element name="minValue" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         &lt;element name="units" type="{http://www.isotc211.org/2005/gco}UomLength_PropertyType" minOccurs="0"/>
 *         &lt;element name="peakResponse" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         &lt;element name="bitsPerValue" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType" minOccurs="0"/>
 *         &lt;element name="toneGradation" type="{http://www.isotc211.org/2005/gco}Integer_PropertyType" minOccurs="0"/>
 *         &lt;element name="scaleFactor" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *         &lt;element name="offset" type="{http://www.isotc211.org/2005/gco}Real_PropertyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MD_Band_Type", propOrder = {
    "maxValue",
    "minValue",
    "units",
    "peakResponse",
    "bitsPerValue",
    "toneGradation",
    "scaleFactor",
    "offset"
})
public class MDBandType
    extends MDRangeDimensionType
{

    protected RealPropertyType maxValue;
    protected RealPropertyType minValue;
    protected UomLengthPropertyType units;
    protected RealPropertyType peakResponse;
    protected IntegerPropertyType bitsPerValue;
    protected IntegerPropertyType toneGradation;
    protected RealPropertyType scaleFactor;
    protected RealPropertyType offset;

    /**
     * Gets the value of the maxValue property.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getMaxValue() {
        return maxValue;
    }

    /**
     * Sets the value of the maxValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setMaxValue(RealPropertyType value) {
        this.maxValue = value;
    }

    public boolean isSetMaxValue() {
        return (this.maxValue!= null);
    }

    /**
     * Gets the value of the minValue property.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getMinValue() {
        return minValue;
    }

    /**
     * Sets the value of the minValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setMinValue(RealPropertyType value) {
        this.minValue = value;
    }

    public boolean isSetMinValue() {
        return (this.minValue!= null);
    }

    /**
     * Gets the value of the units property.
     * 
     * @return
     *     possible object is
     *     {@link UomLengthPropertyType }
     *     
     */
    public UomLengthPropertyType getUnits() {
        return units;
    }

    /**
     * Sets the value of the units property.
     * 
     * @param value
     *     allowed object is
     *     {@link UomLengthPropertyType }
     *     
     */
    public void setUnits(UomLengthPropertyType value) {
        this.units = value;
    }

    public boolean isSetUnits() {
        return (this.units!= null);
    }

    /**
     * Gets the value of the peakResponse property.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getPeakResponse() {
        return peakResponse;
    }

    /**
     * Sets the value of the peakResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setPeakResponse(RealPropertyType value) {
        this.peakResponse = value;
    }

    public boolean isSetPeakResponse() {
        return (this.peakResponse!= null);
    }

    /**
     * Gets the value of the bitsPerValue property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getBitsPerValue() {
        return bitsPerValue;
    }

    /**
     * Sets the value of the bitsPerValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setBitsPerValue(IntegerPropertyType value) {
        this.bitsPerValue = value;
    }

    public boolean isSetBitsPerValue() {
        return (this.bitsPerValue!= null);
    }

    /**
     * Gets the value of the toneGradation property.
     * 
     * @return
     *     possible object is
     *     {@link IntegerPropertyType }
     *     
     */
    public IntegerPropertyType getToneGradation() {
        return toneGradation;
    }

    /**
     * Sets the value of the toneGradation property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntegerPropertyType }
     *     
     */
    public void setToneGradation(IntegerPropertyType value) {
        this.toneGradation = value;
    }

    public boolean isSetToneGradation() {
        return (this.toneGradation!= null);
    }

    /**
     * Gets the value of the scaleFactor property.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getScaleFactor() {
        return scaleFactor;
    }

    /**
     * Sets the value of the scaleFactor property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setScaleFactor(RealPropertyType value) {
        this.scaleFactor = value;
    }

    public boolean isSetScaleFactor() {
        return (this.scaleFactor!= null);
    }

    /**
     * Gets the value of the offset property.
     * 
     * @return
     *     possible object is
     *     {@link RealPropertyType }
     *     
     */
    public RealPropertyType getOffset() {
        return offset;
    }

    /**
     * Sets the value of the offset property.
     * 
     * @param value
     *     allowed object is
     *     {@link RealPropertyType }
     *     
     */
    public void setOffset(RealPropertyType value) {
        this.offset = value;
    }

    public boolean isSetOffset() {
        return (this.offset!= null);
    }

}
