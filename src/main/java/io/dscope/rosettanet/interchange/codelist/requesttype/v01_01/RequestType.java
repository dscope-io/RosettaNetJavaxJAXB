
package io.dscope.rosettanet.interchange.codelist.requesttype.v01_01;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RequestType
    extends JAXBElement<RequestTypeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:RequestType:xsd:codelist:01.01", "RequestType");

    public RequestType(RequestTypeType value) {
        super(NAME, ((Class) RequestTypeType.class), null, value);
    }

    public RequestType() {
        super(NAME, ((Class) RequestTypeType.class), null, null);
    }

}
