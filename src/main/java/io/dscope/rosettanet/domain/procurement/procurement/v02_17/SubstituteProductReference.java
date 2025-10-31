
package io.dscope.rosettanet.domain.procurement.procurement.v02_17;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SubstituteProductReference
    extends JAXBElement<SubstituteProductReferenceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.17", "SubstituteProductReference");

    public SubstituteProductReference(SubstituteProductReferenceType value) {
        super(NAME, ((Class) SubstituteProductReferenceType.class), null, value);
    }

    public SubstituteProductReference() {
        super(NAME, ((Class) SubstituteProductReferenceType.class), null, null);
    }

}
