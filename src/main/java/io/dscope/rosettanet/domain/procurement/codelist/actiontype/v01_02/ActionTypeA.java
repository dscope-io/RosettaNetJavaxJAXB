
package io.dscope.rosettanet.domain.procurement.codelist.actiontype.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ActionTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ActionType:xsd:codelist:01.02", "ActionTypeA");

    public ActionTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ActionTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
