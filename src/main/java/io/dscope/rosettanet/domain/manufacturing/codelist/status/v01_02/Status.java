
package io.dscope.rosettanet.domain.manufacturing.codelist.status.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Status
    extends JAXBElement<StatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:Status:xsd:codelist:01.02", "Status");

    public Status(StatusType value) {
        super(NAME, ((Class) StatusType.class), null, value);
    }

    public Status() {
        super(NAME, ((Class) StatusType.class), null, null);
    }

}
