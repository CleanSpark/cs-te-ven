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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.ns.emix._2011._06.EmixInterfaceType;
import org.oasis_open.docs.ns.emix._2011._06.PriceType;
import org.oasis_open.docs.ns.emix._2011._06.ProductDescriptionType;
import org.oasis_open.docs.ns.emix._2011._06.ServiceAreaType;


/**
 * Product Description for contract for supplier to deliver a specific sized block of power to buyer. Simple prices, commits a a fixed block. Derived directly from EMIX Product Description rather than Power Product Description because optionality is stripped out.
 * 
 * <p>Java class for TemixPowerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TemixPowerType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/emix/2011/06}ProductDescriptionType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}emixInterface"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}price"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power}powerItem" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power}energyItem" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}quantity"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TemixPowerType", propOrder = {
    "emixInterface",
    "price",
    "powerItem",
    "energyItem",
    "quantity"
})
public class TemixPowerType
    extends ProductDescriptionType
{

    @XmlElementRef(name = "emixInterface", namespace = "http://docs.oasis-open.org/ns/emix/2011/06", type = JAXBElement.class)
    protected JAXBElement<? extends EmixInterfaceType> emixInterface;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/emix/2011/06", required = true)
    protected PriceType price;
    @XmlElementRef(name = "powerItem", namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends PowerItemType> powerItem;
    @XmlElementRef(name = "energyItem", namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends EnergyItemType> energyItem;
    @XmlElement(namespace = "http://docs.oasis-open.org/ns/emix/2011/06")
    protected float quantity;

    /**
     * Gets the value of the emixInterface property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link EmixInterfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceLocationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceDeliveryPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PnodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportInterfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EndDeviceAssetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MeterAssetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AggregatedPnodeType }{@code >}
     *     
     */
    public JAXBElement<? extends EmixInterfaceType> getEmixInterface() {
        return emixInterface;
    }

    /**
     * Sets the value of the emixInterface property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link EmixInterfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceLocationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceDeliveryPointType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PnodeType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ServiceAreaType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportInterfaceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link EndDeviceAssetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MeterAssetType }{@code >}
     *     {@link JAXBElement }{@code <}{@link AggregatedPnodeType }{@code >}
     *     
     */
    public void setEmixInterface(JAXBElement<? extends EmixInterfaceType> value) {
        this.emixInterface = value;
    }

    public boolean isSetEmixInterface() {
        return (this.emixInterface!= null);
    }

    /**
     * Gets the value of the price property.
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

}