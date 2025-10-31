
package io.dscope.rosettanet.interchange.certificateofanalysisnotification.v02_04;

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
import io.dscope.rosettanet.interchange.codelist.documentissuancetype.v02_00.DocumentIssuanceType;
import io.dscope.rosettanet.universal.document.v01_12.BusinessDocumentReference;
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
 * <p>Java class for CertificateOfAnalysisType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CertificateOfAnalysisType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.12}BusinessDocumentReference" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:DocumentIssuanceType:xsd:codelist:02.00}DocumentIssuanceType"/&gt;
 *         &lt;element name="LotIdentification" type="{urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.04}LotIdentificationType" maxOccurs="unbounded"/&gt;
 *         &lt;element name="Material" type="{urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.04}MaterialType"/&gt;
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
@XmlType(name = "CertificateOfAnalysisType", propOrder = {
    "businessDocumentReference",
    "comment",
    "documentIssuanceType",
    "lotIdentification",
    "material"
})
public class CertificateOfAnalysisType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.12", type = BusinessDocumentReference.class, required = false)
    protected List<BusinessDocumentReference> businessDocumentReference;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElementRef(name = "DocumentIssuanceType", namespace = "urn:rosettanet:specification:interchange:DocumentIssuanceType:xsd:codelist:02.00", type = DocumentIssuanceType.class)
    protected DocumentIssuanceType documentIssuanceType;
    @XmlElement(name = "LotIdentification", required = true)
    protected List<LotIdentificationType> lotIdentification;
    @XmlElement(name = "Material", required = true)
    protected MaterialType material;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the businessDocumentReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessDocumentReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessDocumentReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReference }
     * 
     * 
     */
    public List<BusinessDocumentReference> getBusinessDocumentReference() {
        if (businessDocumentReference == null) {
            businessDocumentReference = new ArrayList<BusinessDocumentReference>();
        }
        return this.businessDocumentReference;
    }

    /**
     * Gets the value of the comment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComment() {
        return comment;
    }

    /**
     * Sets the value of the comment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComment(String value) {
        this.comment = value;
    }

    /**
     * Gets the value of the documentIssuanceType property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentIssuanceType }
     *     
     */
    public DocumentIssuanceType getDocumentIssuanceType() {
        return documentIssuanceType;
    }

    /**
     * Sets the value of the documentIssuanceType property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentIssuanceType }
     *     
     */
    public void setDocumentIssuanceType(DocumentIssuanceType value) {
        this.documentIssuanceType = value;
    }

    /**
     * Gets the value of the lotIdentification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lotIdentification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLotIdentification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LotIdentificationType }
     * 
     * 
     */
    public List<LotIdentificationType> getLotIdentification() {
        if (lotIdentification == null) {
            lotIdentification = new ArrayList<LotIdentificationType>();
        }
        return this.lotIdentification;
    }

    /**
     * Gets the value of the material property.
     * 
     * @return
     *     possible object is
     *     {@link MaterialType }
     *     
     */
    public MaterialType getMaterial() {
        return material;
    }

    /**
     * Sets the value of the material property.
     * 
     * @param value
     *     allowed object is
     *     {@link MaterialType }
     *     
     */
    public void setMaterial(MaterialType value) {
        this.material = value;
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
        final CertificateOfAnalysisType that = ((CertificateOfAnalysisType) object);
        {
            List<BusinessDocumentReference> lhsBusinessDocumentReference;
            lhsBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            List<BusinessDocumentReference> rhsBusinessDocumentReference;
            rhsBusinessDocumentReference = (((that.businessDocumentReference!= null)&&(!that.businessDocumentReference.isEmpty()))?that.getBusinessDocumentReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessDocumentReference", lhsBusinessDocumentReference), LocatorUtils.property(thatLocator, "businessDocumentReference", rhsBusinessDocumentReference), lhsBusinessDocumentReference, rhsBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())), ((that.businessDocumentReference!= null)&&(!that.businessDocumentReference.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsComment;
            lhsComment = this.getComment();
            String rhsComment;
            rhsComment = that.getComment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "comment", lhsComment), LocatorUtils.property(thatLocator, "comment", rhsComment), lhsComment, rhsComment, (this.comment!= null), (that.comment!= null))) {
                return false;
            }
        }
        {
            DocumentIssuanceType lhsDocumentIssuanceType;
            lhsDocumentIssuanceType = this.getDocumentIssuanceType();
            DocumentIssuanceType rhsDocumentIssuanceType;
            rhsDocumentIssuanceType = that.getDocumentIssuanceType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentIssuanceType", lhsDocumentIssuanceType), LocatorUtils.property(thatLocator, "documentIssuanceType", rhsDocumentIssuanceType), lhsDocumentIssuanceType, rhsDocumentIssuanceType, (this.documentIssuanceType!= null), (that.documentIssuanceType!= null))) {
                return false;
            }
        }
        {
            List<LotIdentificationType> lhsLotIdentification;
            lhsLotIdentification = (((this.lotIdentification!= null)&&(!this.lotIdentification.isEmpty()))?this.getLotIdentification():null);
            List<LotIdentificationType> rhsLotIdentification;
            rhsLotIdentification = (((that.lotIdentification!= null)&&(!that.lotIdentification.isEmpty()))?that.getLotIdentification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotIdentification", lhsLotIdentification), LocatorUtils.property(thatLocator, "lotIdentification", rhsLotIdentification), lhsLotIdentification, rhsLotIdentification, ((this.lotIdentification!= null)&&(!this.lotIdentification.isEmpty())), ((that.lotIdentification!= null)&&(!that.lotIdentification.isEmpty())))) {
                return false;
            }
        }
        {
            MaterialType lhsMaterial;
            lhsMaterial = this.getMaterial();
            MaterialType rhsMaterial;
            rhsMaterial = that.getMaterial();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "material", lhsMaterial), LocatorUtils.property(thatLocator, "material", rhsMaterial), lhsMaterial, rhsMaterial, (this.material!= null), (that.material!= null))) {
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
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDocumentReference", theBusinessDocumentReference), currentHashCode, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            String theComment;
            theComment = this.getComment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comment", theComment), currentHashCode, theComment, (this.comment!= null));
        }
        {
            DocumentIssuanceType theDocumentIssuanceType;
            theDocumentIssuanceType = this.getDocumentIssuanceType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentIssuanceType", theDocumentIssuanceType), currentHashCode, theDocumentIssuanceType, (this.documentIssuanceType!= null));
        }
        {
            List<LotIdentificationType> theLotIdentification;
            theLotIdentification = (((this.lotIdentification!= null)&&(!this.lotIdentification.isEmpty()))?this.getLotIdentification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotIdentification", theLotIdentification), currentHashCode, theLotIdentification, ((this.lotIdentification!= null)&&(!this.lotIdentification.isEmpty())));
        }
        {
            MaterialType theMaterial;
            theMaterial = this.getMaterial();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "material", theMaterial), currentHashCode, theMaterial, (this.material!= null));
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
            List<BusinessDocumentReference> theBusinessDocumentReference;
            theBusinessDocumentReference = (((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty()))?this.getBusinessDocumentReference():null);
            strategy.appendField(locator, this, "businessDocumentReference", buffer, theBusinessDocumentReference, ((this.businessDocumentReference!= null)&&(!this.businessDocumentReference.isEmpty())));
        }
        {
            String theComment;
            theComment = this.getComment();
            strategy.appendField(locator, this, "comment", buffer, theComment, (this.comment!= null));
        }
        {
            DocumentIssuanceType theDocumentIssuanceType;
            theDocumentIssuanceType = this.getDocumentIssuanceType();
            strategy.appendField(locator, this, "documentIssuanceType", buffer, theDocumentIssuanceType, (this.documentIssuanceType!= null));
        }
        {
            List<LotIdentificationType> theLotIdentification;
            theLotIdentification = (((this.lotIdentification!= null)&&(!this.lotIdentification.isEmpty()))?this.getLotIdentification():null);
            strategy.appendField(locator, this, "lotIdentification", buffer, theLotIdentification, ((this.lotIdentification!= null)&&(!this.lotIdentification.isEmpty())));
        }
        {
            MaterialType theMaterial;
            theMaterial = this.getMaterial();
            strategy.appendField(locator, this, "material", buffer, theMaterial, (this.material!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
