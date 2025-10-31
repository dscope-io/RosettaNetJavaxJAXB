
package io.dscope.rosettanet.domain.procurement.codelist.purchaseordertype.v01_00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PurchaseOrderTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="PurchaseOrderTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="BLA"/&gt;
 *     &lt;enumeration value="COO"/&gt;
 *     &lt;enumeration value="DNS"/&gt;
 *     &lt;enumeration value="ERS"/&gt;
 *     &lt;enumeration value="ESD"/&gt;
 *     &lt;enumeration value="EVA"/&gt;
 *     &lt;enumeration value="EXO"/&gt;
 *     &lt;enumeration value="FUL"/&gt;
 *     &lt;enumeration value="GOV"/&gt;
 *     &lt;enumeration value="NON"/&gt;
 *     &lt;enumeration value="PAP"/&gt;
 *     &lt;enumeration value="PRD"/&gt;
 *     &lt;enumeration value="QUO"/&gt;
 *     &lt;enumeration value="REP"/&gt;
 *     &lt;enumeration value="RPN"/&gt;
 *     &lt;enumeration value="RWK"/&gt;
 *     &lt;enumeration value="RPD"/&gt;
 *     &lt;enumeration value="SAM"/&gt;
 *     &lt;enumeration value="SVC"/&gt;
 *     &lt;enumeration value="SIT"/&gt;
 *     &lt;enumeration value="STD"/&gt;
 *     &lt;enumeration value="WRP"/&gt;
 *     &lt;enumeration value="WRM"/&gt;
 *     &lt;enumeration value="WDW"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "PurchaseOrderTypeContentType")
@XmlEnum
public enum PurchaseOrderTypeContentType {

    BLA,
    COO,
    DNS,
    ERS,
    ESD,
    EVA,
    EXO,
    FUL,
    GOV,
    NON,
    PAP,
    PRD,
    QUO,
    REP,
    RPN,
    RWK,
    RPD,
    SAM,
    SVC,
    SIT,
    STD,
    WRP,
    WRM,
    WDW;

    public String value() {
        return name();
    }

    public static PurchaseOrderTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
