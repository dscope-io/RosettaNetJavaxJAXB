
package io.dscope.rosettanet.domain.design.design.v01_00;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.jvnet.jaxb2_commons.lang.Equals2;
import org.jvnet.jaxb2_commons.lang.EqualsStrategy2;
import org.jvnet.jaxb2_commons.lang.HashCode2;
import org.jvnet.jaxb2_commons.lang.HashCodeStrategy2;
import org.jvnet.jaxb2_commons.lang.JAXBEqualsStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBHashCodeStrategy;
import org.jvnet.jaxb2_commons.lang.JAXBToStringStrategy;
import org.jvnet.jaxb2_commons.lang.ToString2;
import org.jvnet.jaxb2_commons.lang.ToStringStrategy2;
import org.jvnet.jaxb2_commons.locator.ObjectLocator;
import org.jvnet.jaxb2_commons.locator.util.LocatorUtils;


/**
 * <p>Java class for ReferenceLocatorType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ReferenceLocatorType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ContentTypeReference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FileFormatReference" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="FileSize" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/&gt;
 *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="UrlLegal" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.01}Attachment"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:domain:Design:xsd:schema:01.01}url" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "ReferenceLocatorType", propOrder = {
    "contentTypeReference",
    "fileFormatReference",
    "fileSize",
    "reference",
    "urlLegal",
    "attachment",
    "url"
})
public class ReferenceLocatorType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "ContentTypeReference")
    protected String contentTypeReference;
    @XmlElement(name = "FileFormatReference")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger fileFormatReference;
    @XmlElement(name = "FileSize")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger fileSize;
    @XmlElement(name = "Reference")
    protected List<String> reference;
    @XmlElement(name = "UrlLegal")
    protected List<String> urlLegal;
    @XmlElementRef(name = "Attachment", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.01", type = Attachment.class, required = false)
    protected Attachment attachment;
    @XmlElementRef(name = "url", namespace = "urn:rosettanet:specification:domain:Design:xsd:schema:01.01", type = Url.class, required = false)
    protected List<Url> url;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the contentTypeReference property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentTypeReference() {
        return contentTypeReference;
    }

    /**
     * Sets the value of the contentTypeReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentTypeReference(String value) {
        this.contentTypeReference = value;
    }

    /**
     * Gets the value of the fileFormatReference property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFileFormatReference() {
        return fileFormatReference;
    }

    /**
     * Sets the value of the fileFormatReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFileFormatReference(BigInteger value) {
        this.fileFormatReference = value;
    }

    /**
     * Gets the value of the fileSize property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFileSize() {
        return fileSize;
    }

    /**
     * Sets the value of the fileSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFileSize(BigInteger value) {
        this.fileSize = value;
    }

    /**
     * Gets the value of the reference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the reference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getReference() {
        if (reference == null) {
            reference = new ArrayList<String>();
        }
        return this.reference;
    }

    /**
     * Gets the value of the urlLegal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the urlLegal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrlLegal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getUrlLegal() {
        if (urlLegal == null) {
            urlLegal = new ArrayList<String>();
        }
        return this.urlLegal;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * @return
     *     possible object is
     *     {@link Attachment }
     *     
     */
    public Attachment getAttachment() {
        return attachment;
    }

    /**
     * Sets the value of the attachment property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attachment }
     *     
     */
    public void setAttachment(Attachment value) {
        this.attachment = value;
    }

    /**
     * Gets the value of the url property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the url property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUrl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Url }
     * 
     * 
     */
    public List<Url> getUrl() {
        if (url == null) {
            url = new ArrayList<Url>();
        }
        return this.url;
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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final ReferenceLocatorType that = ((ReferenceLocatorType) object);
        {
            String lhsContentTypeReference;
            lhsContentTypeReference = this.getContentTypeReference();
            String rhsContentTypeReference;
            rhsContentTypeReference = that.getContentTypeReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "contentTypeReference", lhsContentTypeReference), LocatorUtils.property(thatLocator, "contentTypeReference", rhsContentTypeReference), lhsContentTypeReference, rhsContentTypeReference, (this.contentTypeReference!= null), (that.contentTypeReference!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsFileFormatReference;
            lhsFileFormatReference = this.getFileFormatReference();
            BigInteger rhsFileFormatReference;
            rhsFileFormatReference = that.getFileFormatReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileFormatReference", lhsFileFormatReference), LocatorUtils.property(thatLocator, "fileFormatReference", rhsFileFormatReference), lhsFileFormatReference, rhsFileFormatReference, (this.fileFormatReference!= null), (that.fileFormatReference!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsFileSize;
            lhsFileSize = this.getFileSize();
            BigInteger rhsFileSize;
            rhsFileSize = that.getFileSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fileSize", lhsFileSize), LocatorUtils.property(thatLocator, "fileSize", rhsFileSize), lhsFileSize, rhsFileSize, (this.fileSize!= null), (that.fileSize!= null))) {
                return false;
            }
        }
        {
            List<String> lhsReference;
            lhsReference = (((this.reference!= null)&&(!this.reference.isEmpty()))?this.getReference():null);
            List<String> rhsReference;
            rhsReference = (((that.reference!= null)&&(!that.reference.isEmpty()))?that.getReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "reference", lhsReference), LocatorUtils.property(thatLocator, "reference", rhsReference), lhsReference, rhsReference, ((this.reference!= null)&&(!this.reference.isEmpty())), ((that.reference!= null)&&(!that.reference.isEmpty())))) {
                return false;
            }
        }
        {
            List<String> lhsUrlLegal;
            lhsUrlLegal = (((this.urlLegal!= null)&&(!this.urlLegal.isEmpty()))?this.getUrlLegal():null);
            List<String> rhsUrlLegal;
            rhsUrlLegal = (((that.urlLegal!= null)&&(!that.urlLegal.isEmpty()))?that.getUrlLegal():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "urlLegal", lhsUrlLegal), LocatorUtils.property(thatLocator, "urlLegal", rhsUrlLegal), lhsUrlLegal, rhsUrlLegal, ((this.urlLegal!= null)&&(!this.urlLegal.isEmpty())), ((that.urlLegal!= null)&&(!that.urlLegal.isEmpty())))) {
                return false;
            }
        }
        {
            Attachment lhsAttachment;
            lhsAttachment = this.getAttachment();
            Attachment rhsAttachment;
            rhsAttachment = that.getAttachment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attachment", lhsAttachment), LocatorUtils.property(thatLocator, "attachment", rhsAttachment), lhsAttachment, rhsAttachment, (this.attachment!= null), (that.attachment!= null))) {
                return false;
            }
        }
        {
            List<Url> lhsUrl;
            lhsUrl = (((this.url!= null)&&(!this.url.isEmpty()))?this.getUrl():null);
            List<Url> rhsUrl;
            rhsUrl = (((that.url!= null)&&(!that.url.isEmpty()))?that.getUrl():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "url", lhsUrl), LocatorUtils.property(thatLocator, "url", rhsUrl), lhsUrl, rhsUrl, ((this.url!= null)&&(!this.url.isEmpty())), ((that.url!= null)&&(!that.url.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsSchemaVersion;
            lhsSchemaVersion = this.getSchemaVersion();
            String rhsSchemaVersion;
            rhsSchemaVersion = that.getSchemaVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schemaVersion", lhsSchemaVersion), LocatorUtils.property(thatLocator, "schemaVersion", rhsSchemaVersion), lhsSchemaVersion, rhsSchemaVersion, (this.schemaVersion!= null), (that.schemaVersion!= null))) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object object) {
        final EqualsStrategy2 strategy = JAXBEqualsStrategy.INSTANCE;
        return equals(null, null, object, strategy);
    }

    public int hashCode(ObjectLocator locator, HashCodeStrategy2 strategy) {
        int currentHashCode = 1;
        {
            String theContentTypeReference;
            theContentTypeReference = this.getContentTypeReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "contentTypeReference", theContentTypeReference), currentHashCode, theContentTypeReference, (this.contentTypeReference!= null));
        }
        {
            BigInteger theFileFormatReference;
            theFileFormatReference = this.getFileFormatReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileFormatReference", theFileFormatReference), currentHashCode, theFileFormatReference, (this.fileFormatReference!= null));
        }
        {
            BigInteger theFileSize;
            theFileSize = this.getFileSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fileSize", theFileSize), currentHashCode, theFileSize, (this.fileSize!= null));
        }
        {
            List<String> theReference;
            theReference = (((this.reference!= null)&&(!this.reference.isEmpty()))?this.getReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "reference", theReference), currentHashCode, theReference, ((this.reference!= null)&&(!this.reference.isEmpty())));
        }
        {
            List<String> theUrlLegal;
            theUrlLegal = (((this.urlLegal!= null)&&(!this.urlLegal.isEmpty()))?this.getUrlLegal():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "urlLegal", theUrlLegal), currentHashCode, theUrlLegal, ((this.urlLegal!= null)&&(!this.urlLegal.isEmpty())));
        }
        {
            Attachment theAttachment;
            theAttachment = this.getAttachment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attachment", theAttachment), currentHashCode, theAttachment, (this.attachment!= null));
        }
        {
            List<Url> theUrl;
            theUrl = (((this.url!= null)&&(!this.url.isEmpty()))?this.getUrl():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "url", theUrl), currentHashCode, theUrl, ((this.url!= null)&&(!this.url.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schemaVersion", theSchemaVersion), currentHashCode, theSchemaVersion, (this.schemaVersion!= null));
        }
        return currentHashCode;
    }

    public int hashCode() {
        final HashCodeStrategy2 strategy = JAXBHashCodeStrategy.INSTANCE;
        return this.hashCode(null, strategy);
    }

    public String toString() {
        final ToStringStrategy2 strategy = JAXBToStringStrategy.INSTANCE;
        final StringBuilder buffer = new StringBuilder();
        append(null, buffer, strategy);
        return buffer.toString();
    }

    public StringBuilder append(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        strategy.appendStart(locator, this, buffer);
        appendFields(locator, buffer, strategy);
        strategy.appendEnd(locator, this, buffer);
        return buffer;
    }

    public StringBuilder appendFields(ObjectLocator locator, StringBuilder buffer, ToStringStrategy2 strategy) {
        {
            String theContentTypeReference;
            theContentTypeReference = this.getContentTypeReference();
            strategy.appendField(locator, this, "contentTypeReference", buffer, theContentTypeReference, (this.contentTypeReference!= null));
        }
        {
            BigInteger theFileFormatReference;
            theFileFormatReference = this.getFileFormatReference();
            strategy.appendField(locator, this, "fileFormatReference", buffer, theFileFormatReference, (this.fileFormatReference!= null));
        }
        {
            BigInteger theFileSize;
            theFileSize = this.getFileSize();
            strategy.appendField(locator, this, "fileSize", buffer, theFileSize, (this.fileSize!= null));
        }
        {
            List<String> theReference;
            theReference = (((this.reference!= null)&&(!this.reference.isEmpty()))?this.getReference():null);
            strategy.appendField(locator, this, "reference", buffer, theReference, ((this.reference!= null)&&(!this.reference.isEmpty())));
        }
        {
            List<String> theUrlLegal;
            theUrlLegal = (((this.urlLegal!= null)&&(!this.urlLegal.isEmpty()))?this.getUrlLegal():null);
            strategy.appendField(locator, this, "urlLegal", buffer, theUrlLegal, ((this.urlLegal!= null)&&(!this.urlLegal.isEmpty())));
        }
        {
            Attachment theAttachment;
            theAttachment = this.getAttachment();
            strategy.appendField(locator, this, "attachment", buffer, theAttachment, (this.attachment!= null));
        }
        {
            List<Url> theUrl;
            theUrl = (((this.url!= null)&&(!this.url.isEmpty()))?this.getUrl():null);
            strategy.appendField(locator, this, "url", buffer, theUrl, ((this.url!= null)&&(!this.url.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
