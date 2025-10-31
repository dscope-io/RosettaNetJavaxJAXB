
package io.dscope.ebxml.businessprocess.v01_01;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Documentation" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="Role" type="{http://www.ebxml.org/BusinessProcess/1.01}RoleType" maxOccurs="2" minOccurs="2"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Start"/&gt;
 *         &lt;choice maxOccurs="unbounded"&gt;
 *           &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}BusinessTransactionActivity"/&gt;
 *           &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}CollaborationActivity"/&gt;
 *         &lt;/choice&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Success" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Failure" maxOccurs="unbounded"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Transition" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Fork" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Join" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element ref="{http://www.ebxml.org/BusinessProcess/1.01}Decision" maxOccurs="unbounded" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attGroup ref="{http://www.ebxml.org/BusinessProcess/1.01}name"/&gt;
 *       &lt;attribute name="pattern" type="{http://www.w3.org/2001/XMLSchema}anyURI" /&gt;
 *       &lt;attribute name="beginsWhen" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="endsWhen" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="preCondition" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="postCondition" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="timeToPerform" type="{http://www.w3.org/2001/XMLSchema}duration" /&gt;
 *       &lt;attribute name="initiatingRoleIDREF" type="{http://www.ebxml.org/BusinessProcess/1.01}GUIDREF" /&gt;
 *       &lt;attribute name="isInnerCollaboration" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" /&gt;
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
    "role",
    "start",
    "businessTransactionActivityOrCollaborationActivity",
    "success",
    "failure",
    "transition",
    "fork",
    "join",
    "decision"
})
@XmlRootElement(name = "BinaryCollaboration")
public class BinaryCollaboration implements Equals2, HashCode2, ToString2
{

