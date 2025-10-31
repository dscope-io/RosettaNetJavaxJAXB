
package io.dscope.rosettanet.interchange.semiconductorprocessdatanotification.v02_04;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "SemiconductorProcessDataNotification", namespace = "urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.04")
public class SemiconductorProcessDataNotification
    extends JAXBElement<SemiconductorProcessDataNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:SemiconductorProcessDataNotification:xsd:schema:02.04", "SemiconductorProcessDataNotification");

    public SemiconductorProcessDataNotification(SemiconductorProcessDataNotificationType value) {
        super(NAME, ((Class) SemiconductorProcessDataNotificationType.class), null, value);
    }

    public SemiconductorProcessDataNotification() {
        super(NAME, ((Class) SemiconductorProcessDataNotificationType.class), null, null);
    }

}
