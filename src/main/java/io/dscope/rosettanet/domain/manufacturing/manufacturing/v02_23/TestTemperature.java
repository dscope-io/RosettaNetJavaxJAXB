
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_23;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TestTemperature
    extends JAXBElement<TestTemperatureType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.23", "TestTemperature");

    public TestTemperature(TestTemperatureType value) {
        super(NAME, ((Class) TestTemperatureType.class), null, value);
    }

    public TestTemperature() {
        super(NAME, ((Class) TestTemperatureType.class), null, null);
    }

}
