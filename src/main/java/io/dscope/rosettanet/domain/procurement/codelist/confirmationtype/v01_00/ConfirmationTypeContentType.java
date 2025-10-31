
package io.dscope.rosettanet.domain.procurement.codelist.confirmationtype.v01_00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ConfirmationTypeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ConfirmationTypeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="ASC"/&gt;
 *     &lt;enumeration value="AMC"/&gt;
 *     &lt;enumeration value="ANC"/&gt;
 *     &lt;enumeration value="APC"/&gt;
 *     &lt;enumeration value="APS"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ConfirmationTypeContentType")
@XmlEnum
public enum ConfirmationTypeContentType {

    ASC,
    AMC,
    ANC,
    APC,
    APS;

    public String value() {
        return name();
    }

    public static ConfirmationTypeContentType fromValue(String v) {
        return valueOf(v);
    }

}
