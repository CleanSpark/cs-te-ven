//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package org.oasis_open.docs.ns.energyinterop._201110;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for EiSmoothingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="EiSmoothingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="ramp"/>
 *     &lt;enumeration value="uniform"/>
 *     &lt;enumeration value="none"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "EiSmoothingType")
@XmlEnum
public enum EiSmoothingType {


    /**
     * A smooth or uniform step ramp is indicated between the initial and end values in the respective Tolerance Interval.
     * 
     */
    @XmlEnumValue("ramp")
    RAMP("ramp"),

    /**
     * A uniform distribution is indicated over the entire respective Tolerance Interval.
     * 
     */
    @XmlEnumValue("uniform")
    UNIFORM("uniform"),

    /**
     * No specific smoothing is indicated. Applications need not react in a stepwise manner, so some degree of smoothing MAY occur in response to this request. If the Smoothing Term is absent, the behavior requested is the same as None.
     * 
     */
    @XmlEnumValue("none")
    NONE("none");
    private final String value;

    EiSmoothingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static EiSmoothingType fromValue(String v) {
        for (EiSmoothingType c: EiSmoothingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
