
package io.dscope.rosettanet.interchange.codelist.shipmentstatusreportinglevel.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class ShipmentStatusReportingLevel
    extends JAXBElement<ShipmentStatusReportingLevelType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ShipmentStatusReportingLevel:xsd:codelist:01.00", "ShipmentStatusReportingLevel");

    public ShipmentStatusReportingLevel(ShipmentStatusReportingLevelType value) {
        super(NAME, ((Class) ShipmentStatusReportingLevelType.class), null, value);
    }

    public ShipmentStatusReportingLevel() {
        super(NAME, ((Class) ShipmentStatusReportingLevelType.class), null, null);
    }

}
