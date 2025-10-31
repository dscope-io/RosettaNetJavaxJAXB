
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
 *     &lt;extension base="{http://www.ebxml.org/BusinessProcess/1.01}BusinessActivity"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Documentation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="binaryCollaboration" use="required" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="binaryCollaborationIDREF" type="{http://www.ebxml.org/BusinessProcess/1.01}GUIDREF" /&gt;
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
@XmlRootElement(name = "CollaborationActivity")
public class CollaborationActivity
    extends BusinessActivity
    implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Documentation")
    protected List<Documentation> documentation;
    @XmlAttribute(name = "binaryCollaboration", required = true)
    protected String binaryCollaboration;
    @XmlAttribute(name = "binaryCollaborationIDREF")
    protected String binaryCollaborationIDREF;

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
     * Gets the value of the binaryCollaboration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaryCollaboration() {
        return binaryCollaboration;
    }

    /**
     * Sets the value of the binaryCollaboration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaryCollaboration(String value) {
        this.binaryCollaboration = value;
    }

    /**
     * Gets the value of the binaryCollaborationIDREF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBinaryCollaborationIDREF() {
        return binaryCollaborationIDREF;
    }

    /**
     * Sets the value of the binaryCollaborationIDREF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBinaryCollaborationIDREF(String value) {
        this.binaryCollaborationIDREF = value;
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
        final CollaborationActivity that = ((CollaborationActivity) object);
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
            String lhsBinaryCollaboration;
            lhsBinaryCollaboration = this.getBinaryCollaboration();
            String rhsBinaryCollaboration;
            rhsBinaryCollaboration = that.getBinaryCollaboration();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "binaryCollaboration", lhsBinaryCollaboration), LocatorUtils.property(thatLocator, "binaryCollaboration", rhsBinaryCollaboration), lhsBinaryCollaboration, rhsBinaryCollaboration, (this.binaryCollaboration!= null), (that.binaryCollaboration!= null))) {
                return false;
            }
        }
        {
            String lhsBinaryCollaborationIDREF;
            lhsBinaryCollaborationIDREF = this.getBinaryCollaborationIDREF();
            String rhsBinaryCollaborationIDREF;
            rhsBinaryCollaborationIDREF = that.getBinaryCollaborationIDREF();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "binaryCollaborationIDREF", lhsBinaryCollaborationIDREF), LocatorUtils.property(thatLocator, "binaryCollaborationIDREF", rhsBinaryCollaborationIDREF), lhsBinaryCollaborationIDREF, rhsBinaryCollaborationIDREF, (this.binaryCollaborationIDREF!= null), (that.binaryCollaborationIDREF!= null))) {
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
            String theBinaryCollaboration;
            theBinaryCollaboration = this.getBinaryCollaboration();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "binaryCollaboration", theBinaryCollaboration), currentHashCode, theBinaryCollaboration, (this.binaryCollaboration!= null));
        }
        {
            String theBinaryCollaborationIDREF;
            theBinaryCollaborationIDREF = this.getBinaryCollaborationIDREF();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "binaryCollaborationIDREF", theBinaryCollaborationIDREF), currentHashCode, theBinaryCollaborationIDREF, (this.binaryCollaborationIDREF!= null));
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
            String theBinaryCollaboration;
            theBinaryCollaboration = this.getBinaryCollaboration();
            strategy.appendField(locator, this, "binaryCollaboration", buffer, theBinaryCollaboration, (this.binaryCollaboration!= null));
        }
        {
            String theBinaryCollaborationIDREF;
            theBinaryCollaborationIDREF = this.getBinaryCollaborationIDREF();
            strategy.appendField(locator, this, "binaryCollaborationIDREF", buffer, theBinaryCollaborationIDREF, (this.binaryCollaborationIDREF!= null));
        }
        return buffer;
    }

}
