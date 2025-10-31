
package io.dscope.rosettanet.domain.manufacturing.codelist.completionstatus.v01_02;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class CompletionStatus
    extends JAXBElement<CompletionStatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:CompletionStatus:xsd:codelist:01.02", "CompletionStatus");

    public CompletionStatus(CompletionStatusType value) {
        super(NAME, ((Class) CompletionStatusType.class), null, value);
    }

    public CompletionStatus() {
        super(NAME, ((Class) CompletionStatusType.class), null, null);
    }

}
