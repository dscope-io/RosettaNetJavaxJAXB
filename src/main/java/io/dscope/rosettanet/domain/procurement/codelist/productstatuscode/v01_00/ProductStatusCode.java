
package io.dscope.rosettanet.domain.procurement.codelist.productstatuscode.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductStatusCode
    extends JAXBElement<ProductStatusCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ProductStatusCode:xsd:codelist:1.0", "ProductStatusCode");

    public ProductStatusCode(ProductStatusCodeType value) {
        super(NAME, ((Class) ProductStatusCodeType.class), null, value);
    }

    public ProductStatusCode() {
        super(NAME, ((Class) ProductStatusCodeType.class), null, null);
    }

}
