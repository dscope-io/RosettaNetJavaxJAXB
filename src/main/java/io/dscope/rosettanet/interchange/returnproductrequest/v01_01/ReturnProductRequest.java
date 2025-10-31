
package io.dscope.rosettanet.interchange.returnproductrequest.v01_01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ReturnProductRequest", namespace = "urn:rosettanet:specification:interchange:ReturnProductRequest:xsd:schema:01.01")
public class ReturnProductRequest
    extends JAXBElement<ReturnProductRequestType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ReturnProductRequest:xsd:schema:01.01", "ReturnProductRequest");

    public ReturnProductRequest(ReturnProductRequestType value) {
        super(NAME, ((Class) ReturnProductRequestType.class), null, value);
    }

    public ReturnProductRequest() {
        super(NAME, ((Class) ReturnProductRequestType.class), null, null);
    }

}
