
package io.dscope.rosettanet.domain.logistics.logistics.v01_15;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MassPhysicalDimension
    extends JAXBElement<MassPhysicalDimensionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:01.15", "MassPhysicalDimension");

    public MassPhysicalDimension(MassPhysicalDimensionType value) {
        super(NAME, ((Class) MassPhysicalDimensionType.class), null, value);
    }

    public MassPhysicalDimension() {
        super(NAME, ((Class) MassPhysicalDimensionType.class), null, null);
    }

}
