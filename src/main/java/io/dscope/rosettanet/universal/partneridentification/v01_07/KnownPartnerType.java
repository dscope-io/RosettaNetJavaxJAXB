
package io.dscope.rosettanet.universal.partneridentification.v01_07;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.universal.codelist.processroleidentifier.v01_04.ProcessRoleIdentifier;


/**
 * <p>Java class for KnownPartnerType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="KnownPartnerType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.07}SpecifiedKnownPartnerType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProcessRoleIdentifier:xsd:codelist:01.04}ProcessRoleIdentifier"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "KnownPartnerType", propOrder = {
    "processRoleIdentifier"
})
public class KnownPartnerType
    extends SpecifiedKnownPartnerType
{

    @XmlElementRef(name = "ProcessRoleIdentifier", namespace = "urn:rosettanet:specification:universal:ProcessRoleIdentifier:xsd:codelist:01.04", type = ProcessRoleIdentifier.class)
    protected ProcessRoleIdentifier processRoleIdentifier;

    /**
     * Gets the value of the processRoleIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessRoleIdentifier }
     *     
     */
    public ProcessRoleIdentifier getProcessRoleIdentifier() {
        return processRoleIdentifier;
    }

    /**
     * Sets the value of the processRoleIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessRoleIdentifier }
     *     
     */
    public void setProcessRoleIdentifier(ProcessRoleIdentifier value) {
        this.processRoleIdentifier = value;
    }

}
