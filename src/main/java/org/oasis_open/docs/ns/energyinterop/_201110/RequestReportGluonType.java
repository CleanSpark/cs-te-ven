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
import ietf.params.xml.ns.icalendar_2.WsCalendarGluonType;


/**
 * Used if the Report Specifier includes a Report Interval to influence the expression of that Interval. Information in the Gluon is inherited by the Report Interval in conformance with WS-Calendar.
 * 
 * <p>Java class for RequestReportGluonType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequestReportGluonType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/energyinterop/201110}ReportSchedulerBaseType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}gluon"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RequestReportGluonType", propOrder = {
    "gluon"
})
public class RequestReportGluonType
    extends ReportSchedulerBaseType
{

    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0", required = true)
    protected WsCalendarGluonType gluon;

    /**
     * Gets the value of the gluon property.
     * 
     * @return
     *     possible object is
     *     {@link WsCalendarGluonType }
     *     
     */
    public WsCalendarGluonType getGluon() {
        return gluon;
    }

    /**
     * Sets the value of the gluon property.
     * 
     * @param value
     *     allowed object is
     *     {@link WsCalendarGluonType }
     *     
     */
    public void setGluon(WsCalendarGluonType value) {
        this.gluon = value;
    }

    public boolean isSetGluon() {
        return (this.gluon!= null);
    }

}
