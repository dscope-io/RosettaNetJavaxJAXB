
package io.dscope.rosettanet.domain.procurement.codelist.saletype.v01_00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SaleTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="SaleTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="PUR"/&gt;
 *     &lt;enumeration value="LSE"/&gt;
 *     &lt;enumeration value="RMK"/&gt;
 *     &lt;enumeration value="CSG"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "SaleTypeContentType")
@XmlEnum
public enum SaleTypeContentType {

    PUR,
    LSE,
    RMK,
    CSG;

    public String value() {
        return name();
    }

    public static SaleTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
