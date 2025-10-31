
package io.dscope.rosettanet.domain.procurement.codelist.monetaryamounttype.v01_00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for MonetaryAmountTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="MonetaryAmountTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ZER"/&gt;
 *     &lt;enumeration value="DEB"/&gt;
 *     &lt;enumeration value="CRE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "MonetaryAmountTypeContentType")
@XmlEnum
public enum MonetaryAmountTypeContentType {

    ZER,
    DEB,
    CRE;

    public String value() {
        return name();
    }

    public static MonetaryAmountTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
