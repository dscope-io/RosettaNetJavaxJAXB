
package io.dscope.rosettanet.interchange.semiconductortestdatanotification.v01_05;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "SemiconductorTestDataNotification", namespace = "urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.05")
public class SemiconductorTestDataNotification
    extends JAXBElement<SemiconductorTestDataNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:SemiconductorTestDataNotification:xsd:schema:01.05", "SemiconductorTestDataNotification");

    public SemiconductorTestDataNotification(SemiconductorTestDataNotificationType value) {
        super(NAME, ((Class) SemiconductorTestDataNotificationType.class), null, value);
    }

    public SemiconductorTestDataNotification() {
        super(NAME, ((Class) SemiconductorTestDataNotificationType.class), null, null);
    }

}
