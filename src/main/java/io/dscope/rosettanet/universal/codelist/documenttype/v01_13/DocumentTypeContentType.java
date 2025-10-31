
package io.dscope.rosettanet.universal.codelist.documenttype.v01_13;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DocumentTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="DocumentTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="APM"/&gt;
 *     &lt;enumeration value="ARA"/&gt;
 *     &lt;enumeration value="CAR"/&gt;
 *     &lt;enumeration value="CBN"/&gt;
 *     &lt;enumeration value="CCN"/&gt;
 *     &lt;enumeration value="CFA"/&gt;
 *     &lt;enumeration value="CIN"/&gt;
 *     &lt;enumeration value="CNM"/&gt;
 *     &lt;enumeration value="COA"/&gt;
 *     &lt;enumeration value="CON"/&gt;
 *     &lt;enumeration value="COS"/&gt;
 *     &lt;enumeration value="COT"/&gt;
 *     &lt;enumeration value="CRN"/&gt;
 *     &lt;enumeration value="DEM"/&gt;
 *     &lt;enumeration value="DEN"/&gt;
 *     &lt;enumeration value="DIN"/&gt;
 *     &lt;enumeration value="DOR"/&gt;
 *     &lt;enumeration value="DRN"/&gt;
 *     &lt;enumeration value="DRR"/&gt;
 *     &lt;enumeration value="ECO"/&gt;
 *     &lt;enumeration value="EDD"/&gt;
 *     &lt;enumeration value="EIR"/&gt;
 *     &lt;enumeration value="EOL"/&gt;
 *     &lt;enumeration value="FUO"/&gt;
 *     &lt;enumeration value="IDD"/&gt;
 *     &lt;enumeration value="INV"/&gt;
 *     &lt;enumeration value="LID"/&gt;
 *     &lt;enumeration value="MEN"/&gt;
 *     &lt;enumeration value="MID"/&gt;
 *     &lt;enumeration value="MON"/&gt;
 *     &lt;enumeration value="NTS"/&gt;
 *     &lt;enumeration value="OCL"/&gt;
 *     &lt;enumeration value="OGA"/&gt;
 *     &lt;enumeration value="OPO"/&gt;
 *     &lt;enumeration value="OPR"/&gt;
 *     &lt;enumeration value="PCN"/&gt;
 *     &lt;enumeration value="PFA"/&gt;
 *     &lt;enumeration value="PII"/&gt;
 *     &lt;enumeration value="PLS"/&gt;
 *     &lt;enumeration value="POI"/&gt;
 *     &lt;enumeration value="PON"/&gt;
 *     &lt;enumeration value="POO"/&gt;
 *     &lt;enumeration value="PRC"/&gt;
 *     &lt;enumeration value="PSI"/&gt;
 *     &lt;enumeration value="PUO"/&gt;
 *     &lt;enumeration value="QUO"/&gt;
 *     &lt;enumeration value="REC"/&gt;
 *     &lt;enumeration value="REN"/&gt;
 *     &lt;enumeration value="REO"/&gt;
 *     &lt;enumeration value="REQ"/&gt;
 *     &lt;enumeration value="RMA"/&gt;
 *     &lt;enumeration value="RPO"/&gt;
 *     &lt;enumeration value="RTA"/&gt;
 *     &lt;enumeration value="SAO"/&gt;
 *     &lt;enumeration value="SBC"/&gt;
 *     &lt;enumeration value="SBD"/&gt;
 *     &lt;enumeration value="SBI"/&gt;
 *     &lt;enumeration value="SBN"/&gt;
 *     &lt;enumeration value="SCA"/&gt;
 *     &lt;enumeration value="SEN"/&gt;
 *     &lt;enumeration value="SEO"/&gt;
 *     &lt;enumeration value="SHD"/&gt;
 *     &lt;enumeration value="SNC"/&gt;
 *     &lt;enumeration value="SPC"/&gt;
 *     &lt;enumeration value="SPN"/&gt;
 *     &lt;enumeration value="SPO"/&gt;
 *     &lt;enumeration value="SPR"/&gt;
 *     &lt;enumeration value="SPW"/&gt;
 *     &lt;enumeration value="SRI"/&gt;
 *     &lt;enumeration value="SWT"/&gt;
 *     &lt;enumeration value="TCS"/&gt;
 *     &lt;enumeration value="TRO"/&gt;
 *     &lt;enumeration value="WAB"/&gt;
 *     &lt;enumeration value="WAC"/&gt;
 *     &lt;enumeration value="WOO"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "DocumentTypeContentType")
@XmlEnum
public enum DocumentTypeContentType {

    APM,
    ARA,
    CAR,
    CBN,
    CCN,
    CFA,
    CIN,
    CNM,
    COA,
    CON,
    COS,
    COT,
    CRN,
    DEM,
    DEN,
    DIN,
    DOR,
    DRN,
    DRR,
    ECO,
    EDD,
    EIR,
    EOL,
    FUO,
    IDD,
    INV,
    LID,
    MEN,
    MID,
    MON,
    NTS,
    OCL,
    OGA,
    OPO,
    OPR,
    PCN,
    PFA,
    PII,
    PLS,
    POI,
    PON,
    POO,
    PRC,
    PSI,
    PUO,
    QUO,
    REC,
    REN,
    REO,
    REQ,
    RMA,
    RPO,
    RTA,
    SAO,
    SBC,
    SBD,
    SBI,
    SBN,
    SCA,
    SEN,
    SEO,
    SHD,
    SNC,
    SPC,
    SPN,
    SPO,
    SPR,
    SPW,
    SRI,
    SWT,
    TCS,
    TRO,
    WAB,
    WAC,
    WOO;

    public String value() {
        return name();
    }

    public static DocumentTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
