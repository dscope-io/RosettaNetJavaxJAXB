
package io.dscope.rosettanet.domain.logistics.codelist.preferredstatus.v01_00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PreferredStatusContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PreferredStatusContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ALT"/&gt;
 *     &lt;enumeration value="DIS"/&gt;
 *     &lt;enumeration value="EOL"/&gt;
 *     &lt;enumeration value="NAV"/&gt;
 *     &lt;enumeration value="OTH"/&gt;
 *     &lt;enumeration value="PAP"/&gt;
 *     &lt;enumeration value="PRI"/&gt;
 *     &lt;enumeration value="SPL"/&gt;
 *     &lt;enumeration value="UQU"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PreferredStatusContentType")
@XmlEnum
public enum PreferredStatusContentType {

    ALT,
    DIS,
    EOL,
    NAV,
    OTH,
    PAP,
    PRI,
    SPL,
    UQU;

    public String value() {
        return name();
    }

    public static PreferredStatusContentType fromValue(String v) {
        return valueOf(v);
    }

}
