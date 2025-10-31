
package io.dscope.rosettanet.interchange.remittanceadvicenotification.v02_04;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "RemittanceAdviceNotification", namespace = "urn:rosettanet:specification:interchange:RemittanceAdviceNotification:xsd:schema:02.04")
public class RemittanceAdviceNotification
    extends JAXBElement<RemittanceAdviceNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:RemittanceAdviceNotification:xsd:schema:02.04", "RemittanceAdviceNotification");

    public RemittanceAdviceNotification(RemittanceAdviceNotificationType value) {
        super(NAME, ((Class) RemittanceAdviceNotificationType.class), null, value);
    }

    public RemittanceAdviceNotification() {
        super(NAME, ((Class) RemittanceAdviceNotificationType.class), null, null);
    }

}
