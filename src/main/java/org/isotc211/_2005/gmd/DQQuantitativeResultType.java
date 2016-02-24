//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package org.isotc211._2005.gmd;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.isotc211._2005.gco.CharacterStringPropertyType;
import org.isotc211._2005.gco.RecordPropertyType;
import org.isotc211._2005.gco.RecordTypePropertyType;
import org.isotc211._2005.gco.UnitOfMeasurePropertyType;


/**
 * Quantitative_conformance_measure from Quality Procedures.  -  - Renamed to remove implied use limitation -  - OCL - -- result is type specified by valueDomain - result.tupleType = valueDomain
 * 
 * <p>Java class for DQ_QuantitativeResult_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DQ_QuantitativeResult_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.isotc211.org/2005/gmd}AbstractDQ_Result_Type">
 *       &lt;sequence>
 *         &lt;element name="valueType" type="{http://www.isotc211.org/2005/gco}RecordType_PropertyType" minOccurs="0"/>
 *         &lt;element name="valueUnit" type="{http://www.isotc211.org/2005/gco}UnitOfMeasure_PropertyType"/>
 *         &lt;element name="errorStatistic" type="{http://www.isotc211.org/2005/gco}CharacterString_PropertyType" minOccurs="0"/>
 *         &lt;element name="value" type="{http://www.isotc211.org/2005/gco}Record_PropertyType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DQ_QuantitativeResult_Type", propOrder = {
    "valueType",
    "valueUnit",
    "errorStatistic",
    "value"
})
public class DQQuantitativeResultType
    extends AbstractDQResultType
{

    protected RecordTypePropertyType valueType;
    @XmlElement(required = true)
    protected UnitOfMeasurePropertyType valueUnit;
    protected CharacterStringPropertyType errorStatistic;
    @XmlElement(required = true)
    protected List<RecordPropertyType> value;

    /**
     * Gets the value of the valueType property.
     * 
     * @return
     *     possible object is
     *     {@link RecordTypePropertyType }
     *     
     */
    public RecordTypePropertyType getValueType() {
        return valueType;
    }

    /**
     * Sets the value of the valueType property.
     * 
     * @param value
     *     allowed object is
     *     {@link RecordTypePropertyType }
     *     
     */
    public void setValueType(RecordTypePropertyType value) {
        this.valueType = value;
    }

    public boolean isSetValueType() {
        return (this.valueType!= null);
    }

    /**
     * Gets the value of the valueUnit property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasurePropertyType }
     *     
     */
    public UnitOfMeasurePropertyType getValueUnit() {
        return valueUnit;
    }

    /**
     * Sets the value of the valueUnit property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasurePropertyType }
     *     
     */
    public void setValueUnit(UnitOfMeasurePropertyType value) {
        this.valueUnit = value;
    }

    public boolean isSetValueUnit() {
        return (this.valueUnit!= null);
    }

    /**
     * Gets the value of the errorStatistic property.
     * 
     * @return
     *     possible object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public CharacterStringPropertyType getErrorStatistic() {
        return errorStatistic;
    }

    /**
     * Sets the value of the errorStatistic property.
     * 
     * @param value
     *     allowed object is
     *     {@link CharacterStringPropertyType }
     *     
     */
    public void setErrorStatistic(CharacterStringPropertyType value) {
        this.errorStatistic = value;
    }

    public boolean isSetErrorStatistic() {
        return (this.errorStatistic!= null);
    }

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RecordPropertyType }
     * 
     * 
     */
    public List<RecordPropertyType> getValue() {
        if (value == null) {
            value = new ArrayList<RecordPropertyType>();
        }
        return this.value;
    }

    public boolean isSetValue() {
        return ((this.value!= null)&&(!this.value.isEmpty()));
    }

    public void unsetValue() {
        this.value = null;
    }

}
