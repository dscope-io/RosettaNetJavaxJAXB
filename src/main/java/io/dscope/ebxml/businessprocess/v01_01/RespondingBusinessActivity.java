
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
 *     &lt;extension base="{http://www.ebxml.org/BusinessProcess/1.01}BusinessAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}DocumentEnvelope" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "documentEnvelope"
})
@XmlRootElement(name = "RespondingBusinessActivity")
public class RespondingBusinessActivity
    extends BusinessAction
    implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "DocumentEnvelope")
    protected List<DocumentEnvelope> documentEnvelope;

    /**
     * Gets the value of the documentEnvelope property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the documentEnvelope property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocumentEnvelope().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentEnvelope }
     * 
     * 
     */
    public List<DocumentEnvelope> getDocumentEnvelope() {
        if (documentEnvelope == null) {
            documentEnvelope = new ArrayList<DocumentEnvelope>();
        }
        return this.documentEnvelope;
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
        final RespondingBusinessActivity that = ((RespondingBusinessActivity) object);
        {
            List<DocumentEnvelope> lhsDocumentEnvelope;
            lhsDocumentEnvelope = (((this.documentEnvelope!= null)&&(!this.documentEnvelope.isEmpty()))?this.getDocumentEnvelope():null);
            List<DocumentEnvelope> rhsDocumentEnvelope;
            rhsDocumentEnvelope = (((that.documentEnvelope!= null)&&(!that.documentEnvelope.isEmpty()))?that.getDocumentEnvelope():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentEnvelope", lhsDocumentEnvelope), LocatorUtils.property(thatLocator, "documentEnvelope", rhsDocumentEnvelope), lhsDocumentEnvelope, rhsDocumentEnvelope, ((this.documentEnvelope!= null)&&(!this.documentEnvelope.isEmpty())), ((that.documentEnvelope!= null)&&(!that.documentEnvelope.isEmpty())))) {
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
            List<DocumentEnvelope> theDocumentEnvelope;
            theDocumentEnvelope = (((this.documentEnvelope!= null)&&(!this.documentEnvelope.isEmpty()))?this.getDocumentEnvelope():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentEnvelope", theDocumentEnvelope), currentHashCode, theDocumentEnvelope, ((this.documentEnvelope!= null)&&(!this.documentEnvelope.isEmpty())));
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
            List<DocumentEnvelope> theDocumentEnvelope;
            theDocumentEnvelope = (((this.documentEnvelope!= null)&&(!this.documentEnvelope.isEmpty()))?this.getDocumentEnvelope():null);
            strategy.appendField(locator, this, "documentEnvelope", buffer, theDocumentEnvelope, ((this.documentEnvelope!= null)&&(!this.documentEnvelope.isEmpty())));
        }
        return buffer;
    }

}
