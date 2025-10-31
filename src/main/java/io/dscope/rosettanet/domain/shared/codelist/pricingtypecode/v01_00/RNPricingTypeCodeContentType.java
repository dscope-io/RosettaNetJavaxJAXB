
package io.dscope.rosettanet.domain.shared.codelist.pricingtypecode.v01_00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RN_PricingTypeCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RN_PricingTypeCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ACR"/&gt;
 *     &lt;enumeration value="ACS"/&gt;
 *     &lt;enumeration value="ACT"/&gt;
 *     &lt;enumeration value="ANY"/&gt;
 *     &lt;enumeration value="ARS"/&gt;
 *     &lt;enumeration value="ASP"/&gt;
 *     &lt;enumeration value="BPP"/&gt;
 *     &lt;enumeration value="BSH"/&gt;
 *     &lt;enumeration value="CAT"/&gt;
 *     &lt;enumeration value="CMC"/&gt;
 *     &lt;enumeration value="CMD"/&gt;
 *     &lt;enumeration value="CMF"/&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="COS"/&gt;
 *     &lt;enumeration value="DBC"/&gt;
 *     &lt;enumeration value="DFR"/&gt;
 *     &lt;enumeration value="DIS"/&gt;
 *     &lt;enumeration value="DPD"/&gt;
 *     &lt;enumeration value="DTP"/&gt;
 *     &lt;enumeration value="EDU"/&gt;
 *     &lt;enumeration value="ERT"/&gt;
 *     &lt;enumeration value="EXC"/&gt;
 *     &lt;enumeration value="FGM"/&gt;
 *     &lt;enumeration value="GEN"/&gt;
 *     &lt;enumeration value="HIE"/&gt;
 *     &lt;enumeration value="LCL"/&gt;
 *     &lt;enumeration value="LGM"/&gt;
 *     &lt;enumeration value="LIS"/&gt;
 *     &lt;enumeration value="MPR"/&gt;
 *     &lt;enumeration value="MRP"/&gt;
 *     &lt;enumeration value="MSR"/&gt;
 *     &lt;enumeration value="MUS"/&gt;
 *     &lt;enumeration value="NPF"/&gt;
 *     &lt;enumeration value="OEM"/&gt;
 *     &lt;enumeration value="OVP"/&gt;
 *     &lt;enumeration value="PED"/&gt;
 *     &lt;enumeration value="RCS"/&gt;
 *     &lt;enumeration value="RFB"/&gt;
 *     &lt;enumeration value="RIN"/&gt;
 *     &lt;enumeration value="RSP"/&gt;
 *     &lt;enumeration value="SCE"/&gt;
 *     &lt;enumeration value="SEC"/&gt;
 *     &lt;enumeration value="SED"/&gt;
 *     &lt;enumeration value="SEV"/&gt;
 *     &lt;enumeration value="SGM"/&gt;
 *     &lt;enumeration value="SPE"/&gt;
 *     &lt;enumeration value="SPL"/&gt;
 *     &lt;enumeration value="SRP"/&gt;
 *     &lt;enumeration value="STR"/&gt;
 *     &lt;enumeration value="THP"/&gt;
 *     &lt;enumeration value="TOC"/&gt;
 *     &lt;enumeration value="QUO"/&gt;
 *     &lt;enumeration value="SPD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RN_PricingTypeCodeContentType")
@XmlEnum
public enum RNPricingTypeCodeContentType {

    ACR,
    ACS,
    ACT,
    ANY,
    ARS,
    ASP,
    BPP,
    BSH,
    CAT,
    CMC,
    CMD,
    CMF,
    CON,
    COS,
    DBC,
    DFR,
    DIS,
    DPD,
    DTP,
    EDU,
    ERT,
    EXC,
    FGM,
    GEN,
    HIE,
    LCL,
    LGM,
    LIS,
    MPR,
    MRP,
    MSR,
    MUS,
    NPF,
    OEM,
    OVP,
    PED,
    RCS,
    RFB,
    RIN,
    RSP,
    SCE,
    SEC,
    SED,
    SEV,
    SGM,
    SPE,
    SPL,
    SRP,
    STR,
    THP,
    TOC,
    QUO,
    SPD;

    public String value() {
        return name();
    }

    public static RNPricingTypeCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
