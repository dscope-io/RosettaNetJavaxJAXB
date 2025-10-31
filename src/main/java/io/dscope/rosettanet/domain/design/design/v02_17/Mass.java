
package io.dscope.rosettanet.domain.design.design.v02_17;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Mass
    extends JAXBElement<MassType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.17", "Mass");

    public Mass(MassType value) {
        super(NAME, ((Class) MassType.class), null, value);
    }

    public Mass() {
        super(NAME, ((Class) MassType.class), null, null);
    }

}
