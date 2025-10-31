
package io.dscope.rosettanet.domain.service.codelist.notificationcode.v01_03;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NotificationCodeContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="NotificationCodeContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AME"/&gt;
 *     &lt;enumeration value="CAN"/&gt;
 *     &lt;enumeration value="ERR"/&gt;
 *     &lt;enumeration value="FIN"/&gt;
 *     &lt;enumeration value="INF"/&gt;
 *     &lt;enumeration value="INI"/&gt;
 *     &lt;enumeration value="UPD"/&gt;
 *     &lt;enumeration value="WAR"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "NotificationCodeContentType")
@XmlEnum
public enum NotificationCodeContentType {

    AME,
    CAN,
    ERR,
    FIN,
    INF,
    INI,
    UPD,
    WAR;

    public String value() {
        return name();
    }

    public static NotificationCodeContentType fromValue(String v) {
        return valueOf(v);
    }

}
