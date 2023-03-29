/*-
 * ===LICENSE_START===
 * RosettaNet JAXB
 * ===
 * Copyright (C) 2023 Exilor Inc.
 * ===
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ===LICENSE_END===
 */

package io.dscope.rosettanet.interchange.purchaseorderstatusdistribution.v02_01;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.purchaseorderstatusdistribution.v02_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.purchaseorderstatusdistribution.v02_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PurchaseOrderStatusDistributionType }
     * 
     */
    public PurchaseOrderStatusDistributionType createPurchaseOrderStatusDistributionType() {
        return new PurchaseOrderStatusDistributionType();
    }

    /**
     * Create an instance of {@link OrderLineItemType }
     * 
     */
    public OrderLineItemType createOrderLineItemType() {
        return new OrderLineItemType();
    }

    /**
     * Create an instance of {@link OrderStatusType }
     * 
     */
    public OrderStatusType createOrderStatusType() {
        return new OrderStatusType();
    }

    /**
     * Create an instance of {@link ProductLineItemType }
     * 
     */
    public ProductLineItemType createProductLineItemType() {
        return new ProductLineItemType();
    }

    /**
     * Create an instance of {@link ProductSubLineItemType }
     * 
     */
    public ProductSubLineItemType createProductSubLineItemType() {
        return new ProductSubLineItemType();
    }

    /**
     * Create an instance of {@link PurchaseOrderType }
     * 
     */
    public PurchaseOrderType createPurchaseOrderType() {
        return new PurchaseOrderType();
    }

    /**
     * Create an instance of {@link QuantityType }
     * 
     */
    public QuantityType createQuantityType() {
        return new QuantityType();
    }

    /**
     * Create an instance of {@link ServiceLineItemType }
     * 
     */
    public ServiceLineItemType createServiceLineItemType() {
        return new ServiceLineItemType();
    }

    /**
     * Create an instance of {@link ServiceLineItemByOptionType }
     * 
     */
    public ServiceLineItemByOptionType createServiceLineItemByOptionType() {
        return new ServiceLineItemByOptionType();
    }

    /**
     * Create an instance of {@link ShipmentStatusInformationType }
     * 
     */
    public ShipmentStatusInformationType createShipmentStatusInformationType() {
        return new ShipmentStatusInformationType();
    }

    /**
     * Create an instance of {@link ShippedQuantityInformationType }
     * 
     */
    public ShippedQuantityInformationType createShippedQuantityInformationType() {
        return new ShippedQuantityInformationType();
    }

    /**
     * Create an instance of {@link PurchaseOrderStatusDistribution }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link PurchaseOrderStatusDistribution }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:PurchaseOrderStatusDistribution:xsd:schema:02.01", name = "PurchaseOrderStatusDistribution")
    public PurchaseOrderStatusDistribution createPurchaseOrderStatusDistribution(PurchaseOrderStatusDistributionType value) {
        return new PurchaseOrderStatusDistribution(value);
    }

}
