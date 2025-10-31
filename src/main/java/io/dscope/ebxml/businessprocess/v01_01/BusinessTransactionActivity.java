
package io.dscope.ebxml.businessprocess.v01_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
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
 *     &lt;extension base="{http://www.ebxml.org/BusinessProcess/1.01}BusinessActivity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Documentation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="businessTransaction" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="businessTransactionIDREF" type="{http://www.ebxml.org/BusinessProcess/1.01}GUIDREF" /&gt;
 *       &lt;attribute name="isConcurrent" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="isLegallyBinding" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" /&gt;
 *       &lt;attribute name="timeToPerform" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *     &lt;/extension&gt;
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
@XmlRootElement(name = "BusinessTransactionActivity")
public class BusinessTransactionActivity
    extends BusinessActivity
    implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Documentation")
    protected List<Documentation> documentation;
    @XmlAttribute(name = "businessTransaction", required = true)
    protected String businessTransaction;
    @XmlAttribute(name = "businessTransactionIDREF")
    protected String businessTransactionIDREF;
    @XmlAttribute(name = "isConcurrent")
    protected Boolean isConcurrent;
    @XmlAttribute(name = "isLegallyBinding")
    protected Boolean isLegallyBinding;
    @XmlAttribute(name = "timeToPerform")
    protected Duration timeToPerform;

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
     * Gets the value of the businessTransaction property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessTransaction() {
        return businessTransaction;
    }

    /**
     * Sets the value of the businessTransaction property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessTransaction(String value) {
        this.businessTransaction = value;
    }

    /**
     * Gets the value of the businessTransactionIDREF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessTransactionIDREF() {
        return businessTransactionIDREF;
    }

    /**
     * Sets the value of the businessTransactionIDREF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessTransactionIDREF(String value) {
        this.businessTransactionIDREF = value;
    }

    /**
     * Gets the value of the isConcurrent property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsConcurrent() {
        if (isConcurrent == null) {
            return true;
        } else {
            return isConcurrent;
        }
    }

    /**
     * Sets the value of the isConcurrent property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsConcurrent(Boolean value) {
        this.isConcurrent = value;
    }

    /**
     * Gets the value of the isLegallyBinding property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsLegallyBinding() {
        if (isLegallyBinding == null) {
            return true;
        } else {
            return isLegallyBinding;
        }
    }

    /**
     * Sets the value of the isLegallyBinding property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsLegallyBinding(Boolean value) {
        this.isLegallyBinding = value;
    }

    /**
     * Gets the value of the timeToPerform property.
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTimeToPerform() {
        return timeToPerform;
    }

    /**
     * Sets the value of the timeToPerform property.
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTimeToPerform(Duration value) {
        this.timeToPerform = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (!super.equals(thisLocator, thatLocator, object, strategy)) {
            return false;
        }
        final BusinessTransactionActivity that = ((BusinessTransactionActivity) object);
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
            String lhsBusinessTransaction;
            lhsBusinessTransaction = this.getBusinessTransaction();
            String rhsBusinessTransaction;
            rhsBusinessTransaction = that.getBusinessTransaction();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessTransaction", lhsBusinessTransaction), LocatorUtils.property(thatLocator, "businessTransaction", rhsBusinessTransaction), lhsBusinessTransaction, rhsBusinessTransaction, (this.businessTransaction!= null), (that.businessTransaction!= null))) {
                return false;
            }
        }
        {
            String lhsBusinessTransactionIDREF;
            lhsBusinessTransactionIDREF = this.getBusinessTransactionIDREF();
            String rhsBusinessTransactionIDREF;
            rhsBusinessTransactionIDREF = that.getBusinessTransactionIDREF();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessTransactionIDREF", lhsBusinessTransactionIDREF), LocatorUtils.property(thatLocator, "businessTransactionIDREF", rhsBusinessTransactionIDREF), lhsBusinessTransactionIDREF, rhsBusinessTransactionIDREF, (this.businessTransactionIDREF!= null), (that.businessTransactionIDREF!= null))) {
                return false;
            }
        }
        {
            boolean lhsIsConcurrent;
            lhsIsConcurrent = ((this.isConcurrent!= null)?this.isIsConcurrent():true);
            boolean rhsIsConcurrent;
            rhsIsConcurrent = ((that.isConcurrent!= null)?that.isIsConcurrent():true);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isConcurrent", lhsIsConcurrent), LocatorUtils.property(thatLocator, "isConcurrent", rhsIsConcurrent), lhsIsConcurrent, rhsIsConcurrent, (this.isConcurrent!= null), (that.isConcurrent!= null))) {
                return false;
            }
        }
        {
            boolean lhsIsLegallyBinding;
            lhsIsLegallyBinding = ((this.isLegallyBinding!= null)?this.isIsLegallyBinding():true);
            boolean rhsIsLegallyBinding;
            rhsIsLegallyBinding = ((that.isLegallyBinding!= null)?that.isIsLegallyBinding():true);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isLegallyBinding", lhsIsLegallyBinding), LocatorUtils.property(thatLocator, "isLegallyBinding", rhsIsLegallyBinding), lhsIsLegallyBinding, rhsIsLegallyBinding, (this.isLegallyBinding!= null), (that.isLegallyBinding!= null))) {
                return false;
            }
        }
        {
            Duration lhsTimeToPerform;
            lhsTimeToPerform = this.getTimeToPerform();
            Duration rhsTimeToPerform;
            rhsTimeToPerform = that.getTimeToPerform();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "timeToPerform", lhsTimeToPerform), LocatorUtils.property(thatLocator, "timeToPerform", rhsTimeToPerform), lhsTimeToPerform, rhsTimeToPerform, (this.timeToPerform!= null), (that.timeToPerform!= null))) {
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
        int currentHashCode = super.hashCode(locator, strategy);
        {
            List<Documentation> theDocumentation;
            theDocumentation = (((this.documentation!= null)&&(!this.documentation.isEmpty()))?this.getDocumentation():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentation", theDocumentation), currentHashCode, theDocumentation, ((this.documentation!= null)&&(!this.documentation.isEmpty())));
        }
        {
            String theBusinessTransaction;
            theBusinessTransaction = this.getBusinessTransaction();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessTransaction", theBusinessTransaction), currentHashCode, theBusinessTransaction, (this.businessTransaction!= null));
        }
        {
            String theBusinessTransactionIDREF;
            theBusinessTransactionIDREF = this.getBusinessTransactionIDREF();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessTransactionIDREF", theBusinessTransactionIDREF), currentHashCode, theBusinessTransactionIDREF, (this.businessTransactionIDREF!= null));
        }
        {
            boolean theIsConcurrent;
            theIsConcurrent = ((this.isConcurrent!= null)?this.isIsConcurrent():true);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isConcurrent", theIsConcurrent), currentHashCode, theIsConcurrent, (this.isConcurrent!= null));
        }
        {
            boolean theIsLegallyBinding;
            theIsLegallyBinding = ((this.isLegallyBinding!= null)?this.isIsLegallyBinding():true);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isLegallyBinding", theIsLegallyBinding), currentHashCode, theIsLegallyBinding, (this.isLegallyBinding!= null));
        }
        {
            Duration theTimeToPerform;
            theTimeToPerform = this.getTimeToPerform();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeToPerform", theTimeToPerform), currentHashCode, theTimeToPerform, (this.timeToPerform!= null));
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
        super.appendFields(locator, buffer, strategy);
        {
            List<Documentation> theDocumentation;
            theDocumentation = (((this.documentation!= null)&&(!this.documentation.isEmpty()))?this.getDocumentation():null);
            strategy.appendField(locator, this, "documentation", buffer, theDocumentation, ((this.documentation!= null)&&(!this.documentation.isEmpty())));
        }
        {
            String theBusinessTransaction;
            theBusinessTransaction = this.getBusinessTransaction();
            strategy.appendField(locator, this, "businessTransaction", buffer, theBusinessTransaction, (this.businessTransaction!= null));
        }
        {
            String theBusinessTransactionIDREF;
            theBusinessTransactionIDREF = this.getBusinessTransactionIDREF();
            strategy.appendField(locator, this, "businessTransactionIDREF", buffer, theBusinessTransactionIDREF, (this.businessTransactionIDREF!= null));
        }
        {
            boolean theIsConcurrent;
            theIsConcurrent = ((this.isConcurrent!= null)?this.isIsConcurrent():true);
            strategy.appendField(locator, this, "isConcurrent", buffer, theIsConcurrent, (this.isConcurrent!= null));
        }
        {
            boolean theIsLegallyBinding;
            theIsLegallyBinding = ((this.isLegallyBinding!= null)?this.isIsLegallyBinding():true);
            strategy.appendField(locator, this, "isLegallyBinding", buffer, theIsLegallyBinding, (this.isLegallyBinding!= null));
        }
        {
            Duration theTimeToPerform;
            theTimeToPerform = this.getTimeToPerform();
            strategy.appendField(locator, this, "timeToPerform", buffer, theTimeToPerform, (this.timeToPerform!= null));
        }
        return buffer;
    }

}
