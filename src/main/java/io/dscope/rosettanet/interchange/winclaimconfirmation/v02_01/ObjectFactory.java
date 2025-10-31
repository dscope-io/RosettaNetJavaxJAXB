
package io.dscope.rosettanet.interchange.winclaimconfirmation.v02_01;

import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the io.dscope.rosettanet.interchange.winclaimconfirmation.v02_01 package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: io.dscope.rosettanet.interchange.winclaimconfirmation.v02_01
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link WinClaimConfirmationType }
     * 
     */
    public WinClaimConfirmationType createWinClaimConfirmationType() {
        return new WinClaimConfirmationType();
    }

    /**
     * Create an instance of {@link DesignRegistrationIdentificationType }
     * 
     */
    public DesignRegistrationIdentificationType createDesignRegistrationIdentificationType() {
        return new DesignRegistrationIdentificationType();
    }

    /**
     * Create an instance of {@link DesignWinClaimType }
     * 
     */
    public DesignWinClaimType createDesignWinClaimType() {
        return new DesignWinClaimType();
    }

    /**
     * Create an instance of {@link InvoiceType }
     * 
     */
    public InvoiceType createInvoiceType() {
        return new InvoiceType();
    }

    /**
     * Create an instance of {@link InvoiceLineItemType }
     * 
     */
    public InvoiceLineItemType createInvoiceLineItemType() {
        return new InvoiceLineItemType();
    }

    /**
     * Create an instance of {@link WinClaimConfirmation }
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link WinClaimConfirmation }
     */
    @XmlElementDecl(namespace = "urn:rosettanet:specification:interchange:WinClaimConfirmation:xsd:schema:02.01", name = "WinClaimConfirmation")
    public WinClaimConfirmation createWinClaimConfirmation(WinClaimConfirmationType value) {
        return new WinClaimConfirmation(value);
    }

}
