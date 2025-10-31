
package io.dscope.ebxml.businessprocess.v01_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}DocumentSubstitution" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}AttributeSubstitution" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.ebxml.org/BusinessProcess/1.01}name"/&gt;
 *       &lt;attribute name="applyToScope" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "documentSubstitution",
    "attributeSubstitution"
})
@XmlRootElement(name = "SubstitutionSet")
public class SubstitutionSet implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Documentation")
    protected List<Documentation> documentation;
    @XmlElement(name = "DocumentSubstitution")
    protected List<DocumentSubstitution> documentSubstitution;
    @XmlElement(name = "AttributeSubstitution")
    protected List<AttributeSubstitution> attributeSubstitution;
    @XmlAttribute(name = "applyToScope", required = true)
    protected String applyToScope;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "nameID", required = true)
    protected String nameID;

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
     * Gets the value of the documentSubstitution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentSubstitution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentSubstitution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentSubstitution }
     * 
     * 
     */
    public List<DocumentSubstitution> getDocumentSubstitution() {
        if (documentSubstitution == null) {
            documentSubstitution = new ArrayList<DocumentSubstitution>();
        }
        return this.documentSubstitution;
    }

    /**
     * Gets the value of the attributeSubstitution property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the attributeSubstitution property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAttributeSubstitution().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AttributeSubstitution }
     * 
     * 
     */
    public List<AttributeSubstitution> getAttributeSubstitution() {
        if (attributeSubstitution == null) {
            attributeSubstitution = new ArrayList<AttributeSubstitution>();
        }
        return this.attributeSubstitution;
    }

    /**
     * Gets the value of the applyToScope property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyToScope() {
        return applyToScope;
    }

    /**
     * Sets the value of the applyToScope property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyToScope(String value) {
        this.applyToScope = value;
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

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final SubstitutionSet that = ((SubstitutionSet) object);
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
            List<DocumentSubstitution> lhsDocumentSubstitution;
            lhsDocumentSubstitution = (((this.documentSubstitution!= null)&&(!this.documentSubstitution.isEmpty()))?this.getDocumentSubstitution():null);
            List<DocumentSubstitution> rhsDocumentSubstitution;
            rhsDocumentSubstitution = (((that.documentSubstitution!= null)&&(!that.documentSubstitution.isEmpty()))?that.getDocumentSubstitution():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentSubstitution", lhsDocumentSubstitution), LocatorUtils.property(thatLocator, "documentSubstitution", rhsDocumentSubstitution), lhsDocumentSubstitution, rhsDocumentSubstitution, ((this.documentSubstitution!= null)&&(!this.documentSubstitution.isEmpty())), ((that.documentSubstitution!= null)&&(!that.documentSubstitution.isEmpty())))) {
                return false;
            }
        }
        {
            List<AttributeSubstitution> lhsAttributeSubstitution;
            lhsAttributeSubstitution = (((this.attributeSubstitution!= null)&&(!this.attributeSubstitution.isEmpty()))?this.getAttributeSubstitution():null);
            List<AttributeSubstitution> rhsAttributeSubstitution;
            rhsAttributeSubstitution = (((that.attributeSubstitution!= null)&&(!that.attributeSubstitution.isEmpty()))?that.getAttributeSubstitution():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "attributeSubstitution", lhsAttributeSubstitution), LocatorUtils.property(thatLocator, "attributeSubstitution", rhsAttributeSubstitution), lhsAttributeSubstitution, rhsAttributeSubstitution, ((this.attributeSubstitution!= null)&&(!this.attributeSubstitution.isEmpty())), ((that.attributeSubstitution!= null)&&(!that.attributeSubstitution.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsApplyToScope;
            lhsApplyToScope = this.getApplyToScope();
            String rhsApplyToScope;
            rhsApplyToScope = that.getApplyToScope();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "applyToScope", lhsApplyToScope), LocatorUtils.property(thatLocator, "applyToScope", rhsApplyToScope), lhsApplyToScope, rhsApplyToScope, (this.applyToScope!= null), (that.applyToScope!= null))) {
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
            List<DocumentSubstitution> theDocumentSubstitution;
            theDocumentSubstitution = (((this.documentSubstitution!= null)&&(!this.documentSubstitution.isEmpty()))?this.getDocumentSubstitution():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentSubstitution", theDocumentSubstitution), currentHashCode, theDocumentSubstitution, ((this.documentSubstitution!= null)&&(!this.documentSubstitution.isEmpty())));
        }
        {
            List<AttributeSubstitution> theAttributeSubstitution;
            theAttributeSubstitution = (((this.attributeSubstitution!= null)&&(!this.attributeSubstitution.isEmpty()))?this.getAttributeSubstitution():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "attributeSubstitution", theAttributeSubstitution), currentHashCode, theAttributeSubstitution, ((this.attributeSubstitution!= null)&&(!this.attributeSubstitution.isEmpty())));
        }
        {
            String theApplyToScope;
            theApplyToScope = this.getApplyToScope();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "applyToScope", theApplyToScope), currentHashCode, theApplyToScope, (this.applyToScope!= null));
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
            List<DocumentSubstitution> theDocumentSubstitution;
            theDocumentSubstitution = (((this.documentSubstitution!= null)&&(!this.documentSubstitution.isEmpty()))?this.getDocumentSubstitution():null);
            strategy.appendField(locator, this, "documentSubstitution", buffer, theDocumentSubstitution, ((this.documentSubstitution!= null)&&(!this.documentSubstitution.isEmpty())));
        }
        {
            List<AttributeSubstitution> theAttributeSubstitution;
            theAttributeSubstitution = (((this.attributeSubstitution!= null)&&(!this.attributeSubstitution.isEmpty()))?this.getAttributeSubstitution():null);
            strategy.appendField(locator, this, "attributeSubstitution", buffer, theAttributeSubstitution, ((this.attributeSubstitution!= null)&&(!this.attributeSubstitution.isEmpty())));
        }
        {
            String theApplyToScope;
            theApplyToScope = this.getApplyToScope();
            strategy.appendField(locator, this, "applyToScope", buffer, theApplyToScope, (this.applyToScope!= null));
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
        return buffer;
    }

}
