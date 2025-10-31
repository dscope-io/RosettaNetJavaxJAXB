
package io.dscope.rosettanet.domain.logistics.codelist.trackingreferencetype.v01_04;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TrackingReferenceType
    extends JAXBElement<TrackingReferenceTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:TrackingReferenceType:xsd:codelist:01.04", "TrackingReferenceType");

    public TrackingReferenceType(TrackingReferenceTypeType value) {
        super(NAME, ((Class) TrackingReferenceTypeType.class), null, value);
    }

    public TrackingReferenceType() {
        super(NAME, ((Class) TrackingReferenceTypeType.class), null, null);
    }

}
