
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_27;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Environment
    extends JAXBElement<EnvironmentType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27", "Environment");

    public Environment(EnvironmentType value) {
        super(NAME, ((Class) EnvironmentType.class), null, value);
    }

    public Environment() {
        super(NAME, ((Class) EnvironmentType.class), null, null);
    }

}
