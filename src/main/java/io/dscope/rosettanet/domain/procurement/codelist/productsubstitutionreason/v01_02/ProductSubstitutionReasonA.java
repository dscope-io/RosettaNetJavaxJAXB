
package io.dscope.rosettanet.domain.procurement.codelist.productsubstitutionreason.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ProductSubstitutionReasonA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ProductSubstitutionReason:xsd:codelist:01.02", "ProductSubstitutionReasonA");

    public ProductSubstitutionReasonA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ProductSubstitutionReasonA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
