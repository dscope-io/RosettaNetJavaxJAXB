
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_04;

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
import io.dscope.rosettanet.domain.manufacturing.codelist.lottype.v01_02.LotType;
import io.dscope.rosettanet.universal.physicaldimension.v01_01.LinearType;
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
 * <p>Java class for SourceLotType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SourceLotType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BondingPadSize" type="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.01}LinearType" minOccurs="0"/&gt;
 *         &lt;element name="DieSize" type="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.01}LinearType" minOccurs="0"/&gt;
 *         &lt;element name="IsInking" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="IsMappingFile" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:LotType:xsd:codelist:01.02}LotType" minOccurs="0"/&gt;
 *         &lt;element name="MappingFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SourceLotNumber" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.04}WaferInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.04}WaferLotQuantity"/&gt;
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
@XmlType(name = "SourceLotType", propOrder = {
    "bondingPadSize",
    "dieSize",
    "isInking",
    "isMappingFile",
    "lotType",
    "mappingFileName",
    "sourceLotNumber",
    "waferInformation",
    "waferLotQuantity"
})
public class SourceLotType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "BondingPadSize")
    protected LinearType bondingPadSize;
    @XmlElement(name = "DieSize")
    protected LinearType dieSize;
    @XmlElement(name = "IsInking")
    protected Boolean isInking;
    @XmlElement(name = "IsMappingFile")
    protected Boolean isMappingFile;
    @XmlElementRef(name = "LotType", namespace = "urn:rosettanet:specification:domain:Manufacturing:LotType:xsd:codelist:01.02", type = LotType.class, required = false)
    protected LotType lotType;
    @XmlElement(name = "MappingFileName")
    protected String mappingFileName;
    @XmlElement(name = "SourceLotNumber", required = true)
    protected String sourceLotNumber;
    @XmlElementRef(name = "WaferInformation", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.04", type = WaferInformation.class, required = false)
    protected List<WaferInformation> waferInformation;
    @XmlElementRef(name = "WaferLotQuantity", namespace = "urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.04", type = WaferLotQuantity.class)
    protected WaferLotQuantity waferLotQuantity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the bondingPadSize property.
     * 
     * @return
     *     possible object is
     *     {@link LinearType }
     *     
     */
    public LinearType getBondingPadSize() {
        return bondingPadSize;
    }

    /**
     * Sets the value of the bondingPadSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearType }
     *     
     */
    public void setBondingPadSize(LinearType value) {
        this.bondingPadSize = value;
    }

    /**
     * Gets the value of the dieSize property.
     * 
     * @return
     *     possible object is
     *     {@link LinearType }
     *     
     */
    public LinearType getDieSize() {
        return dieSize;
    }

    /**
     * Sets the value of the dieSize property.
     * 
     * @param value
     *     allowed object is
     *     {@link LinearType }
     *     
     */
    public void setDieSize(LinearType value) {
        this.dieSize = value;
    }

    /**
     * Gets the value of the isInking property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsInking() {
        return isInking;
    }

    /**
     * Sets the value of the isInking property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInking(Boolean value) {
        this.isInking = value;
    }

    /**
     * Gets the value of the isMappingFile property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsMappingFile() {
        return isMappingFile;
    }

    /**
     * Sets the value of the isMappingFile property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsMappingFile(Boolean value) {
        this.isMappingFile = value;
    }

    /**
     * Gets the value of the lotType property.
     * 
     * @return
     *     possible object is
     *     {@link LotType }
     *     
     */
    public LotType getLotType() {
        return lotType;
    }

    /**
     * Sets the value of the lotType property.
     * 
     * @param value
     *     allowed object is
     *     {@link LotType }
     *     
     */
    public void setLotType(LotType value) {
        this.lotType = value;
    }

    /**
     * Gets the value of the mappingFileName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMappingFileName() {
        return mappingFileName;
    }

    /**
     * Sets the value of the mappingFileName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMappingFileName(String value) {
        this.mappingFileName = value;
    }

    /**
     * Gets the value of the sourceLotNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceLotNumber() {
        return sourceLotNumber;
    }

    /**
     * Sets the value of the sourceLotNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceLotNumber(String value) {
        this.sourceLotNumber = value;
    }

    /**
     * Gets the value of the waferInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waferInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaferInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WaferInformation }
     * 
     * 
     */
    public List<WaferInformation> getWaferInformation() {
        if (waferInformation == null) {
            waferInformation = new ArrayList<WaferInformation>();
        }
        return this.waferInformation;
    }

    /**
     * Gets the value of the waferLotQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link WaferLotQuantity }
     *     
     */
    public WaferLotQuantity getWaferLotQuantity() {
        return waferLotQuantity;
    }

    /**
     * Sets the value of the waferLotQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link WaferLotQuantity }
     *     
     */
    public void setWaferLotQuantity(WaferLotQuantity value) {
        this.waferLotQuantity = value;
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
        final SourceLotType that = ((SourceLotType) object);
        {
            LinearType lhsBondingPadSize;
            lhsBondingPadSize = this.getBondingPadSize();
            LinearType rhsBondingPadSize;
            rhsBondingPadSize = that.getBondingPadSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "bondingPadSize", lhsBondingPadSize), LocatorUtils.property(thatLocator, "bondingPadSize", rhsBondingPadSize), lhsBondingPadSize, rhsBondingPadSize, (this.bondingPadSize!= null), (that.bondingPadSize!= null))) {
                return false;
            }
        }
        {
            LinearType lhsDieSize;
            lhsDieSize = this.getDieSize();
            LinearType rhsDieSize;
            rhsDieSize = that.getDieSize();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "dieSize", lhsDieSize), LocatorUtils.property(thatLocator, "dieSize", rhsDieSize), lhsDieSize, rhsDieSize, (this.dieSize!= null), (that.dieSize!= null))) {
                return false;
            }
        }
        {
            Boolean lhsIsInking;
            lhsIsInking = this.isIsInking();
            Boolean rhsIsInking;
            rhsIsInking = that.isIsInking();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isInking", lhsIsInking), LocatorUtils.property(thatLocator, "isInking", rhsIsInking), lhsIsInking, rhsIsInking, (this.isInking!= null), (that.isInking!= null))) {
                return false;
            }
        }
        {
            Boolean lhsIsMappingFile;
            lhsIsMappingFile = this.isIsMappingFile();
            Boolean rhsIsMappingFile;
            rhsIsMappingFile = that.isIsMappingFile();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isMappingFile", lhsIsMappingFile), LocatorUtils.property(thatLocator, "isMappingFile", rhsIsMappingFile), lhsIsMappingFile, rhsIsMappingFile, (this.isMappingFile!= null), (that.isMappingFile!= null))) {
                return false;
            }
        }
        {
            LotType lhsLotType;
            lhsLotType = this.getLotType();
            LotType rhsLotType;
            rhsLotType = that.getLotType();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotType", lhsLotType), LocatorUtils.property(thatLocator, "lotType", rhsLotType), lhsLotType, rhsLotType, (this.lotType!= null), (that.lotType!= null))) {
                return false;
            }
        }
        {
            String lhsMappingFileName;
            lhsMappingFileName = this.getMappingFileName();
            String rhsMappingFileName;
            rhsMappingFileName = that.getMappingFileName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "mappingFileName", lhsMappingFileName), LocatorUtils.property(thatLocator, "mappingFileName", rhsMappingFileName), lhsMappingFileName, rhsMappingFileName, (this.mappingFileName!= null), (that.mappingFileName!= null))) {
                return false;
            }
        }
        {
            String lhsSourceLotNumber;
            lhsSourceLotNumber = this.getSourceLotNumber();
            String rhsSourceLotNumber;
            rhsSourceLotNumber = that.getSourceLotNumber();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceLotNumber", lhsSourceLotNumber), LocatorUtils.property(thatLocator, "sourceLotNumber", rhsSourceLotNumber), lhsSourceLotNumber, rhsSourceLotNumber, (this.sourceLotNumber!= null), (that.sourceLotNumber!= null))) {
                return false;
            }
        }
        {
            List<WaferInformation> lhsWaferInformation;
            lhsWaferInformation = (((this.waferInformation!= null)&&(!this.waferInformation.isEmpty()))?this.getWaferInformation():null);
            List<WaferInformation> rhsWaferInformation;
            rhsWaferInformation = (((that.waferInformation!= null)&&(!that.waferInformation.isEmpty()))?that.getWaferInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waferInformation", lhsWaferInformation), LocatorUtils.property(thatLocator, "waferInformation", rhsWaferInformation), lhsWaferInformation, rhsWaferInformation, ((this.waferInformation!= null)&&(!this.waferInformation.isEmpty())), ((that.waferInformation!= null)&&(!that.waferInformation.isEmpty())))) {
                return false;
            }
        }
        {
            WaferLotQuantity lhsWaferLotQuantity;
            lhsWaferLotQuantity = this.getWaferLotQuantity();
            WaferLotQuantity rhsWaferLotQuantity;
            rhsWaferLotQuantity = that.getWaferLotQuantity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "waferLotQuantity", lhsWaferLotQuantity), LocatorUtils.property(thatLocator, "waferLotQuantity", rhsWaferLotQuantity), lhsWaferLotQuantity, rhsWaferLotQuantity, (this.waferLotQuantity!= null), (that.waferLotQuantity!= null))) {
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
            LinearType theBondingPadSize;
            theBondingPadSize = this.getBondingPadSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "bondingPadSize", theBondingPadSize), currentHashCode, theBondingPadSize, (this.bondingPadSize!= null));
        }
        {
            LinearType theDieSize;
            theDieSize = this.getDieSize();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "dieSize", theDieSize), currentHashCode, theDieSize, (this.dieSize!= null));
        }
        {
            Boolean theIsInking;
            theIsInking = this.isIsInking();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isInking", theIsInking), currentHashCode, theIsInking, (this.isInking!= null));
        }
        {
            Boolean theIsMappingFile;
            theIsMappingFile = this.isIsMappingFile();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isMappingFile", theIsMappingFile), currentHashCode, theIsMappingFile, (this.isMappingFile!= null));
        }
        {
            LotType theLotType;
            theLotType = this.getLotType();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotType", theLotType), currentHashCode, theLotType, (this.lotType!= null));
        }
        {
            String theMappingFileName;
            theMappingFileName = this.getMappingFileName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "mappingFileName", theMappingFileName), currentHashCode, theMappingFileName, (this.mappingFileName!= null));
        }
        {
            String theSourceLotNumber;
            theSourceLotNumber = this.getSourceLotNumber();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceLotNumber", theSourceLotNumber), currentHashCode, theSourceLotNumber, (this.sourceLotNumber!= null));
        }
        {
            List<WaferInformation> theWaferInformation;
            theWaferInformation = (((this.waferInformation!= null)&&(!this.waferInformation.isEmpty()))?this.getWaferInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waferInformation", theWaferInformation), currentHashCode, theWaferInformation, ((this.waferInformation!= null)&&(!this.waferInformation.isEmpty())));
        }
        {
            WaferLotQuantity theWaferLotQuantity;
            theWaferLotQuantity = this.getWaferLotQuantity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "waferLotQuantity", theWaferLotQuantity), currentHashCode, theWaferLotQuantity, (this.waferLotQuantity!= null));
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
            LinearType theBondingPadSize;
            theBondingPadSize = this.getBondingPadSize();
            strategy.appendField(locator, this, "bondingPadSize", buffer, theBondingPadSize, (this.bondingPadSize!= null));
        }
        {
            LinearType theDieSize;
            theDieSize = this.getDieSize();
            strategy.appendField(locator, this, "dieSize", buffer, theDieSize, (this.dieSize!= null));
        }
        {
            Boolean theIsInking;
            theIsInking = this.isIsInking();
            strategy.appendField(locator, this, "isInking", buffer, theIsInking, (this.isInking!= null));
        }
        {
            Boolean theIsMappingFile;
            theIsMappingFile = this.isIsMappingFile();
            strategy.appendField(locator, this, "isMappingFile", buffer, theIsMappingFile, (this.isMappingFile!= null));
        }
        {
            LotType theLotType;
            theLotType = this.getLotType();
            strategy.appendField(locator, this, "lotType", buffer, theLotType, (this.lotType!= null));
        }
        {
            String theMappingFileName;
            theMappingFileName = this.getMappingFileName();
            strategy.appendField(locator, this, "mappingFileName", buffer, theMappingFileName, (this.mappingFileName!= null));
        }
        {
            String theSourceLotNumber;
            theSourceLotNumber = this.getSourceLotNumber();
            strategy.appendField(locator, this, "sourceLotNumber", buffer, theSourceLotNumber, (this.sourceLotNumber!= null));
        }
        {
            List<WaferInformation> theWaferInformation;
            theWaferInformation = (((this.waferInformation!= null)&&(!this.waferInformation.isEmpty()))?this.getWaferInformation():null);
            strategy.appendField(locator, this, "waferInformation", buffer, theWaferInformation, ((this.waferInformation!= null)&&(!this.waferInformation.isEmpty())));
        }
        {
            WaferLotQuantity theWaferLotQuantity;
            theWaferLotQuantity = this.getWaferLotQuantity();
            strategy.appendField(locator, this, "waferLotQuantity", buffer, theWaferLotQuantity, (this.waferLotQuantity!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
