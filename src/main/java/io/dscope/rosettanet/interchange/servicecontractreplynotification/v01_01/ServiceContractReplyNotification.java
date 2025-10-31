
package io.dscope.rosettanet.interchange.servicecontractreplynotification.v01_01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ServiceContractReplyNotification", namespace = "urn:rosettanet:specification:interchange:ServiceContractReplyNotification:xsd:schema:01.01")
public class ServiceContractReplyNotification
    extends JAXBElement<ServiceContractReplyNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ServiceContractReplyNotification:xsd:schema:01.01", "ServiceContractReplyNotification");

    public ServiceContractReplyNotification(ServiceContractReplyNotificationType value) {
        super(NAME, ((Class) ServiceContractReplyNotificationType.class), null, value);
    }

    public ServiceContractReplyNotification() {
        super(NAME, ((Class) ServiceContractReplyNotificationType.class), null, null);
    }

}
