
package io.dscope.rosettanet.interchange.caserequestnotification.v02_02;

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
import io.dscope.rosettanet.domain.service.codelist.priority.v01_01.Priority;
import io.dscope.rosettanet.domain.service.codelist.severity.v01_01.Severity;
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
 * <p>Java class for CaseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CaseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="CaseDetail" type="{urn:rosettanet:specification:interchange:CaseRequestNotification:xsd:schema:02.02}CaseDetailType"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:Priority:xsd:codelist:01.01}Priority" minOccurs="0"/&gt;
 *         &lt;element name="ServiceDetail" type="{urn:rosettanet:specification:interchange:CaseRequestNotification:xsd:schema:02.02}ServiceDetailType"/&gt;
 *         &lt;element name="ServiceRequestEmailNotification" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Service:Severity:xsd:codelist:01.01}Severity" minOccurs="0"/&gt;
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
@XmlType(name = "CaseType", propOrder = {
    "caseDetail",
    "priority",
    "serviceDetail",
    "serviceRequestEmailNotification",
    "severity"
})
public class CaseType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "CaseDetail", required = true)
    protected CaseDetailType caseDetail;
    @XmlElementRef(name = "Priority", namespace = "urn:rosettanet:specification:domain:Service:Priority:xsd:codelist:01.01", type = Priority.class, required = false)
    protected Priority priority;
    @XmlElement(name = "ServiceDetail", required = true)
    protected ServiceDetailType serviceDetail;
    @XmlElement(name = "ServiceRequestEmailNotification")
    protected List<String> serviceRequestEmailNotification;
    @XmlElementRef(name = "Severity", namespace = "urn:rosettanet:specification:domain:Service:Severity:xsd:codelist:01.01", type = Severity.class, required = false)
    protected Severity severity;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the caseDetail property.
     * 
     * @return
     *     possible object is
     *     {@link CaseDetailType }
     *     
     */
    public CaseDetailType getCaseDetail() {
        return caseDetail;
    }

    /**
     * Sets the value of the caseDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseDetailType }
     *     
     */
    public void setCaseDetail(CaseDetailType value) {
        this.caseDetail = value;
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
     * Gets the value of the serviceDetail property.
     * 
     * @return
     *     possible object is
     *     {@link ServiceDetailType }
     *     
     */
    public ServiceDetailType getServiceDetail() {
        return serviceDetail;
    }

    /**
     * Sets the value of the serviceDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceDetailType }
     *     
     */
    public void setServiceDetail(ServiceDetailType value) {
        this.serviceDetail = value;
    }

    /**
     * Gets the value of the serviceRequestEmailNotification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the serviceRequestEmailNotification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getServiceRequestEmailNotification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getServiceRequestEmailNotification() {
        if (serviceRequestEmailNotification == null) {
            serviceRequestEmailNotification = new ArrayList<String>();
        }
        return this.serviceRequestEmailNotification;
    }

    /**
     * Gets the value of the severity property.
     * 
     * @return
     *     possible object is
     *     {@link Severity }
     *     
     */
    public Severity getSeverity() {
        return severity;
    }

    /**
     * Sets the value of the severity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Severity }
     *     
     */
    public void setSeverity(Severity value) {
        this.severity = value;
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
        final CaseType that = ((CaseType) object);
        {
            CaseDetailType lhsCaseDetail;
            lhsCaseDetail = this.getCaseDetail();
            CaseDetailType rhsCaseDetail;
            rhsCaseDetail = that.getCaseDetail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "caseDetail", lhsCaseDetail), LocatorUtils.property(thatLocator, "caseDetail", rhsCaseDetail), lhsCaseDetail, rhsCaseDetail, (this.caseDetail!= null), (that.caseDetail!= null))) {
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
            ServiceDetailType lhsServiceDetail;
            lhsServiceDetail = this.getServiceDetail();
            ServiceDetailType rhsServiceDetail;
            rhsServiceDetail = that.getServiceDetail();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceDetail", lhsServiceDetail), LocatorUtils.property(thatLocator, "serviceDetail", rhsServiceDetail), lhsServiceDetail, rhsServiceDetail, (this.serviceDetail!= null), (that.serviceDetail!= null))) {
                return false;
            }
        }
        {
            List<String> lhsServiceRequestEmailNotification;
            lhsServiceRequestEmailNotification = (((this.serviceRequestEmailNotification!= null)&&(!this.serviceRequestEmailNotification.isEmpty()))?this.getServiceRequestEmailNotification():null);
            List<String> rhsServiceRequestEmailNotification;
            rhsServiceRequestEmailNotification = (((that.serviceRequestEmailNotification!= null)&&(!that.serviceRequestEmailNotification.isEmpty()))?that.getServiceRequestEmailNotification():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "serviceRequestEmailNotification", lhsServiceRequestEmailNotification), LocatorUtils.property(thatLocator, "serviceRequestEmailNotification", rhsServiceRequestEmailNotification), lhsServiceRequestEmailNotification, rhsServiceRequestEmailNotification, ((this.serviceRequestEmailNotification!= null)&&(!this.serviceRequestEmailNotification.isEmpty())), ((that.serviceRequestEmailNotification!= null)&&(!that.serviceRequestEmailNotification.isEmpty())))) {
                return false;
            }
        }
        {
            Severity lhsSeverity;
            lhsSeverity = this.getSeverity();
            Severity rhsSeverity;
            rhsSeverity = that.getSeverity();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "severity", lhsSeverity), LocatorUtils.property(thatLocator, "severity", rhsSeverity), lhsSeverity, rhsSeverity, (this.severity!= null), (that.severity!= null))) {
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
            CaseDetailType theCaseDetail;
            theCaseDetail = this.getCaseDetail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "caseDetail", theCaseDetail), currentHashCode, theCaseDetail, (this.caseDetail!= null));
        }
        {
            Priority thePriority;
            thePriority = this.getPriority();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "priority", thePriority), currentHashCode, thePriority, (this.priority!= null));
        }
        {
            ServiceDetailType theServiceDetail;
            theServiceDetail = this.getServiceDetail();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceDetail", theServiceDetail), currentHashCode, theServiceDetail, (this.serviceDetail!= null));
        }
        {
            List<String> theServiceRequestEmailNotification;
            theServiceRequestEmailNotification = (((this.serviceRequestEmailNotification!= null)&&(!this.serviceRequestEmailNotification.isEmpty()))?this.getServiceRequestEmailNotification():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "serviceRequestEmailNotification", theServiceRequestEmailNotification), currentHashCode, theServiceRequestEmailNotification, ((this.serviceRequestEmailNotification!= null)&&(!this.serviceRequestEmailNotification.isEmpty())));
        }
        {
            Severity theSeverity;
            theSeverity = this.getSeverity();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "severity", theSeverity), currentHashCode, theSeverity, (this.severity!= null));
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
            CaseDetailType theCaseDetail;
            theCaseDetail = this.getCaseDetail();
            strategy.appendField(locator, this, "caseDetail", buffer, theCaseDetail, (this.caseDetail!= null));
        }
        {
            Priority thePriority;
            thePriority = this.getPriority();
            strategy.appendField(locator, this, "priority", buffer, thePriority, (this.priority!= null));
        }
        {
            ServiceDetailType theServiceDetail;
            theServiceDetail = this.getServiceDetail();
            strategy.appendField(locator, this, "serviceDetail", buffer, theServiceDetail, (this.serviceDetail!= null));
        }
        {
            List<String> theServiceRequestEmailNotification;
            theServiceRequestEmailNotification = (((this.serviceRequestEmailNotification!= null)&&(!this.serviceRequestEmailNotification.isEmpty()))?this.getServiceRequestEmailNotification():null);
            strategy.appendField(locator, this, "serviceRequestEmailNotification", buffer, theServiceRequestEmailNotification, ((this.serviceRequestEmailNotification!= null)&&(!this.serviceRequestEmailNotification.isEmpty())));
        }
        {
            Severity theSeverity;
            theSeverity = this.getSeverity();
            strategy.appendField(locator, this, "severity", buffer, theSeverity, (this.severity!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
