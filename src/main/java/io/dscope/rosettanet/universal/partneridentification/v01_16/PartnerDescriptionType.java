
package io.dscope.rosettanet.universal.partneridentification.v01_16;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for PartnerDescriptionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartnerDescriptionType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}FullPartner"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}IntermittentPartner"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}KnownPartnerContact"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16}NewPartner"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="schemaVersion" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartnerDescriptionType", propOrder = {
    "fullPartner",
    "intermittentPartner",
    "knownPartnerContact",
    "newPartner"
})
public class PartnerDescriptionType {

    @XmlElementRef(name = "FullPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = FullPartner.class, required = false)
    protected FullPartner fullPartner;
    @XmlElementRef(name = "IntermittentPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = IntermittentPartner.class, required = false)
    protected IntermittentPartner intermittentPartner;
    @XmlElementRef(name = "KnownPartnerContact", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = KnownPartnerContact.class, required = false)
    protected KnownPartnerContact knownPartnerContact;
    @XmlElementRef(name = "NewPartner", namespace = "urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.16", type = NewPartner.class, required = false)
    protected NewPartner newPartner;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the fullPartner property.
     * 
     * @return
     *     possible object is
     *     {@link FullPartner }
     *     
     */
    public FullPartner getFullPartner() {
        return fullPartner;
    }

    /**
     * Sets the value of the fullPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link FullPartner }
     *     
     */
    public void setFullPartner(FullPartner value) {
        this.fullPartner = value;
    }

    /**
     * Gets the value of the intermittentPartner property.
     * 
     * @return
     *     possible object is
     *     {@link IntermittentPartner }
     *     
     */
    public IntermittentPartner getIntermittentPartner() {
        return intermittentPartner;
    }

    /**
     * Sets the value of the intermittentPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link IntermittentPartner }
     *     
     */
    public void setIntermittentPartner(IntermittentPartner value) {
        this.intermittentPartner = value;
    }

    /**
     * Gets the value of the knownPartnerContact property.
     * 
     * @return
     *     possible object is
     *     {@link KnownPartnerContact }
     *     
     */
    public KnownPartnerContact getKnownPartnerContact() {
        return knownPartnerContact;
    }

    /**
     * Sets the value of the knownPartnerContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link KnownPartnerContact }
     *     
     */
    public void setKnownPartnerContact(KnownPartnerContact value) {
        this.knownPartnerContact = value;
    }

    /**
     * Gets the value of the newPartner property.
     * 
     * @return
     *     possible object is
     *     {@link NewPartner }
     *     
     */
    public NewPartner getNewPartner() {
        return newPartner;
    }

    /**
     * Sets the value of the newPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link NewPartner }
     *     
     */
    public void setNewPartner(NewPartner value) {
        this.newPartner = value;
    }

    /**
     * Gets the value of the schemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Sets the value of the schemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

}
