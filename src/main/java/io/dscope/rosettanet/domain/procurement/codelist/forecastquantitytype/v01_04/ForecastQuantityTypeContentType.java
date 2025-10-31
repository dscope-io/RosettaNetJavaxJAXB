
package io.dscope.rosettanet.domain.procurement.codelist.forecastquantitytype.v01_04;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ForecastQuantityTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ForecastQuantityTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="CGD"/&gt;
 *     &lt;enumeration value="CMT"/&gt;
 *     &lt;enumeration value="CND"/&gt;
 *     &lt;enumeration value="DGD"/&gt;
 *     &lt;enumeration value="DND"/&gt;
 *     &lt;enumeration value="DOD"/&gt;
 *     &lt;enumeration value="PAI"/&gt;
 *     &lt;enumeration value="UPD"/&gt;
 *     &lt;enumeration value="UPP"/&gt;
 *     &lt;enumeration value="WQE"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ForecastQuantityTypeContentType")
@XmlEnum
public enum ForecastQuantityTypeContentType {

    CGD,
    CMT,
    CND,
    DGD,
    DND,
    DOD,
    PAI,
    UPD,
    UPP,
    WQE;

    public String value() {
        return name();
    }

    public static ForecastQuantityTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
