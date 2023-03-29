
package io.dscope.rosettanet.domain.logistics.codelist.shippingdocument.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShippingDocument
    extends JAXBElement<ShippingDocumentType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ShippingDocument:xsd:codelist:01.02", "ShippingDocument");

    public ShippingDocument(ShippingDocumentType value) {
        super(NAME, ((Class) ShippingDocumentType.class), null, value);
    }

    public ShippingDocument() {
        super(NAME, ((Class) ShippingDocumentType.class), null, null);
    }

}
