
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v02_02;

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
import io.dscope.rosettanet.domain.manufacturing.codelist.sortweight.v01_03.SortWeight;
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
 * <p>Java class for SortType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SortType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="BinAssignment" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/&gt;
 *         &lt;element name="HardSort" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HardSortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="HardSortSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="PassVisualInspection" type="{http://www.w3.org/2001/XMLSchema}boolean" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="RepairableFlag" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="SortCount" type="{http://www.w3.org/2001/XMLSchema}integer" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="SortID" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SortName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SortSymbol" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Manufacturing:SortWeight:xsd:codelist:01.03}SortWeight" minOccurs="0"/&gt;
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
@XmlType(name = "SortType", propOrder = {
    "binAssignment",
    "hardSort",
    "hardSortName",
    "hardSortSymbol",
    "passVisualInspection",
    "repairableFlag",
    "sortCount",
    "sortID",
    "sortName",
    "sortSymbol",
    "sortWeight"
})
public class SortType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "BinAssignment")
    protected BigInteger binAssignment;
    @XmlElement(name = "HardSort")
    protected String hardSort;
    @XmlElement(name = "HardSortName")
    protected String hardSortName;
    @XmlElement(name = "HardSortSymbol")
    protected String hardSortSymbol;
    @XmlElement(name = "PassVisualInspection", type = Boolean.class)
    protected List<Boolean> passVisualInspection;
    @XmlElement(name = "RepairableFlag")
    protected Boolean repairableFlag;
    @XmlElement(name = "SortCount")
    protected List<BigInteger> sortCount;
    @XmlElement(name = "SortID", required = true)
    protected String sortID;
    @XmlElement(name = "SortName")
    protected String sortName;
    @XmlElement(name = "SortSymbol")
    protected String sortSymbol;
    @XmlElementRef(name = "SortWeight", namespace = "urn:rosettanet:specification:domain:Manufacturing:SortWeight:xsd:codelist:01.03", type = SortWeight.class, required = false)
    protected SortWeight sortWeight;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the binAssignment property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBinAssignment() {
        return binAssignment;
    }

    /**
     * Sets the value of the binAssignment property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBinAssignment(BigInteger value) {
        this.binAssignment = value;
    }

    /**
     * Gets the value of the hardSort property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardSort() {
        return hardSort;
    }

    /**
     * Sets the value of the hardSort property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardSort(String value) {
        this.hardSort = value;
    }

    /**
     * Gets the value of the hardSortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardSortName() {
        return hardSortName;
    }

    /**
     * Sets the value of the hardSortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardSortName(String value) {
        this.hardSortName = value;
    }

    /**
     * Gets the value of the hardSortSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHardSortSymbol() {
        return hardSortSymbol;
    }

    /**
     * Sets the value of the hardSortSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHardSortSymbol(String value) {
        this.hardSortSymbol = value;
    }

    /**
     * Gets the value of the passVisualInspection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passVisualInspection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassVisualInspection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Boolean }
     * 
     * 
     */
    public List<Boolean> getPassVisualInspection() {
        if (passVisualInspection == null) {
            passVisualInspection = new ArrayList<Boolean>();
        }
        return this.passVisualInspection;
    }

    /**
     * Gets the value of the repairableFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRepairableFlag() {
        return repairableFlag;
    }

    /**
     * Sets the value of the repairableFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepairableFlag(Boolean value) {
        this.repairableFlag = value;
    }

    /**
     * Gets the value of the sortCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the sortCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSortCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BigInteger }
     * 
     * 
     */
    public List<BigInteger> getSortCount() {
        if (sortCount == null) {
            sortCount = new ArrayList<BigInteger>();
        }
        return this.sortCount;
    }

    /**
     * Gets the value of the sortID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortID() {
        return sortID;
    }

    /**
     * Sets the value of the sortID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortID(String value) {
        this.sortID = value;
    }

    /**
     * Gets the value of the sortName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortName() {
        return sortName;
    }

    /**
     * Sets the value of the sortName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortName(String value) {
        this.sortName = value;
    }

    /**
     * Gets the value of the sortSymbol property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortSymbol() {
        return sortSymbol;
    }

    /**
     * Sets the value of the sortSymbol property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortSymbol(String value) {
        this.sortSymbol = value;
    }

    /**
     * Gets the value of the sortWeight property.
     * 
     * @return
     *     possible object is
     *     {@link SortWeight }
     *     
     */
    public SortWeight getSortWeight() {
        return sortWeight;
    }

    /**
     * Sets the value of the sortWeight property.
     * 
     * @param value
     *     allowed object is
     *     {@link SortWeight }
     *     
     */
    public void setSortWeight(SortWeight value) {
        this.sortWeight = value;
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
        final SortType that = ((SortType) object);
        {
            BigInteger lhsBinAssignment;
            lhsBinAssignment = this.getBinAssignment();
            BigInteger rhsBinAssignment;
            rhsBinAssignment = that.getBinAssignment();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "binAssignment", lhsBinAssignment), LocatorUtils.property(thatLocator, "binAssignment", rhsBinAssignment), lhsBinAssignment, rhsBinAssignment, (this.binAssignment!= null), (that.binAssignment!= null))) {
                return false;
            }
        }
        {
            String lhsHardSort;
            lhsHardSort = this.getHardSort();
            String rhsHardSort;
            rhsHardSort = that.getHardSort();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hardSort", lhsHardSort), LocatorUtils.property(thatLocator, "hardSort", rhsHardSort), lhsHardSort, rhsHardSort, (this.hardSort!= null), (that.hardSort!= null))) {
                return false;
            }
        }
        {
            String lhsHardSortName;
            lhsHardSortName = this.getHardSortName();
            String rhsHardSortName;
            rhsHardSortName = that.getHardSortName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hardSortName", lhsHardSortName), LocatorUtils.property(thatLocator, "hardSortName", rhsHardSortName), lhsHardSortName, rhsHardSortName, (this.hardSortName!= null), (that.hardSortName!= null))) {
                return false;
            }
        }
        {
            String lhsHardSortSymbol;
            lhsHardSortSymbol = this.getHardSortSymbol();
            String rhsHardSortSymbol;
            rhsHardSortSymbol = that.getHardSortSymbol();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "hardSortSymbol", lhsHardSortSymbol), LocatorUtils.property(thatLocator, "hardSortSymbol", rhsHardSortSymbol), lhsHardSortSymbol, rhsHardSortSymbol, (this.hardSortSymbol!= null), (that.hardSortSymbol!= null))) {
                return false;
            }
        }
        {
            List<Boolean> lhsPassVisualInspection;
            lhsPassVisualInspection = (((this.passVisualInspection!= null)&&(!this.passVisualInspection.isEmpty()))?this.getPassVisualInspection():null);
            List<Boolean> rhsPassVisualInspection;
            rhsPassVisualInspection = (((that.passVisualInspection!= null)&&(!that.passVisualInspection.isEmpty()))?that.getPassVisualInspection():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "passVisualInspection", lhsPassVisualInspection), LocatorUtils.property(thatLocator, "passVisualInspection", rhsPassVisualInspection), lhsPassVisualInspection, rhsPassVisualInspection, ((this.passVisualInspection!= null)&&(!this.passVisualInspection.isEmpty())), ((that.passVisualInspection!= null)&&(!that.passVisualInspection.isEmpty())))) {
                return false;
            }
        }
        {
            Boolean lhsRepairableFlag;
            lhsRepairableFlag = this.isRepairableFlag();
            Boolean rhsRepairableFlag;
            rhsRepairableFlag = that.isRepairableFlag();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "repairableFlag", lhsRepairableFlag), LocatorUtils.property(thatLocator, "repairableFlag", rhsRepairableFlag), lhsRepairableFlag, rhsRepairableFlag, (this.repairableFlag!= null), (that.repairableFlag!= null))) {
                return false;
            }
        }
        {
            List<BigInteger> lhsSortCount;
            lhsSortCount = (((this.sortCount!= null)&&(!this.sortCount.isEmpty()))?this.getSortCount():null);
            List<BigInteger> rhsSortCount;
            rhsSortCount = (((that.sortCount!= null)&&(!that.sortCount.isEmpty()))?that.getSortCount():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sortCount", lhsSortCount), LocatorUtils.property(thatLocator, "sortCount", rhsSortCount), lhsSortCount, rhsSortCount, ((this.sortCount!= null)&&(!this.sortCount.isEmpty())), ((that.sortCount!= null)&&(!that.sortCount.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsSortID;
            lhsSortID = this.getSortID();
            String rhsSortID;
            rhsSortID = that.getSortID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sortID", lhsSortID), LocatorUtils.property(thatLocator, "sortID", rhsSortID), lhsSortID, rhsSortID, (this.sortID!= null), (that.sortID!= null))) {
                return false;
            }
        }
        {
            String lhsSortName;
            lhsSortName = this.getSortName();
            String rhsSortName;
            rhsSortName = that.getSortName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sortName", lhsSortName), LocatorUtils.property(thatLocator, "sortName", rhsSortName), lhsSortName, rhsSortName, (this.sortName!= null), (that.sortName!= null))) {
                return false;
            }
        }
        {
            String lhsSortSymbol;
            lhsSortSymbol = this.getSortSymbol();
            String rhsSortSymbol;
            rhsSortSymbol = that.getSortSymbol();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sortSymbol", lhsSortSymbol), LocatorUtils.property(thatLocator, "sortSymbol", rhsSortSymbol), lhsSortSymbol, rhsSortSymbol, (this.sortSymbol!= null), (that.sortSymbol!= null))) {
                return false;
            }
        }
        {
            SortWeight lhsSortWeight;
            lhsSortWeight = this.getSortWeight();
            SortWeight rhsSortWeight;
            rhsSortWeight = that.getSortWeight();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sortWeight", lhsSortWeight), LocatorUtils.property(thatLocator, "sortWeight", rhsSortWeight), lhsSortWeight, rhsSortWeight, (this.sortWeight!= null), (that.sortWeight!= null))) {
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
            BigInteger theBinAssignment;
            theBinAssignment = this.getBinAssignment();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "binAssignment", theBinAssignment), currentHashCode, theBinAssignment, (this.binAssignment!= null));
        }
        {
            String theHardSort;
            theHardSort = this.getHardSort();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hardSort", theHardSort), currentHashCode, theHardSort, (this.hardSort!= null));
        }
        {
            String theHardSortName;
            theHardSortName = this.getHardSortName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hardSortName", theHardSortName), currentHashCode, theHardSortName, (this.hardSortName!= null));
        }
        {
            String theHardSortSymbol;
            theHardSortSymbol = this.getHardSortSymbol();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "hardSortSymbol", theHardSortSymbol), currentHashCode, theHardSortSymbol, (this.hardSortSymbol!= null));
        }
        {
            List<Boolean> thePassVisualInspection;
            thePassVisualInspection = (((this.passVisualInspection!= null)&&(!this.passVisualInspection.isEmpty()))?this.getPassVisualInspection():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "passVisualInspection", thePassVisualInspection), currentHashCode, thePassVisualInspection, ((this.passVisualInspection!= null)&&(!this.passVisualInspection.isEmpty())));
        }
        {
            Boolean theRepairableFlag;
            theRepairableFlag = this.isRepairableFlag();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "repairableFlag", theRepairableFlag), currentHashCode, theRepairableFlag, (this.repairableFlag!= null));
        }
        {
            List<BigInteger> theSortCount;
            theSortCount = (((this.sortCount!= null)&&(!this.sortCount.isEmpty()))?this.getSortCount():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sortCount", theSortCount), currentHashCode, theSortCount, ((this.sortCount!= null)&&(!this.sortCount.isEmpty())));
        }
        {
            String theSortID;
            theSortID = this.getSortID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sortID", theSortID), currentHashCode, theSortID, (this.sortID!= null));
        }
        {
            String theSortName;
            theSortName = this.getSortName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sortName", theSortName), currentHashCode, theSortName, (this.sortName!= null));
        }
        {
            String theSortSymbol;
            theSortSymbol = this.getSortSymbol();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sortSymbol", theSortSymbol), currentHashCode, theSortSymbol, (this.sortSymbol!= null));
        }
        {
            SortWeight theSortWeight;
            theSortWeight = this.getSortWeight();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sortWeight", theSortWeight), currentHashCode, theSortWeight, (this.sortWeight!= null));
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
            BigInteger theBinAssignment;
            theBinAssignment = this.getBinAssignment();
            strategy.appendField(locator, this, "binAssignment", buffer, theBinAssignment, (this.binAssignment!= null));
        }
        {
            String theHardSort;
            theHardSort = this.getHardSort();
            strategy.appendField(locator, this, "hardSort", buffer, theHardSort, (this.hardSort!= null));
        }
        {
            String theHardSortName;
            theHardSortName = this.getHardSortName();
            strategy.appendField(locator, this, "hardSortName", buffer, theHardSortName, (this.hardSortName!= null));
        }
        {
            String theHardSortSymbol;
            theHardSortSymbol = this.getHardSortSymbol();
            strategy.appendField(locator, this, "hardSortSymbol", buffer, theHardSortSymbol, (this.hardSortSymbol!= null));
        }
        {
            List<Boolean> thePassVisualInspection;
            thePassVisualInspection = (((this.passVisualInspection!= null)&&(!this.passVisualInspection.isEmpty()))?this.getPassVisualInspection():null);
            strategy.appendField(locator, this, "passVisualInspection", buffer, thePassVisualInspection, ((this.passVisualInspection!= null)&&(!this.passVisualInspection.isEmpty())));
        }
        {
            Boolean theRepairableFlag;
            theRepairableFlag = this.isRepairableFlag();
            strategy.appendField(locator, this, "repairableFlag", buffer, theRepairableFlag, (this.repairableFlag!= null));
        }
        {
            List<BigInteger> theSortCount;
            theSortCount = (((this.sortCount!= null)&&(!this.sortCount.isEmpty()))?this.getSortCount():null);
            strategy.appendField(locator, this, "sortCount", buffer, theSortCount, ((this.sortCount!= null)&&(!this.sortCount.isEmpty())));
        }
        {
            String theSortID;
            theSortID = this.getSortID();
            strategy.appendField(locator, this, "sortID", buffer, theSortID, (this.sortID!= null));
        }
        {
            String theSortName;
            theSortName = this.getSortName();
            strategy.appendField(locator, this, "sortName", buffer, theSortName, (this.sortName!= null));
        }
        {
            String theSortSymbol;
            theSortSymbol = this.getSortSymbol();
            strategy.appendField(locator, this, "sortSymbol", buffer, theSortSymbol, (this.sortSymbol!= null));
        }
        {
            SortWeight theSortWeight;
            theSortWeight = this.getSortWeight();
            strategy.appendField(locator, this, "sortWeight", buffer, theSortWeight, (this.sortWeight!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
