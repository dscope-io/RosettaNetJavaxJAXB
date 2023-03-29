
package io.dscope.rosettanet.domain.logistics.codelist.portidentifierauthoritycode.v01_03;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class PortIdentifierAuthorityCode
    extends JAXBElement<PortIdentifierAuthorityCodeType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Logistics:PortIdentifierAuthorityCode:xsd:codelist:01.03", "PortIdentifierAuthorityCode");

    public PortIdentifierAuthorityCode(PortIdentifierAuthorityCodeType value) {
        super(NAME, ((Class) PortIdentifierAuthorityCodeType.class), null, value);
    }

    public PortIdentifierAuthorityCode() {
        super(NAME, ((Class) PortIdentifierAuthorityCodeType.class), null, null);
    }

}