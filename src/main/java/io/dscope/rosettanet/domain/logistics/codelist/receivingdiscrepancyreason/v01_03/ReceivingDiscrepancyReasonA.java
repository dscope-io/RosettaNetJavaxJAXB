
package io.dscope.rosettanet.domain.logistics.codelist.receivingdiscrepancyreason.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ReceivingDiscrepancyReasonA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:ReceivingDiscrepancyReason:xsd:codelist:01.03", "ReceivingDiscrepancyReasonA");

    public ReceivingDiscrepancyReasonA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ReceivingDiscrepancyReasonA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}