//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package ietf.params.xml.ns.icalendar_2;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;
import org.oasis_open.docs.ns.emix._2011._06.MeasurementType;
import org.oasis_open.docs.ns.emix._2011._06.ProductDescriptionType;
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


/**
 * types the content of the xCal attach element
 * 
 * <p>Java class for WsCalendarAttachType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WsCalendarAttachType">
 *   &lt;complexContent>
 *     &lt;extension base="{urn:ietf:params:xml:ns:icalendar-2.0}BasePropertyType">
 *       &lt;choice maxOccurs="unbounded" minOccurs="0">
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}artifact"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}artifactBase"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}uri"/>
 *         &lt;element ref="{urn:ietf:params:xml:ns:icalendar-2.0}text"/>
 *       &lt;/choice>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WsCalendarAttachType", propOrder = {
    "artifactOrArtifactBaseOrUri"
})
public class WsCalendarAttachType
    extends BasePropertyType
{

    @XmlElementRefs({
        @XmlElementRef(name = "text", namespace = "urn:ietf:params:xml:ns:icalendar-2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "artifactBase", namespace = "urn:ietf:params:xml:ns:icalendar-2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "artifact", namespace = "urn:ietf:params:xml:ns:icalendar-2.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "uri", namespace = "urn:ietf:params:xml:ns:icalendar-2.0", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> artifactOrArtifactBaseOrUri;

    /**
     * Gets the value of the artifactOrArtifactBaseOrUri property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the artifactOrArtifactBaseOrUri property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getArtifactOrArtifactBaseOrUri().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link ArtifactBaseType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link TransportProductDescriptionType }{@code >}
     * {@link JAXBElement }{@code <}{@link RegulationServiceType }{@code >}
     * {@link JAXBElement }{@code <}{@link FullRequirementsPowerType }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link ProductDescriptionType }{@code >}
     * {@link JAXBElement }{@code <}{@link BlockPowerFullRequirementsType }{@code >}
     * {@link JAXBElement }{@code <}{@link LoadReductionType }{@code >}
     * {@link JAXBElement }{@code <}{@link GenerationType }{@code >}
     * {@link JAXBElement }{@code <}{@link ActiveReserveType }{@code >}
     * {@link JAXBElement }{@code <}{@link MeasurementType }{@code >}
     * {@link JAXBElement }{@code <}{@link TemixPowerType }{@code >}
     * {@link JAXBElement }{@code <}{@link ArtifactType }{@code >}
     * {@link JAXBElement }{@code <}{@link PowerProductDescriptionType }{@code >}
     * {@link JAXBElement }{@code <}{@link ProductVoltageRegulationType }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getArtifactOrArtifactBaseOrUri() {
        if (artifactOrArtifactBaseOrUri == null) {
            artifactOrArtifactBaseOrUri = new ArrayList<JAXBElement<?>>();
        }
        return this.artifactOrArtifactBaseOrUri;
    }

    public boolean isSetArtifactOrArtifactBaseOrUri() {
        return ((this.artifactOrArtifactBaseOrUri!= null)&&(!this.artifactOrArtifactBaseOrUri.isEmpty()));
    }

    public void unsetArtifactOrArtifactBaseOrUri() {
        this.artifactOrArtifactBaseOrUri = null;
    }

}
