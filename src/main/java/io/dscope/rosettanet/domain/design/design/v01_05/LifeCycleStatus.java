
package io.dscope.rosettanet.domain.design.design.v01_05;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class LifeCycleStatus
    extends JAXBElement<LifeCycleStatusType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:01.05", "LifeCycleStatus");

    public LifeCycleStatus(LifeCycleStatusType value) {
        super(NAME, ((Class) LifeCycleStatusType.class), null, value);
    }

    public LifeCycleStatus() {
        super(NAME, ((Class) LifeCycleStatusType.class), null, null);
    }

}