    @XmlElement(name = "Documentation")
    protected List<Documentation> documentation;
    @XmlElement(name = "Role", required = true)
    protected List<RoleType> role;
    @XmlElement(name = "Start", required = true)
    protected Start start;
    @XmlElements({
        @XmlElement(name = "BusinessTransactionActivity", type = BusinessTransactionActivity.class),
        @XmlElement(name = "CollaborationActivity", type = CollaborationActivity.class)
    })
    protected List<BusinessActivity> businessTransactionActivityOrCollaborationActivity;
    @XmlElement(name = "Success", required = true)
    protected List<Success> success;
    @XmlElement(name = "Failure", required = true)
    protected List<Failure> failure;
    @XmlElement(name = "Transition")
    protected List<Transition> transition;
    @XmlElement(name = "Fork")
    protected List<Fork> fork;
    @XmlElement(name = "Join")
    protected List<Join> join;
    @XmlElement(name = "Decision")
    protected List<Decision> decision;
    @XmlAttribute(name = "pattern")
    @XmlSchemaType(name = "anyURI")
    protected String pattern;
    @XmlAttribute(name = "beginsWhen")
    protected String beginsWhen;
    @XmlAttribute(name = "endsWhen")
    protected String endsWhen;
    @XmlAttribute(name = "preCondition")
    protected String preCondition;
    @XmlAttribute(name = "postCondition")
    protected String postCondition;
    @XmlAttribute(name = "timeToPerform")
    protected Duration timeToPerform;
    @XmlAttribute(name = "initiatingRoleIDREF")
    protected String initiatingRoleIDREF;
    @XmlAttribute(name = "isInnerCollaboration")
    protected Boolean isInnerCollaboration;
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
     * Gets the value of the role property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the role property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRole().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoleType }
     * 
     * 
     */
    public List<RoleType> getRole() {
        if (role == null) {
            role = new ArrayList<RoleType>();
        }
        return this.role;
    }

    /**
     * Gets the value of the start property.
     * 
     * @return
     *     possible object is
     *     {@link Start }
     *     
     */
    public Start getStart() {
        return start;
    }

    /**
     * Sets the value of the start property.
     * 
     * @param value
     *     allowed object is
     *     {@link Start }
     *     
     */
    public void setStart(Start value) {
        this.start = value;
    }

    /**
     * Gets the value of the businessTransactionActivityOrCollaborationActivity property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the businessTransactionActivityOrCollaborationActivity property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBusinessTransactionActivityOrCollaborationActivity().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BusinessTransactionActivity }
     * {@link CollaborationActivity }
     * 
     * 
     */
    public List<BusinessActivity> getBusinessTransactionActivityOrCollaborationActivity() {
        if (businessTransactionActivityOrCollaborationActivity == null) {
            businessTransactionActivityOrCollaborationActivity = new ArrayList<BusinessActivity>();
        }
        return this.businessTransactionActivityOrCollaborationActivity;
    }

    /**
     * Gets the value of the success property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the success property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSuccess().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Success }
     * 
     * 
     */
    public List<Success> getSuccess() {
        if (success == null) {
            success = new ArrayList<Success>();
        }
        return this.success;
    }

    /**
     * Gets the value of the failure property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the failure property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFailure().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Failure }
     * 
     * 
     */
    public List<Failure> getFailure() {
        if (failure == null) {
            failure = new ArrayList<Failure>();
        }
        return this.failure;
    }

    /**
     * Gets the value of the transition property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transition property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransition().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Transition }
     * 
     * 
     */
    public List<Transition> getTransition() {
        if (transition == null) {
            transition = new ArrayList<Transition>();
        }
        return this.transition;
    }

    /**
     * Gets the value of the fork property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fork property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFork().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Fork }
     * 
     * 
     */
    public List<Fork> getFork() {
        if (fork == null) {
            fork = new ArrayList<Fork>();
        }
        return this.fork;
    }

    /**
     * Gets the value of the join property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the join property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJoin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Join }
     * 
     * 
     */
    public List<Join> getJoin() {
        if (join == null) {
            join = new ArrayList<Join>();
        }
        return this.join;
    }

    /**
     * Gets the value of the decision property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the decision property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDecision().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Decision }
     * 
     * 
     */
    public List<Decision> getDecision() {
        if (decision == null) {
            decision = new ArrayList<Decision>();
        }
        return this.decision;
    }

    /**
     * Gets the value of the pattern property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPattern() {
        return pattern;
    }

    /**
     * Sets the value of the pattern property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPattern(String value) {
        this.pattern = value;
    }

    /**
     * Gets the value of the beginsWhen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginsWhen() {
        return beginsWhen;
    }

    /**
     * Sets the value of the beginsWhen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginsWhen(String value) {
        this.beginsWhen = value;
    }

    /**
     * Gets the value of the endsWhen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndsWhen() {
        return endsWhen;
    }

    /**
     * Sets the value of the endsWhen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndsWhen(String value) {
        this.endsWhen = value;
    }

    /**
     * Gets the value of the preCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPreCondition() {
        return preCondition;
    }

    /**
     * Sets the value of the preCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPreCondition(String value) {
        this.preCondition = value;
    }

    /**
     * Gets the value of the postCondition property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPostCondition() {
        return postCondition;
    }

    /**
     * Sets the value of the postCondition property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPostCondition(String value) {
        this.postCondition = value;
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

    /**
     * Gets the value of the initiatingRoleIDREF property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInitiatingRoleIDREF() {
        return initiatingRoleIDREF;
    }

    /**
     * Sets the value of the initiatingRoleIDREF property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInitiatingRoleIDREF(String value) {
        this.initiatingRoleIDREF = value;
    }

    /**
     * Gets the value of the isInnerCollaboration property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsInnerCollaboration() {
        if (isInnerCollaboration == null) {
            return false;
        } else {
            return isInnerCollaboration;
        }
    }

    /**
     * Sets the value of the isInnerCollaboration property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsInnerCollaboration(Boolean value) {
        this.isInnerCollaboration = value;
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
        final BinaryCollaboration that = ((BinaryCollaboration) object);
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
            List<RoleType> lhsRole;
            lhsRole = (((this.role!= null)&&(!this.role.isEmpty()))?this.getRole():null);
            List<RoleType> rhsRole;
            rhsRole = (((that.role!= null)&&(!that.role.isEmpty()))?that.getRole():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "role", lhsRole), LocatorUtils.property(thatLocator, "role", rhsRole), lhsRole, rhsRole, ((this.role!= null)&&(!this.role.isEmpty())), ((that.role!= null)&&(!that.role.isEmpty())))) {
                return false;
            }
        }
        {
            Start lhsStart;
            lhsStart = this.getStart();
            Start rhsStart;
            rhsStart = that.getStart();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "start", lhsStart), LocatorUtils.property(thatLocator, "start", rhsStart), lhsStart, rhsStart, (this.start!= null), (that.start!= null))) {
                return false;
            }
        }
        {
            List<BusinessActivity> lhsBusinessTransactionActivityOrCollaborationActivity;
            lhsBusinessTransactionActivityOrCollaborationActivity = (((this.businessTransactionActivityOrCollaborationActivity!= null)&&(!this.businessTransactionActivityOrCollaborationActivity.isEmpty()))?this.getBusinessTransactionActivityOrCollaborationActivity():null);
            List<BusinessActivity> rhsBusinessTransactionActivityOrCollaborationActivity;
            rhsBusinessTransactionActivityOrCollaborationActivity = (((that.businessTransactionActivityOrCollaborationActivity!= null)&&(!that.businessTransactionActivityOrCollaborationActivity.isEmpty()))?that.getBusinessTransactionActivityOrCollaborationActivity():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "businessTransactionActivityOrCollaborationActivity", lhsBusinessTransactionActivityOrCollaborationActivity), LocatorUtils.property(thatLocator, "businessTransactionActivityOrCollaborationActivity", rhsBusinessTransactionActivityOrCollaborationActivity), lhsBusinessTransactionActivityOrCollaborationActivity, rhsBusinessTransactionActivityOrCollaborationActivity, ((this.businessTransactionActivityOrCollaborationActivity!= null)&&(!this.businessTransactionActivityOrCollaborationActivity.isEmpty())), ((that.businessTransactionActivityOrCollaborationActivity!= null)&&(!that.businessTransactionActivityOrCollaborationActivity.isEmpty())))) {
                return false;
            }
        }
        {
            List<Success> lhsSuccess;
            lhsSuccess = (((this.success!= null)&&(!this.success.isEmpty()))?this.getSuccess():null);
            List<Success> rhsSuccess;
            rhsSuccess = (((that.success!= null)&&(!that.success.isEmpty()))?that.getSuccess():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "success", lhsSuccess), LocatorUtils.property(thatLocator, "success", rhsSuccess), lhsSuccess, rhsSuccess, ((this.success!= null)&&(!this.success.isEmpty())), ((that.success!= null)&&(!that.success.isEmpty())))) {
                return false;
            }
        }
        {
            List<Failure> lhsFailure;
            lhsFailure = (((this.failure!= null)&&(!this.failure.isEmpty()))?this.getFailure():null);
            List<Failure> rhsFailure;
            rhsFailure = (((that.failure!= null)&&(!that.failure.isEmpty()))?that.getFailure():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "failure", lhsFailure), LocatorUtils.property(thatLocator, "failure", rhsFailure), lhsFailure, rhsFailure, ((this.failure!= null)&&(!this.failure.isEmpty())), ((that.failure!= null)&&(!that.failure.isEmpty())))) {
                return false;
            }
        }
        {
            List<Transition> lhsTransition;
            lhsTransition = (((this.transition!= null)&&(!this.transition.isEmpty()))?this.getTransition():null);
            List<Transition> rhsTransition;
            rhsTransition = (((that.transition!= null)&&(!that.transition.isEmpty()))?that.getTransition():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "transition", lhsTransition), LocatorUtils.property(thatLocator, "transition", rhsTransition), lhsTransition, rhsTransition, ((this.transition!= null)&&(!this.transition.isEmpty())), ((that.transition!= null)&&(!that.transition.isEmpty())))) {
                return false;
            }
        }
        {
            List<Fork> lhsFork;
            lhsFork = (((this.fork!= null)&&(!this.fork.isEmpty()))?this.getFork():null);
            List<Fork> rhsFork;
            rhsFork = (((that.fork!= null)&&(!that.fork.isEmpty()))?that.getFork():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "fork", lhsFork), LocatorUtils.property(thatLocator, "fork", rhsFork), lhsFork, rhsFork, ((this.fork!= null)&&(!this.fork.isEmpty())), ((that.fork!= null)&&(!that.fork.isEmpty())))) {
                return false;
            }
        }
        {
            List<Join> lhsJoin;
            lhsJoin = (((this.join!= null)&&(!this.join.isEmpty()))?this.getJoin():null);
            List<Join> rhsJoin;
            rhsJoin = (((that.join!= null)&&(!that.join.isEmpty()))?that.getJoin():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "join", lhsJoin), LocatorUtils.property(thatLocator, "join", rhsJoin), lhsJoin, rhsJoin, ((this.join!= null)&&(!this.join.isEmpty())), ((that.join!= null)&&(!that.join.isEmpty())))) {
                return false;
            }
        }
        {
            List<Decision> lhsDecision;
            lhsDecision = (((this.decision!= null)&&(!this.decision.isEmpty()))?this.getDecision():null);
            List<Decision> rhsDecision;
            rhsDecision = (((that.decision!= null)&&(!that.decision.isEmpty()))?that.getDecision():null);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "decision", lhsDecision), LocatorUtils.property(thatLocator, "decision", rhsDecision), lhsDecision, rhsDecision, ((this.decision!= null)&&(!this.decision.isEmpty())), ((that.decision!= null)&&(!that.decision.isEmpty())))) {
                return false;
            }
        }
        {
            String lhsPattern;
            lhsPattern = this.getPattern();
            String rhsPattern;
            rhsPattern = that.getPattern();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "pattern", lhsPattern), LocatorUtils.property(thatLocator, "pattern", rhsPattern), lhsPattern, rhsPattern, (this.pattern!= null), (that.pattern!= null))) {
                return false;
            }
        }
        {
            String lhsBeginsWhen;
            lhsBeginsWhen = this.getBeginsWhen();
            String rhsBeginsWhen;
            rhsBeginsWhen = that.getBeginsWhen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "beginsWhen", lhsBeginsWhen), LocatorUtils.property(thatLocator, "beginsWhen", rhsBeginsWhen), lhsBeginsWhen, rhsBeginsWhen, (this.beginsWhen!= null), (that.beginsWhen!= null))) {
                return false;
            }
        }
        {
            String lhsEndsWhen;
            lhsEndsWhen = this.getEndsWhen();
            String rhsEndsWhen;
            rhsEndsWhen = that.getEndsWhen();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "endsWhen", lhsEndsWhen), LocatorUtils.property(thatLocator, "endsWhen", rhsEndsWhen), lhsEndsWhen, rhsEndsWhen, (this.endsWhen!= null), (that.endsWhen!= null))) {
                return false;
            }
        }
        {
            String lhsPreCondition;
            lhsPreCondition = this.getPreCondition();
            String rhsPreCondition;
            rhsPreCondition = that.getPreCondition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "preCondition", lhsPreCondition), LocatorUtils.property(thatLocator, "preCondition", rhsPreCondition), lhsPreCondition, rhsPreCondition, (this.preCondition!= null), (that.preCondition!= null))) {
                return false;
            }
        }
        {
            String lhsPostCondition;
            lhsPostCondition = this.getPostCondition();
            String rhsPostCondition;
            rhsPostCondition = that.getPostCondition();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "postCondition", lhsPostCondition), LocatorUtils.property(thatLocator, "postCondition", rhsPostCondition), lhsPostCondition, rhsPostCondition, (this.postCondition!= null), (that.postCondition!= null))) {
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
        {
            String lhsInitiatingRoleIDREF;
            lhsInitiatingRoleIDREF = this.getInitiatingRoleIDREF();
            String rhsInitiatingRoleIDREF;
            rhsInitiatingRoleIDREF = that.getInitiatingRoleIDREF();
            if (!strategy.equals(LocatorUtils.property(thisLocator, "initiatingRoleIDREF", lhsInitiatingRoleIDREF), LocatorUtils.property(thatLocator, "initiatingRoleIDREF", rhsInitiatingRoleIDREF), lhsInitiatingRoleIDREF, rhsInitiatingRoleIDREF, (this.initiatingRoleIDREF!= null), (that.initiatingRoleIDREF!= null))) {
                return false;
            }
        }
        {
            boolean lhsIsInnerCollaboration;
            lhsIsInnerCollaboration = ((this.isInnerCollaboration!= null)?this.isIsInnerCollaboration():false);
            boolean rhsIsInnerCollaboration;
            rhsIsInnerCollaboration = ((that.isInnerCollaboration!= null)?that.isIsInnerCollaboration():false);
            if (!strategy.equals(LocatorUtils.property(thisLocator, "isInnerCollaboration", lhsIsInnerCollaboration), LocatorUtils.property(thatLocator, "isInnerCollaboration", rhsIsInnerCollaboration), lhsIsInnerCollaboration, rhsIsInnerCollaboration, (this.isInnerCollaboration!= null), (that.isInnerCollaboration!= null))) {
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
            List<RoleType> theRole;
            theRole = (((this.role!= null)&&(!this.role.isEmpty()))?this.getRole():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "role", theRole), currentHashCode, theRole, ((this.role!= null)&&(!this.role.isEmpty())));
        }
        {
            Start theStart;
            theStart = this.getStart();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "start", theStart), currentHashCode, theStart, (this.start!= null));
        }
        {
            List<BusinessActivity> theBusinessTransactionActivityOrCollaborationActivity;
            theBusinessTransactionActivityOrCollaborationActivity = (((this.businessTransactionActivityOrCollaborationActivity!= null)&&(!this.businessTransactionActivityOrCollaborationActivity.isEmpty()))?this.getBusinessTransactionActivityOrCollaborationActivity():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "businessTransactionActivityOrCollaborationActivity", theBusinessTransactionActivityOrCollaborationActivity), currentHashCode, theBusinessTransactionActivityOrCollaborationActivity, ((this.businessTransactionActivityOrCollaborationActivity!= null)&&(!this.businessTransactionActivityOrCollaborationActivity.isEmpty())));
        }
        {
            List<Success> theSuccess;
            theSuccess = (((this.success!= null)&&(!this.success.isEmpty()))?this.getSuccess():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "success", theSuccess), currentHashCode, theSuccess, ((this.success!= null)&&(!this.success.isEmpty())));
        }
        {
            List<Failure> theFailure;
            theFailure = (((this.failure!= null)&&(!this.failure.isEmpty()))?this.getFailure():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "failure", theFailure), currentHashCode, theFailure, ((this.failure!= null)&&(!this.failure.isEmpty())));
        }
        {
            List<Transition> theTransition;
            theTransition = (((this.transition!= null)&&(!this.transition.isEmpty()))?this.getTransition():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "transition", theTransition), currentHashCode, theTransition, ((this.transition!= null)&&(!this.transition.isEmpty())));
        }
        {
            List<Fork> theFork;
            theFork = (((this.fork!= null)&&(!this.fork.isEmpty()))?this.getFork():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "fork", theFork), currentHashCode, theFork, ((this.fork!= null)&&(!this.fork.isEmpty())));
        }
        {
            List<Join> theJoin;
            theJoin = (((this.join!= null)&&(!this.join.isEmpty()))?this.getJoin():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "join", theJoin), currentHashCode, theJoin, ((this.join!= null)&&(!this.join.isEmpty())));
        }
        {
            List<Decision> theDecision;
            theDecision = (((this.decision!= null)&&(!this.decision.isEmpty()))?this.getDecision():null);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "decision", theDecision), currentHashCode, theDecision, ((this.decision!= null)&&(!this.decision.isEmpty())));
        }
        {
            String thePattern;
            thePattern = this.getPattern();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "pattern", thePattern), currentHashCode, thePattern, (this.pattern!= null));
        }
        {
            String theBeginsWhen;
            theBeginsWhen = this.getBeginsWhen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "beginsWhen", theBeginsWhen), currentHashCode, theBeginsWhen, (this.beginsWhen!= null));
        }
        {
            String theEndsWhen;
            theEndsWhen = this.getEndsWhen();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "endsWhen", theEndsWhen), currentHashCode, theEndsWhen, (this.endsWhen!= null));
        }
        {
            String thePreCondition;
            thePreCondition = this.getPreCondition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "preCondition", thePreCondition), currentHashCode, thePreCondition, (this.preCondition!= null));
        }
        {
            String thePostCondition;
            thePostCondition = this.getPostCondition();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "postCondition", thePostCondition), currentHashCode, thePostCondition, (this.postCondition!= null));
        }
        {
            Duration theTimeToPerform;
            theTimeToPerform = this.getTimeToPerform();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "timeToPerform", theTimeToPerform), currentHashCode, theTimeToPerform, (this.timeToPerform!= null));
        }
        {
            String theInitiatingRoleIDREF;
            theInitiatingRoleIDREF = this.getInitiatingRoleIDREF();
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "initiatingRoleIDREF", theInitiatingRoleIDREF), currentHashCode, theInitiatingRoleIDREF, (this.initiatingRoleIDREF!= null));
        }
        {
            boolean theIsInnerCollaboration;
            theIsInnerCollaboration = ((this.isInnerCollaboration!= null)?this.isIsInnerCollaboration():false);
            currentHashCode = strategy.hashCode(LocatorUtils.property(locator, "isInnerCollaboration", theIsInnerCollaboration), currentHashCode, theIsInnerCollaboration, (this.isInnerCollaboration!= null));
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
            List<RoleType> theRole;
            theRole = (((this.role!= null)&&(!this.role.isEmpty()))?this.getRole():null);
            strategy.appendField(locator, this, "role", buffer, theRole, ((this.role!= null)&&(!this.role.isEmpty())));
        }
        {
            Start theStart;
            theStart = this.getStart();
            strategy.appendField(locator, this, "start", buffer, theStart, (this.start!= null));
        }
        {
            List<BusinessActivity> theBusinessTransactionActivityOrCollaborationActivity;
            theBusinessTransactionActivityOrCollaborationActivity = (((this.businessTransactionActivityOrCollaborationActivity!= null)&&(!this.businessTransactionActivityOrCollaborationActivity.isEmpty()))?this.getBusinessTransactionActivityOrCollaborationActivity():null);
            strategy.appendField(locator, this, "businessTransactionActivityOrCollaborationActivity", buffer, theBusinessTransactionActivityOrCollaborationActivity, ((this.businessTransactionActivityOrCollaborationActivity!= null)&&(!this.businessTransactionActivityOrCollaborationActivity.isEmpty())));
        }
        {
            List<Success> theSuccess;
            theSuccess = (((this.success!= null)&&(!this.success.isEmpty()))?this.getSuccess():null);
            strategy.appendField(locator, this, "success", buffer, theSuccess, ((this.success!= null)&&(!this.success.isEmpty())));
        }
        {
            List<Failure> theFailure;
            theFailure = (((this.failure!= null)&&(!this.failure.isEmpty()))?this.getFailure():null);
            strategy.appendField(locator, this, "failure", buffer, theFailure, ((this.failure!= null)&&(!this.failure.isEmpty())));
        }
        {
            List<Transition> theTransition;
            theTransition = (((this.transition!= null)&&(!this.transition.isEmpty()))?this.getTransition():null);
            strategy.appendField(locator, this, "transition", buffer, theTransition, ((this.transition!= null)&&(!this.transition.isEmpty())));
        }
        {
            List<Fork> theFork;
            theFork = (((this.fork!= null)&&(!this.fork.isEmpty()))?this.getFork():null);
            strategy.appendField(locator, this, "fork", buffer, theFork, ((this.fork!= null)&&(!this.fork.isEmpty())));
        }
        {
            List<Join> theJoin;
            theJoin = (((this.join!= null)&&(!this.join.isEmpty()))?this.getJoin():null);
            strategy.appendField(locator, this, "join", buffer, theJoin, ((this.join!= null)&&(!this.join.isEmpty())));
        }
        {
            List<Decision> theDecision;
            theDecision = (((this.decision!= null)&&(!this.decision.isEmpty()))?this.getDecision():null);
            strategy.appendField(locator, this, "decision", buffer, theDecision, ((this.decision!= null)&&(!this.decision.isEmpty())));
        }
        {
            String thePattern;
            thePattern = this.getPattern();
            strategy.appendField(locator, this, "pattern", buffer, thePattern, (this.pattern!= null));
        }
        {
            String theBeginsWhen;
            theBeginsWhen = this.getBeginsWhen();
            strategy.appendField(locator, this, "beginsWhen", buffer, theBeginsWhen, (this.beginsWhen!= null));
        }
        {
            String theEndsWhen;
            theEndsWhen = this.getEndsWhen();
            strategy.appendField(locator, this, "endsWhen", buffer, theEndsWhen, (this.endsWhen!= null));
        }
        {
            String thePreCondition;
            thePreCondition = this.getPreCondition();
            strategy.appendField(locator, this, "preCondition", buffer, thePreCondition, (this.preCondition!= null));
        }
        {
            String thePostCondition;
            thePostCondition = this.getPostCondition();
            strategy.appendField(locator, this, "postCondition", buffer, thePostCondition, (this.postCondition!= null));
        }
        {
            Duration theTimeToPerform;
            theTimeToPerform = this.getTimeToPerform();
            strategy.appendField(locator, this, "timeToPerform", buffer, theTimeToPerform, (this.timeToPerform!= null));
        }
        {
            String theInitiatingRoleIDREF;
            theInitiatingRoleIDREF = this.getInitiatingRoleIDREF();
            strategy.appendField(locator, this, "initiatingRoleIDREF", buffer, theInitiatingRoleIDREF, (this.initiatingRoleIDREF!= null));
        }
        {
            boolean theIsInnerCollaboration;
            theIsInnerCollaboration = ((this.isInnerCollaboration!= null)?this.isIsInnerCollaboration():false);
            strategy.appendField(locator, this, "isInnerCollaboration", buffer, theIsInnerCollaboration, (this.isInnerCollaboration!= null));
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
