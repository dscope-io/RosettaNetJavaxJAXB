
package io.dscope.rosettanet.domain.procurement.procurement.v02_01;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class IsCallFactory
    extends JAXBElement<Boolean>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.01", "IsCallFactory");

    public IsCallFactory(Boolean value) {
        super(NAME, ((Class) Boolean.class), null, value);
    }

    public IsCallFactory() {
        super(NAME, ((Class) Boolean.class), null, null);
    }

}
