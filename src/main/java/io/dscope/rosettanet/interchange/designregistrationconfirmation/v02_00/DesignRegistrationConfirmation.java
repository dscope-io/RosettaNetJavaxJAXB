
package io.dscope.rosettanet.interchange.designregistrationconfirmation.v02_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "DesignRegistrationConfirmation", namespace = "urn:rosettanet:specification:interchange:DesignRegistrationConfirmation:xsd:schema:02.00")
public class DesignRegistrationConfirmation
    extends JAXBElement<DesignRegistrationConfirmationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:DesignRegistrationConfirmation:xsd:schema:02.00", "DesignRegistrationConfirmation");

    public DesignRegistrationConfirmation(DesignRegistrationConfirmationType value) {
        super(NAME, ((Class) DesignRegistrationConfirmationType.class), null, value);
    }

    public DesignRegistrationConfirmation() {
        super(NAME, ((Class) DesignRegistrationConfirmationType.class), null, null);
    }

}
