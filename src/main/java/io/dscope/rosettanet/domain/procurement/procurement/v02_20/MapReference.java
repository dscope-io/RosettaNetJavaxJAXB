
package io.dscope.rosettanet.domain.procurement.procurement.v02_20;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MapReference
    extends JAXBElement<MapReferenceType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.20", "MapReference");

    public MapReference(MapReferenceType value) {
        super(NAME, ((Class) MapReferenceType.class), null, value);
    }

    public MapReference() {
        super(NAME, ((Class) MapReferenceType.class), null, null);
    }

}
