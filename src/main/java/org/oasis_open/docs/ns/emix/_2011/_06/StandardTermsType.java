//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package org.oasis_open.docs.ns.emix._2011._06;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import ietf.params.xml.ns.icalendar_2.DurationPropType;
import ietf.params.xml.ns.icalendar_2.TzidParamType;
import org.oasis_open.docs.ns.emix._2011._06.power.BlockPowerFullRequirementsType;
import org.oasis_open.docs.ns.emix._2011._06.power.FullRequirementsPowerType;
import org.oasis_open.docs.ns.emix._2011._06.power.PowerProductDescriptionType;
import org.oasis_open.docs.ns.emix._2011._06.power.TemixPowerType;
import org.oasis_open.docs.ns.emix._2011._06.power.TransportProductDescriptionType;
import org.oasis_open.docs.ns.emix._2011._06.power.resource.ActiveReserveType;
import org.oasis_open.docs.ns.emix._2011._06.power.resource.GenerationType;
import org.oasis_open.docs.ns.emix._2011._06.power.resource.LoadReductionType;
import org.oasis_open.docs.ns.emix._2011._06.power.resource.ProductVoltageRegulationType;
import org.oasis_open.docs.ns.emix._2011._06.power.resource.RegulationServiceType;
import un.unece.uncefact.codelist.standard._5.iso42173a._2010_04_07.ISO3AlphaCurrencyCodeContentType;


