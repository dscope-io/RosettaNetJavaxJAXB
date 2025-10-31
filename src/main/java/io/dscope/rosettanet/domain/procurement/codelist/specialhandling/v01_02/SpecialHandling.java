
package io.dscope.rosettanet.domain.procurement.codelist.specialhandling.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SpecialHandling
    extends JAXBElement<SpecialHandlingType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:SpecialHandling:xsd:codelist:01.02", "SpecialHandling");

    public SpecialHandling(SpecialHandlingType value) {
        super(NAME, ((Class) SpecialHandlingType.class), null, value);
    }

    public SpecialHandling() {
        super(NAME, ((Class) SpecialHandlingType.class), null, null);
    }

}
