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
 * Price per Unit of Energy, i.e., Power times Duration
 * 
 * <p>Java class for UnitEnergyPriceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnitEnergyPriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}priceBase"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06/power}energyItem"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnitEnergyPriceType", propOrder = {
    "priceBase",
    "energyItem"
})
public class UnitEnergyPriceType {

    @XmlElementRef(name = "priceBase", namespace = "http://docs.oasis-open.org/ns/emix/2011/06", type = JAXBElement.class)
    protected JAXBElement<? extends PriceBaseType> priceBase;
    @XmlElementRef(name = "energyItem", namespace = "http://docs.oasis-open.org/ns/emix/2011/06/power", type = JAXBElement.class)
    protected JAXBElement<? extends EnergyItemType> energyItem;

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

}
