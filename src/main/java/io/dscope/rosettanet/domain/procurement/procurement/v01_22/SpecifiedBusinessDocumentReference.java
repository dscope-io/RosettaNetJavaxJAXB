
package io.dscope.rosettanet.domain.procurement.procurement.v01_22;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecifiedBusinessDocumentReference
    extends JAXBElement<SpecifiedBusinessDocumentReferenceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:01.22", "SpecifiedBusinessDocumentReference");

    public SpecifiedBusinessDocumentReference(SpecifiedBusinessDocumentReferenceType value) {
        super(NAME, ((Class) SpecifiedBusinessDocumentReferenceType.class), null, value);
    }

    public SpecifiedBusinessDocumentReference() {
        super(NAME, ((Class) SpecifiedBusinessDocumentReferenceType.class), null, null);
    }

}
