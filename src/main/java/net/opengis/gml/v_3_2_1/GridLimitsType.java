//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package net.opengis.gml.v_3_2_1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for GridLimitsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="GridLimitsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GridEnvelope" type="{http://www.opengis.net/gml/3.2}GridEnvelopeType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GridLimitsType", propOrder = {
    "gridEnvelope"
})
public class GridLimitsType {

    @XmlElement(name = "GridEnvelope", required = true)
    protected GridEnvelopeType gridEnvelope;

    /**
     * Gets the value of the gridEnvelope property.
     * 
     * @return
     *     possible object is
     *     {@link GridEnvelopeType }
     *     
     */
    public GridEnvelopeType getGridEnvelope() {
        return gridEnvelope;
    }

    /**
     * Sets the value of the gridEnvelope property.
     * 
     * @param value
     *     allowed object is
     *     {@link GridEnvelopeType }
     *     
     */
    public void setGridEnvelope(GridEnvelopeType value) {
        this.gridEnvelope = value;
    }

    public boolean isSetGridEnvelope() {
        return (this.gridEnvelope!= null);
    }

}
