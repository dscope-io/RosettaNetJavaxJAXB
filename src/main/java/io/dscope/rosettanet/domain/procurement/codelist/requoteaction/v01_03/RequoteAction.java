
package io.dscope.rosettanet.domain.procurement.codelist.requoteaction.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RequoteAction
    extends JAXBElement<RequoteActionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:RequoteAction:xsd:codelist:01.03", "RequoteAction");

    public RequoteAction(RequoteActionType value) {
        super(NAME, ((Class) RequoteActionType.class), null, value);
    }

    public RequoteAction() {
        super(NAME, ((Class) RequoteActionType.class), null, null);
    }

}
