//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package org.oasis_open.docs.ns.emix._2011._06;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.ns.energyinterop._201110.EiDeliveryType;


/**
 * Receipt / Report of Product Delivery. Injection flag is true for adding product to market supply, false for taking from market.
 * 
 * <p>Java class for DeliveryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/emix/2011/06}EmixBaseType">
 *       &lt;sequence>
 *         &lt;element name="injection" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryType", propOrder = {
    "injection"
})
@XmlSeeAlso({
    EiDeliveryType.class
})
public class DeliveryType
    extends EmixBaseType
{

    protected boolean injection;

    /**
     * Gets the value of the injection property.
     * 
     */
    public boolean isInjection() {
        return injection;
    }

    /**
     * Sets the value of the injection property.
     * 
     */
    public void setInjection(boolean value) {
        this.injection = value;
    }

    public boolean isSetInjection() {
        return true;
    }

}
