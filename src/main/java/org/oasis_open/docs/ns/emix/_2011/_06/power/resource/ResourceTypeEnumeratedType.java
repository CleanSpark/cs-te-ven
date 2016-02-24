//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package org.oasis_open.docs.ns.emix._2011._06.power.resource;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ResourceTypeEnumeratedType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ResourceTypeEnumeratedType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="dispatchableHydro"/>
 *     &lt;enumeration value="nonDispatchableHydro"/>
 *     &lt;enumeration value="windGeneration"/>
 *     &lt;enumeration value="solarGeneration"/>
 *     &lt;enumeration value="tollingContract"/>
 *     &lt;enumeration value="aggregateResource"/>
 *     &lt;enumeration value="dispatchableStorage"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ResourceTypeEnumeratedType")
@XmlEnum
public enum ResourceTypeEnumeratedType {

    @XmlEnumValue("dispatchableHydro")
    DISPATCHABLE_HYDRO("dispatchableHydro"),
    @XmlEnumValue("nonDispatchableHydro")
    NON_DISPATCHABLE_HYDRO("nonDispatchableHydro"),
    @XmlEnumValue("windGeneration")
    WIND_GENERATION("windGeneration"),
    @XmlEnumValue("solarGeneration")
    SOLAR_GENERATION("solarGeneration"),
    @XmlEnumValue("tollingContract")
    TOLLING_CONTRACT("tollingContract"),
    @XmlEnumValue("aggregateResource")
    AGGREGATE_RESOURCE("aggregateResource"),
    @XmlEnumValue("dispatchableStorage")
    DISPATCHABLE_STORAGE("dispatchableStorage");
    private final String value;

    ResourceTypeEnumeratedType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ResourceTypeEnumeratedType fromValue(String v) {
        for (ResourceTypeEnumeratedType c: ResourceTypeEnumeratedType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
