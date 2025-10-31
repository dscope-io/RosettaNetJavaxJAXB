
package io.dscope.rosettanet.domain.logistics.logistics.v02_15;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class GeographicRegion
    extends JAXBElement<GeographicRegionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.15", "GeographicRegion");

    public GeographicRegion(GeographicRegionType value) {
        super(NAME, ((Class) GeographicRegionType.class), null, value);
    }

    public GeographicRegion() {
        super(NAME, ((Class) GeographicRegionType.class), null, null);
    }

}
