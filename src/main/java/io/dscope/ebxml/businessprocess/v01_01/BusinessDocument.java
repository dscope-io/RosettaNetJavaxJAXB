
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
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}ConditionExpression" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.ebxml.org/BusinessProcess/1.01}name"/&gt;
 *       &lt;attribute name="specificationLocation" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="specificationID" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="namespacePrefixes" type="{http://www.w3.org/2001/XMLSchema}NMTOKENS" /&gt;
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
    "conditionExpression"
})
@XmlRootElement(name = "BusinessDocument")
public class BusinessDocument implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Documentation")
    protected List<Documentation> documentation;
    @XmlElement(name = "ConditionExpression")
    protected ConditionExpression conditionExpression;
    @XmlAttribute(name = "specificationLocation")
    @XmlSchemaType(name = "anyURI")
    protected String specificationLocation;
    @XmlAttribute(name = "specificationID")
    @XmlSchemaType(name = "anyURI")
    protected String specificationID;
    @XmlAttribute(name = "namespacePrefixes")
    @XmlSchemaType(name = "NMTOKENS")
    protected List<String> namespacePrefixes;
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
     * Gets the value of the conditionExpression property.
     * 
     * @return
     *     possible object is
     *     {@link ConditionExpression }
     *     
     */
    public ConditionExpression getConditionExpression() {
        return conditionExpression;
    }

    /**
     * Sets the value of the conditionExpression property.
     * 
     * @param value
     *     allowed object is
     *     {@link ConditionExpression }
     *     
     */
    public void setConditionExpression(ConditionExpression value) {
        this.conditionExpression = value;
    }

    /**
     * Gets the value of the specificationLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificationLocation() {
        return specificationLocation;
    }

    /**
     * Sets the value of the specificationLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificationLocation(String value) {
        this.specificationLocation = value;
    }

    /**
     * Gets the value of the specificationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecificationID() {
        return specificationID;
    }

    /**
     * Sets the value of the specificationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecificationID(String value) {
        this.specificationID = value;
    }

    /**
     * Gets the value of the namespacePrefixes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namespacePrefixes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamespacePrefixes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNamespacePrefixes() {
        if (namespacePrefixes == null) {
            namespacePrefixes = new ArrayList<String>();
        }
        return this.namespacePrefixes;
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
        final BusinessDocument that = ((BusinessDocument) object);
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
            ConditionExpression lhsConditionExpression;
            lhsConditionExpression = this.getConditionExpression();
            ConditionExpression rhsConditionExpression;
            rhsConditionExpression = that.getConditionExpression();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "conditionExpression", lhsConditionExpression), LocatorUtils.property(thatLocator, "conditionExpression", rhsConditionExpression), lhsConditionExpression, rhsConditionExpression, (this.conditionExpression!= null), (that.conditionExpression!= null))) {
                return false;
            }
        }
        {
            String lhsSpecificationLocation;
            lhsSpecificationLocation = this.getSpecificationLocation();
            String rhsSpecificationLocation;
            rhsSpecificationLocation = that.getSpecificationLocation();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specificationLocation", lhsSpecificationLocation), LocatorUtils.property(thatLocator, "specificationLocation", rhsSpecificationLocation), lhsSpecificationLocation, rhsSpecificationLocation, (this.specificationLocation!= null), (that.specificationLocation!= null))) {
                return false;
            }
        }
        {
            String lhsSpecificationID;
            lhsSpecificationID = this.getSpecificationID();
            String rhsSpecificationID;
            rhsSpecificationID = that.getSpecificationID();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "specificationID", lhsSpecificationID), LocatorUtils.property(thatLocator, "specificationID", rhsSpecificationID), lhsSpecificationID, rhsSpecificationID, (this.specificationID!= null), (that.specificationID!= null))) {
                return false;
            }
        }
        {
            List<String> lhsNamespacePrefixes;
            lhsNamespacePrefixes = (((this.namespacePrefixes!= null)&&(!this.namespacePrefixes.isEmpty()))?this.getNamespacePrefixes():null);
            List<String> rhsNamespacePrefixes;
            rhsNamespacePrefixes = (((that.namespacePrefixes!= null)&&(!that.namespacePrefixes.isEmpty()))?that.getNamespacePrefixes():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "namespacePrefixes", lhsNamespacePrefixes), LocatorUtils.property(thatLocator, "namespacePrefixes", rhsNamespacePrefixes), lhsNamespacePrefixes, rhsNamespacePrefixes, ((this.namespacePrefixes!= null)&&(!this.namespacePrefixes.isEmpty())), ((that.namespacePrefixes!= null)&&(!that.namespacePrefixes.isEmpty())))) {
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
            ConditionExpression theConditionExpression;
            theConditionExpression = this.getConditionExpression();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "conditionExpression", theConditionExpression), currentHashCode, theConditionExpression, (this.conditionExpression!= null));
        }
        {
            String theSpecificationLocation;
            theSpecificationLocation = this.getSpecificationLocation();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specificationLocation", theSpecificationLocation), currentHashCode, theSpecificationLocation, (this.specificationLocation!= null));
        }
        {
            String theSpecificationID;
            theSpecificationID = this.getSpecificationID();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "specificationID", theSpecificationID), currentHashCode, theSpecificationID, (this.specificationID!= null));
        }
        {
            List<String> theNamespacePrefixes;
            theNamespacePrefixes = (((this.namespacePrefixes!= null)&&(!this.namespacePrefixes.isEmpty()))?this.getNamespacePrefixes():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "namespacePrefixes", theNamespacePrefixes), currentHashCode, theNamespacePrefixes, ((this.namespacePrefixes!= null)&&(!this.namespacePrefixes.isEmpty())));
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
            ConditionExpression theConditionExpression;
            theConditionExpression = this.getConditionExpression();
            strategy.appendField(locator, this, "conditionExpression", buffer, theConditionExpression, (this.conditionExpression!= null));
        }
        {
            String theSpecificationLocation;
            theSpecificationLocation = this.getSpecificationLocation();
            strategy.appendField(locator, this, "specificationLocation", buffer, theSpecificationLocation, (this.specificationLocation!= null));
        }
        {
            String theSpecificationID;
            theSpecificationID = this.getSpecificationID();
            strategy.appendField(locator, this, "specificationID", buffer, theSpecificationID, (this.specificationID!= null));
        }
        {
            List<String> theNamespacePrefixes;
            theNamespacePrefixes = (((this.namespacePrefixes!= null)&&(!this.namespacePrefixes.isEmpty()))?this.getNamespacePrefixes():null);
            strategy.appendField(locator, this, "namespacePrefixes", buffer, theNamespacePrefixes, ((this.namespacePrefixes!= null)&&(!this.namespacePrefixes.isEmpty())));
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
