
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_03;

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
import io.dscope.rosettanet.system.standarddocumentheader.v01_06.DocumentHeader;
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
 * <p>Java class for SemiconductorTestDataNotificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SemiconductorTestDataNotificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.06}DocumentHeader" minOccurs="0"/&gt;
 *         &lt;element name="LotReport" type="{urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.03}LotReportType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "SemiconductorTestDataNotificationType", propOrder = {
    "documentHeader",
    "lotReport"
})
public class SemiconductorTestDataNotificationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "DocumentHeader", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.06", type = DocumentHeader.class, required = false)
    protected DocumentHeader documentHeader;
    @XmlElement(name = "LotReport", required = true)
    protected List<LotReportType> lotReport;
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
     * Gets the value of the lotReport property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lotReport property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLotReport().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LotReportType }
     * 
     * 
     */
    public List<LotReportType> getLotReport() {
        if (lotReport == null) {
            lotReport = new ArrayList<LotReportType>();
        }
        return this.lotReport;
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
        final SemiconductorTestDataNotificationType that = ((SemiconductorTestDataNotificationType) object);
        {
            DocumentHeader lhsDocumentHeader;
            lhsDocumentHeader = this.getDocumentHeader();
            DocumentHeader rhsDocumentHeader;
            rhsDocumentHeader = that.getDocumentHeader();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentHeader", lhsDocumentHeader), LocatorUtils.property(thatLocator, "documentHeader", rhsDocumentHeader), lhsDocumentHeader, rhsDocumentHeader, (this.documentHeader!= null), (that.documentHeader!= null))) {
                return false;
            }
        }
        {
            List<LotReportType> lhsLotReport;
            lhsLotReport = (((this.lotReport!= null)&&(!this.lotReport.isEmpty()))?this.getLotReport():null);
            List<LotReportType> rhsLotReport;
            rhsLotReport = (((that.lotReport!= null)&&(!that.lotReport.isEmpty()))?that.getLotReport():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "lotReport", lhsLotReport), LocatorUtils.property(thatLocator, "lotReport", rhsLotReport), lhsLotReport, rhsLotReport, ((this.lotReport!= null)&&(!this.lotReport.isEmpty())), ((that.lotReport!= null)&&(!that.lotReport.isEmpty())))) {
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
            DocumentHeader theDocumentHeader;
            theDocumentHeader = this.getDocumentHeader();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentHeader", theDocumentHeader), currentHashCode, theDocumentHeader, (this.documentHeader!= null));
        }
        {
            List<LotReportType> theLotReport;
            theLotReport = (((this.lotReport!= null)&&(!this.lotReport.isEmpty()))?this.getLotReport():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "lotReport", theLotReport), currentHashCode, theLotReport, ((this.lotReport!= null)&&(!this.lotReport.isEmpty())));
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
            DocumentHeader theDocumentHeader;
            theDocumentHeader = this.getDocumentHeader();
            strategy.appendField(locator, this, "documentHeader", buffer, theDocumentHeader, (this.documentHeader!= null));
        }
        {
            List<LotReportType> theLotReport;
            theLotReport = (((this.lotReport!= null)&&(!this.lotReport.isEmpty()))?this.getLotReport():null);
            strategy.appendField(locator, this, "lotReport", buffer, theLotReport, ((this.lotReport!= null)&&(!this.lotReport.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
