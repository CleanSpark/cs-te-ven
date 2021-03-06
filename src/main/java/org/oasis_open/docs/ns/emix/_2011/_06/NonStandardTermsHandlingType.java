//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.02.05 at 11:06:51 AM PST 
//


package org.oasis_open.docs.ns.emix._2011._06;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonStandardTermsHandlingType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="NonStandardTermsHandlingType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="mustAccept"/>
 *     &lt;enumeration value="ignore"/>
 *     &lt;enumeration value="mustUnderstand"/>
 *     &lt;enumeration value="reject"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "NonStandardTermsHandlingType")
@XmlEnum
public enum NonStandardTermsHandlingType {


    /**
     * Participants must accept messages even if they contain rules not listed here that the party does not understand.
     * 
     */
    @XmlEnumValue("mustAccept")
    MUST_ACCEPT("mustAccept"),

    /**
     * Participants must ignore any rule not listed
     * 
     */
    @XmlEnumValue("ignore")
    IGNORE("ignore"),

    /**
     * Participants must reject any message containing a rule not listed here unless is it understoo.
     * 
     */
    @XmlEnumValue("mustUnderstand")
    MUST_UNDERSTAND("mustUnderstand"),

    /**
     * Participants in this market will reject all message containing rules not itemized in market rules.
     * 
     */
    @XmlEnumValue("reject")
    REJECT("reject");
    private final String value;

    NonStandardTermsHandlingType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static NonStandardTermsHandlingType fromValue(String v) {
        for (NonStandardTermsHandlingType c: NonStandardTermsHandlingType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
