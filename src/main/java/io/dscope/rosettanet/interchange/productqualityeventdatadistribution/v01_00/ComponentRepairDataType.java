
package io.dscope.rosettanet.interchange.productqualityeventdatadistribution.v01_00;

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
import javax.xml.datatype.XMLGregorianCalendar;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.ProductReferenceType;
import io.dscope.rosettanet.domain.service.codelist.componentrepair.v01_02.ComponentRepairType;
import io.dscope.rosettanet.domain.service.codelist.qualitydisposition.v01_02.QualityDisposition;
import io.dscope.rosettanet.domain.shared.shared.v01_10.ProductQuantity;
import io.dscope.rosettanet.universal.codelist.unitofmeasure.v01_03.UnitOfMeasure;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReference;
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
 * <p>Java class for ComponentRepairDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ComponentRepairDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReference" minOccurs="0"/&gt;
 *         &lt;element name="Comment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DispositionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="FinalProductReference" type="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}ProductReferenceType" minOccurs="0"/&gt;
 *         &lt;element name="IncidentInformation" type="{urn:rosettanet:specification:interchange:ProductQualityEventDataDistribution:xsd:schema:01.00}IncidentInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="LocationInformation" type="{urn:rosettanet:specification:interchange:ProductQualityEventDataDistribution:xsd:schema:01.00}LocationInformationType" minOccurs="0"/&gt;
 *         &lt;element name="OperatorIdentifier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Shared:xsd:schema:01.10}ProductQuantity" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:QualityDisposition:xsd:codelist:01.02}QualityDisposition"/&gt;
 *         &lt;element name="ReceivedProductReference" type="{urn:rosettanet:specification:interchange:ProductQualityEventDataDistribution:xsd:schema:01.00}ReceivedProductReferenceType"/&gt;
 *         &lt;element name="Status" type="{urn:rosettanet:specification:domain:Service:ComponentRepair:xsd:codelist:01.02}ComponentRepairType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03}UnitOfMeasure" minOccurs="0"/&gt;
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
@XmlType(name = "ComponentRepairDataType", propOrder = {
    "businessDocumentReference",
    "comment",
    "dispositionDate",
    "finalProductReference",
    "incidentInformation",
    "locationInformation",
    "operatorIdentifier",
    "productQuantity",
    "qualityDisposition",
    "receivedProductReference",
    "status",
    "unitOfMeasure"
})
public class ComponentRepairDataType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "BusinessDocumentReference", namespace = "urn:rosettanet:specification:universal:Document:xsd:schema:01.08", type = BusinessDocumentReference.class, required = false)
    protected BusinessDocumentReference businessDocumentReference;
    @XmlElement(name = "Comment")
    protected String comment;
    @XmlElement(name = "DispositionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dispositionDate;
    @XmlElement(name = "FinalProductReference")
    protected ProductReferenceType finalProductReference;
    @XmlElement(name = "IncidentInformation")
    protected List<IncidentInformationType> incidentInformation;
    @XmlElement(name = "LocationInformation")
    protected LocationInformationType locationInformation;
    @XmlElement(name = "OperatorIdentifier")
    protected String operatorIdentifier;
    @XmlElementRef(name = "ProductQuantity", namespace = "urn:rosettanet:specification:domain:Shared:xsd:schema:01.10", type = ProductQuantity.class, required = false)
    protected ProductQuantity productQuantity;
    @XmlElementRef(name = "QualityDisposition", namespace = "urn:rosettanet:specification:domain:Service:QualityDisposition:xsd:codelist:01.02", type = QualityDisposition.class)
    protected QualityDisposition qualityDisposition;
    @XmlElement(name = "ReceivedProductReference", required = true)
    protected ReceivedProductReferenceType receivedProductReference;
    @XmlElement(name = "Status")
    protected List<ComponentRepairType> status;
    @XmlElementRef(name = "UnitOfMeasure", namespace = "urn:rosettanet:specification:universal:UnitOfMeasure:xsd:codelist:01.03", type = UnitOfMeasure.class, required = false)
    protected UnitOfMeasure unitOfMeasure;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the businessDocumentReference property.
     * 
     * @return
     *     possible object is
     *     {@link BusinessDocumentReference }
     *     
     */
    public BusinessDocumentReference getBusinessDocumentReference() {
        return businessDocumentReference;
    }

    /**
     * Sets the value of the businessDocumentReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BusinessDocumentReference }
     *     
     */
    public void setBusinessDocumentReference(BusinessDocumentReference value) {
        this.businessDocumentReference = value;
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
     * Gets the value of the dispositionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDispositionDate() {
        return dispositionDate;
    }

    /**
     * Sets the value of the dispositionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDispositionDate(XMLGregorianCalendar value) {
        this.dispositionDate = value;
    }

    /**
     * Gets the value of the finalProductReference property.
     * 
     * @return
     *     possible object is
     *     {@link ProductReferenceType }
     *     
     */
    public ProductReferenceType getFinalProductReference() {
        return finalProductReference;
    }

    /**
     * Sets the value of the finalProductReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductReferenceType }
     *     
     */
    public void setFinalProductReference(ProductReferenceType value) {
        this.finalProductReference = value;
    }

    /**
     * Gets the value of the incidentInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the incidentInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIncidentInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link IncidentInformationType }
     * 
     * 
     */
    public List<IncidentInformationType> getIncidentInformation() {
        if (incidentInformation == null) {
            incidentInformation = new ArrayList<IncidentInformationType>();
        }
        return this.incidentInformation;
    }

    /**
     * Gets the value of the locationInformation property.
     * 
     * @return
     *     possible object is
     *     {@link LocationInformationType }
     *     
     */
    public LocationInformationType getLocationInformation() {
        return locationInformation;
    }

    /**
     * Sets the value of the locationInformation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationInformationType }
     *     
     */
    public void setLocationInformation(LocationInformationType value) {
        this.locationInformation = value;
    }

    /**
     * Gets the value of the operatorIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOperatorIdentifier() {
        return operatorIdentifier;
    }

    /**
     * Sets the value of the operatorIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOperatorIdentifier(String value) {
        this.operatorIdentifier = value;
    }

    /**
     * Gets the value of the productQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link ProductQuantity }
     *     
     */
    public ProductQuantity getProductQuantity() {
        return productQuantity;
    }

    /**
     * Sets the value of the productQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductQuantity }
     *     
     */
    public void setProductQuantity(ProductQuantity value) {
        this.productQuantity = value;
    }

    /**
     * Gets the value of the qualityDisposition property.
     * 
     * @return
     *     possible object is
     *     {@link QualityDisposition }
     *     
     */
    public QualityDisposition getQualityDisposition() {
        return qualityDisposition;
    }

    /**
     * Sets the value of the qualityDisposition property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityDisposition }
     *     
     */
    public void setQualityDisposition(QualityDisposition value) {
        this.qualityDisposition = value;
    }

    /**
     * Gets the value of the receivedProductReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReceivedProductReferenceType }
     *     
     */
    public ReceivedProductReferenceType getReceivedProductReference() {
        return receivedProductReference;
    }

    /**
     * Sets the value of the receivedProductReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceivedProductReferenceType }
     *     
     */
    public void setReceivedProductReference(ReceivedProductReferenceType value) {
        this.receivedProductReference = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComponentRepairType }
     * 
     * 
     */
    public List<ComponentRepairType> getStatus() {
        if (status == null) {
            status = new ArrayList<ComponentRepairType>();
        }
        return this.status;
    }

    /**
     * Gets the value of the unitOfMeasure property.
     * 
     * @return
     *     possible object is
     *     {@link UnitOfMeasure }
     *     
     */
    public UnitOfMeasure getUnitOfMeasure() {
        return unitOfMeasure;
    }

    /**
     * Sets the value of the unitOfMeasure property.
     * 
     * @param value
     *     allowed object is
     *     {@link UnitOfMeasure }
     *     
     */
    public void setUnitOfMeasure(UnitOfMeasure value) {
        this.unitOfMeasure = value;
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
        final ComponentRepairDataType that = ((ComponentRepairDataType) object);
        {
            BusinessDocumentReference lhsBusinessDocumentReference;
            lhsBusinessDocumentReference = this.getBusinessDocumentReference();
            BusinessDocumentReference rhsBusinessDocumentReference;
            rhsBusinessDocumentReference = that.getBusinessDocumentReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessDocumentReference", lhsBusinessDocumentReference), LocatorUtils.property(thatLocator, "businessDocumentReference", rhsBusinessDocumentReference), lhsBusinessDocumentReference, rhsBusinessDocumentReference, (this.businessDocumentReference!= null), (that.businessDocumentReference!= null))) {
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
            XMLGregorianCalendar lhsDispositionDate;
            lhsDispositionDate = this.getDispositionDate();
            XMLGregorianCalendar rhsDispositionDate;
            rhsDispositionDate = that.getDispositionDate();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dispositionDate", lhsDispositionDate), LocatorUtils.property(thatLocator, "dispositionDate", rhsDispositionDate), lhsDispositionDate, rhsDispositionDate, (this.dispositionDate!= null), (that.dispositionDate!= null))) {
                return false;
            }
        }
        {
            ProductReferenceType lhsFinalProductReference;
            lhsFinalProductReference = this.getFinalProductReference();
            ProductReferenceType rhsFinalProductReference;
            rhsFinalProductReference = that.getFinalProductReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "finalProductReference", lhsFinalProductReference), LocatorUtils.property(thatLocator, "finalProductReference", rhsFinalProductReference), lhsFinalProductReference, rhsFinalProductReference, (this.finalProductReference!= null), (that.finalProductReference!= null))) {
                return false;
            }
        }
        {
            List<IncidentInformationType> lhsIncidentInformation;
            lhsIncidentInformation = (((this.incidentInformation!= null)&&(!this.incidentInformation.isEmpty()))?this.getIncidentInformation():null);
            List<IncidentInformationType> rhsIncidentInformation;
            rhsIncidentInformation = (((that.incidentInformation!= null)&&(!that.incidentInformation.isEmpty()))?that.getIncidentInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "incidentInformation", lhsIncidentInformation), LocatorUtils.property(thatLocator, "incidentInformation", rhsIncidentInformation), lhsIncidentInformation, rhsIncidentInformation, ((this.incidentInformation!= null)&&(!this.incidentInformation.isEmpty())), ((that.incidentInformation!= null)&&(!that.incidentInformation.isEmpty())))) {
                return false;
            }
        }
        {
            LocationInformationType lhsLocationInformation;
            lhsLocationInformation = this.getLocationInformation();
            LocationInformationType rhsLocationInformation;
            rhsLocationInformation = that.getLocationInformation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "locationInformation", lhsLocationInformation), LocatorUtils.property(thatLocator, "locationInformation", rhsLocationInformation), lhsLocationInformation, rhsLocationInformation, (this.locationInformation!= null), (that.locationInformation!= null))) {
                return false;
            }
        }
        {
            String lhsOperatorIdentifier;
            lhsOperatorIdentifier = this.getOperatorIdentifier();
            String rhsOperatorIdentifier;
            rhsOperatorIdentifier = that.getOperatorIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "operatorIdentifier", lhsOperatorIdentifier), LocatorUtils.property(thatLocator, "operatorIdentifier", rhsOperatorIdentifier), lhsOperatorIdentifier, rhsOperatorIdentifier, (this.operatorIdentifier!= null), (that.operatorIdentifier!= null))) {
                return false;
            }
        }
        {
            ProductQuantity lhsProductQuantity;
            lhsProductQuantity = this.getProductQuantity();
            ProductQuantity rhsProductQuantity;
            rhsProductQuantity = that.getProductQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productQuantity", lhsProductQuantity), LocatorUtils.property(thatLocator, "productQuantity", rhsProductQuantity), lhsProductQuantity, rhsProductQuantity, (this.productQuantity!= null), (that.productQuantity!= null))) {
                return false;
            }
        }
        {
            QualityDisposition lhsQualityDisposition;
            lhsQualityDisposition = this.getQualityDisposition();
            QualityDisposition rhsQualityDisposition;
            rhsQualityDisposition = that.getQualityDisposition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qualityDisposition", lhsQualityDisposition), LocatorUtils.property(thatLocator, "qualityDisposition", rhsQualityDisposition), lhsQualityDisposition, rhsQualityDisposition, (this.qualityDisposition!= null), (that.qualityDisposition!= null))) {
                return false;
            }
        }
        {
            ReceivedProductReferenceType lhsReceivedProductReference;
            lhsReceivedProductReference = this.getReceivedProductReference();
            ReceivedProductReferenceType rhsReceivedProductReference;
            rhsReceivedProductReference = that.getReceivedProductReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "receivedProductReference", lhsReceivedProductReference), LocatorUtils.property(thatLocator, "receivedProductReference", rhsReceivedProductReference), lhsReceivedProductReference, rhsReceivedProductReference, (this.receivedProductReference!= null), (that.receivedProductReference!= null))) {
                return false;
            }
        }
        {
            List<ComponentRepairType> lhsStatus;
            lhsStatus = (((this.status!= null)&&(!this.status.isEmpty()))?this.getStatus():null);
            List<ComponentRepairType> rhsStatus;
            rhsStatus = (((that.status!= null)&&(!that.status.isEmpty()))?that.getStatus():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "status", lhsStatus), LocatorUtils.property(thatLocator, "status", rhsStatus), lhsStatus, rhsStatus, ((this.status!= null)&&(!this.status.isEmpty())), ((that.status!= null)&&(!that.status.isEmpty())))) {
                return false;
            }
        }
        {
            UnitOfMeasure lhsUnitOfMeasure;
            lhsUnitOfMeasure = this.getUnitOfMeasure();
            UnitOfMeasure rhsUnitOfMeasure;
            rhsUnitOfMeasure = that.getUnitOfMeasure();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "unitOfMeasure", lhsUnitOfMeasure), LocatorUtils.property(thatLocator, "unitOfMeasure", rhsUnitOfMeasure), lhsUnitOfMeasure, rhsUnitOfMeasure, (this.unitOfMeasure!= null), (that.unitOfMeasure!= null))) {
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
            BusinessDocumentReference theBusinessDocumentReference;
            theBusinessDocumentReference = this.getBusinessDocumentReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDocumentReference", theBusinessDocumentReference), currentHashCode, theBusinessDocumentReference, (this.businessDocumentReference!= null));
        }
        {
            String theComment;
            theComment = this.getComment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "comment", theComment), currentHashCode, theComment, (this.comment!= null));
        }
        {
            XMLGregorianCalendar theDispositionDate;
            theDispositionDate = this.getDispositionDate();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dispositionDate", theDispositionDate), currentHashCode, theDispositionDate, (this.dispositionDate!= null));
        }
        {
            ProductReferenceType theFinalProductReference;
            theFinalProductReference = this.getFinalProductReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "finalProductReference", theFinalProductReference), currentHashCode, theFinalProductReference, (this.finalProductReference!= null));
        }
        {
            List<IncidentInformationType> theIncidentInformation;
            theIncidentInformation = (((this.incidentInformation!= null)&&(!this.incidentInformation.isEmpty()))?this.getIncidentInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "incidentInformation", theIncidentInformation), currentHashCode, theIncidentInformation, ((this.incidentInformation!= null)&&(!this.incidentInformation.isEmpty())));
        }
        {
            LocationInformationType theLocationInformation;
            theLocationInformation = this.getLocationInformation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "locationInformation", theLocationInformation), currentHashCode, theLocationInformation, (this.locationInformation!= null));
        }
        {
            String theOperatorIdentifier;
            theOperatorIdentifier = this.getOperatorIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "operatorIdentifier", theOperatorIdentifier), currentHashCode, theOperatorIdentifier, (this.operatorIdentifier!= null));
        }
        {
            ProductQuantity theProductQuantity;
            theProductQuantity = this.getProductQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productQuantity", theProductQuantity), currentHashCode, theProductQuantity, (this.productQuantity!= null));
        }
        {
            QualityDisposition theQualityDisposition;
            theQualityDisposition = this.getQualityDisposition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qualityDisposition", theQualityDisposition), currentHashCode, theQualityDisposition, (this.qualityDisposition!= null));
        }
        {
            ReceivedProductReferenceType theReceivedProductReference;
            theReceivedProductReference = this.getReceivedProductReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "receivedProductReference", theReceivedProductReference), currentHashCode, theReceivedProductReference, (this.receivedProductReference!= null));
        }
        {
            List<ComponentRepairType> theStatus;
            theStatus = (((this.status!= null)&&(!this.status.isEmpty()))?this.getStatus():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "status", theStatus), currentHashCode, theStatus, ((this.status!= null)&&(!this.status.isEmpty())));
        }
        {
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "unitOfMeasure", theUnitOfMeasure), currentHashCode, theUnitOfMeasure, (this.unitOfMeasure!= null));
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
            BusinessDocumentReference theBusinessDocumentReference;
            theBusinessDocumentReference = this.getBusinessDocumentReference();
            strategy.appendField(locator, this, "businessDocumentReference", buffer, theBusinessDocumentReference, (this.businessDocumentReference!= null));
        }
        {
            String theComment;
            theComment = this.getComment();
            strategy.appendField(locator, this, "comment", buffer, theComment, (this.comment!= null));
        }
        {
            XMLGregorianCalendar theDispositionDate;
            theDispositionDate = this.getDispositionDate();
            strategy.appendField(locator, this, "dispositionDate", buffer, theDispositionDate, (this.dispositionDate!= null));
        }
        {
            ProductReferenceType theFinalProductReference;
            theFinalProductReference = this.getFinalProductReference();
            strategy.appendField(locator, this, "finalProductReference", buffer, theFinalProductReference, (this.finalProductReference!= null));
        }
        {
            List<IncidentInformationType> theIncidentInformation;
            theIncidentInformation = (((this.incidentInformation!= null)&&(!this.incidentInformation.isEmpty()))?this.getIncidentInformation():null);
            strategy.appendField(locator, this, "incidentInformation", buffer, theIncidentInformation, ((this.incidentInformation!= null)&&(!this.incidentInformation.isEmpty())));
        }
        {
            LocationInformationType theLocationInformation;
            theLocationInformation = this.getLocationInformation();
            strategy.appendField(locator, this, "locationInformation", buffer, theLocationInformation, (this.locationInformation!= null));
        }
        {
            String theOperatorIdentifier;
            theOperatorIdentifier = this.getOperatorIdentifier();
            strategy.appendField(locator, this, "operatorIdentifier", buffer, theOperatorIdentifier, (this.operatorIdentifier!= null));
        }
        {
            ProductQuantity theProductQuantity;
            theProductQuantity = this.getProductQuantity();
            strategy.appendField(locator, this, "productQuantity", buffer, theProductQuantity, (this.productQuantity!= null));
        }
        {
            QualityDisposition theQualityDisposition;
            theQualityDisposition = this.getQualityDisposition();
            strategy.appendField(locator, this, "qualityDisposition", buffer, theQualityDisposition, (this.qualityDisposition!= null));
        }
        {
            ReceivedProductReferenceType theReceivedProductReference;
            theReceivedProductReference = this.getReceivedProductReference();
            strategy.appendField(locator, this, "receivedProductReference", buffer, theReceivedProductReference, (this.receivedProductReference!= null));
        }
        {
            List<ComponentRepairType> theStatus;
            theStatus = (((this.status!= null)&&(!this.status.isEmpty()))?this.getStatus():null);
            strategy.appendField(locator, this, "status", buffer, theStatus, ((this.status!= null)&&(!this.status.isEmpty())));
        }
        {
            UnitOfMeasure theUnitOfMeasure;
            theUnitOfMeasure = this.getUnitOfMeasure();
            strategy.appendField(locator, this, "unitOfMeasure", buffer, theUnitOfMeasure, (this.unitOfMeasure!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
