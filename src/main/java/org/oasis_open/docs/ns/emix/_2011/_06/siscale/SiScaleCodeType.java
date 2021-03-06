//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package org.oasis_open.docs.ns.emix._2011._06.siscale;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SiScaleCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="SiScaleCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="p"/>
 *     &lt;enumeration value="n"/>
 *     &lt;enumeration value="micro"/>
 *     &lt;enumeration value="m"/>
 *     &lt;enumeration value="c"/>
 *     &lt;enumeration value="d"/>
 *     &lt;enumeration value="k"/>
 *     &lt;enumeration value="M"/>
 *     &lt;enumeration value="G"/>
 *     &lt;enumeration value="T"/>
 *     &lt;enumeration value="none"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "SiScaleCodeType", namespace = "http://docs.oasis-open.org/ns/emix/2011/06/siscale")
@XmlEnum
public enum SiScaleCodeType {


    /**
     * Pico 10**-12
     * 
     */
    @XmlEnumValue("p")
    VALUE_1("p"),

    /**
     * Nano 10**-9
     * 
     */
    @XmlEnumValue("n")
    VALUE_2("n"),

    /**
     * Micro 10**-6
     * 
     */
    @XmlEnumValue("micro")
    VALUE_3("micro"),

    /**
     * Milli 10**-3
     * 
     */
    @XmlEnumValue("m")
    VALUE_4("m"),

    /**
     * Centi 10**-2
     * 
     */
    @XmlEnumValue("c")
    VALUE_5("c"),

    /**
     * Deci 10**-1
     * 
     */
    @XmlEnumValue("d")
    VALUE_6("d"),

    /**
     * Kilo 10**3
     * 
     */
    @XmlEnumValue("k")
    VALUE_7("k"),

    /**
     * Mega 10**6
     * 
     */
    @XmlEnumValue("M")
    VALUE_8("M"),

    /**
     * Giga 10**9
     * 
     */
    @XmlEnumValue("G")
    VALUE_9("G"),

    /**
     * Tera 10**12
     * 
     */
    @XmlEnumValue("T")
    VALUE_10("T"),

    /**
     * Native Scale
     * 
     */
    @XmlEnumValue("none")
    VALUE_11("none");
    private final String value;

    SiScaleCodeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static SiScaleCodeType fromValue(String v) {
        for (SiScaleCodeType c: SiScaleCodeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
