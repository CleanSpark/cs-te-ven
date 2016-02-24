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


/**
 * Response adding information to manage event-based messages
 * 
 * <p>Java class for EiEventResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EiEventResponseType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://docs.oasis-open.org/ns/energyinterop/201110}EiResponseType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}qualifiedEventID"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/energyinterop/201110}optType"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EiEventResponseType", propOrder = {
    "qualifiedEventID",
    "optType"
})
public class EiEventResponseType
    extends EiResponseType
{

    @XmlElement(required = true)
    protected QualifiedEventIDType qualifiedEventID;
    @XmlElement(required = true)
    protected OptTypeType optType;

    /**
     * Gets the value of the qualifiedEventID property.
     * 
     * @return
     *     possible object is
     *     {@link QualifiedEventIDType }
     *     
     */
    public QualifiedEventIDType getQualifiedEventID() {
        return qualifiedEventID;
    }

    /**
     * Sets the value of the qualifiedEventID property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualifiedEventIDType }
     *     
     */
    public void setQualifiedEventID(QualifiedEventIDType value) {
        this.qualifiedEventID = value;
    }

    public boolean isSetQualifiedEventID() {
        return (this.qualifiedEventID!= null);
    }

    /**
     * Gets the value of the optType property.
     * 
     * @return
     *     possible object is
     *     {@link OptTypeType }
     *     
     */
    public OptTypeType getOptType() {
        return optType;
    }

    /**
     * Sets the value of the optType property.
     * 
     * @param value
     *     allowed object is
     *     {@link OptTypeType }
     *     
     */
    public void setOptType(OptTypeType value) {
        this.optType = value;
    }

    public boolean isSetOptType() {
        return (this.optType!= null);
    }

}
