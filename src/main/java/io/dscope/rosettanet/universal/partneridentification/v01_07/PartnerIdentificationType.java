
package io.dscope.rosettanet.universal.partneridentification.v01_07;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.universal.abstracttype.v01_02.IdentifierType;
import io.dscope.rosettanet.universal.datatype.v01_03.DUNS;
import io.dscope.rosettanet.universal.datatype.v01_03.DUNSPlus4;
import io.dscope.rosettanet.universal.datatype.v01_03.GLN;
import io.dscope.rosettanet.universal.locations.v01_03.AlternativeIdentifier;


/**
 * <p>Java class for PartnerIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PartnerIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:universal:AbstractType:xsd:schema:01.02}IdentifierType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="PartnerName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:Locations:xsd:schema:01.03}AlternativeIdentifier" maxOccurs="unbounded"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.03}DUNS"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.03}DUNSPlus4"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.03}GLN"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PartnerIdentificationType", propOrder = {
    "partnerName",
    "alternativeIdentifier",
    "duns",
    "dunsPlus4",
    "gln"
})
public class PartnerIdentificationType
    extends IdentifierType
{

    @XmlElement(name = "PartnerName")
    protected String partnerName;
    @XmlElementRef(name = "AlternativeIdentifier", namespace = "urn:rosettanet:specification:universal:Locations:xsd:schema:01.03", type = AlternativeIdentifier.class, required = false)
    protected List<AlternativeIdentifier> alternativeIdentifier;
    @XmlElementRef(name = "DUNS", namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:01.03", type = DUNS.class, required = false)
    protected DUNS duns;
    @XmlElementRef(name = "DUNSPlus4", namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:01.03", type = DUNSPlus4 .class, required = false)
    protected DUNSPlus4 dunsPlus4;
    @XmlElementRef(name = "GLN", namespace = "urn:rosettanet:specification:universal:DataType:xsd:schema:01.03", type = GLN.class, required = false)
    protected GLN gln;

    /**
     * Gets the value of the partnerName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerName() {
        return partnerName;
    }

    /**
     * Sets the value of the partnerName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerName(String value) {
        this.partnerName = value;
    }

    /**
     * Gets the value of the alternativeIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the alternativeIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAlternativeIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AlternativeIdentifier }
     * 
     * 
     */
    public List<AlternativeIdentifier> getAlternativeIdentifier() {
        if (alternativeIdentifier == null) {
            alternativeIdentifier = new ArrayList<AlternativeIdentifier>();
        }
        return this.alternativeIdentifier;
    }

    /**
     * Gets the value of the duns property.
     * 
     * @return
     *     possible object is
     *     {@link DUNS }
     *     
     */
    public DUNS getDUNS() {
        return duns;
    }

    /**
     * Sets the value of the duns property.
     * 
     * @param value
     *     allowed object is
     *     {@link DUNS }
     *     
     */
    public void setDUNS(DUNS value) {
        this.duns = value;
    }

    /**
     * Gets the value of the dunsPlus4 property.
     * 
     * @return
     *     possible object is
     *     {@link DUNSPlus4 }
     *     
     */
    public DUNSPlus4 getDUNSPlus4() {
        return dunsPlus4;
    }

    /**
     * Sets the value of the dunsPlus4 property.
     * 
     * @param value
     *     allowed object is
     *     {@link DUNSPlus4 }
     *     
     */
    public void setDUNSPlus4(DUNSPlus4 value) {
        this.dunsPlus4 = value;
    }

    /**
     * Gets the value of the gln property.
     * 
     * @return
     *     possible object is
     *     {@link GLN }
     *     
     */
    public GLN getGLN() {
        return gln;
    }

    /**
     * Sets the value of the gln property.
     * 
     * @param value
     *     allowed object is
     *     {@link GLN }
     *     
     */
    public void setGLN(GLN value) {
        this.gln = value;
    }

}
