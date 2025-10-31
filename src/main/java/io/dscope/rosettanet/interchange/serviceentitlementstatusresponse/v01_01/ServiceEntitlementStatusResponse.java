
package io.dscope.rosettanet.interchange.serviceentitlementstatusresponse.v01_01;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.namespace.QName;

@XmlRootElement(name = "ServiceEntitlementStatusResponse", namespace = "urn:rosettanet:specification:interchange:ServiceEntitlementStatusResponse:xsd:schema:01.01")
public class ServiceEntitlementStatusResponse
    extends JAXBElement<ServiceEntitlementStatusResponseType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:interchange:ServiceEntitlementStatusResponse:xsd:schema:01.01", "ServiceEntitlementStatusResponse");

    public ServiceEntitlementStatusResponse(ServiceEntitlementStatusResponseType value) {
        super(NAME, ((Class) ServiceEntitlementStatusResponseType.class), null, value);
    }

    public ServiceEntitlementStatusResponse() {
        super(NAME, ((Class) ServiceEntitlementStatusResponseType.class), null, null);
    }

}
