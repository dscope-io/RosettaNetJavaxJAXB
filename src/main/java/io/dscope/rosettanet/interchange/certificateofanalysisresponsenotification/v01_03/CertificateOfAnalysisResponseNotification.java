
package io.dscope.rosettanet.interchange.certificateofanalysisresponsenotification.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "CertificateOfAnalysisResponseNotification", namespace = "urn:rosettanet:specification:interchange:CertificateOfAnalysisResponseNotification:xsd:schema:01.03")
public class CertificateOfAnalysisResponseNotification
    extends JAXBElement<CertificateOfAnalysisResponseNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:CertificateOfAnalysisResponseNotification:xsd:schema:01.03", "CertificateOfAnalysisResponseNotification");

    public CertificateOfAnalysisResponseNotification(CertificateOfAnalysisResponseNotificationType value) {
        super(NAME, ((Class) CertificateOfAnalysisResponseNotificationType.class), null, value);
    }

    public CertificateOfAnalysisResponseNotification() {
        super(NAME, ((Class) CertificateOfAnalysisResponseNotificationType.class), null, null);
    }

}
