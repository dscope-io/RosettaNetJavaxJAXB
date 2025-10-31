
package io.dscope.rosettanet.domain.manufacturing.manufacturing.v02_27;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class SoftwareReport
    extends JAXBElement<SoftwareReportType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Manufacturing:xsd:schema:02.27", "SoftwareReport");

    public SoftwareReport(SoftwareReportType value) {
        super(NAME, ((Class) SoftwareReportType.class), null, value);
    }

    public SoftwareReport() {
        super(NAME, ((Class) SoftwareReportType.class), null, null);
    }

}
