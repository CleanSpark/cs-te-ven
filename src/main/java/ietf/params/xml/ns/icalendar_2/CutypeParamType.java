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
 *        cutypeparam        = "CUTYPE" "="
 *                           ("INDIVIDUAL"   ; An individual
 *                          / "GROUP"        ; A group of individuals
 *                          / "RESOURCE"     ; A physical resource
 *                          / "ROOM"         ; A room resource
 *                          / "UNKNOWN"      ; Otherwise not known
 *                          / x-name         ; Experimental type
 *                          / iana-token)    ; Other IANA-registered
 *                                           ; type
 *        ; Default is INDIVIDUAL
 *       
 * 
 * <p>Java class for CutypeParamType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CutypeParamType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:icalendar-2.0}TextParameterType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CutypeParamType")
public class CutypeParamType
    extends TextParameterType
{


}
