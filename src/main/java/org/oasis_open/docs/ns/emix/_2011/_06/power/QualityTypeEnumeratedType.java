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
 * <p>Java class for QualityTypeEnumeratedType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="QualityTypeEnumeratedType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="guaranteed"/>
 *     &lt;enumeration value="averaged"/>
 *     &lt;enumeration value="projected"/>
 *     &lt;enumeration value="measured"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "QualityTypeEnumeratedType")
@XmlEnum
public enum QualityTypeEnumeratedType {

    @XmlEnumValue("guaranteed")
    GUARANTEED("guaranteed"),
    @XmlEnumValue("averaged")
    AVERAGED("averaged"),
    @XmlEnumValue("projected")
    PROJECTED("projected"),
    @XmlEnumValue("measured")
    MEASURED("measured");
    private final String value;

    QualityTypeEnumeratedType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static QualityTypeEnumeratedType fromValue(String v) {
        for (QualityTypeEnumeratedType c: QualityTypeEnumeratedType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
