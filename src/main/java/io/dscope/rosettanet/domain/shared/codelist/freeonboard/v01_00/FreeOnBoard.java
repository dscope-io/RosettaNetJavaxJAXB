
package io.dscope.rosettanet.domain.shared.codelist.freeonboard.v01_00;

import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;

public class FreeOnBoard
    extends JAXBElement<FreeOnBoardType>
{

    protected final static QName NAME = new QName("urn:rosettanet:specification:domain:Shared:FreeOnBoard:xsd:codelist:01.00", "FreeOnBoard");

    public FreeOnBoard(FreeOnBoardType value) {
        super(NAME, ((Class) FreeOnBoardType.class), null, value);
    }

    public FreeOnBoard() {
        super(NAME, ((Class) FreeOnBoardType.class), null, null);
    }

}
