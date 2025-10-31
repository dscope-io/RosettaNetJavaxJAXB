
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_28;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Result
    extends JAXBElement<ResultType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.28", "Result");

    public Result(ResultType value) {
        super(NAME, ((Class) ResultType.class), null, value);
    }

    public Result() {
        super(NAME, ((Class) ResultType.class), null, null);
    }

}
