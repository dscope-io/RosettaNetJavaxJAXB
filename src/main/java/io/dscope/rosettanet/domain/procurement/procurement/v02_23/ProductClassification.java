
package io.dscope.rosettanet.domain.procurement.procurement.v02_23;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductClassification
    extends JAXBElement<ProductClassificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.23", "ProductClassification");

    public ProductClassification(ProductClassificationType value) {
        super(NAME, ((Class) ProductClassificationType.class), null, value);
    }

    public ProductClassification() {
        super(NAME, ((Class) ProductClassificationType.class), null, null);
    }

}
