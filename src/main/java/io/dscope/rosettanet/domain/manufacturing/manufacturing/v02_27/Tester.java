
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_27;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Tester
    extends JAXBElement<TesterType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27", "Tester");

    public Tester(TesterType value) {
        super(NAME, ((Class) TesterType.class), null, value);
    }

    public Tester() {
        super(NAME, ((Class) TesterType.class), null, null);
    }

}
