//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package ietf.params.xml.ns.icalendar_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         This type is the basis for all components that can be contained within
 *         a vcalendar component
 *       
 * 
 * <p>Java class for VcalendarContainedComponentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VcalendarContainedComponentType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:icalendar-2.0}BaseComponentType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VcalendarContainedComponentType")
@XmlSeeAlso({
    VfreebusyType.class,
    WsCalendarIntervalType.class,
    WsCalendarGluonType.class,
    VavailabilityType.class,
    VjournalType.class,
    VtimezoneType.class,
    EventTodoComponentType.class
})
public class VcalendarContainedComponentType
    extends BaseComponentType
{


}
