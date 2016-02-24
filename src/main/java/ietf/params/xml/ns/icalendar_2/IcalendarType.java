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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IcalendarType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IcalendarType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vcalendar" type="{urn:ietf:params:xml:ns:icalendar-2.0}VcalendarType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IcalendarType", propOrder = {
    "vcalendar"
})
public class IcalendarType {

    @XmlElement(required = true)
    protected List<VcalendarType> vcalendar;

    /**
     * Gets the value of the vcalendar property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vcalendar property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVcalendar().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VcalendarType }
     * 
     * 
     */
    public List<VcalendarType> getVcalendar() {
        if (vcalendar == null) {
            vcalendar = new ArrayList<VcalendarType>();
        }
        return this.vcalendar;
    }

    public boolean isSetVcalendar() {
        return ((this.vcalendar!= null)&&(!this.vcalendar.isEmpty()));
    }

    public void unsetVcalendar() {
        this.vcalendar = null;
    }

}