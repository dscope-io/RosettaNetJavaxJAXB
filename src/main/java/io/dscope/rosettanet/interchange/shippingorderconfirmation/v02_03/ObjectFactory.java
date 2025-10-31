
package io.dscope.rosettanet.interchange.shippingorderconfirmation.v02_03;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.shippingorderconfirmation.v02_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.shippingorderconfirmation.v02_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ShippingOrderConfirmationType }
     * 
     */
    public ShippingOrderConfirmationType createShippingOrderConfirmationType() {
        return new ShippingOrderConfirmationType();
    }

    /**
     * Create an instance of {@link DateInformationType }
     * 
     */
    public DateInformationType createDateInformationType() {
        return new DateInformationType();
    }

    /**
     * Create an instance of {@link OrderConfirmationType }
     * 
     */
    public OrderConfirmationType createOrderConfirmationType() {
        return new OrderConfirmationType();
    }

    /**
     * Create an instance of {@link QuantityInformationType }
     * 
     */
    public QuantityInformationType createQuantityInformationType() {
        return new QuantityInformationType();
    }

    /**
     * Create an instance of {@link RequestingOrderInformationType }
     * 
     */
    public RequestingOrderInformationType createRequestingOrderInformationType() {
        return new RequestingOrderInformationType();
    }

    /**
     * Create an instance of {@link RequestingOrderLineItemReferenceType }
     * 
     */
    public RequestingOrderLineItemReferenceType createRequestingOrderLineItemReferenceType() {
        return new RequestingOrderLineItemReferenceType();
    }

    /**
     * Create an instance of {@link RoutingInformationType }
     * 
     */
    public RoutingInformationType createRoutingInformationType() {
        return new RoutingInformationType();
    }

    /**
     * Create an instance of {@link ShipmentInformationType }
     * 
     */
    public ShipmentInformationType createShipmentInformationType() {
        return new ShipmentInformationType();
    }

    /**
     * Create an instance of {@link ShipmentLineItemType }
     * 
     */
    public ShipmentLineItemType createShipmentLineItemType() {
        return new ShipmentLineItemType();
    }

    /**
     * Create an instance of {@link ShippingContainerType }
     * 
     */
    public ShippingContainerType createShippingContainerType() {
        return new ShippingContainerType();
    }

    /**
     * Create an instance of {@link ShippingContainerItemType }
     * 
     */
    public ShippingContainerItemType createShippingContainerItemType() {
        return new ShippingContainerItemType();
    }

    /**
     * Create an instance of {@link ShippingOrderType }
     * 
     */
    public ShippingOrderType createShippingOrderType() {
        return new ShippingOrderType();
    }

    /**
     * Create an instance of {@link SubContainerType }
     * 
     */
    public SubContainerType createSubContainerType() {
        return new SubContainerType();
    }

    /**
     * Create an instance of {@link ShippingOrderConfirmation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link ShippingOrderConfirmation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:ShippingOrderConfirmation:xsd:schema:02.03", name = "ShippingOrderConfirmation")
    public ShippingOrderConfirmation createShippingOrderConfirmation(ShippingOrderConfirmationType value) {
        return new ShippingOrderConfirmation(value);
    }

}
