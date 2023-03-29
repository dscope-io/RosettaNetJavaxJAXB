
package io.dscope.rosettanet.domain.procurement.codelist.reporttype.v01_04;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ReportTypeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:ReportType:xsd:codelist:01.04", "ReportTypeA");

    public ReportTypeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public ReportTypeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}
