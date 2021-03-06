//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package ietf.params.xml.ns.icalendar_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RecurPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RecurPropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:icalendar-2.0}BasePropertyType">
 *       &lt;sequence>
 *         &lt;element name="recur" type="{urn:ietf:params:xml:ns:icalendar-2.0}RecurType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecurPropertyType", propOrder = {
    "recur"
})
@XmlSeeAlso({
    ExrulePropType.class,
    RrulePropType.class
})
public class RecurPropertyType
    extends BasePropertyType
{

    @XmlElement(required = true)
    protected RecurType recur;

    /**
     * Gets the value of the recur property.
     * 
     * @return
     *     possible object is
     *     {@link RecurType }
     *     
     */
    public RecurType getRecur() {
        return recur;
    }

    /**
     * Sets the value of the recur property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecurType }
     *     
     */
    public void setRecur(RecurType value) {
        this.recur = value;
    }

    public boolean isSetRecur() {
        return (this.recur!= null);
    }

}
