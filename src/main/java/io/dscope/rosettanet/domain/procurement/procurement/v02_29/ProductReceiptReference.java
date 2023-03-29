
package io.dscope.rosettanet.domain.procurement.procurement.v02_29;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductReceiptReference
    extends JAXBElement<ProductReceiptReferenceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.29", "ProductReceiptReference");

    public ProductReceiptReference(ProductReceiptReferenceType value) {
        super(NAME, ((Class) ProductReceiptReferenceType.class), null, value);
    }

    public ProductReceiptReference() {
        super(NAME, ((Class) ProductReceiptReferenceType.class), null, null);
    }

}
