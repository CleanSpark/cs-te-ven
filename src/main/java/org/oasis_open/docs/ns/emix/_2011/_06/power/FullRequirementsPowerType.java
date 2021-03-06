//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package org.oasis_open.docs.ns.emix._2011._06.power;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.ns.emix._2011._06.PriceBaseType;
import org.oasis_open.docs.ns.emix._2011._06.PriceMultiplierType;
import org.oasis_open.docs.ns.emix._2011._06.PriceRelativeType;
import org.oasis_open.docs.ns.emix._2011._06.PriceType;


/**
 * Product Description for Supplier to provide for full requirements of buyer. Simple price, will supply all used. Demand Charges Optional. Often used in retail residential rates.
 * 
 * <p>Java class for FullRequirementsPowerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FullRequirementsPowerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/emix/2011/06/power}PowerProductDescriptionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}priceBase" minOccurs="0"/>
 *         &lt;element name="maximumPower" type="{http://docs.oasis-open.org/ns/emix/2011/06}QuantityType" minOccurs="0"/>
 *         &lt;element name="minimumPower" type="{http://docs.oasis-open.org/ns/emix/2011/06}QuantityType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FullRequirementsPowerType", propOrder = {
    "priceBase",
    "maximumPower",
    "minimumPower"
})
public class FullRequirementsPowerType
    extends PowerProductDescriptionType
{

    @XmlElementRef(name = "priceBase", namespace = "http://docs.oasis-open.org/ns/emix/2011/06", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends PriceBaseType> priceBase;
    protected Float maximumPower;
    protected Float minimumPower;

    /**
     * Gets the value of the priceBase property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PriceBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriceMultiplierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriceRelativeType }{@code >}
     *     
     */
    public JAXBElement<? extends PriceBaseType> getPriceBase() {
        return priceBase;
    }

    /**
     * Sets the value of the priceBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PriceBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriceMultiplierType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PriceRelativeType }{@code >}
     *     
     */
    public void setPriceBase(JAXBElement<? extends PriceBaseType> value) {
        this.priceBase = value;
    }

    public boolean isSetPriceBase() {
        return (this.priceBase!= null);
    }

    /**
     * Gets the value of the maximumPower property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMaximumPower() {
        return maximumPower;
    }

    /**
     * Sets the value of the maximumPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMaximumPower(Float value) {
        this.maximumPower = value;
    }

    public boolean isSetMaximumPower() {
        return (this.maximumPower!= null);
    }

    /**
     * Gets the value of the minimumPower property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMinimumPower() {
        return minimumPower;
    }

    /**
     * Sets the value of the minimumPower property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMinimumPower(Float value) {
        this.minimumPower = value;
    }

    public boolean isSetMinimumPower() {
        return (this.minimumPower!= null);
    }

}
