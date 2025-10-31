
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_13;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FacilityLocation
    extends JAXBElement<FacilityLocationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.13", "FacilityLocation");

    public FacilityLocation(FacilityLocationType value) {
        super(NAME, ((Class) FacilityLocationType.class), null, value);
    }

    public FacilityLocation() {
        super(NAME, ((Class) FacilityLocationType.class), null, null);
    }

}
