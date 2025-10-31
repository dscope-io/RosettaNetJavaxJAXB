
package io.dscope.rosettanet.universal.physicaldimension.v01_05;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Volume
    extends JAXBElement<VolumeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.05", "Volume");

    public Volume(VolumeType value) {
        super(NAME, ((Class) VolumeType.class), null, value);
    }

    public Volume() {
        super(NAME, ((Class) VolumeType.class), null, null);
    }

}
