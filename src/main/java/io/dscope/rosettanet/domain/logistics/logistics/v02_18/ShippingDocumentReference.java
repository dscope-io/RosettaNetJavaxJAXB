
package io.dscope.rosettanet.domain.logistics.logistics.v02_18;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShippingDocumentReference
    extends JAXBElement<ShippingDocumentReferenceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.18", "ShippingDocumentReference");

    public ShippingDocumentReference(ShippingDocumentReferenceType value) {
        super(NAME, ((Class) ShippingDocumentReferenceType.class), null, value);
    }

    public ShippingDocumentReference() {
        super(NAME, ((Class) ShippingDocumentReferenceType.class), null, null);
    }

}
