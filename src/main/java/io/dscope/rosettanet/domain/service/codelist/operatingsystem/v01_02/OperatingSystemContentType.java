
package io.dscope.rosettanet.domain.service.codelist.operatingsystem.v01_02;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for OperatingSystemContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="OperatingSystemContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BAN"/&gt;
 *     &lt;enumeration value="DOS"/&gt;
 *     &lt;enumeration value="NAP"/&gt;
 *     &lt;enumeration value="NOV"/&gt;
 *     &lt;enumeration value="OS2"/&gt;
 *     &lt;enumeration value="UNI"/&gt;
 *     &lt;enumeration value="WIN"/&gt;
 *     &lt;enumeration value="WNT"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "OperatingSystemContentType")
@XmlEnum
public enum OperatingSystemContentType {

    BAN("BAN"),
    DOS("DOS"),
    NAP("NAP"),
    NOV("NOV"),
    @XmlEnumValue("OS2")
    OS_2("OS2"),
    UNI("UNI"),
    WIN("WIN"),
    WNT("WNT");
    private final String value;

    OperatingSystemContentType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static OperatingSystemContentType fromValue(String v) {
        for (OperatingSystemContentType c: OperatingSystemContentType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
