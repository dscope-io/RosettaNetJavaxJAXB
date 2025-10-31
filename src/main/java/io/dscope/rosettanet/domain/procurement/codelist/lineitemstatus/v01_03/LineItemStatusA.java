
package io.dscope.rosettanet.domain.procurement.codelist.lineitemstatus.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LineItemStatusA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:LineItemStatus:xsd:codelist:01.03", "LineItemStatusA");

    public LineItemStatusA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public LineItemStatusA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
