
package io.dscope.rosettanet.domain.manufacturing.codelist.workinprocesslocation.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class WorkInProcessLocation
    extends JAXBElement<WorkInProcessLocationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:WorkInProcessLocation:xsd:codelist:1.0", "WorkInProcessLocation");

    public WorkInProcessLocation(WorkInProcessLocationType value) {
        super(NAME, ((Class) WorkInProcessLocationType.class), null, value);
    }

    public WorkInProcessLocation() {
        super(NAME, ((Class) WorkInProcessLocationType.class), null, null);
    }

}
