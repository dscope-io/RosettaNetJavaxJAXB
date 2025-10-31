
package io.dscope.rosettanet.interchange.shipfromstockanddebitclaimrequest.v01_01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ShipFromStockAndDebitClaimRequest", namespace = "urn:rosettanet:specification:interchange:ShipFromStockAndDebitClaimRequest:xsd:schema:01.01")
public class ShipFromStockAndDebitClaimRequest
    extends JAXBElement<ShipFromStockAndDebitClaimRequestType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ShipFromStockAndDebitClaimRequest:xsd:schema:01.01", "ShipFromStockAndDebitClaimRequest");

    public ShipFromStockAndDebitClaimRequest(ShipFromStockAndDebitClaimRequestType value) {
        super(NAME, ((Class) ShipFromStockAndDebitClaimRequestType.class), null, value);
    }

    public ShipFromStockAndDebitClaimRequest() {
        super(NAME, ((Class) ShipFromStockAndDebitClaimRequestType.class), null, null);
    }

}
