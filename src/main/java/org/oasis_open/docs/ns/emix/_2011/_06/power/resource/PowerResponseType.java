//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package org.oasis_open.docs.ns.emix._2011._06.power.resource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Generic model describing the power response capabilities of a resource
 * 
 * <p>Java class for PowerResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PowerResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/emix/2011/06/power/resource}ResourceDescriptionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power/resource}stagingRamp" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power/resource}maximumResponse" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power/resource}minimumResponse"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power/resource}recoveryRamp" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power/resource}offerCurve" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerResponseType", propOrder = {
    "stagingRamp",
    "maximumResponse",
    "minimumResponse",
    "recoveryRamp",
    "offerCurve"
})
@XmlSeeAlso({
    GenerationType.class,
    LoadReductionType.class
})
public abstract class PowerResponseType
    extends ResourceDescriptionType
{

    protected ArrayOfRampSegments stagingRamp;
    protected Float maximumResponse;
    protected float minimumResponse;
    protected ArrayOfRampSegments recoveryRamp;
    protected OfferCurveType offerCurve;

    /**
     * Gets the value of the stagingRamp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRampSegments }
     *     
     */
    public ArrayOfRampSegments getStagingRamp() {
        return stagingRamp;
    }

    /**
     * Sets the value of the stagingRamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRampSegments }
     *     
     */
    public void setStagingRamp(ArrayOfRampSegments value) {
        this.stagingRamp = value;
    }

    public boolean isSetStagingRamp() {
        return (this.stagingRamp!= null);
    }

    /**
     * Gets the value of the maximumResponse property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaximumResponse() {
        return maximumResponse;
    }

    /**
     * Sets the value of the maximumResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaximumResponse(Float value) {
        this.maximumResponse = value;
    }

    public boolean isSetMaximumResponse() {
        return (this.maximumResponse!= null);
    }

    /**
     * Gets the value of the minimumResponse property.
     * 
     */
    public float getMinimumResponse() {
        return minimumResponse;
    }

    /**
     * Sets the value of the minimumResponse property.
     * 
     */
    public void setMinimumResponse(float value) {
        this.minimumResponse = value;
    }

    public boolean isSetMinimumResponse() {
        return true;
    }

    /**
     * Gets the value of the recoveryRamp property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfRampSegments }
     *     
     */
    public ArrayOfRampSegments getRecoveryRamp() {
        return recoveryRamp;
    }

    /**
     * Sets the value of the recoveryRamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfRampSegments }
     *     
     */
    public void setRecoveryRamp(ArrayOfRampSegments value) {
        this.recoveryRamp = value;
    }

    public boolean isSetRecoveryRamp() {
        return (this.recoveryRamp!= null);
    }

    /**
     * Gets the value of the offerCurve property.
     * 
     * @return
     *     possible object is
     *     {@link OfferCurveType }
     *     
     */
    public OfferCurveType getOfferCurve() {
        return offerCurve;
    }

    /**
     * Sets the value of the offerCurve property.
     * 
     * @param value
     *     allowed object is
     *     {@link OfferCurveType }
     *     
     */
    public void setOfferCurve(OfferCurveType value) {
        this.offerCurve = value;
    }

    public boolean isSetOfferCurve() {
        return (this.offerCurve!= null);
    }

}
