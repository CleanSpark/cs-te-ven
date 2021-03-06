//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package ietf.params.xml.ns.icalendar_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfTimezoneContainedComponents complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfTimezoneContainedComponents">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice maxOccurs="unbounded" minOccurs="0">
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}standard"/>
 *           &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}daylight"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTimezoneContainedComponents", propOrder = {
    "standardOrDaylight"
})
public class ArrayOfTimezoneContainedComponents {

    @XmlElements({
        @XmlElement(name = "standard", type = StandardType.class),
        @XmlElement(name = "daylight", type = DaylightType.class)
    })
    protected List<BaseComponentType> standardOrDaylight;

    /**
     * Gets the value of the standardOrDaylight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardOrDaylight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardOrDaylight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandardType }
     * {@link DaylightType }
     * 
     * 
     */
    public List<BaseComponentType> getStandardOrDaylight() {
        if (standardOrDaylight == null) {
            standardOrDaylight = new ArrayList<BaseComponentType>();
        }
        return this.standardOrDaylight;
    }

    public boolean isSetStandardOrDaylight() {
        return ((this.standardOrDaylight!= null)&&(!this.standardOrDaylight.isEmpty()));
    }

    public void unsetStandardOrDaylight() {
        this.standardOrDaylight = null;
    }

}
