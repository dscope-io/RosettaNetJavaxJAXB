
package io.dscope.rosettanet.interchange.codelist.quotelineitemstatus.v01_00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for QuoteLineItemStatusContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="QuoteLineItemStatusContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BID"/&gt;
 *     &lt;enumeration value="NBI"/&gt;
 *     &lt;enumeration value="PEN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "QuoteLineItemStatusContentType")
@XmlEnum
public enum QuoteLineItemStatusContentType {

    BID,
    NBI,
    PEN;

    public String value() {
        return name();
    }

    public static QuoteLineItemStatusContentType fromValue(String v) {
        return valueOf(v);
    }

}
