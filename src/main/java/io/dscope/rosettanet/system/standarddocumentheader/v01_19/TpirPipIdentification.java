
package io.dscope.rosettanet.system.standarddocumentheader.v01_19;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class TpirPipIdentification
    extends JAXBElement<TpirPipIdentificationType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.19", "TpirPipIdentification");

    public TpirPipIdentification(TpirPipIdentificationType value) {
        super(NAME, ((Class) TpirPipIdentificationType.class), null, value);
    }

    public TpirPipIdentification() {
        super(NAME, ((Class) TpirPipIdentificationType.class), null, null);
    }

}
