
package io.dscope.rosettanet.domain.procurement.codelist.orderadmin.v01_03;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.domain.procurement.codelist.orderadmin.v01_03 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.domain.procurement.codelist.orderadmin.v01_03
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderAdminType }
     * 
     */
    public OrderAdminType createOrderAdminType() {
        return new OrderAdminType();
    }

    /**
     * Create an instance of {@link OrderAdminA }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link OrderAdminA }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:OrderAdmin:xsd:codelist:01.03", name = "OrderAdminA")
    public OrderAdminA createOrderAdminA(Object value) {
        return new OrderAdminA(value);
    }

    /**
     * Create an instance of {@link OrderAdmin }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link OrderAdmin }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:domain:Procurement:OrderAdmin:xsd:codelist:01.03", name = "OrderAdmin", substitutionHeadNamespace = "urn:rosettanet:specification:domain:Procurement:OrderAdmin:xsd:codelist:01.03", substitutionHeadName = "OrderAdminA")
    public OrderAdmin createOrderAdmin(OrderAdminType value) {
        return new OrderAdmin(value);
    }

}
