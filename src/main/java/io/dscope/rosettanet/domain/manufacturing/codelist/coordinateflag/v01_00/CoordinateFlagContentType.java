
package io.dscope.rosettanet.domain.manufacturing.codelist.coordinateflag.v01_00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CoordinateFlagContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="CoordinateFlagContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="DIE"/&gt;
 *     &lt;enumeration value="RET"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "CoordinateFlagContentType")
@XmlEnum
public enum CoordinateFlagContentType {

    DIE,
    RET;

    public String value() {
        return name();
    }

    public static CoordinateFlagContentType fromValue(String v) {
        return valueOf(v);
    }

}
