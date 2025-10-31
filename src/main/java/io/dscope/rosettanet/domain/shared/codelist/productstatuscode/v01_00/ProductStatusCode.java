
package io.dscope.rosettanet.domain.shared.codelist.productstatuscode.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductStatusCode
    extends JAXBElement<ProductStatusCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:ProductStatusCode:xsd:codelist:01.00", "ProductStatusCode");

    public ProductStatusCode(ProductStatusCodeType value) {
        super(NAME, ((Class) ProductStatusCodeType.class), null, value);
    }

    public ProductStatusCode() {
        super(NAME, ((Class) ProductStatusCodeType.class), null, null);
    }

}
