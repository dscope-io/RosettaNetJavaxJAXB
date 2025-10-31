
package io.dscope.rosettanet.interchange.quoteconfirmation.v02_01;

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
import io.dscope.rosettanet.domain.procurement.codelist.requoteaction.v01_03.RequoteAction;
import io.dscope.rosettanet.universal.document.v01_08.BusinessDocumentReferenceType;
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
 * <p>Java class for RequoteLineStatusType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RequoteLineStatusType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:RequoteAction:xsd:codelist:01.03}RequoteAction"/&gt;
 *         &lt;element name="RequoteReference" type="{urn:rosettanet:specification:universal:Document:xsd:schema:01.08}BusinessDocumentReferenceType" maxOccurs="unbounded"/&gt;
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
@XmlType(name = "RequoteLineStatusType", propOrder = {
    "requoteAction",
    "requoteReference"
})
public class RequoteLineStatusType implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "RequoteAction", namespace = "urn:rosettanet:specification:domain:Procurement:RequoteAction:xsd:codelist:01.03", type = RequoteAction.class)
    protected RequoteAction requoteAction;
    @XmlElement(name = "RequoteReference", required = true)
    protected List<BusinessDocumentReferenceType> requoteReference;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the requoteAction property.
     * 
     * @return
     *     possible object is
     *     {@link RequoteAction }
     *     
     */
    public RequoteAction getRequoteAction() {
        return requoteAction;
    }

    /**
     * Sets the value of the requoteAction property.
     * 
     * @param value
     *     allowed object is
     *     {@link RequoteAction }
     *     
     */
    public void setRequoteAction(RequoteAction value) {
        this.requoteAction = value;
    }

    /**
     * Gets the value of the requoteReference property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the requoteReference property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRequoteReference().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessDocumentReferenceType }
     * 
     * 
     */
    public List<BusinessDocumentReferenceType> getRequoteReference() {
        if (requoteReference == null) {
            requoteReference = new ArrayList<BusinessDocumentReferenceType>();
        }
        return this.requoteReference;
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
        final RequoteLineStatusType that = ((RequoteLineStatusType) object);
        {
            RequoteAction lhsRequoteAction;
            lhsRequoteAction = this.getRequoteAction();
            RequoteAction rhsRequoteAction;
            rhsRequoteAction = that.getRequoteAction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requoteAction", lhsRequoteAction), LocatorUtils.property(thatLocator, "requoteAction", rhsRequoteAction), lhsRequoteAction, rhsRequoteAction, (this.requoteAction!= null), (that.requoteAction!= null))) {
                return false;
            }
        }
        {
            List<BusinessDocumentReferenceType> lhsRequoteReference;
            lhsRequoteReference = (((this.requoteReference!= null)&&(!this.requoteReference.isEmpty()))?this.getRequoteReference():null);
            List<BusinessDocumentReferenceType> rhsRequoteReference;
            rhsRequoteReference = (((that.requoteReference!= null)&&(!that.requoteReference.isEmpty()))?that.getRequoteReference():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "requoteReference", lhsRequoteReference), LocatorUtils.property(thatLocator, "requoteReference", rhsRequoteReference), lhsRequoteReference, rhsRequoteReference, ((this.requoteReference!= null)&&(!this.requoteReference.isEmpty())), ((that.requoteReference!= null)&&(!that.requoteReference.isEmpty())))) {
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
            RequoteAction theRequoteAction;
            theRequoteAction = this.getRequoteAction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requoteAction", theRequoteAction), currentHashCode, theRequoteAction, (this.requoteAction!= null));
        }
        {
            List<BusinessDocumentReferenceType> theRequoteReference;
            theRequoteReference = (((this.requoteReference!= null)&&(!this.requoteReference.isEmpty()))?this.getRequoteReference():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "requoteReference", theRequoteReference), currentHashCode, theRequoteReference, ((this.requoteReference!= null)&&(!this.requoteReference.isEmpty())));
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
            RequoteAction theRequoteAction;
            theRequoteAction = this.getRequoteAction();
            strategy.appendField(locator, this, "requoteAction", buffer, theRequoteAction, (this.requoteAction!= null));
        }
        {
            List<BusinessDocumentReferenceType> theRequoteReference;
            theRequoteReference = (((this.requoteReference!= null)&&(!this.requoteReference.isEmpty()))?this.getRequoteReference():null);
            strategy.appendField(locator, this, "requoteReference", buffer, theRequoteReference, ((this.requoteReference!= null)&&(!this.requoteReference.isEmpty())));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
