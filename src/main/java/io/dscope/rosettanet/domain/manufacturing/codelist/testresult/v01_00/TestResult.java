
package io.dscope.rosettanet.domain.manufacturing.codelist.testresult.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TestResult
    extends JAXBElement<TestResultType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:TestResult:xsd:codelist:1.0", "TestResult");

    public TestResult(TestResultType value) {
        super(NAME, ((Class) TestResultType.class), null, value);
    }

    public TestResult() {
        super(NAME, ((Class) TestResultType.class), null, null);
    }

}
