
package io.dscope.rosettanet.interchange.certificateofanalysisnotification.v02_04;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "CertificateOfAnalysisNotification", namespace = "urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.04")
public class CertificateOfAnalysisNotification
    extends JAXBElement<CertificateOfAnalysisNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:CertificateOfAnalysisNotification:xsd:schema:02.04", "CertificateOfAnalysisNotification");

    public CertificateOfAnalysisNotification(CertificateOfAnalysisNotificationType value) {
        super(NAME, ((Class) CertificateOfAnalysisNotificationType.class), null, value);
    }

    public CertificateOfAnalysisNotification() {
        super(NAME, ((Class) CertificateOfAnalysisNotificationType.class), null, null);
    }

}
