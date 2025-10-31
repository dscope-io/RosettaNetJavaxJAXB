
package io.dscope.rosettanet.domain.service.service.v02_12;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class Update
    extends JAXBElement<UpdateType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Service:xsd:schema:02.12", "Update");

    public Update(UpdateType value) {
        super(NAME, ((Class) UpdateType.class), null, value);
    }

    public Update() {
        super(NAME, ((Class) UpdateType.class), null, null);
    }

}
