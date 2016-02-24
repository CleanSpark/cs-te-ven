//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package ietf.params.xml.ns.icalendar_2;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *        status          = "STATUS" statparam ":" statvalue CRLF
 * 
 *        statparam       = *(";" other-param)
 * 
 *        statvalue       = (statvalue-event
 *                        /  statvalue-todo
 *                        /  statvalue-jour)
 * 
 *        statvalue-event = "TENTATIVE"    ;Indicates event is tentative.
 *                        / "CONFIRMED"    ;Indicates event is definite.
 *                        / "CANCELLED"    ;Indicates event was cancelled.
 *        ;Status values for a "VEVENT"
 * 
 *        statvalue-todo  = "NEEDS-ACTION" ;Indicates to-do needs action.
 *                        / "COMPLETED"    ;Indicates to-do completed.
 *                        / "IN-PROCESS"   ;Indicates to-do in process of.
 *                        / "CANCELLED"    ;Indicates to-do was cancelled.
 *        ;Status values for "VTODO".
 * 
 *        statvalue-jour  = "DRAFT"        ;Indicates journal is draft.
 *                        / "FINAL"        ;Indicates journal is final.
 *                        / "CANCELLED"    ;Indicates journal is removed.
 *       ;Status values for "VJOURNAL".
 *       
 * 
 * <p>Java class for StatusPropType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StatusPropType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:icalendar-2.0}TextPropertyType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StatusPropType")
public class StatusPropType
    extends TextPropertyType
{


}