/**
 * Standard Terms express overarching terms for a market context
 * 
 * <p>Java class for StandardTermsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StandardTermsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}marketContext"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}marketContextName" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}standardTermsSet" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}productDescription" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}granularity" minOccurs="0"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}tzid" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}currency" minOccurs="0"/>
 *         &lt;element ref="{http://docs.oasis-open.org/ns/emix/2011/06}nonStandardTermsHandling" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StandardTermsType", propOrder = {
    "marketContext",
    "marketContextName",
    "standardTermsSet",
    "productDescription",
    "granularity",
    "tzid",
    "currency",
    "nonStandardTermsHandling"
})
public class StandardTermsType {

    @XmlElement(required = true)
    protected String marketContext;
    protected String marketContextName;
    protected List<StandardTermsSetType> standardTermsSet;
    @XmlElementRef(name = "productDescription", namespace = "http://docs.oasis-open.org/ns/emix/2011/06", type = JAXBElement.class, required = false)
    protected JAXBElement<? extends ProductDescriptionType> productDescription;
    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0")
    protected DurationPropType granularity;
    @XmlElement(namespace = "urn:ietf:params:xml:ns:icalendar-2.0")
    protected TzidParamType tzid;
    protected ISO3AlphaCurrencyCodeContentType currency;
    protected NonStandardTermsHandlingType nonStandardTermsHandling;

    /**
     * Gets the value of the marketContext property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketContext() {
        return marketContext;
    }

    /**
     * Sets the value of the marketContext property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketContext(String value) {
        this.marketContext = value;
    }

    public boolean isSetMarketContext() {
        return (this.marketContext!= null);
    }

    /**
     * Gets the value of the marketContextName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarketContextName() {
        return marketContextName;
    }

    /**
     * Sets the value of the marketContextName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarketContextName(String value) {
        this.marketContextName = value;
    }

    public boolean isSetMarketContextName() {
        return (this.marketContextName!= null);
    }

    /**
     * Gets the value of the standardTermsSet property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the standardTermsSet property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStandardTermsSet().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link StandardTermsSetType }
     * 
     * 
     */
    public List<StandardTermsSetType> getStandardTermsSet() {
        if (standardTermsSet == null) {
            standardTermsSet = new ArrayList<StandardTermsSetType>();
        }
        return this.standardTermsSet;
    }

    public boolean isSetStandardTermsSet() {
        return ((this.standardTermsSet!= null)&&(!this.standardTermsSet.isEmpty()));
    }

    public void unsetStandardTermsSet() {
        this.standardTermsSet = null;
    }

    /**
     * If present in Standard Terms, then it specifies a single Product Description for all products in the market.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link GenerationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportProductDescriptionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActiveReserveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemixPowerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MeasurementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegulationServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FullRequirementsPowerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProductDescriptionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerProductDescriptionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BlockPowerFullRequirementsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProductVoltageRegulationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LoadReductionType }{@code >}
     *     
     */
    public JAXBElement<? extends ProductDescriptionType> getProductDescription() {
        return productDescription;
    }

    /**
     * Sets the value of the productDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link GenerationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TransportProductDescriptionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ActiveReserveType }{@code >}
     *     {@link JAXBElement }{@code <}{@link TemixPowerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link MeasurementType }{@code >}
     *     {@link JAXBElement }{@code <}{@link RegulationServiceType }{@code >}
     *     {@link JAXBElement }{@code <}{@link FullRequirementsPowerType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProductDescriptionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link PowerProductDescriptionType }{@code >}
     *     {@link JAXBElement }{@code <}{@link BlockPowerFullRequirementsType }{@code >}
     *     {@link JAXBElement }{@code <}{@link ProductVoltageRegulationType }{@code >}
     *     {@link JAXBElement }{@code <}{@link LoadReductionType }{@code >}
     *     
     */
    public void setProductDescription(JAXBElement<? extends ProductDescriptionType> value) {
        this.productDescription = value;
    }

    public boolean isSetProductDescription() {
        return (this.productDescription!= null);
    }

    /**
     * Temporal granularity of market, i.e., a 5 minute market operates in 5 minute chunks, with a fixed offset from the beginning of availability
     * 
     * @return
     *     possible object is
     *     {@link DurationPropType }
     *     
     */
    public DurationPropType getGranularity() {
        return granularity;
    }

    /**
     * Sets the value of the granularity property.
     * 
     * @param value
     *     allowed object is
     *     {@link DurationPropType }
     *     
     */
    public void setGranularity(DurationPropType value) {
        this.granularity = value;
    }

    public boolean isSetGranularity() {
        return (this.granularity!= null);
    }

    /**
     * Time Zone for communications in this market. Applies to "floating" time, i.e., expressions of time that are not in UTC or do not have a Time Zone indicated.
     * 
     * @return
     *     possible object is
     *     {@link TzidParamType }
     *     
     */
    public TzidParamType getTzid() {
        return tzid;
    }

    /**
     * Sets the value of the tzid property.
     * 
     * @param value
     *     allowed object is
     *     {@link TzidParamType }
     *     
     */
    public void setTzid(TzidParamType value) {
        this.tzid = value;
    }

    public boolean isSetTzid() {
        return (this.tzid!= null);
    }

    /**
     * Currency for interactions. If present, becomes the default for all information models.
     * 
     * @return
     *     possible object is
     *     {@link ISO3AlphaCurrencyCodeContentType }
     *     
     */
    public ISO3AlphaCurrencyCodeContentType getCurrency() {
        return currency;
    }

    /**
     * Sets the value of the currency property.
     * 
     * @param value
     *     allowed object is
     *     {@link ISO3AlphaCurrencyCodeContentType }
     *     
     */
    public void setCurrency(ISO3AlphaCurrencyCodeContentType value) {
        this.currency = value;
    }

    public boolean isSetCurrency() {
        return (this.currency!= null);
    }

    /**
     * Gets the value of the nonStandardTermsHandling property.
     * 
     * @return
     *     possible object is
     *     {@link NonStandardTermsHandlingType }
     *     
     */
    public NonStandardTermsHandlingType getNonStandardTermsHandling() {
        return nonStandardTermsHandling;
    }

    /**
     * Sets the value of the nonStandardTermsHandling property.
     * 
     * @param value
     *     allowed object is
     *     {@link NonStandardTermsHandlingType }
     *     
     */
    public void setNonStandardTermsHandling(NonStandardTermsHandlingType value) {
        this.nonStandardTermsHandling = value;
    }

    public boolean isSetNonStandardTermsHandling() {
        return (this.nonStandardTermsHandling!= null);
    }

}
