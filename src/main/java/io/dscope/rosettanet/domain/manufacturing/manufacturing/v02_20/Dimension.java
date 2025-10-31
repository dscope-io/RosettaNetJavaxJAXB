
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_20;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Dimension
    extends JAXBElement<DimensionType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.20", "Dimension");

    public Dimension(DimensionType value) {
        super(NAME, ((Class) DimensionType.class), null, value);
    }

    public Dimension() {
        super(NAME, ((Class) DimensionType.class), null, null);
    }

}
