
package io.dscope.rosettanet.domain.procurement.codelist.bookpricequalifier.v01_02;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BookPriceQualifierContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="BookPriceQualifierContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AVC"/&gt;
 *     &lt;enumeration value="LNC"/&gt;
 *     &lt;enumeration value="NTC"/&gt;
 *     &lt;enumeration value="RPC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "BookPriceQualifierContentType")
@XmlEnum
public enum BookPriceQualifierContentType {

    AVC,
    LNC,
    NTC,
    RPC;

    public String value() {
        return name();
    }

    public static BookPriceQualifierContentType fromValue(String v) {
        return valueOf(v);
    }

}
