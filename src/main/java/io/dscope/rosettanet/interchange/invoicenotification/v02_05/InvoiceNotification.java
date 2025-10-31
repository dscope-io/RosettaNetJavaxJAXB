
package io.dscope.rosettanet.interchange.invoicenotification.v02_05;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "InvoiceNotification", namespace = "urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:02.05")
public class InvoiceNotification
    extends JAXBElement<InvoiceNotificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:InvoiceNotification:xsd:schema:02.05", "InvoiceNotification");

    public InvoiceNotification(InvoiceNotificationType value) {
        super(NAME, ((Class) InvoiceNotificationType.class), null, value);
    }

    public InvoiceNotification() {
        super(NAME, ((Class) InvoiceNotificationType.class), null, null);
    }

}
