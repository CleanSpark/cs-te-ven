//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package org.oasis_open.docs.ns.energyinterop._201110;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.ns.emix._2011._06.BaseTermType;


/**
 * Response Smoothing defines a Term that obligates the recipient to ensure that the response not be in a single step. Response Smoothing is applied to the tolerance interval[s] indicated by the Start Before, Start After, End Before, and End After tolerances. Response Smoothing is implimented as a Term so it can be delivered, if desired, as part of a market context.
 * 
 * <p>Java class for EiResponseSmoothingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EiResponseSmoothingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/emix/2011/06}BaseTermType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}eiSmoothing"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EiResponseSmoothingType", propOrder = {
    "eiSmoothing"
})
public class EiResponseSmoothingType
    extends BaseTermType
{

    @XmlElement(required = true)
    protected EiSmoothingType eiSmoothing;

    /**
     * Gets the value of the eiSmoothing property.
     * 
     * @return
     *     possible object is
     *     {@link EiSmoothingType }
     *     
     */
    public EiSmoothingType getEiSmoothing() {
        return eiSmoothing;
    }

    /**
     * Sets the value of the eiSmoothing property.
     * 
     * @param value
     *     allowed object is
     *     {@link EiSmoothingType }
     *     
     */
    public void setEiSmoothing(EiSmoothingType value) {
        this.eiSmoothing = value;
    }

    public boolean isSetEiSmoothing() {
        return (this.eiSmoothing!= null);
    }

}