
package io.dscope.rosettanet.domain.logistics.logistics.v02_08;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductPackaging
    extends JAXBElement<ProductPackagingType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.08", "ProductPackaging");

    public ProductPackaging(ProductPackagingType value) {
        super(NAME, ((Class) ProductPackagingType.class), null, value);
    }

    public ProductPackaging() {
        super(NAME, ((Class) ProductPackagingType.class), null, null);
    }

}
