
package io.dscope.rosettanet.domain.design.design.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class MassPercentage
    extends JAXBElement<MassPercentageType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:01.01", "MassPercentage");

    public MassPercentage(MassPercentageType value) {
        super(NAME, ((Class) MassPercentageType.class), null, value);
    }

    public MassPercentage() {
        super(NAME, ((Class) MassPercentageType.class), null, null);
    }

}
