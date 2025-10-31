
package io.dscope.ebxml.businessprocess.v01_01;

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
 *     &lt;extension base="{http://www.ebxml.org/BusinessProcess/1.01}BusinessAction"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}DocumentEnvelope"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="retryCount" type="{http://www.w3.org/2001/XMLSchema}int" /&gt;
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
@XmlRootElement(name = "RequestingBusinessActivity")
public class RequestingBusinessActivity
    extends BusinessAction
    implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "DocumentEnvelope", required = true)
    protected DocumentEnvelope documentEnvelope;
    @XmlAttribute(name = "retryCount")
    protected Integer retryCount;

    /**
     * Gets the value of the documentEnvelope property.
     * 
     * @return
     *     possible object is
     *     {@link DocumentEnvelope }
     *     
     */
    public DocumentEnvelope getDocumentEnvelope() {
        return documentEnvelope;
    }

    /**
     * Sets the value of the documentEnvelope property.
     * 
     * @param value
     *     allowed object is
     *     {@link DocumentEnvelope }
     *     
     */
    public void setDocumentEnvelope(DocumentEnvelope value) {
        this.documentEnvelope = value;
    }

    /**
     * Gets the value of the retryCount property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRetryCount() {
        return retryCount;
    }

    /**
     * Sets the value of the retryCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRetryCount(Integer value) {
        this.retryCount = value;
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
        final RequestingBusinessActivity that = ((RequestingBusinessActivity) object);
        {
            DocumentEnvelope lhsDocumentEnvelope;
            lhsDocumentEnvelope = this.getDocumentEnvelope();
            DocumentEnvelope rhsDocumentEnvelope;
            rhsDocumentEnvelope = that.getDocumentEnvelope();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "documentEnvelope", lhsDocumentEnvelope), LocatorUtils.property(thatLocator, "documentEnvelope", rhsDocumentEnvelope), lhsDocumentEnvelope, rhsDocumentEnvelope, (this.documentEnvelope!= null), (that.documentEnvelope!= null))) {
                return false;
            }
        }
        {
            Integer lhsRetryCount;
            lhsRetryCount = this.getRetryCount();
            Integer rhsRetryCount;
            rhsRetryCount = that.getRetryCount();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "retryCount", lhsRetryCount), LocatorUtils.property(thatLocator, "retryCount", rhsRetryCount), lhsRetryCount, rhsRetryCount, (this.retryCount!= null), (that.retryCount!= null))) {
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
            DocumentEnvelope theDocumentEnvelope;
            theDocumentEnvelope = this.getDocumentEnvelope();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "documentEnvelope", theDocumentEnvelope), currentHashCode, theDocumentEnvelope, (this.documentEnvelope!= null));
        }
        {
            Integer theRetryCount;
            theRetryCount = this.getRetryCount();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "retryCount", theRetryCount), currentHashCode, theRetryCount, (this.retryCount!= null));
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
            DocumentEnvelope theDocumentEnvelope;
            theDocumentEnvelope = this.getDocumentEnvelope();
            strategy.appendField(locator, this, "documentEnvelope", buffer, theDocumentEnvelope, (this.documentEnvelope!= null));
        }
        {
            Integer theRetryCount;
            theRetryCount = this.getRetryCount();
            strategy.appendField(locator, this, "retryCount", buffer, theRetryCount, (this.retryCount!= null));
        }
        return buffer;
    }

}
