
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_07;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WorkInProcessStage
    extends JAXBElement<WorkInProcessStageType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:01.07", "WorkInProcessStage");

    public WorkInProcessStage(WorkInProcessStageType value) {
        super(NAME, ((Class) WorkInProcessStageType.class), null, value);
    }

    public WorkInProcessStage() {
        super(NAME, ((Class) WorkInProcessStageType.class), null, null);
    }

}
