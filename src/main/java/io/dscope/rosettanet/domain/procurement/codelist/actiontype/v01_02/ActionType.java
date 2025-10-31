
package io.dscope.rosettanet.domain.procurement.codelist.actiontype.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ActionType
    extends JAXBElement<ActionTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ActionType:xsd:codelist:01.02", "ActionType");

    public ActionType(ActionTypeType value) {
        super(NAME, ((Class) ActionTypeType.class), null, value);
    }

    public ActionType() {
        super(NAME, ((Class) ActionTypeType.class), null, null);
    }

}
