
package io.dscope.rosettanet.domain.procurement.codelist.revisionreason.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class RevisionReason
    extends JAXBElement<RevisionReasonType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:RevisionReason:xsd:codelist:1.0", "RevisionReason");

    public RevisionReason(RevisionReasonType value) {
        super(NAME, ((Class) RevisionReasonType.class), null, value);
    }

    public RevisionReason() {
        super(NAME, ((Class) RevisionReasonType.class), null, null);
    }

}
