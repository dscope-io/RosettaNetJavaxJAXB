
package io.dscope.rosettanet.domain.procurement.procurement.v02_24;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ForecastProductInventory
    extends JAXBElement<ForecastProductInventoryType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Procurement:xsd:schema:02.24", "ForecastProductInventory");

    public ForecastProductInventory(ForecastProductInventoryType value) {
        super(NAME, ((Class) ForecastProductInventoryType.class), null, value);
    }

    public ForecastProductInventory() {
        super(NAME, ((Class) ForecastProductInventoryType.class), null, null);
    }

}
