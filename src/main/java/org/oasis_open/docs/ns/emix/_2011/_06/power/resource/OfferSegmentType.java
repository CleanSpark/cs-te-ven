//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package org.oasis_open.docs.ns.emix._2011._06.power.resource;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.ns.emix._2011._06.PriceType;
import org.oasis_open.docs.ns.emix._2011._06.power.EnergyApparentType;
import org.oasis_open.docs.ns.emix._2011._06.power.EnergyItemType;
import org.oasis_open.docs.ns.emix._2011._06.power.EnergyReactiveType;
import org.oasis_open.docs.ns.emix._2011._06.power.EnergyRealType;
import org.oasis_open.docs.ns.emix._2011._06.power.PowerApparentType;
import org.oasis_open.docs.ns.emix._2011._06.power.PowerItemType;
import org.oasis_open.docs.ns.emix._2011._06.power.PowerReactiveType;
import org.oasis_open.docs.ns.emix._2011._06.power.PowerRealType;


/**
 *  Marginal offer for Power within a range. Marginal costs must be computed within the context of a range of segments as conformed by the Offer Type
 * 
 * <p>Java class for OfferSegmentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OfferSegmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="segment" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}price"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}quantity"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power}powerItem"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power}energyItem"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}integralOnly"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferSegmentType", propOrder = {
    "segment",
    "price",
    "quantity",
    "powerItem",
    "energyItem",
    "integralOnly"
})
public class OfferSegmentType {

    protected int segment;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/emix/2011/06", required = true)
    protected PriceType price;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/emix/2011/06")
    protected float quantity;
    @XmlElementRef(name = "powerItem", namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", type = JAXBElement.class)
    protected JAXBElement<? extends PowerItemType> powerItem;
    @XmlElementRef(name = "energyItem", namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", type = JAXBElement.class)
    protected JAXBElement<? extends EnergyItemType> energyItem;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/emix/2011/06")
    protected boolean integralOnly;

    /**
     * Gets the value of the segment property.
     * 
     */
    public int getSegment() {
        return segment;
    }

    /**
     * Sets the value of the segment property.
     * 
     */
    public void setSegment(int value) {
        this.segment = value;
    }

    public boolean isSetSegment() {
        return true;
    }

    /**
     * Energy Price for this Segment
     * 
     * @return
     *     possible object is
     *     {@link PriceType }
     *     
     */
    public PriceType getPrice() {
        return price;
    }

    /**
     * Sets the value of the price property.
     * 
     * @param value
     *     allowed object is
     *     {@link PriceType }
     *     
     */
    public void setPrice(PriceType value) {
        this.price = value;
    }

    public boolean isSetPrice() {
        return (this.price!= null);
    }

    /**
     * Power Quantity for this Segment
     * 
     */
    public float getQuantity() {
        return quantity;
    }

    /**
     * Sets the value of the quantity property.
     * 
     */
    public void setQuantity(float value) {
        this.quantity = value;
    }

    public boolean isSetQuantity() {
        return true;
    }

    /**
     * Gets the value of the powerItem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PowerItemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerApparentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerReactiveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerRealType }{@code >}
     *     
     */
    public JAXBElement<? extends PowerItemType> getPowerItem() {
        return powerItem;
    }

    /**
     * Sets the value of the powerItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PowerItemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerApparentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerReactiveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerRealType }{@code >}
     *     
     */
    public void setPowerItem(JAXBElement<? extends PowerItemType> value) {
        this.powerItem = value;
    }

    public boolean isSetPowerItem() {
        return (this.powerItem!= null);
    }

    /**
     * Gets the value of the energyItem property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EnergyRealType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyItemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyApparentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyReactiveType }{@code >}
     *     
     */
    public JAXBElement<? extends EnergyItemType> getEnergyItem() {
        return energyItem;
    }

    /**
     * Sets the value of the energyItem property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EnergyRealType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyItemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyApparentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyReactiveType }{@code >}
     *     
     */
    public void setEnergyItem(JAXBElement<? extends EnergyItemType> value) {
        this.energyItem = value;
    }

    public boolean isSetEnergyItem() {
        return (this.energyItem!= null);
    }

    /**
     * If true, offer is all or none; no partial acceptance of this segment.
     * 
     */
    public boolean isIntegralOnly() {
        return integralOnly;
    }

    /**
     * Sets the value of the integralOnly property.
     * 
     */
    public void setIntegralOnly(boolean value) {
        this.integralOnly = value;
    }

    public boolean isSetIntegralOnly() {
        return true;
    }

}
