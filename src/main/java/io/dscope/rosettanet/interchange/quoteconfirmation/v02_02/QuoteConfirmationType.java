
package io.dscope.rosettanet.interchange.quoteconfirmation.v02_02;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.system.standarddocumentheader.v01_23.DocumentHeader;


/**
 * <p>Java class for QuoteConfirmationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="QuoteConfirmationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.23}DocumentHeader" minOccurs="0"/&gt;
 *         &lt;element name="Quote" type="{urn:rosettanet:specification:interchange:QuoteConfirmation:xsd:schema:02.02}QuoteType"/&gt;
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
@XmlType(name = "QuoteConfirmationType", propOrder = {
    "documentHeader",
    "quote"
})
public class QuoteConfirmationType {

    @XmlElementRef(name = "DocumentHeader", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.23", type = DocumentHeader.class, required = false)
    protected DocumentHeader documentHeader;
    @XmlElement(name = "Quote", required = true)
    protected QuoteType quote;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the documentHeader property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentHeader }
     *     
     */
    public DocumentHeader getDocumentHeader() {
        return documentHeader;
    }

    /**
     * Sets the value of the documentHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentHeader }
     *     
     */
    public void setDocumentHeader(DocumentHeader value) {
        this.documentHeader = value;
    }

    /**
     * Gets the value of the quote property.
     * 
     * @return
     *     possible object is
     *     {@link QuoteType }
     *     
     */
    public QuoteType getQuote() {
        return quote;
    }

    /**
     * Sets the value of the quote property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuoteType }
     *     
     */
    public void setQuote(QuoteType value) {
        this.quote = value;
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
