
package io.dscope.rosettanet.domain.marketing.marketing.v02_12;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ChangeNotification
    extends JAXBElement<ChangeNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Marketing:xsd:schema:02.12", "ChangeNotification");

    public ChangeNotification(ChangeNotificationType value) {
        super(NAME, ((Class) ChangeNotificationType.class), null, value);
    }

    public ChangeNotification() {
        super(NAME, ((Class) ChangeNotificationType.class), null, null);
    }

}
