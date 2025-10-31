
package io.dscope.rosettanet.interchange.priceandavailabilityresponse.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "PriceAndAvailabilityResponse", namespace = "urn:rosettanet:specification:interchange:PriceAndAvailabilityResponseNotification:xsd:schema:01.00")
public class PriceAndAvailabilityResponse
    extends JAXBElement<PriceAndAvailabilityResponseType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:PriceAndAvailabilityResponseNotification:xsd:schema:01.00", "PriceAndAvailabilityResponse");

    public PriceAndAvailabilityResponse(PriceAndAvailabilityResponseType value) {
        super(NAME, ((Class) PriceAndAvailabilityResponseType.class), null, value);
    }

    public PriceAndAvailabilityResponse() {
        super(NAME, ((Class) PriceAndAvailabilityResponseType.class), null, null);
    }

}
