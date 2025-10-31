
package io.dscope.rosettanet.domain.manufacturing.codelist.pcmparmtype.v01_04;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PCMParmTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PCMParmTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CSP"/&gt;
 *     &lt;enumeration value="PSR"/&gt;
 *     &lt;enumeration value="WAT"/&gt;
 *     &lt;enumeration value="WLR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PCMParmTypeContentType")
@XmlEnum
public enum PCMParmTypeContentType {

    CSP,
    PSR,
    WAT,
    WLR;

    public String value() {
        return name();
    }

    public static PCMParmTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
