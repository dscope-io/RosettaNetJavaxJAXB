
package io.dscope.rosettanet.interchange.shipfromstockanddebitclaimrequest.v01_01;

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
import io.dscope.rosettanet.domain.procurement.procurement.v02_27.BranchInformation;
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
 * <p>Java class for AuthorizationInformationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AuthorizationInformationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27}BranchInformation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="InvoiceInformation" type="{urn:rosettanet:specification:interchange:ShipFromStockAndDebitClaimRequest:xsd:schema:01.01}InvoiceInformationType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "AuthorizationInformationType", propOrder = {
    "branchInformation",
    "identifier",
    "invoiceInformation"
})
public class AuthorizationInformationType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "BranchInformation", namespace = "urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", type = BranchInformation.class, required = false)
    protected List<BranchInformation> branchInformation;
    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlElement(name = "InvoiceInformation", required = true)
    protected List<InvoiceInformationType> invoiceInformation;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the branchInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the branchInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBranchInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BranchInformation }
     * 
     * 
     */
    public List<BranchInformation> getBranchInformation() {
        if (branchInformation == null) {
            branchInformation = new ArrayList<BranchInformation>();
        }
        return this.branchInformation;
    }

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the invoiceInformation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the invoiceInformation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInvoiceInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InvoiceInformationType }
     * 
     * 
     */
    public List<InvoiceInformationType> getInvoiceInformation() {
        if (invoiceInformation == null) {
            invoiceInformation = new ArrayList<InvoiceInformationType>();
        }
        return this.invoiceInformation;
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
        final AuthorizationInformationType that = ((AuthorizationInformationType) object);
        {
            List<BranchInformation> lhsBranchInformation;
            lhsBranchInformation = (((this.branchInformation!= null)&&(!this.branchInformation.isEmpty()))?this.getBranchInformation():null);
            List<BranchInformation> rhsBranchInformation;
            rhsBranchInformation = (((that.branchInformation!= null)&&(!that.branchInformation.isEmpty()))?that.getBranchInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "branchInformation", lhsBranchInformation), LocatorUtils.property(thatLocator, "branchInformation", rhsBranchInformation), lhsBranchInformation, rhsBranchInformation, ((this.branchInformation!= null)&&(!this.branchInformation.isEmpty())), ((that.branchInformation!= null)&&(!that.branchInformation.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsIdentifier;
            lhsIdentifier = this.getIdentifier();
            String rhsIdentifier;
            rhsIdentifier = that.getIdentifier();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "identifier", lhsIdentifier), LocatorUtils.property(thatLocator, "identifier", rhsIdentifier), lhsIdentifier, rhsIdentifier, (this.identifier!= null), (that.identifier!= null))) {
                return false;
            }
        }
        {
            List<InvoiceInformationType> lhsInvoiceInformation;
            lhsInvoiceInformation = (((this.invoiceInformation!= null)&&(!this.invoiceInformation.isEmpty()))?this.getInvoiceInformation():null);
            List<InvoiceInformationType> rhsInvoiceInformation;
            rhsInvoiceInformation = (((that.invoiceInformation!= null)&&(!that.invoiceInformation.isEmpty()))?that.getInvoiceInformation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "invoiceInformation", lhsInvoiceInformation), LocatorUtils.property(thatLocator, "invoiceInformation", rhsInvoiceInformation), lhsInvoiceInformation, rhsInvoiceInformation, ((this.invoiceInformation!= null)&&(!this.invoiceInformation.isEmpty())), ((that.invoiceInformation!= null)&&(!that.invoiceInformation.isEmpty())))) {
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
            List<BranchInformation> theBranchInformation;
            theBranchInformation = (((this.branchInformation!= null)&&(!this.branchInformation.isEmpty()))?this.getBranchInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "branchInformation", theBranchInformation), currentHashCode, theBranchInformation, ((this.branchInformation!= null)&&(!this.branchInformation.isEmpty())));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "identifier", theIdentifier), currentHashCode, theIdentifier, (this.identifier!= null));
        }
        {
            List<InvoiceInformationType> theInvoiceInformation;
            theInvoiceInformation = (((this.invoiceInformation!= null)&&(!this.invoiceInformation.isEmpty()))?this.getInvoiceInformation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "invoiceInformation", theInvoiceInformation), currentHashCode, theInvoiceInformation, ((this.invoiceInformation!= null)&&(!this.invoiceInformation.isEmpty())));
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
            List<BranchInformation> theBranchInformation;
            theBranchInformation = (((this.branchInformation!= null)&&(!this.branchInformation.isEmpty()))?this.getBranchInformation():null);
            strategy.appendField(locator, this, "branchInformation", buffer, theBranchInformation, ((this.branchInformation!= null)&&(!this.branchInformation.isEmpty())));
        }
        {
            String theIdentifier;
            theIdentifier = this.getIdentifier();
            strategy.appendField(locator, this, "identifier", buffer, theIdentifier, (this.identifier!= null));
        }
        {
            List<InvoiceInformationType> theInvoiceInformation;
            theInvoiceInformation = (((this.invoiceInformation!= null)&&(!this.invoiceInformation.isEmpty()))?this.getInvoiceInformation():null);
            strategy.appendField(locator, this, "invoiceInformation", buffer, theInvoiceInformation, ((this.invoiceInformation!= null)&&(!this.invoiceInformation.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
