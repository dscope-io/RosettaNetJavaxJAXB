
package io.dscope.rosettanet.universal.codelist.processroleidentifier.v01_03;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProcessRoleIdentifierContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ProcessRoleIdentifierContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ADM"/&gt;
 *     &lt;enumeration value="ALT"/&gt;
 *     &lt;enumeration value="APP"/&gt;
 *     &lt;enumeration value="BIF"/&gt;
 *     &lt;enumeration value="BIT"/&gt;
 *     &lt;enumeration value="CNC"/&gt;
 *     &lt;enumeration value="COR"/&gt;
 *     &lt;enumeration value="COW"/&gt;
 *     &lt;enumeration value="CRA"/&gt;
 *     &lt;enumeration value="CRE"/&gt;
 *     &lt;enumeration value="DIS"/&gt;
 *     &lt;enumeration value="FIN"/&gt;
 *     &lt;enumeration value="FOR"/&gt;
 *     &lt;enumeration value="INL"/&gt;
 *     &lt;enumeration value="INO"/&gt;
 *     &lt;enumeration value="ITF"/&gt;
 *     &lt;enumeration value="ITT"/&gt;
 *     &lt;enumeration value="MFG"/&gt;
 *     &lt;enumeration value="OWN"/&gt;
 *     &lt;enumeration value="PUR"/&gt;
 *     &lt;enumeration value="REA"/&gt;
 *     &lt;enumeration value="REC"/&gt;
 *     &lt;enumeration value="REQ"/&gt;
 *     &lt;enumeration value="RES"/&gt;
 *     &lt;enumeration value="RET"/&gt;
 *     &lt;enumeration value="REV"/&gt;
 *     &lt;enumeration value="SBF"/&gt;
 *     &lt;enumeration value="SBT"/&gt;
 *     &lt;enumeration value="SCP"/&gt;
 *     &lt;enumeration value="SHF"/&gt;
 *     &lt;enumeration value="SHT"/&gt;
 *     &lt;enumeration value="SLD"/&gt;
 *     &lt;enumeration value="SOB"/&gt;
 *     &lt;enumeration value="SPL"/&gt;
 *     &lt;enumeration value="SRT"/&gt;
 *     &lt;enumeration value="TFR"/&gt;
 *     &lt;enumeration value="TRA"/&gt;
 *     &lt;enumeration value="TTR"/&gt;
 *     &lt;enumeration value="ULR"/&gt;
 *     &lt;enumeration value="USE"/&gt;
 *     &lt;enumeration value="SVA"/&gt;
 *     &lt;enumeration value="RTT"/&gt;
 *     &lt;enumeration value="CBK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ProcessRoleIdentifierContentType")
@XmlEnum
public enum ProcessRoleIdentifierContentType {

    ADM,
    ALT,
    APP,
    BIF,
    BIT,
    CNC,
    COR,
    COW,
    CRA,
    CRE,
    DIS,
    FIN,
    FOR,
    INL,
    INO,
    ITF,
    ITT,
    MFG,
    OWN,
    PUR,
    REA,
    REC,
    REQ,
    RES,
    RET,
    REV,
    SBF,
    SBT,
    SCP,
    SHF,
    SHT,
    SLD,
    SOB,
    SPL,
    SRT,
    TFR,
    TRA,
    TTR,
    ULR,
    USE,
    SVA,
    RTT,
    CBK;

    public String value() {
        return name();
    }

    public static ProcessRoleIdentifierContentType fromValue(String v) {
        return valueOf(v);
    }

}
