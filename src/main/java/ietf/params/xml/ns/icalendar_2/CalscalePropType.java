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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CalscalePropType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CalscalePropType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:icalendar-2.0}BasePropertyType">
 *       &lt;sequence>
 *         &lt;element name="text" type="{urn:ietf:params:xml:ns:icalendar-2.0}CalscaleValueType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CalscalePropType", propOrder = {
    "text"
})
public class CalscalePropType
    extends BasePropertyType
{

    @XmlElement(required = true)
    protected CalscaleValueType text;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link CalscaleValueType }
     *     
     */
    public CalscaleValueType getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link CalscaleValueType }
     *     
     */
    public void setText(CalscaleValueType value) {
        this.text = value;
    }

    public boolean isSetText() {
        return (this.text!= null);
    }

}
