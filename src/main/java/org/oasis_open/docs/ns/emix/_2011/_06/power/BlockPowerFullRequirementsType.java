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


/**
 * Product Description for Supplier to provide for full requirements of buyer in "blocks". Price is constant within a block, but changes as each block is used during a period. Demand Charges MAY be included. Often used in retail residential rates.
 * 
 * <p>Java class for BlockPowerFullRequirementsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BlockPowerFullRequirementsType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/emix/2011/06/power}PowerProductDescriptionType">
 *       &lt;sequence>
 *         &lt;element name="maximumPower" type="{http://docs.oasis-open.org/ns/emix/2011/06}QuantityType" minOccurs="0"/>
 *         &lt;element name="minimumPower" type="{http://docs.oasis-open.org/ns/emix/2011/06}QuantityType" minOccurs="0"/>
 *         &lt;element name="priceTiers" type="{http://docs.oasis-open.org/ns/emix/2011/06/power}ArrayOfBlockPowerPrices"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BlockPowerFullRequirementsType", propOrder = {
    "maximumPower",
    "minimumPower",
    "priceTiers"
})
public class BlockPowerFullRequirementsType
    extends PowerProductDescriptionType
{

    protected Float maximumPower;
    protected Float minimumPower;
    @XmlElement(required = true)
    protected ArrayOfBlockPowerPrices priceTiers;

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

    /**
     * Gets the value of the priceTiers property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfBlockPowerPrices }
     *     
     */
    public ArrayOfBlockPowerPrices getPriceTiers() {
        return priceTiers;
    }

    /**
     * Sets the value of the priceTiers property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfBlockPowerPrices }
     *     
     */
    public void setPriceTiers(ArrayOfBlockPowerPrices value) {
        this.priceTiers = value;
    }

    public boolean isSetPriceTiers() {
        return (this.priceTiers!= null);
    }

}
