
package io.dscope.rosettanet.domain.manufacturing.codelist.waferbacksidefinish.v01_04;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for WaferBackSideFinishContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="WaferBackSideFinishContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="COA"/&gt;
 *     &lt;enumeration value="FIN"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "WaferBackSideFinishContentType")
@XmlEnum
public enum WaferBackSideFinishContentType {

    COA,
    FIN;

    public String value() {
        return name();
    }

    public static WaferBackSideFinishContentType fromValue(String v) {
        return valueOf(v);
    }

}
