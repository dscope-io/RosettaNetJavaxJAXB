
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_27;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TestSetup
    extends JAXBElement<TestSetupType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27", "TestSetup");

    public TestSetup(TestSetupType value) {
        super(NAME, ((Class) TestSetupType.class), null, value);
    }

    public TestSetup() {
        super(NAME, ((Class) TestSetupType.class), null, null);
    }

}
