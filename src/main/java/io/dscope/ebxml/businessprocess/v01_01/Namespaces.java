
package io.dscope.ebxml.businessprocess.v01_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Namespace" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "namespace"
})
@XmlRootElement(name = "Namespaces")
public class Namespaces implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Namespace", required = true)
    protected List<Namespace> namespace;

    /**
     * Gets the value of the namespace property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namespace property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamespace().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Namespace }
     * 
     * 
     */
    public List<Namespace> getNamespace() {
        if (namespace == null) {
            namespace = new ArrayList<Namespace>();
        }
        return this.namespace;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final Namespaces that = ((Namespaces) object);
        {
            List<Namespace> lhsNamespace;
            lhsNamespace = (((this.namespace!= null)&&(!this.namespace.isEmpty()))?this.getNamespace():null);
            List<Namespace> rhsNamespace;
            rhsNamespace = (((that.namespace!= null)&&(!that.namespace.isEmpty()))?that.getNamespace():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "namespace", lhsNamespace), LocatorUtils.property(thatLocator, "namespace", rhsNamespace), lhsNamespace, rhsNamespace, ((this.namespace!= null)&&(!this.namespace.isEmpty())), ((that.namespace!= null)&&(!that.namespace.isEmpty())))) {
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
            List<Namespace> theNamespace;
            theNamespace = (((this.namespace!= null)&&(!this.namespace.isEmpty()))?this.getNamespace():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "namespace", theNamespace), currentHashCode, theNamespace, ((this.namespace!= null)&&(!this.namespace.isEmpty())));
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
            List<Namespace> theNamespace;
            theNamespace = (((this.namespace!= null)&&(!this.namespace.isEmpty()))?this.getNamespace():null);
            strategy.appendField(locator, this, "namespace", buffer, theNamespace, ((this.namespace!= null)&&(!this.namespace.isEmpty())));
        }
        return buffer;
    }

}
