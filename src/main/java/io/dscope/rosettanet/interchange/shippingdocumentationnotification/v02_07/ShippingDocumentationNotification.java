
package io.dscope.rosettanet.interchange.shippingdocumentationnotification.v02_07;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ShippingDocumentationNotification", namespace = "urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.07")
public class ShippingDocumentationNotification
    extends JAXBElement<ShippingDocumentationNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ShippingDocumentationNotification:xsd:schema:02.07", "ShippingDocumentationNotification");

    public ShippingDocumentationNotification(ShippingDocumentationNotificationType value) {
        super(NAME, ((Class) ShippingDocumentationNotificationType.class), null, value);
    }

    public ShippingDocumentationNotification() {
        super(NAME, ((Class) ShippingDocumentationNotificationType.class), null, null);
    }

}
