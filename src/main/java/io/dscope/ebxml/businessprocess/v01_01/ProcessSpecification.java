
package io.dscope.ebxml.businessprocess.v01_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
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
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Include" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}SubstitutionSet" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Namespaces" minOccurs="0"/&gt;
 *         &lt;choice maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Package" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}BusinessDocument" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}BusinessTransaction" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}BinaryCollaboration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *           &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}MultiPartyCollaboration" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.ebxml.org/BusinessProcess/1.01}name"/&gt;
 *       &lt;attribute name="version" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    "include",
    "substitutionSet",
    "namespaces",
    "packageOrBusinessDocumentOrBusinessTransaction"
})
@XmlRootElement(name = "ProcessSpecification")
public class ProcessSpecification implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Documentation")
    protected List<Documentation> documentation;
    @XmlElement(name = "Include")
    protected List<Include> include;
    @XmlElement(name = "SubstitutionSet")
    protected SubstitutionSet substitutionSet;
    @XmlElement(name = "Namespaces")
    protected Namespaces namespaces;
    @XmlElements({
        @XmlElement(name = "Package", type = Package.class),
        @XmlElement(name = "BusinessDocument", type = BusinessDocument.class),
        @XmlElement(name = "BusinessTransaction", type = BusinessTransaction.class),
        @XmlElement(name = "BinaryCollaboration", type = BinaryCollaboration.class),
        @XmlElement(name = "MultiPartyCollaboration", type = MultiPartyCollaboration.class)
    })
    protected List<Object> packageOrBusinessDocumentOrBusinessTransaction;
    @XmlAttribute(name = "version", required = true)
    protected String version;
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
     * Gets the value of the include property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the include property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInclude().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Include }
     * 
     * 
     */
    public List<Include> getInclude() {
        if (include == null) {
            include = new ArrayList<Include>();
        }
        return this.include;
    }

    /**
     * Gets the value of the substitutionSet property.
     * 
     * @return
     *     possible object is
     *     {@link SubstitutionSet }
     *     
     */
    public SubstitutionSet getSubstitutionSet() {
        return substitutionSet;
    }

    /**
     * Sets the value of the substitutionSet property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubstitutionSet }
     *     
     */
    public void setSubstitutionSet(SubstitutionSet value) {
        this.substitutionSet = value;
    }

    /**
     * Gets the value of the namespaces property.
     * 
     * @return
     *     possible object is
     *     {@link Namespaces }
     *     
     */
    public Namespaces getNamespaces() {
        return namespaces;
    }

    /**
     * Sets the value of the namespaces property.
     * 
     * @param value
     *     allowed object is
     *     {@link Namespaces }
     *     
     */
    public void setNamespaces(Namespaces value) {
        this.namespaces = value;
    }

    /**
     * Gets the value of the packageOrBusinessDocumentOrBusinessTransaction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the packageOrBusinessDocumentOrBusinessTransaction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPackageOrBusinessDocumentOrBusinessTransaction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BinaryCollaboration }
     * {@link BusinessDocument }
     * {@link BusinessTransaction }
     * {@link MultiPartyCollaboration }
     * {@link Package }
     * 
     * 
     */
    public List<Object> getPackageOrBusinessDocumentOrBusinessTransaction() {
        if (packageOrBusinessDocumentOrBusinessTransaction == null) {
            packageOrBusinessDocumentOrBusinessTransaction = new ArrayList<Object>();
        }
        return this.packageOrBusinessDocumentOrBusinessTransaction;
    }

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
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
        final ProcessSpecification that = ((ProcessSpecification) object);
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
            List<Include> lhsInclude;
            lhsInclude = (((this.include!= null)&&(!this.include.isEmpty()))?this.getInclude():null);
            List<Include> rhsInclude;
            rhsInclude = (((that.include!= null)&&(!that.include.isEmpty()))?that.getInclude():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "include", lhsInclude), LocatorUtils.property(thatLocator, "include", rhsInclude), lhsInclude, rhsInclude, ((this.include!= null)&&(!this.include.isEmpty())), ((that.include!= null)&&(!that.include.isEmpty())))) {
                return false;
            }
        }
        {
            SubstitutionSet lhsSubstitutionSet;
            lhsSubstitutionSet = this.getSubstitutionSet();
            SubstitutionSet rhsSubstitutionSet;
            rhsSubstitutionSet = that.getSubstitutionSet();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "substitutionSet", lhsSubstitutionSet), LocatorUtils.property(thatLocator, "substitutionSet", rhsSubstitutionSet), lhsSubstitutionSet, rhsSubstitutionSet, (this.substitutionSet!= null), (that.substitutionSet!= null))) {
                return false;
            }
        }
        {
            Namespaces lhsNamespaces;
            lhsNamespaces = this.getNamespaces();
            Namespaces rhsNamespaces;
            rhsNamespaces = that.getNamespaces();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "namespaces", lhsNamespaces), LocatorUtils.property(thatLocator, "namespaces", rhsNamespaces), lhsNamespaces, rhsNamespaces, (this.namespaces!= null), (that.namespaces!= null))) {
                return false;
            }
        }
        {
            List<Object> lhsPackageOrBusinessDocumentOrBusinessTransaction;
            lhsPackageOrBusinessDocumentOrBusinessTransaction = (((this.packageOrBusinessDocumentOrBusinessTransaction!= null)&&(!this.packageOrBusinessDocumentOrBusinessTransaction.isEmpty()))?this.getPackageOrBusinessDocumentOrBusinessTransaction():null);
            List<Object> rhsPackageOrBusinessDocumentOrBusinessTransaction;
            rhsPackageOrBusinessDocumentOrBusinessTransaction = (((that.packageOrBusinessDocumentOrBusinessTransaction!= null)&&(!that.packageOrBusinessDocumentOrBusinessTransaction.isEmpty()))?that.getPackageOrBusinessDocumentOrBusinessTransaction():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "packageOrBusinessDocumentOrBusinessTransaction", lhsPackageOrBusinessDocumentOrBusinessTransaction), LocatorUtils.property(thatLocator, "packageOrBusinessDocumentOrBusinessTransaction", rhsPackageOrBusinessDocumentOrBusinessTransaction), lhsPackageOrBusinessDocumentOrBusinessTransaction, rhsPackageOrBusinessDocumentOrBusinessTransaction, ((this.packageOrBusinessDocumentOrBusinessTransaction!= null)&&(!this.packageOrBusinessDocumentOrBusinessTransaction.isEmpty())), ((that.packageOrBusinessDocumentOrBusinessTransaction!= null)&&(!that.packageOrBusinessDocumentOrBusinessTransaction.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsVersion;
            lhsVersion = this.getVersion();
            String rhsVersion;
            rhsVersion = that.getVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "version", lhsVersion), LocatorUtils.property(thatLocator, "version", rhsVersion), lhsVersion, rhsVersion, (this.version!= null), (that.version!= null))) {
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
            List<Include> theInclude;
            theInclude = (((this.include!= null)&&(!this.include.isEmpty()))?this.getInclude():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "include", theInclude), currentHashCode, theInclude, ((this.include!= null)&&(!this.include.isEmpty())));
        }
        {
            SubstitutionSet theSubstitutionSet;
            theSubstitutionSet = this.getSubstitutionSet();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "substitutionSet", theSubstitutionSet), currentHashCode, theSubstitutionSet, (this.substitutionSet!= null));
        }
        {
            Namespaces theNamespaces;
            theNamespaces = this.getNamespaces();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "namespaces", theNamespaces), currentHashCode, theNamespaces, (this.namespaces!= null));
        }
        {
            List<Object> thePackageOrBusinessDocumentOrBusinessTransaction;
            thePackageOrBusinessDocumentOrBusinessTransaction = (((this.packageOrBusinessDocumentOrBusinessTransaction!= null)&&(!this.packageOrBusinessDocumentOrBusinessTransaction.isEmpty()))?this.getPackageOrBusinessDocumentOrBusinessTransaction():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "packageOrBusinessDocumentOrBusinessTransaction", thePackageOrBusinessDocumentOrBusinessTransaction), currentHashCode, thePackageOrBusinessDocumentOrBusinessTransaction, ((this.packageOrBusinessDocumentOrBusinessTransaction!= null)&&(!this.packageOrBusinessDocumentOrBusinessTransaction.isEmpty())));
        }
        {
            String theVersion;
            theVersion = this.getVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "version", theVersion), currentHashCode, theVersion, (this.version!= null));
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
            List<Include> theInclude;
            theInclude = (((this.include!= null)&&(!this.include.isEmpty()))?this.getInclude():null);
            strategy.appendField(locator, this, "include", buffer, theInclude, ((this.include!= null)&&(!this.include.isEmpty())));
        }
        {
            SubstitutionSet theSubstitutionSet;
            theSubstitutionSet = this.getSubstitutionSet();
            strategy.appendField(locator, this, "substitutionSet", buffer, theSubstitutionSet, (this.substitutionSet!= null));
        }
        {
            Namespaces theNamespaces;
            theNamespaces = this.getNamespaces();
            strategy.appendField(locator, this, "namespaces", buffer, theNamespaces, (this.namespaces!= null));
        }
        {
            List<Object> thePackageOrBusinessDocumentOrBusinessTransaction;
            thePackageOrBusinessDocumentOrBusinessTransaction = (((this.packageOrBusinessDocumentOrBusinessTransaction!= null)&&(!this.packageOrBusinessDocumentOrBusinessTransaction.isEmpty()))?this.getPackageOrBusinessDocumentOrBusinessTransaction():null);
            strategy.appendField(locator, this, "packageOrBusinessDocumentOrBusinessTransaction", buffer, thePackageOrBusinessDocumentOrBusinessTransaction, ((this.packageOrBusinessDocumentOrBusinessTransaction!= null)&&(!this.packageOrBusinessDocumentOrBusinessTransaction.isEmpty())));
        }
        {
            String theVersion;
            theVersion = this.getVersion();
            strategy.appendField(locator, this, "version", buffer, theVersion, (this.version!= null));
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
