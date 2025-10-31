
package io.dscope.rosettanet.domain.logistics.logistics.v02_23;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class AlternateItem
    extends JAXBElement<AlternateItemType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:xsd:schema:02.23", "AlternateItem");

    public AlternateItem(AlternateItemType value) {
        super(NAME, ((Class) AlternateItemType.class), null, value);
    }

    public AlternateItem() {
        super(NAME, ((Class) AlternateItemType.class), null, null);
    }

}
