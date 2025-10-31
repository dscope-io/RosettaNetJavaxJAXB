
package io.dscope.rosettanet.domain.logistics.logistics.v02_16;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PhysicalDimension
    extends JAXBElement<PhysicalDimensionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.16", "PhysicalDimension");

    public PhysicalDimension(PhysicalDimensionType value) {
        super(NAME, ((Class) PhysicalDimensionType.class), null, value);
    }

    public PhysicalDimension() {
        super(NAME, ((Class) PhysicalDimensionType.class), null, null);
    }

}
