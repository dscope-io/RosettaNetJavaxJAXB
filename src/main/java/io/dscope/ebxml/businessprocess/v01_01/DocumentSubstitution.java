
package io.dscope.ebxml.businessprocess.v01_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
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
 *       &lt;/sequence&gt;
 *       &lt;attribute name="originalBusinessDocument" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="originalBusinessDocumentID" type="{http://www.ebxml.org/BusinessProcess/1.01}GUIDREF" /&gt;
 *       &lt;attribute name="substituteBusinessDocumentLocation" use="required" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="substituteBusinessDocumentId" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentation"
})
@XmlRootElement(name = "DocumentSubstitution")
public class DocumentSubstitution implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Documentation")
    protected List<Documentation> documentation;
    @XmlAttribute(name = "originalBusinessDocument", required = true)
    protected String originalBusinessDocument;
    @XmlAttribute(name = "originalBusinessDocumentID")
    protected String originalBusinessDocumentID;
    @XmlAttribute(name = "substituteBusinessDocumentLocation", required = true)
    @XmlSchemaType(name = "anyURI")
    protected String substituteBusinessDocumentLocation;
    @XmlAttribute(name = "substituteBusinessDocumentId")
    @XmlSchemaType(name = "anyURI")
    protected String substituteBusinessDocumentId;

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
     * Gets the value of the originalBusinessDocument property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalBusinessDocument() {
        return originalBusinessDocument;
    }

    /**
     * Sets the value of the originalBusinessDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalBusinessDocument(String value) {
        this.originalBusinessDocument = value;
    }

    /**
     * Gets the value of the originalBusinessDocumentID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalBusinessDocumentID() {
        return originalBusinessDocumentID;
    }

    /**
     * Sets the value of the originalBusinessDocumentID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalBusinessDocumentID(String value) {
        this.originalBusinessDocumentID = value;
    }

    /**
     * Gets the value of the substituteBusinessDocumentLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstituteBusinessDocumentLocation() {
        return substituteBusinessDocumentLocation;
    }

    /**
     * Sets the value of the substituteBusinessDocumentLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstituteBusinessDocumentLocation(String value) {
        this.substituteBusinessDocumentLocation = value;
    }

    /**
     * Gets the value of the substituteBusinessDocumentId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubstituteBusinessDocumentId() {
        return substituteBusinessDocumentId;
    }

    /**
     * Sets the value of the substituteBusinessDocumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubstituteBusinessDocumentId(String value) {
        this.substituteBusinessDocumentId = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final DocumentSubstitution that = ((DocumentSubstitution) object);
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
            String lhsOriginalBusinessDocument;
            lhsOriginalBusinessDocument = this.getOriginalBusinessDocument();
            String rhsOriginalBusinessDocument;
            rhsOriginalBusinessDocument = that.getOriginalBusinessDocument();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originalBusinessDocument", lhsOriginalBusinessDocument), LocatorUtils.property(thatLocator, "originalBusinessDocument", rhsOriginalBusinessDocument), lhsOriginalBusinessDocument, rhsOriginalBusinessDocument, (this.originalBusinessDocument!= null), (that.originalBusinessDocument!= null))) {
                return false;
            }
        }
        {
            String lhsOriginalBusinessDocumentID;
            lhsOriginalBusinessDocumentID = this.getOriginalBusinessDocumentID();
            String rhsOriginalBusinessDocumentID;
            rhsOriginalBusinessDocumentID = that.getOriginalBusinessDocumentID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "originalBusinessDocumentID", lhsOriginalBusinessDocumentID), LocatorUtils.property(thatLocator, "originalBusinessDocumentID", rhsOriginalBusinessDocumentID), lhsOriginalBusinessDocumentID, rhsOriginalBusinessDocumentID, (this.originalBusinessDocumentID!= null), (that.originalBusinessDocumentID!= null))) {
                return false;
            }
        }
        {
            String lhsSubstituteBusinessDocumentLocation;
            lhsSubstituteBusinessDocumentLocation = this.getSubstituteBusinessDocumentLocation();
            String rhsSubstituteBusinessDocumentLocation;
            rhsSubstituteBusinessDocumentLocation = that.getSubstituteBusinessDocumentLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "substituteBusinessDocumentLocation", lhsSubstituteBusinessDocumentLocation), LocatorUtils.property(thatLocator, "substituteBusinessDocumentLocation", rhsSubstituteBusinessDocumentLocation), lhsSubstituteBusinessDocumentLocation, rhsSubstituteBusinessDocumentLocation, (this.substituteBusinessDocumentLocation!= null), (that.substituteBusinessDocumentLocation!= null))) {
                return false;
            }
        }
        {
            String lhsSubstituteBusinessDocumentId;
            lhsSubstituteBusinessDocumentId = this.getSubstituteBusinessDocumentId();
            String rhsSubstituteBusinessDocumentId;
            rhsSubstituteBusinessDocumentId = that.getSubstituteBusinessDocumentId();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "substituteBusinessDocumentId", lhsSubstituteBusinessDocumentId), LocatorUtils.property(thatLocator, "substituteBusinessDocumentId", rhsSubstituteBusinessDocumentId), lhsSubstituteBusinessDocumentId, rhsSubstituteBusinessDocumentId, (this.substituteBusinessDocumentId!= null), (that.substituteBusinessDocumentId!= null))) {
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
            String theOriginalBusinessDocument;
            theOriginalBusinessDocument = this.getOriginalBusinessDocument();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originalBusinessDocument", theOriginalBusinessDocument), currentHashCode, theOriginalBusinessDocument, (this.originalBusinessDocument!= null));
        }
        {
            String theOriginalBusinessDocumentID;
            theOriginalBusinessDocumentID = this.getOriginalBusinessDocumentID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "originalBusinessDocumentID", theOriginalBusinessDocumentID), currentHashCode, theOriginalBusinessDocumentID, (this.originalBusinessDocumentID!= null));
        }
        {
            String theSubstituteBusinessDocumentLocation;
            theSubstituteBusinessDocumentLocation = this.getSubstituteBusinessDocumentLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "substituteBusinessDocumentLocation", theSubstituteBusinessDocumentLocation), currentHashCode, theSubstituteBusinessDocumentLocation, (this.substituteBusinessDocumentLocation!= null));
        }
        {
            String theSubstituteBusinessDocumentId;
            theSubstituteBusinessDocumentId = this.getSubstituteBusinessDocumentId();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "substituteBusinessDocumentId", theSubstituteBusinessDocumentId), currentHashCode, theSubstituteBusinessDocumentId, (this.substituteBusinessDocumentId!= null));
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
            String theOriginalBusinessDocument;
            theOriginalBusinessDocument = this.getOriginalBusinessDocument();
            strategy.appendField(locator, this, "originalBusinessDocument", buffer, theOriginalBusinessDocument, (this.originalBusinessDocument!= null));
        }
        {
            String theOriginalBusinessDocumentID;
            theOriginalBusinessDocumentID = this.getOriginalBusinessDocumentID();
            strategy.appendField(locator, this, "originalBusinessDocumentID", buffer, theOriginalBusinessDocumentID, (this.originalBusinessDocumentID!= null));
        }
        {
            String theSubstituteBusinessDocumentLocation;
            theSubstituteBusinessDocumentLocation = this.getSubstituteBusinessDocumentLocation();
            strategy.appendField(locator, this, "substituteBusinessDocumentLocation", buffer, theSubstituteBusinessDocumentLocation, (this.substituteBusinessDocumentLocation!= null));
        }
        {
            String theSubstituteBusinessDocumentId;
            theSubstituteBusinessDocumentId = this.getSubstituteBusinessDocumentId();
            strategy.appendField(locator, this, "substituteBusinessDocumentId", buffer, theSubstituteBusinessDocumentId, (this.substituteBusinessDocumentId!= null));
        }
        return buffer;
    }

}
