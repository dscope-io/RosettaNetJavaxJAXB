
package io.dscope.rosettanet.interchange.codelist.documentissuancetype.v02_00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentIssuanceTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DocumentIssuanceTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ORI"/&gt;
 *     &lt;enumeration value="POR"/&gt;
 *     &lt;enumeration value="PRP"/&gt;
 *     &lt;enumeration value="REP"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentIssuanceTypeContentType")
@XmlEnum
public enum DocumentIssuanceTypeContentType {

    ORI,
    POR,
    PRP,
    REP;

    public String value() {
        return name();
    }

    public static DocumentIssuanceTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
