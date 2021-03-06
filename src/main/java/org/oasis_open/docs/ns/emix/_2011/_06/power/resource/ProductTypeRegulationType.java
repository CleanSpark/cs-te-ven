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
 * <p>Java class for ProductTypeRegulationType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="ProductTypeRegulationType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="regulationUp"/>
 *     &lt;enumeration value="regulationDn"/>
 *     &lt;enumeration value="regulationUp-Dn"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProductTypeRegulationType")
@XmlEnum
public enum ProductTypeRegulationType {

    @XmlEnumValue("regulationUp")
    REGULATION_UP("regulationUp"),
    @XmlEnumValue("regulationDn")
    REGULATION_DN("regulationDn"),
    @XmlEnumValue("regulationUp-Dn")
    REGULATION_UP_DN("regulationUp-Dn");
    private final String value;

    ProductTypeRegulationType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ProductTypeRegulationType fromValue(String v) {
        for (ProductTypeRegulationType c: ProductTypeRegulationType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
