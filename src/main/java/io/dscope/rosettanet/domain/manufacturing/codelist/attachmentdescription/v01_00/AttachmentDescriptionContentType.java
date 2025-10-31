
package io.dscope.rosettanet.domain.manufacturing.codelist.attachmentdescription.v01_00;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AttachmentDescriptionContentType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="AttachmentDescriptionContentType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token"&gt;
 *     &lt;enumeration value="AFI"/&gt;
 *     &lt;enumeration value="ASD"/&gt;
 *     &lt;enumeration value="BLD"/&gt;
 *     &lt;enumeration value="BLP"/&gt;
 *     &lt;enumeration value="BOM"/&gt;
 *     &lt;enumeration value="CAD"/&gt;
 *     &lt;enumeration value="LGT"/&gt;
 *     &lt;enumeration value="SAP"/&gt;
 *     &lt;enumeration value="SCM"/&gt;
 *     &lt;enumeration value="QAD"/&gt;
 *     &lt;enumeration value="TES"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AttachmentDescriptionContentType")
@XmlEnum
public enum AttachmentDescriptionContentType {

    AFI,
    ASD,
    BLD,
    BLP,
    BOM,
    CAD,
    LGT,
    SAP,
    SCM,
    QAD,
    TES;

    public String value() {
        return name();
    }

    public static AttachmentDescriptionContentType fromValue(String v) {
        return valueOf(v);
    }

}
