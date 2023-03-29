
package io.dscope.rosettanet.domain.procurement.codelist.notificationtype.v01_04;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.notificationtype.v01_04 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.notificationtype.v01_04
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link NotificationTypeType }
     * 
     */
    public NotificationTypeType createNotificationTypeType() {
        return new NotificationTypeType();
    }

    /**
     * Create an instance of {@link NotificationTypeA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link NotificationTypeA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:NotificationType:xsd:codelist:01.04", name = "NotificationTypeA")
    public NotificationTypeA createNotificationTypeA(Object value) {
        return new NotificationTypeA(value);
    }

    /**
     * Create an instance of {@link NotificationType }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link NotificationType }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:NotificationType:xsd:codelist:01.04", name = "NotificationType", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:NotificationType:xsd:codelist:01.04", substitutionHeadName = "NotificationTypeA")
    public NotificationType createNotificationType(NotificationTypeType value) {
        return new NotificationType(value);
    }

}