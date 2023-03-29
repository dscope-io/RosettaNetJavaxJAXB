
package io.dscope.rosettanet.domain.procurement.codelist.salesreportdiscrepancycode.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SalesReportDiscrepancyCodeA
    extends JAXBElement<Object>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:SalesReportDiscrepancyCode:xsd:codelist:01.03", "SalesReportDiscrepancyCodeA");

    public SalesReportDiscrepancyCodeA(Object value) {
        super(NAME, ((Class) Object.class), null, value);
    }

    public SalesReportDiscrepancyCodeA() {
        super(NAME, ((Class) Object.class), null, null);
    }

}