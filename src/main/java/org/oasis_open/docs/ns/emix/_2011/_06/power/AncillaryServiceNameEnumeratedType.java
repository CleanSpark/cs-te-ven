//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package org.oasis_open.docs.ns.emix._2011._06.power;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AncillaryServiceNameEnumeratedType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AncillaryServiceNameEnumeratedType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="operatingReserve"/>
 *     &lt;enumeration value="regulationServiceUp"/>
 *     &lt;enumeration value="regulationServiceDown"/>
 *     &lt;enumeration value="regulationServiceUpDown"/>
 *     &lt;enumeration value="synchronizedReserve"/>
 *     &lt;enumeration value="nonSynchronizedReserve"/>
 *     &lt;enumeration value="blackStartRecovery"/>
 *     &lt;enumeration value="reactivePower"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "AncillaryServiceNameEnumeratedType")
@XmlEnum
public enum AncillaryServiceNameEnumeratedType {

    @XmlEnumValue("operatingReserve")
    OPERATING_RESERVE("operatingReserve"),
    @XmlEnumValue("regulationServiceUp")
    REGULATION_SERVICE_UP("regulationServiceUp"),
    @XmlEnumValue("regulationServiceDown")
    REGULATION_SERVICE_DOWN("regulationServiceDown"),
    @XmlEnumValue("regulationServiceUpDown")
    REGULATION_SERVICE_UP_DOWN("regulationServiceUpDown"),
    @XmlEnumValue("synchronizedReserve")
    SYNCHRONIZED_RESERVE("synchronizedReserve"),
    @XmlEnumValue("nonSynchronizedReserve")
    NON_SYNCHRONIZED_RESERVE("nonSynchronizedReserve"),
    @XmlEnumValue("blackStartRecovery")
    BLACK_START_RECOVERY("blackStartRecovery"),
    @XmlEnumValue("reactivePower")
    REACTIVE_POWER("reactivePower");
    private final String value;

    AncillaryServiceNameEnumeratedType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static AncillaryServiceNameEnumeratedType fromValue(String v) {
        for (AncillaryServiceNameEnumeratedType c: AncillaryServiceNameEnumeratedType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}