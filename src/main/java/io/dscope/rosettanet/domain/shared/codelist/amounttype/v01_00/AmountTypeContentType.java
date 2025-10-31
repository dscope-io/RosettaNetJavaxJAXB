
package io.dscope.rosettanet.domain.shared.codelist.amounttype.v01_00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AmountTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AmountTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="FRE"/&gt;
 *     &lt;enumeration value="INS"/&gt;
 *     &lt;enumeration value="UNI"/&gt;
 *     &lt;enumeration value="VAD"/&gt;
 *     &lt;enumeration value="MIS"/&gt;
 *     &lt;enumeration value="MAT"/&gt;
 *     &lt;enumeration value="DIS"/&gt;
 *     &lt;enumeration value="TOT"/&gt;
 *     &lt;enumeration value="TOD"/&gt;
 *     &lt;enumeration value="TOV"/&gt;
 *     &lt;enumeration value="PRC"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AmountTypeContentType")
@XmlEnum
public enum AmountTypeContentType {

    FRE,
    INS,
    UNI,
    VAD,
    MIS,
    MAT,
    DIS,
    TOT,
    TOD,
    TOV,
    PRC;

    public String value() {
        return name();
    }

    public static AmountTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
