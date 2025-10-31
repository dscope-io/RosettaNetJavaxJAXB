
package io.dscope.rosettanet.interchange.approvedmanufacturerlistnotification.v01_00;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.approvedmanufacturerlistnotification.v01_00 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.approvedmanufacturerlistnotification.v01_00
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ApprovedManufacturerListNotificationType }
     * 
     */
    public ApprovedManufacturerListNotificationType createApprovedManufacturerListNotificationType() {
        return new ApprovedManufacturerListNotificationType();
    }

    /**
     * Create an instance of {@link ApprovedManufacturerListType }
     * 
     */
    public ApprovedManufacturerListType createApprovedManufacturerListType() {
        return new ApprovedManufacturerListType();
    }

    /**
     * Create an instance of {@link ApprovedManufacturerListItemType }
     * 
     */
    public ApprovedManufacturerListItemType createApprovedManufacturerListItemType() {
        return new ApprovedManufacturerListItemType();
    }

    /**
     * Create an instance of {@link ApprovedSupplierListItemType }
     * 
     */
    public ApprovedSupplierListItemType createApprovedSupplierListItemType() {
        return new ApprovedSupplierListItemType();
    }

    /**
     * Create an instance of {@link ItemComplianceType }
     * 
     */
    public ItemComplianceType createItemComplianceType() {
        return new ItemComplianceType();
    }

    /**
     * Create an instance of {@link ApprovedManufacturerListNotification }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ApprovedManufacturerListNotification }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ApprovedManufacturerListNotification:xsd:schema:01.00", name = "ApprovedManufacturerListNotification")
    public ApprovedManufacturerListNotification createApprovedManufacturerListNotification(ApprovedManufacturerListNotificationType value) {
        return new ApprovedManufacturerListNotification(value);
    }

}
