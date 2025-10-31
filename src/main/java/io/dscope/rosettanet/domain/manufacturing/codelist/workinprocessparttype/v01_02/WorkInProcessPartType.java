
package io.dscope.rosettanet.domain.manufacturing.codelist.workinprocessparttype.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WorkInProcessPartType
    extends JAXBElement<WorkInProcessPartTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:WorkInProcessPartType:xsd:codelist:01.02", "WorkInProcessPartType");

    public WorkInProcessPartType(WorkInProcessPartTypeType value) {
        super(NAME, ((Class) WorkInProcessPartTypeType.class), null, value);
    }

    public WorkInProcessPartType() {
        super(NAME, ((Class) WorkInProcessPartTypeType.class), null, null);
    }

}
