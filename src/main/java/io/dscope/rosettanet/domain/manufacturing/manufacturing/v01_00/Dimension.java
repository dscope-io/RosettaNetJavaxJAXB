
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Dimension
    extends JAXBElement<DimensionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:1.0", "Dimension");

    public Dimension(DimensionType value) {
        super(NAME, ((Class) DimensionType.class), null, value);
    }

    public Dimension() {
        super(NAME, ((Class) DimensionType.class), null, null);
    }

}
