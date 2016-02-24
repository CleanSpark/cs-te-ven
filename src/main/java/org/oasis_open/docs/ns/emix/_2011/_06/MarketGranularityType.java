//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package org.oasis_open.docs.ns.emix._2011._06;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.ns.emix._2011._06.power.EnergyApparentType;
import org.oasis_open.docs.ns.emix._2011._06.power.EnergyItemType;
import org.oasis_open.docs.ns.emix._2011._06.power.EnergyReactiveType;
import org.oasis_open.docs.ns.emix._2011._06.power.EnergyRealType;
import org.oasis_open.docs.ns.emix._2011._06.power.PowerApparentType;
import org.oasis_open.docs.ns.emix._2011._06.power.PowerItemType;
import org.oasis_open.docs.ns.emix._2011._06.power.PowerReactiveType;
import org.oasis_open.docs.ns.emix._2011._06.power.PowerRealType;
import org.oasis_open.docs.ns.emix._2011._06.power.VoltageType;


/**
 * Granularity defines the size of a market �bundle�. For example, a Market with a granularity of 10 MW, will only accept tenders, process transactions, and pay for delivery of Power in multiples of 10MW.
 * 
 * <p>Java class for MarketGranularityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MarketGranularityType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/emix/2011/06}BaseTermType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}quantity"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}itemBase"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarketGranularityType", propOrder = {
    "quantity",
    "itemBase"
})
public class MarketGranularityType
    extends BaseTermType
{

    protected float quantity;
    @XmlElementRef(name = "itemBase", namespace = "http://docs.oasis-open.org/ns/emix/2011/06", type = JAXBElement.class)
    protected JAXBElement<? extends ItemBaseType> itemBase;

    /**
     * Gets the value of the quantity property.
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
     * Gets the value of the itemBase property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link PowerApparentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerItemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerRealType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VoltageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyApparentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ItemBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyRealType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerReactiveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyItemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyReactiveType }{@code >}
     *     
     */
    public JAXBElement<? extends ItemBaseType> getItemBase() {
        return itemBase;
    }

    /**
     * Sets the value of the itemBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link PowerApparentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerItemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerRealType }{@code >}
     *     {@link JAXBElement }{@code <}{@link VoltageType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyApparentType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ItemBaseType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyRealType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerReactiveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyItemType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EnergyReactiveType }{@code >}
     *     
     */
    public void setItemBase(JAXBElement<? extends ItemBaseType> value) {
        this.itemBase = value;
    }

    public boolean isSetItemBase() {
        return (this.itemBase!= null);
    }

}
