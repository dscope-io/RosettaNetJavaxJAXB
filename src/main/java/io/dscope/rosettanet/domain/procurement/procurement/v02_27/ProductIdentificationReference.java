
package io.dscope.rosettanet.domain.procurement.procurement.v02_27;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductIdentificationReference
    extends JAXBElement<ProductIdentificationReferenceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.27", "ProductIdentificationReference");

    public ProductIdentificationReference(ProductIdentificationReferenceType value) {
        super(NAME, ((Class) ProductIdentificationReferenceType.class), null, value);
    }

    public ProductIdentificationReference() {
        super(NAME, ((Class) ProductIdentificationReferenceType.class), null, null);
    }

}
