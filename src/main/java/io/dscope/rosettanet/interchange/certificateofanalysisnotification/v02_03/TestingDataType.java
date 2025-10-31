
package io.dscope.rosettanet.interchange.certificateofanalysisnotification.v02_03;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.interchange.codelist.phase.v01_00.Phase;
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
 * <p>Java class for TestingDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TestingDataType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:interchange:Phase:xsd:codelist:01.00}Phase" minOccurs="0"/&gt;
 *         &lt;element name="Repetition" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Sample" type="{urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.03}SampleType" minOccurs="0"/&gt;
 *         &lt;element name="SourceComponent" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/&gt;
 *         &lt;element name="SourceComponentDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="schemaVersion" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TestingDataType", propOrder = {
    "method",
    "phase",
    "repetition",
    "sample",
    "sourceComponent",
    "sourceComponentDescription"
})
public class TestingDataType implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Method")
    protected String method;
    @XmlElementRef(name = "Phase", namespace = "urn:rosettanet:specification:interchange:Phase:xsd:codelist:01.00", type = Phase.class, required = false)
    protected Phase phase;
    @XmlElement(name = "Repetition")
    protected String repetition;
    @XmlElement(name = "Sample")
    protected SampleType sample;
    @XmlElement(name = "SourceComponent")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sourceComponent;
    @XmlElement(name = "SourceComponentDescription")
    protected String sourceComponentDescription;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the method property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMethod() {
        return method;
    }

    /**
     * Sets the value of the method property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMethod(String value) {
        this.method = value;
    }

    /**
     * Gets the value of the phase property.
     * 
     * @return
     *     possible object is
     *     {@link Phase }
     *     
     */
    public Phase getPhase() {
        return phase;
    }

    /**
     * Sets the value of the phase property.
     * 
     * @param value
     *     allowed object is
     *     {@link Phase }
     *     
     */
    public void setPhase(Phase value) {
        this.phase = value;
    }

    /**
     * Gets the value of the repetition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRepetition() {
        return repetition;
    }

    /**
     * Sets the value of the repetition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRepetition(String value) {
        this.repetition = value;
    }

    /**
     * Gets the value of the sample property.
     * 
     * @return
     *     possible object is
     *     {@link SampleType }
     *     
     */
    public SampleType getSample() {
        return sample;
    }

    /**
     * Sets the value of the sample property.
     * 
     * @param value
     *     allowed object is
     *     {@link SampleType }
     *     
     */
    public void setSample(SampleType value) {
        this.sample = value;
    }

    /**
     * Gets the value of the sourceComponent property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSourceComponent() {
        return sourceComponent;
    }

    /**
     * Sets the value of the sourceComponent property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSourceComponent(BigInteger value) {
        this.sourceComponent = value;
    }

    /**
     * Gets the value of the sourceComponentDescription property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceComponentDescription() {
        return sourceComponentDescription;
    }

    /**
     * Sets the value of the sourceComponentDescription property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceComponentDescription(String value) {
        this.sourceComponentDescription = value;
    }

    /**
     * Gets the value of the schemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Sets the value of the schemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

    public boolean equals(ObjectLocator thisLocator, ObjectLocator thatLocator, Object object, EqualsStrategy2 strategy) {
        if ((object == null)||(this.getClass()!= object.getClass())) {
            return false;
        }
        if (this == object) {
            return true;
        }
        final TestingDataType that = ((TestingDataType) object);
        {
            String lhsMethod;
            lhsMethod = this.getMethod();
            String rhsMethod;
            rhsMethod = that.getMethod();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "method", lhsMethod), LocatorUtils.property(thatLocator, "method", rhsMethod), lhsMethod, rhsMethod, (this.method!= null), (that.method!= null))) {
                return false;
            }
        }
        {
            Phase lhsPhase;
            lhsPhase = this.getPhase();
            Phase rhsPhase;
            rhsPhase = that.getPhase();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "phase", lhsPhase), LocatorUtils.property(thatLocator, "phase", rhsPhase), lhsPhase, rhsPhase, (this.phase!= null), (that.phase!= null))) {
                return false;
            }
        }
        {
            String lhsRepetition;
            lhsRepetition = this.getRepetition();
            String rhsRepetition;
            rhsRepetition = that.getRepetition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "repetition", lhsRepetition), LocatorUtils.property(thatLocator, "repetition", rhsRepetition), lhsRepetition, rhsRepetition, (this.repetition!= null), (that.repetition!= null))) {
                return false;
            }
        }
        {
            SampleType lhsSample;
            lhsSample = this.getSample();
            SampleType rhsSample;
            rhsSample = that.getSample();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sample", lhsSample), LocatorUtils.property(thatLocator, "sample", rhsSample), lhsSample, rhsSample, (this.sample!= null), (that.sample!= null))) {
                return false;
            }
        }
        {
            BigInteger lhsSourceComponent;
            lhsSourceComponent = this.getSourceComponent();
            BigInteger rhsSourceComponent;
            rhsSourceComponent = that.getSourceComponent();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceComponent", lhsSourceComponent), LocatorUtils.property(thatLocator, "sourceComponent", rhsSourceComponent), lhsSourceComponent, rhsSourceComponent, (this.sourceComponent!= null), (that.sourceComponent!= null))) {
                return false;
            }
        }
        {
            String lhsSourceComponentDescription;
            lhsSourceComponentDescription = this.getSourceComponentDescription();
            String rhsSourceComponentDescription;
            rhsSourceComponentDescription = that.getSourceComponentDescription();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "sourceComponentDescription", lhsSourceComponentDescription), LocatorUtils.property(thatLocator, "sourceComponentDescription", rhsSourceComponentDescription), lhsSourceComponentDescription, rhsSourceComponentDescription, (this.sourceComponentDescription!= null), (that.sourceComponentDescription!= null))) {
                return false;
            }
        }
        {
            String lhsSchemaVersion;
            lhsSchemaVersion = this.getSchemaVersion();
            String rhsSchemaVersion;
            rhsSchemaVersion = that.getSchemaVersion();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "schemaVersion", lhsSchemaVersion), LocatorUtils.property(thatLocator, "schemaVersion", rhsSchemaVersion), lhsSchemaVersion, rhsSchemaVersion, (this.schemaVersion!= null), (that.schemaVersion!= null))) {
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
            String theMethod;
            theMethod = this.getMethod();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "method", theMethod), currentHashCode, theMethod, (this.method!= null));
        }
        {
            Phase thePhase;
            thePhase = this.getPhase();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "phase", thePhase), currentHashCode, thePhase, (this.phase!= null));
        }
        {
            String theRepetition;
            theRepetition = this.getRepetition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "repetition", theRepetition), currentHashCode, theRepetition, (this.repetition!= null));
        }
        {
            SampleType theSample;
            theSample = this.getSample();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sample", theSample), currentHashCode, theSample, (this.sample!= null));
        }
        {
            BigInteger theSourceComponent;
            theSourceComponent = this.getSourceComponent();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceComponent", theSourceComponent), currentHashCode, theSourceComponent, (this.sourceComponent!= null));
        }
        {
            String theSourceComponentDescription;
            theSourceComponentDescription = this.getSourceComponentDescription();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "sourceComponentDescription", theSourceComponentDescription), currentHashCode, theSourceComponentDescription, (this.sourceComponentDescription!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "schemaVersion", theSchemaVersion), currentHashCode, theSchemaVersion, (this.schemaVersion!= null));
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
            String theMethod;
            theMethod = this.getMethod();
            strategy.appendField(locator, this, "method", buffer, theMethod, (this.method!= null));
        }
        {
            Phase thePhase;
            thePhase = this.getPhase();
            strategy.appendField(locator, this, "phase", buffer, thePhase, (this.phase!= null));
        }
        {
            String theRepetition;
            theRepetition = this.getRepetition();
            strategy.appendField(locator, this, "repetition", buffer, theRepetition, (this.repetition!= null));
        }
        {
            SampleType theSample;
            theSample = this.getSample();
            strategy.appendField(locator, this, "sample", buffer, theSample, (this.sample!= null));
        }
        {
            BigInteger theSourceComponent;
            theSourceComponent = this.getSourceComponent();
            strategy.appendField(locator, this, "sourceComponent", buffer, theSourceComponent, (this.sourceComponent!= null));
        }
        {
            String theSourceComponentDescription;
            theSourceComponentDescription = this.getSourceComponentDescription();
            strategy.appendField(locator, this, "sourceComponentDescription", buffer, theSourceComponentDescription, (this.sourceComponentDescription!= null));
        }
        {
            String theSchemaVersion;
            theSchemaVersion = this.getSchemaVersion();
            strategy.appendField(locator, this, "schemaVersion", buffer, theSchemaVersion, (this.schemaVersion!= null));
        }
        return buffer;
    }

}
