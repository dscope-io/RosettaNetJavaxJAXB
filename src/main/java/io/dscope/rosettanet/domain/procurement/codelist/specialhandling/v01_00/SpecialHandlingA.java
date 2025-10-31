
package io.dscope.rosettanet.domain.procurement.codelist.specialhandling.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecialHandlingA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:SpecialHandling:xsd:codelist:1.0", "SpecialHandlingA");

    public SpecialHandlingA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public SpecialHandlingA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
