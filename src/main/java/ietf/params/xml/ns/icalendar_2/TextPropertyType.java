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
 * <p>Java class for TextPropertyType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TextPropertyType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:icalendar-2.0}BasePropertyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}text"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TextPropertyType", propOrder = {
    "text"
})
@XmlSeeAlso({
    SummaryPropType.class,
    XBedeworkExsynchLastmodPropType.class,
    WsCalendarTypeType.class,
    CommentPropType.class,
    ContactPropType.class,
    TznamePropType.class,
    VersionPropType.class,
    MethodPropType.class,
    UidPropType.class,
    LocationPropType.class,
    XMicrosoftCdoIntendedstatusPropType.class,
    ProdidPropType.class,
    XBedeworkCostPropType.class,
    XBedeworkExsynchStarttzidPropType.class,
    XBedeworkExsynchEndtzidPropType.class,
    DescriptionPropType.class,
    ActionPropType.class,
    StatusPropType.class,
    ClassPropType.class,
    XMicrosoftCdoBusystatusPropType.class,
    TranspPropType.class,
    BusytypePropType.class,
    TzidPropType.class
})
public class TextPropertyType
    extends BasePropertyType
{

    @XmlElement(required = true)
    protected String text;

    /**
     * Gets the value of the text property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * Sets the value of the text property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    public boolean isSetText() {
        return (this.text!= null);
    }

}
