
package io.dscope.rosettanet.domain.design.design.v02_15;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class QualData
    extends JAXBElement<QualDataType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Design:xsd:schema:02.15", "QualData");

    public QualData(QualDataType value) {
        super(NAME, ((Class) QualDataType.class), null, value);
    }

    public QualData() {
        super(NAME, ((Class) QualDataType.class), null, null);
    }

}
