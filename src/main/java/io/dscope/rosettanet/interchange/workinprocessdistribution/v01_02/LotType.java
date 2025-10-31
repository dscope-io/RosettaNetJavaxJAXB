
package io.dscope.rosettanet.interchange.workinprocessdistribution.v01_02;

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
import io.dscope.rosettanet.domain.manufacturing.codelist.lotstatus.v01_03.LotStatus;
import io.dscope.rosettanet.domain.manufacturing.codelist.priority.v01_04.Priority;
import io.dscope.rosettanet.domain.manufacturing.codelist.qualitystatus.v01_04.QualityStatus;
import io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesslocation.v01_03.WorkInProcessLocation;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_18.LotQuantity;
import io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_18.OrderReference;
import io.dscope.rosettanet.domain.procurement.procurement.v02_17.LotIdentification;
import io.dscope.rosettanet.universal.partneridentification.v01_12.SpecifiedPartnerDescriptionType;
import io.dscope.rosettanet.universal.productidentification.v01_04.ProductIdentification;
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
 * <p>Java class for LotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LotType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17}LotIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18}LotQuantity" maxOccurs="unbounded"/&gt;
 *         &lt;element name="LotShipment" type="{urn:rosettanet:specification:interchange:WorkInProcessDistribution:xsd:schema:01.02}LotShipmentType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:LotStatus:xsd:codelist:01.03}LotStatus"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:LotType:xsd:codelist:01.04}LotType"/&gt;
 *         &lt;element name="ManufacturingDateCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18}OrderReference"/&gt;
 *         &lt;element name="PartInformation" type="{urn:rosettanet:specification:interchange:WorkInProcessDistribution:xsd:schema:01.02}PartInformationType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="PreviousLot" type="{urn:rosettanet:specification:interchange:WorkInProcessDistribution:xsd:schema:01.02}PreviousLotType" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:Priority:xsd:codelist:01.04}Priority" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04}ProductIdentification"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:QualityStatus:xsd:codelist:01.04}QualityStatus" minOccurs="0"/&gt;
 *         &lt;element name="SubLot" type="{urn:rosettanet:specification:interchange:WorkInProcessDistribution:xsd:schema:01.02}SubLotType" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="TransferManufacturingTo" type="{urn:rosettanet:specification:universal:PartnerIdentification:xsd:schema:01.12}SpecifiedPartnerDescriptionType" minOccurs="0"/&gt;
 *         &lt;element name="TransferToManufacturingLine" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:WorkInProcessLocation:xsd:codelist:01.03}WorkInProcessLocation"/&gt;
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
@XmlType(name = "LotType", propOrder = {
    "lotIdentification",
    "lotQuantity",
    "lotShipment",
    "lotStatus",
    "lotType",
    "manufacturingDateCode",
    "orderReference",
    "partInformation",
    "previousLot",
    "priority",
    "productIdentification",
    "qualityStatus",
    "subLot",
    "transferManufacturingTo",
    "transferToManufacturingLine",
    "workInProcessLocation"
})
public class LotType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "LotIdentification", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", type = LotIdentification.class)
    protected LotIdentification lotIdentification;
    @XmlElementRef(name = "LotQuantity", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18", type = LotQuantity.class)
    protected List<LotQuantity> lotQuantity;
    @XmlElement(name = "LotShipment")
    protected LotShipmentType lotShipment;
    @XmlElementRef(name = "LotStatus", namespace = "urn:rosettanet:specification:domain:Manufacturing:LotStatus:xsd:codelist:01.03", type = LotStatus.class)
    protected LotStatus lotStatus;
    @XmlElementRef(name = "LotType", namespace = "urn:rosettanet:specification:domain:Manufacturing:LotType:xsd:codelist:01.04", type = io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType.class)
    protected io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType lotType;
    @XmlElement(name = "ManufacturingDateCode")
    protected String manufacturingDateCode;
    @XmlElementRef(name = "OrderReference", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.18", type = OrderReference.class)
    protected OrderReference orderReference;
    @XmlElement(name = "PartInformation")
    protected List<PartInformationType> partInformation;
    @XmlElement(name = "PreviousLot")
    protected PreviousLotType previousLot;
    @XmlElementRef(name = "Priority", namespace = "urn:rosettanet:specification:domain:Manufacturing:Priority:xsd:codelist:01.04", type = Priority.class, required = false)
    protected Priority priority;
    @XmlElementRef(name = "ProductIdentification", namespace = "urn:rosettanet:specification:universal:ProductIdentification:xsd:schema:01.04", type = ProductIdentification.class)
    protected ProductIdentification productIdentification;
    @XmlElementRef(name = "QualityStatus", namespace = "urn:rosettanet:specification:domain:Manufacturing:QualityStatus:xsd:codelist:01.04", type = QualityStatus.class, required = false)
    protected QualityStatus qualityStatus;
    @XmlElement(name = "SubLot")
    protected List<SubLotType> subLot;
    @XmlElement(name = "TransferManufacturingTo")
    protected SpecifiedPartnerDescriptionType transferManufacturingTo;
    @XmlElement(name = "TransferToManufacturingLine")
    protected String transferToManufacturingLine;
    @XmlElementRef(name = "WorkInProcessLocation", namespace = "urn:rosettanet:specification:domain:Manufacturing:WorkInProcessLocation:xsd:codelist:01.03", type = WorkInProcessLocation.class)
    protected WorkInProcessLocation workInProcessLocation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the lotIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link LotIdentification }
     *     
     */
    public LotIdentification getLotIdentification() {
        return lotIdentification;
    }

    /**
     * Sets the value of the lotIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotIdentification }
     *     
     */
    public void setLotIdentification(LotIdentification value) {
        this.lotIdentification = value;
    }

    /**
     * Gets the value of the lotQuantity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lotQuantity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLotQuantity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LotQuantity }
     * 
     * 
     */
    public List<LotQuantity> getLotQuantity() {
        if (lotQuantity == null) {
            lotQuantity = new ArrayList<LotQuantity>();
        }
        return this.lotQuantity;
    }

    /**
     * Gets the value of the lotShipment property.
     * 
     * @return
     *     possible object is
     *     {@link LotShipmentType }
     *     
     */
    public LotShipmentType getLotShipment() {
        return lotShipment;
    }

    /**
     * Sets the value of the lotShipment property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotShipmentType }
     *     
     */
    public void setLotShipment(LotShipmentType value) {
        this.lotShipment = value;
    }

    /**
     * Gets the value of the lotStatus property.
     * 
     * @return
     *     possible object is
     *     {@link LotStatus }
     *     
     */
    public LotStatus getLotStatus() {
        return lotStatus;
    }

    /**
     * Sets the value of the lotStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotStatus }
     *     
     */
    public void setLotStatus(LotStatus value) {
        this.lotStatus = value;
    }

    /**
     * Gets the value of the lotType property.
     * 
     * @return
     *     possible object is
     *     {@link io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType }
     *     
     */
    public io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType getLotType() {
        return lotType;
    }

    /**
     * Sets the value of the lotType property.
     * 
     * @param value
     *     allowed object is
     *     {@link io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType }
     *     
     */
    public void setLotType(io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType value) {
        this.lotType = value;
    }

    /**
     * Gets the value of the manufacturingDateCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getManufacturingDateCode() {
        return manufacturingDateCode;
    }

    /**
     * Sets the value of the manufacturingDateCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setManufacturingDateCode(String value) {
        this.manufacturingDateCode = value;
    }

    /**
     * Gets the value of the orderReference property.
     * 
     * @return
     *     possible object is
     *     {@link OrderReference }
     *     
     */
    public OrderReference getOrderReference() {
        return orderReference;
    }

    /**
     * Sets the value of the orderReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderReference }
     *     
     */
    public void setOrderReference(OrderReference value) {
        this.orderReference = value;
    }

    /**
     * Gets the value of the partInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartInformationType }
     * 
     * 
     */
    public List<PartInformationType> getPartInformation() {
        if (partInformation == null) {
            partInformation = new ArrayList<PartInformationType>();
        }
        return this.partInformation;
    }

    /**
     * Gets the value of the previousLot property.
     * 
     * @return
     *     possible object is
     *     {@link PreviousLotType }
     *     
     */
    public PreviousLotType getPreviousLot() {
        return previousLot;
    }

    /**
     * Sets the value of the previousLot property.
     * 
     * @param value
     *     allowed object is
     *     {@link PreviousLotType }
     *     
     */
    public void setPreviousLot(PreviousLotType value) {
        this.previousLot = value;
    }

    /**
     * Gets the value of the priority property.
     * 
     * @return
     *     possible object is
     *     {@link Priority }
     *     
     */
    public Priority getPriority() {
        return priority;
    }

    /**
     * Sets the value of the priority property.
     * 
     * @param value
     *     allowed object is
     *     {@link Priority }
     *     
     */
    public void setPriority(Priority value) {
        this.priority = value;
    }

    /**
     * Gets the value of the productIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link ProductIdentification }
     *     
     */
    public ProductIdentification getProductIdentification() {
        return productIdentification;
    }

    /**
     * Sets the value of the productIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProductIdentification }
     *     
     */
    public void setProductIdentification(ProductIdentification value) {
        this.productIdentification = value;
    }

    /**
     * Gets the value of the qualityStatus property.
     * 
     * @return
     *     possible object is
     *     {@link QualityStatus }
     *     
     */
    public QualityStatus getQualityStatus() {
        return qualityStatus;
    }

    /**
     * Sets the value of the qualityStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link QualityStatus }
     *     
     */
    public void setQualityStatus(QualityStatus value) {
        this.qualityStatus = value;
    }

    /**
     * Gets the value of the subLot property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subLot property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubLot().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SubLotType }
     * 
     * 
     */
    public List<SubLotType> getSubLot() {
        if (subLot == null) {
            subLot = new ArrayList<SubLotType>();
        }
        return this.subLot;
    }

    /**
     * Gets the value of the transferManufacturingTo property.
     * 
     * @return
     *     possible object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public SpecifiedPartnerDescriptionType getTransferManufacturingTo() {
        return transferManufacturingTo;
    }

    /**
     * Sets the value of the transferManufacturingTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecifiedPartnerDescriptionType }
     *     
     */
    public void setTransferManufacturingTo(SpecifiedPartnerDescriptionType value) {
        this.transferManufacturingTo = value;
    }

    /**
     * Gets the value of the transferToManufacturingLine property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTransferToManufacturingLine() {
        return transferToManufacturingLine;
    }

    /**
     * Sets the value of the transferToManufacturingLine property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTransferToManufacturingLine(String value) {
        this.transferToManufacturingLine = value;
    }

    /**
     * Gets the value of the workInProcessLocation property.
     * 
     * @return
     *     possible object is
     *     {@link WorkInProcessLocation }
     *     
     */
    public WorkInProcessLocation getWorkInProcessLocation() {
        return workInProcessLocation;
    }

    /**
     * Sets the value of the workInProcessLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkInProcessLocation }
     *     
     */
    public void setWorkInProcessLocation(WorkInProcessLocation value) {
        this.workInProcessLocation = value;
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
        final LotType that = ((LotType) object);
        {
            LotIdentification lhsLotIdentification;
            lhsLotIdentification = this.getLotIdentification();
            LotIdentification rhsLotIdentification;
            rhsLotIdentification = that.getLotIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotIdentification", lhsLotIdentification), LocatorUtils.property(thatLocator, "lotIdentification", rhsLotIdentification), lhsLotIdentification, rhsLotIdentification, (this.lotIdentification!= null), (that.lotIdentification!= null))) {
                return false;
            }
        }
        {
            List<LotQuantity> lhsLotQuantity;
            lhsLotQuantity = (((this.lotQuantity!= null)&&(!this.lotQuantity.isEmpty()))?this.getLotQuantity():null);
            List<LotQuantity> rhsLotQuantity;
            rhsLotQuantity = (((that.lotQuantity!= null)&&(!that.lotQuantity.isEmpty()))?that.getLotQuantity():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotQuantity", lhsLotQuantity), LocatorUtils.property(thatLocator, "lotQuantity", rhsLotQuantity), lhsLotQuantity, rhsLotQuantity, ((this.lotQuantity!= null)&&(!this.lotQuantity.isEmpty())), ((that.lotQuantity!= null)&&(!that.lotQuantity.isEmpty())))) {
                return false;
            }
        }
        {
            LotShipmentType lhsLotShipment;
            lhsLotShipment = this.getLotShipment();
            LotShipmentType rhsLotShipment;
            rhsLotShipment = that.getLotShipment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotShipment", lhsLotShipment), LocatorUtils.property(thatLocator, "lotShipment", rhsLotShipment), lhsLotShipment, rhsLotShipment, (this.lotShipment!= null), (that.lotShipment!= null))) {
                return false;
            }
        }
        {
            LotStatus lhsLotStatus;
            lhsLotStatus = this.getLotStatus();
            LotStatus rhsLotStatus;
            rhsLotStatus = that.getLotStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotStatus", lhsLotStatus), LocatorUtils.property(thatLocator, "lotStatus", rhsLotStatus), lhsLotStatus, rhsLotStatus, (this.lotStatus!= null), (that.lotStatus!= null))) {
                return false;
            }
        }
        {
            io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType lhsLotType;
            lhsLotType = this.getLotType();
            io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType rhsLotType;
            rhsLotType = that.getLotType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotType", lhsLotType), LocatorUtils.property(thatLocator, "lotType", rhsLotType), lhsLotType, rhsLotType, (this.lotType!= null), (that.lotType!= null))) {
                return false;
            }
        }
        {
            String lhsManufacturingDateCode;
            lhsManufacturingDateCode = this.getManufacturingDateCode();
            String rhsManufacturingDateCode;
            rhsManufacturingDateCode = that.getManufacturingDateCode();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "manufacturingDateCode", lhsManufacturingDateCode), LocatorUtils.property(thatLocator, "manufacturingDateCode", rhsManufacturingDateCode), lhsManufacturingDateCode, rhsManufacturingDateCode, (this.manufacturingDateCode!= null), (that.manufacturingDateCode!= null))) {
                return false;
            }
        }
        {
            OrderReference lhsOrderReference;
            lhsOrderReference = this.getOrderReference();
            OrderReference rhsOrderReference;
            rhsOrderReference = that.getOrderReference();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "orderReference", lhsOrderReference), LocatorUtils.property(thatLocator, "orderReference", rhsOrderReference), lhsOrderReference, rhsOrderReference, (this.orderReference!= null), (that.orderReference!= null))) {
                return false;
            }
        }
        {
            List<PartInformationType> lhsPartInformation;
            lhsPartInformation = (((this.partInformation!= null)&&(!this.partInformation.isEmpty()))?this.getPartInformation():null);
            List<PartInformationType> rhsPartInformation;
            rhsPartInformation = (((that.partInformation!= null)&&(!that.partInformation.isEmpty()))?that.getPartInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "partInformation", lhsPartInformation), LocatorUtils.property(thatLocator, "partInformation", rhsPartInformation), lhsPartInformation, rhsPartInformation, ((this.partInformation!= null)&&(!this.partInformation.isEmpty())), ((that.partInformation!= null)&&(!that.partInformation.isEmpty())))) {
                return false;
            }
        }
        {
            PreviousLotType lhsPreviousLot;
            lhsPreviousLot = this.getPreviousLot();
            PreviousLotType rhsPreviousLot;
            rhsPreviousLot = that.getPreviousLot();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "previousLot", lhsPreviousLot), LocatorUtils.property(thatLocator, "previousLot", rhsPreviousLot), lhsPreviousLot, rhsPreviousLot, (this.previousLot!= null), (that.previousLot!= null))) {
                return false;
            }
        }
        {
            Priority lhsPriority;
            lhsPriority = this.getPriority();
            Priority rhsPriority;
            rhsPriority = that.getPriority();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "priority", lhsPriority), LocatorUtils.property(thatLocator, "priority", rhsPriority), lhsPriority, rhsPriority, (this.priority!= null), (that.priority!= null))) {
                return false;
            }
        }
        {
            ProductIdentification lhsProductIdentification;
            lhsProductIdentification = this.getProductIdentification();
            ProductIdentification rhsProductIdentification;
            rhsProductIdentification = that.getProductIdentification();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "productIdentification", lhsProductIdentification), LocatorUtils.property(thatLocator, "productIdentification", rhsProductIdentification), lhsProductIdentification, rhsProductIdentification, (this.productIdentification!= null), (that.productIdentification!= null))) {
                return false;
            }
        }
        {
            QualityStatus lhsQualityStatus;
            lhsQualityStatus = this.getQualityStatus();
            QualityStatus rhsQualityStatus;
            rhsQualityStatus = that.getQualityStatus();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "qualityStatus", lhsQualityStatus), LocatorUtils.property(thatLocator, "qualityStatus", rhsQualityStatus), lhsQualityStatus, rhsQualityStatus, (this.qualityStatus!= null), (that.qualityStatus!= null))) {
                return false;
            }
        }
        {
            List<SubLotType> lhsSubLot;
            lhsSubLot = (((this.subLot!= null)&&(!this.subLot.isEmpty()))?this.getSubLot():null);
            List<SubLotType> rhsSubLot;
            rhsSubLot = (((that.subLot!= null)&&(!that.subLot.isEmpty()))?that.getSubLot():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "subLot", lhsSubLot), LocatorUtils.property(thatLocator, "subLot", rhsSubLot), lhsSubLot, rhsSubLot, ((this.subLot!= null)&&(!this.subLot.isEmpty())), ((that.subLot!= null)&&(!that.subLot.isEmpty())))) {
                return false;
            }
        }
        {
            SpecifiedPartnerDescriptionType lhsTransferManufacturingTo;
            lhsTransferManufacturingTo = this.getTransferManufacturingTo();
            SpecifiedPartnerDescriptionType rhsTransferManufacturingTo;
            rhsTransferManufacturingTo = that.getTransferManufacturingTo();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transferManufacturingTo", lhsTransferManufacturingTo), LocatorUtils.property(thatLocator, "transferManufacturingTo", rhsTransferManufacturingTo), lhsTransferManufacturingTo, rhsTransferManufacturingTo, (this.transferManufacturingTo!= null), (that.transferManufacturingTo!= null))) {
                return false;
            }
        }
        {
            String lhsTransferToManufacturingLine;
            lhsTransferToManufacturingLine = this.getTransferToManufacturingLine();
            String rhsTransferToManufacturingLine;
            rhsTransferToManufacturingLine = that.getTransferToManufacturingLine();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transferToManufacturingLine", lhsTransferToManufacturingLine), LocatorUtils.property(thatLocator, "transferToManufacturingLine", rhsTransferToManufacturingLine), lhsTransferToManufacturingLine, rhsTransferToManufacturingLine, (this.transferToManufacturingLine!= null), (that.transferToManufacturingLine!= null))) {
                return false;
            }
        }
        {
            WorkInProcessLocation lhsWorkInProcessLocation;
            lhsWorkInProcessLocation = this.getWorkInProcessLocation();
            WorkInProcessLocation rhsWorkInProcessLocation;
            rhsWorkInProcessLocation = that.getWorkInProcessLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "workInProcessLocation", lhsWorkInProcessLocation), LocatorUtils.property(thatLocator, "workInProcessLocation", rhsWorkInProcessLocation), lhsWorkInProcessLocation, rhsWorkInProcessLocation, (this.workInProcessLocation!= null), (that.workInProcessLocation!= null))) {
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
            LotIdentification theLotIdentification;
            theLotIdentification = this.getLotIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotIdentification", theLotIdentification), currentHashCode, theLotIdentification, (this.lotIdentification!= null));
        }
        {
            List<LotQuantity> theLotQuantity;
            theLotQuantity = (((this.lotQuantity!= null)&&(!this.lotQuantity.isEmpty()))?this.getLotQuantity():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotQuantity", theLotQuantity), currentHashCode, theLotQuantity, ((this.lotQuantity!= null)&&(!this.lotQuantity.isEmpty())));
        }
        {
            LotShipmentType theLotShipment;
            theLotShipment = this.getLotShipment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotShipment", theLotShipment), currentHashCode, theLotShipment, (this.lotShipment!= null));
        }
        {
            LotStatus theLotStatus;
            theLotStatus = this.getLotStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotStatus", theLotStatus), currentHashCode, theLotStatus, (this.lotStatus!= null));
        }
        {
            io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType theLotType;
            theLotType = this.getLotType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotType", theLotType), currentHashCode, theLotType, (this.lotType!= null));
        }
        {
            String theManufacturingDateCode;
            theManufacturingDateCode = this.getManufacturingDateCode();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "manufacturingDateCode", theManufacturingDateCode), currentHashCode, theManufacturingDateCode, (this.manufacturingDateCode!= null));
        }
        {
            OrderReference theOrderReference;
            theOrderReference = this.getOrderReference();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "orderReference", theOrderReference), currentHashCode, theOrderReference, (this.orderReference!= null));
        }
        {
            List<PartInformationType> thePartInformation;
            thePartInformation = (((this.partInformation!= null)&&(!this.partInformation.isEmpty()))?this.getPartInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "partInformation", thePartInformation), currentHashCode, thePartInformation, ((this.partInformation!= null)&&(!this.partInformation.isEmpty())));
        }
        {
            PreviousLotType thePreviousLot;
            thePreviousLot = this.getPreviousLot();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "previousLot", thePreviousLot), currentHashCode, thePreviousLot, (this.previousLot!= null));
        }
        {
            Priority thePriority;
            thePriority = this.getPriority();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priority", thePriority), currentHashCode, thePriority, (this.priority!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "productIdentification", theProductIdentification), currentHashCode, theProductIdentification, (this.productIdentification!= null));
        }
        {
            QualityStatus theQualityStatus;
            theQualityStatus = this.getQualityStatus();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "qualityStatus", theQualityStatus), currentHashCode, theQualityStatus, (this.qualityStatus!= null));
        }
        {
            List<SubLotType> theSubLot;
            theSubLot = (((this.subLot!= null)&&(!this.subLot.isEmpty()))?this.getSubLot():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "subLot", theSubLot), currentHashCode, theSubLot, ((this.subLot!= null)&&(!this.subLot.isEmpty())));
        }
        {
            SpecifiedPartnerDescriptionType theTransferManufacturingTo;
            theTransferManufacturingTo = this.getTransferManufacturingTo();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transferManufacturingTo", theTransferManufacturingTo), currentHashCode, theTransferManufacturingTo, (this.transferManufacturingTo!= null));
        }
        {
            String theTransferToManufacturingLine;
            theTransferToManufacturingLine = this.getTransferToManufacturingLine();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transferToManufacturingLine", theTransferToManufacturingLine), currentHashCode, theTransferToManufacturingLine, (this.transferToManufacturingLine!= null));
        }
        {
            WorkInProcessLocation theWorkInProcessLocation;
            theWorkInProcessLocation = this.getWorkInProcessLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "workInProcessLocation", theWorkInProcessLocation), currentHashCode, theWorkInProcessLocation, (this.workInProcessLocation!= null));
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
            LotIdentification theLotIdentification;
            theLotIdentification = this.getLotIdentification();
            strategy.appendField(locator, this, "lotIdentification", buffer, theLotIdentification, (this.lotIdentification!= null));
        }
        {
            List<LotQuantity> theLotQuantity;
            theLotQuantity = (((this.lotQuantity!= null)&&(!this.lotQuantity.isEmpty()))?this.getLotQuantity():null);
            strategy.appendField(locator, this, "lotQuantity", buffer, theLotQuantity, ((this.lotQuantity!= null)&&(!this.lotQuantity.isEmpty())));
        }
        {
            LotShipmentType theLotShipment;
            theLotShipment = this.getLotShipment();
            strategy.appendField(locator, this, "lotShipment", buffer, theLotShipment, (this.lotShipment!= null));
        }
        {
            LotStatus theLotStatus;
            theLotStatus = this.getLotStatus();
            strategy.appendField(locator, this, "lotStatus", buffer, theLotStatus, (this.lotStatus!= null));
        }
        {
            io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_04.LotType theLotType;
            theLotType = this.getLotType();
            strategy.appendField(locator, this, "lotType", buffer, theLotType, (this.lotType!= null));
        }
        {
            String theManufacturingDateCode;
            theManufacturingDateCode = this.getManufacturingDateCode();
            strategy.appendField(locator, this, "manufacturingDateCode", buffer, theManufacturingDateCode, (this.manufacturingDateCode!= null));
        }
        {
            OrderReference theOrderReference;
            theOrderReference = this.getOrderReference();
            strategy.appendField(locator, this, "orderReference", buffer, theOrderReference, (this.orderReference!= null));
        }
        {
            List<PartInformationType> thePartInformation;
            thePartInformation = (((this.partInformation!= null)&&(!this.partInformation.isEmpty()))?this.getPartInformation():null);
            strategy.appendField(locator, this, "partInformation", buffer, thePartInformation, ((this.partInformation!= null)&&(!this.partInformation.isEmpty())));
        }
        {
            PreviousLotType thePreviousLot;
            thePreviousLot = this.getPreviousLot();
            strategy.appendField(locator, this, "previousLot", buffer, thePreviousLot, (this.previousLot!= null));
        }
        {
            Priority thePriority;
            thePriority = this.getPriority();
            strategy.appendField(locator, this, "priority", buffer, thePriority, (this.priority!= null));
        }
        {
            ProductIdentification theProductIdentification;
            theProductIdentification = this.getProductIdentification();
            strategy.appendField(locator, this, "productIdentification", buffer, theProductIdentification, (this.productIdentification!= null));
        }
        {
            QualityStatus theQualityStatus;
            theQualityStatus = this.getQualityStatus();
            strategy.appendField(locator, this, "qualityStatus", buffer, theQualityStatus, (this.qualityStatus!= null));
        }
        {
            List<SubLotType> theSubLot;
            theSubLot = (((this.subLot!= null)&&(!this.subLot.isEmpty()))?this.getSubLot():null);
            strategy.appendField(locator, this, "subLot", buffer, theSubLot, ((this.subLot!= null)&&(!this.subLot.isEmpty())));
        }
        {
            SpecifiedPartnerDescriptionType theTransferManufacturingTo;
            theTransferManufacturingTo = this.getTransferManufacturingTo();
            strategy.appendField(locator, this, "transferManufacturingTo", buffer, theTransferManufacturingTo, (this.transferManufacturingTo!= null));
        }
        {
            String theTransferToManufacturingLine;
            theTransferToManufacturingLine = this.getTransferToManufacturingLine();
            strategy.appendField(locator, this, "transferToManufacturingLine", buffer, theTransferToManufacturingLine, (this.transferToManufacturingLine!= null));
        }
        {
            WorkInProcessLocation theWorkInProcessLocation;
            theWorkInProcessLocation = this.getWorkInProcessLocation();
            strategy.appendField(locator, this, "workInProcessLocation", buffer, theWorkInProcessLocation, (this.workInProcessLocation!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
