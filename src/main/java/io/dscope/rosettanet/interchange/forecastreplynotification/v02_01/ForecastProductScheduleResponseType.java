
package io.dscope.rosettanet.interchange.forecastreplynotification.v02_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.domain.procurement.codelist.response.v01_03.Response;
import io.dscope.rosettanet.domain.procurement.codelist.revisionreason.v01_03.RevisionReason;
import io.dscope.rosettanet.domain.procurement.procurement.v02_19.ForecastProductScheduleType;
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
 * <p>Java class for ForecastProductScheduleResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ForecastProductScheduleResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:domain:Procurement:xsd:schema:02.19}ForecastProductScheduleType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:Response:xsd:codelist:01.03}Response"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:domain:Procurement:RevisionReason:xsd:codelist:01.03}RevisionReason" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ForecastProductScheduleResponseType", propOrder = {
    "response",
    "revisionReason"
})
public class ForecastProductScheduleResponseType
    extends ForecastProductScheduleType
    implements Equals2, HashCode2, ToString2
{

    @XmlElementRef(name = "Response", namespace = "urn:rosettanet:specification:domain:Procurement:Response:xsd:codelist:01.03", type = Response.class)
    protected Response response;
    @XmlElementRef(name = "RevisionReason", namespace = "urn:rosettanet:specification:domain:Procurement:RevisionReason:xsd:codelist:01.03", type = RevisionReason.class, required = false)
    protected List<RevisionReason> revisionReason;

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setResponse(Response value) {
        this.response = value;
    }

    /**
     * Gets the value of the revisionReason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the revisionReason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRevisionReason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RevisionReason }
     * 
     * 
     */
    public List<RevisionReason> getRevisionReason() {
        if (revisionReason == null) {
            revisionReason = new ArrayList<RevisionReason>();
        }
        return this.revisionReason;
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
        final ForecastProductScheduleResponseType that = ((ForecastProductScheduleResponseType) object);
        {
            Response lhsResponse;
            lhsResponse = this.getResponse();
            Response rhsResponse;
            rhsResponse = that.getResponse();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "response", lhsResponse), LocatorUtils.property(thatLocator, "response", rhsResponse), lhsResponse, rhsResponse, (this.response!= null), (that.response!= null))) {
                return false;
            }
        }
        {
            List<RevisionReason> lhsRevisionReason;
            lhsRevisionReason = (((this.revisionReason!= null)&&(!this.revisionReason.isEmpty()))?this.getRevisionReason():null);
            List<RevisionReason> rhsRevisionReason;
            rhsRevisionReason = (((that.revisionReason!= null)&&(!that.revisionReason.isEmpty()))?that.getRevisionReason():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "revisionReason", lhsRevisionReason), LocatorUtils.property(thatLocator, "revisionReason", rhsRevisionReason), lhsRevisionReason, rhsRevisionReason, ((this.revisionReason!= null)&&(!this.revisionReason.isEmpty())), ((that.revisionReason!= null)&&(!that.revisionReason.isEmpty())))) {
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
            Response theResponse;
            theResponse = this.getResponse();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "response", theResponse), currentHashCode, theResponse, (this.response!= null));
        }
        {
            List<RevisionReason> theRevisionReason;
            theRevisionReason = (((this.revisionReason!= null)&&(!this.revisionReason.isEmpty()))?this.getRevisionReason():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "revisionReason", theRevisionReason), currentHashCode, theRevisionReason, ((this.revisionReason!= null)&&(!this.revisionReason.isEmpty())));
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
            Response theResponse;
            theResponse = this.getResponse();
            strategy.appendField(locator, this, "response", buffer, theResponse, (this.response!= null));
        }
        {
            List<RevisionReason> theRevisionReason;
            theRevisionReason = (((this.revisionReason!= null)&&(!this.revisionReason.isEmpty()))?this.getRevisionReason():null);
            strategy.appendField(locator, this, "revisionReason", buffer, theRevisionReason, ((this.revisionReason!= null)&&(!this.revisionReason.isEmpty())));
        }
        return buffer;
    }

}
