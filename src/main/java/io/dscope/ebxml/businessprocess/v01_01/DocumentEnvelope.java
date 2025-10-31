
package io.dscope.ebxml.businessprocess.v01_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Documentation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Attachment" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.ebxml.org/BusinessProcess/1.01}name"/&gt;
 *       &lt;attGroup ref="{http://www.ebxml.org/BusinessProcess/1.01}documentSecurity"/&gt;
 *       &lt;attribute name="businessDocument" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="businessDocumentIDREF" type="{http://www.ebxml.org/BusinessProcess/1.01}GUIDREF" /&gt;
 *       &lt;attribute name="isPositiveResponse" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentation",
    "attachment"
})
@XmlRootElement(name = "DocumentEnvelope")
public class DocumentEnvelope implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Documentation")
    protected List<Documentation> documentation;
    @XmlElement(name = "Attachment")
    protected List<Attachment> attachment;
    @XmlAttribute(name = "businessDocument", required = true)
    protected String businessDocument;
    @XmlAttribute(name = "businessDocumentIDREF")
    protected String businessDocumentIDREF;
    @XmlAttribute(name = "isPositiveResponse")
    protected Boolean isPositiveResponse;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "nameID", required = true)
    protected String nameID;
    @XmlAttribute(name = "isAuthenticated")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isAuthenticated;
    @XmlAttribute(name = "isConfidential")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isConfidential;
    @XmlAttribute(name = "isTamperDetectable")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String isTamperDetectable;

    /**
     * Gets the value of the documentation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Documentation }
     * 
     * 
     */
    public List<Documentation> getDocumentation() {
        if (documentation == null) {
            documentation = new ArrayList<Documentation>();
        }
        return this.documentation;
    }

    /**
     * Gets the value of the attachment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attachment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttachment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Attachment }
     * 
     * 
     */
    public List<Attachment> getAttachment() {
        if (attachment == null) {
            attachment = new ArrayList<Attachment>();
        }
        return this.attachment;
    }

    /**
     * Gets the value of the businessDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessDocument() {
        return businessDocument;
    }

    /**
     * Sets the value of the businessDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessDocument(String value) {
        this.businessDocument = value;
    }

    /**
     * Gets the value of the businessDocumentIDREF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessDocumentIDREF() {
        return businessDocumentIDREF;
    }

    /**
     * Sets the value of the businessDocumentIDREF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessDocumentIDREF(String value) {
        this.businessDocumentIDREF = value;
    }

    /**
     * Gets the value of the isPositiveResponse property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsPositiveResponse() {
        return isPositiveResponse;
    }

    /**
     * Sets the value of the isPositiveResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsPositiveResponse(Boolean value) {
        this.isPositiveResponse = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the nameID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameID() {
        return nameID;
    }

    /**
     * Sets the value of the nameID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameID(String value) {
        this.nameID = value;
    }

    /**
     * Gets the value of the isAuthenticated property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsAuthenticated() {
        return isAuthenticated;
    }

    /**
     * Sets the value of the isAuthenticated property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsAuthenticated(String value) {
        this.isAuthenticated = value;
    }

    /**
     * Gets the value of the isConfidential property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsConfidential() {
        return isConfidential;
    }

    /**
     * Sets the value of the isConfidential property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsConfidential(String value) {
        this.isConfidential = value;
    }

    /**
     * Gets the value of the isTamperDetectable property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsTamperDetectable() {
        return isTamperDetectable;
    }

    /**
     * Sets the value of the isTamperDetectable property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsTamperDetectable(String value) {
        this.isTamperDetectable = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DocumentEnvelope that = ((DocumentEnvelope) object);
        {
            List<Documentation> lhsDocumentation;
            lhsDocumentation = (((this.documentation!= null)&&(!this.documentation.isEmpty()))?this.getDocumentation():null);
            List<Documentation> rhsDocumentation;
            rhsDocumentation = (((that.documentation!= null)&&(!that.documentation.isEmpty()))?that.getDocumentation():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentation", lhsDocumentation), LocatorUtils.property(thatLocator, "documentation", rhsDocumentation), lhsDocumentation, rhsDocumentation, ((this.documentation!= null)&&(!this.documentation.isEmpty())), ((that.documentation!= null)&&(!that.documentation.isEmpty())))) {
                return false;
            }
        }
        {
            List<Attachment> lhsAttachment;
            lhsAttachment = (((this.attachment!= null)&&(!this.attachment.isEmpty()))?this.getAttachment():null);
            List<Attachment> rhsAttachment;
            rhsAttachment = (((that.attachment!= null)&&(!that.attachment.isEmpty()))?that.getAttachment():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attachment", lhsAttachment), LocatorUtils.property(thatLocator, "attachment", rhsAttachment), lhsAttachment, rhsAttachment, ((this.attachment!= null)&&(!this.attachment.isEmpty())), ((that.attachment!= null)&&(!that.attachment.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsBusinessDocument;
            lhsBusinessDocument = this.getBusinessDocument();
            String rhsBusinessDocument;
            rhsBusinessDocument = that.getBusinessDocument();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessDocument", lhsBusinessDocument), LocatorUtils.property(thatLocator, "businessDocument", rhsBusinessDocument), lhsBusinessDocument, rhsBusinessDocument, (this.businessDocument!= null), (that.businessDocument!= null))) {
                return false;
            }
        }
        {
            String lhsBusinessDocumentIDREF;
            lhsBusinessDocumentIDREF = this.getBusinessDocumentIDREF();
            String rhsBusinessDocumentIDREF;
            rhsBusinessDocumentIDREF = that.getBusinessDocumentIDREF();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessDocumentIDREF", lhsBusinessDocumentIDREF), LocatorUtils.property(thatLocator, "businessDocumentIDREF", rhsBusinessDocumentIDREF), lhsBusinessDocumentIDREF, rhsBusinessDocumentIDREF, (this.businessDocumentIDREF!= null), (that.businessDocumentIDREF!= null))) {
                return false;
            }
        }
        {
            Boolean lhsIsPositiveResponse;
            lhsIsPositiveResponse = this.isIsPositiveResponse();
            Boolean rhsIsPositiveResponse;
            rhsIsPositiveResponse = that.isIsPositiveResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isPositiveResponse", lhsIsPositiveResponse), LocatorUtils.property(thatLocator, "isPositiveResponse", rhsIsPositiveResponse), lhsIsPositiveResponse, rhsIsPositiveResponse, (this.isPositiveResponse!= null), (that.isPositiveResponse!= null))) {
                return false;
            }
        }
        {
            String lhsName;
            lhsName = this.getName();
            String rhsName;
            rhsName = that.getName();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "name", lhsName), LocatorUtils.property(thatLocator, "name", rhsName), lhsName, rhsName, (this.name!= null), (that.name!= null))) {
                return false;
            }
        }
        {
            String lhsNameID;
            lhsNameID = this.getNameID();
            String rhsNameID;
            rhsNameID = that.getNameID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "nameID", lhsNameID), LocatorUtils.property(thatLocator, "nameID", rhsNameID), lhsNameID, rhsNameID, (this.nameID!= null), (that.nameID!= null))) {
                return false;
            }
        }
        {
            String lhsIsAuthenticated;
            lhsIsAuthenticated = this.getIsAuthenticated();
            String rhsIsAuthenticated;
            rhsIsAuthenticated = that.getIsAuthenticated();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isAuthenticated", lhsIsAuthenticated), LocatorUtils.property(thatLocator, "isAuthenticated", rhsIsAuthenticated), lhsIsAuthenticated, rhsIsAuthenticated, (this.isAuthenticated!= null), (that.isAuthenticated!= null))) {
                return false;
            }
        }
        {
            String lhsIsConfidential;
            lhsIsConfidential = this.getIsConfidential();
            String rhsIsConfidential;
            rhsIsConfidential = that.getIsConfidential();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isConfidential", lhsIsConfidential), LocatorUtils.property(thatLocator, "isConfidential", rhsIsConfidential), lhsIsConfidential, rhsIsConfidential, (this.isConfidential!= null), (that.isConfidential!= null))) {
                return false;
            }
        }
        {
            String lhsIsTamperDetectable;
            lhsIsTamperDetectable = this.getIsTamperDetectable();
            String rhsIsTamperDetectable;
            rhsIsTamperDetectable = that.getIsTamperDetectable();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isTamperDetectable", lhsIsTamperDetectable), LocatorUtils.property(thatLocator, "isTamperDetectable", rhsIsTamperDetectable), lhsIsTamperDetectable, rhsIsTamperDetectable, (this.isTamperDetectable!= null), (that.isTamperDetectable!= null))) {
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
            List<Documentation> theDocumentation;
            theDocumentation = (((this.documentation!= null)&&(!this.documentation.isEmpty()))?this.getDocumentation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentation", theDocumentation), currentHashCode, theDocumentation, ((this.documentation!= null)&&(!this.documentation.isEmpty())));
        }
        {
            List<Attachment> theAttachment;
            theAttachment = (((this.attachment!= null)&&(!this.attachment.isEmpty()))?this.getAttachment():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attachment", theAttachment), currentHashCode, theAttachment, ((this.attachment!= null)&&(!this.attachment.isEmpty())));
        }
        {
            String theBusinessDocument;
            theBusinessDocument = this.getBusinessDocument();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDocument", theBusinessDocument), currentHashCode, theBusinessDocument, (this.businessDocument!= null));
        }
        {
            String theBusinessDocumentIDREF;
            theBusinessDocumentIDREF = this.getBusinessDocumentIDREF();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessDocumentIDREF", theBusinessDocumentIDREF), currentHashCode, theBusinessDocumentIDREF, (this.businessDocumentIDREF!= null));
        }
        {
            Boolean theIsPositiveResponse;
            theIsPositiveResponse = this.isIsPositiveResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isPositiveResponse", theIsPositiveResponse), currentHashCode, theIsPositiveResponse, (this.isPositiveResponse!= null));
        }
        {
            String theName;
            theName = this.getName();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "name", theName), currentHashCode, theName, (this.name!= null));
        }
        {
            String theNameID;
            theNameID = this.getNameID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "nameID", theNameID), currentHashCode, theNameID, (this.nameID!= null));
        }
        {
            String theIsAuthenticated;
            theIsAuthenticated = this.getIsAuthenticated();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isAuthenticated", theIsAuthenticated), currentHashCode, theIsAuthenticated, (this.isAuthenticated!= null));
        }
        {
            String theIsConfidential;
            theIsConfidential = this.getIsConfidential();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isConfidential", theIsConfidential), currentHashCode, theIsConfidential, (this.isConfidential!= null));
        }
        {
            String theIsTamperDetectable;
            theIsTamperDetectable = this.getIsTamperDetectable();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isTamperDetectable", theIsTamperDetectable), currentHashCode, theIsTamperDetectable, (this.isTamperDetectable!= null));
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
            List<Documentation> theDocumentation;
            theDocumentation = (((this.documentation!= null)&&(!this.documentation.isEmpty()))?this.getDocumentation():null);
            strategy.appendField(locator, this, "documentation", buffer, theDocumentation, ((this.documentation!= null)&&(!this.documentation.isEmpty())));
        }
        {
            List<Attachment> theAttachment;
            theAttachment = (((this.attachment!= null)&&(!this.attachment.isEmpty()))?this.getAttachment():null);
            strategy.appendField(locator, this, "attachment", buffer, theAttachment, ((this.attachment!= null)&&(!this.attachment.isEmpty())));
        }
        {
            String theBusinessDocument;
            theBusinessDocument = this.getBusinessDocument();
            strategy.appendField(locator, this, "businessDocument", buffer, theBusinessDocument, (this.businessDocument!= null));
        }
        {
            String theBusinessDocumentIDREF;
            theBusinessDocumentIDREF = this.getBusinessDocumentIDREF();
            strategy.appendField(locator, this, "businessDocumentIDREF", buffer, theBusinessDocumentIDREF, (this.businessDocumentIDREF!= null));
        }
        {
            Boolean theIsPositiveResponse;
            theIsPositiveResponse = this.isIsPositiveResponse();
            strategy.appendField(locator, this, "isPositiveResponse", buffer, theIsPositiveResponse, (this.isPositiveResponse!= null));
        }
        {
            String theName;
            theName = this.getName();
            strategy.appendField(locator, this, "name", buffer, theName, (this.name!= null));
        }
        {
            String theNameID;
            theNameID = this.getNameID();
            strategy.appendField(locator, this, "nameID", buffer, theNameID, (this.nameID!= null));
        }
        {
            String theIsAuthenticated;
            theIsAuthenticated = this.getIsAuthenticated();
            strategy.appendField(locator, this, "isAuthenticated", buffer, theIsAuthenticated, (this.isAuthenticated!= null));
        }
        {
            String theIsConfidential;
            theIsConfidential = this.getIsConfidential();
            strategy.appendField(locator, this, "isConfidential", buffer, theIsConfidential, (this.isConfidential!= null));
        }
        {
            String theIsTamperDetectable;
            theIsTamperDetectable = this.getIsTamperDetectable();
            strategy.appendField(locator, this, "isTamperDetectable", buffer, theIsTamperDetectable, (this.isTamperDetectable!= null));
        }
        return buffer;
    }

}
