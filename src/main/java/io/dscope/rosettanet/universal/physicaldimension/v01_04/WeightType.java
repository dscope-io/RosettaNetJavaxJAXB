
package io.dscope.rosettanet.universal.physicaldimension.v01_04;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import io.dscope.rosettanet.universal.codelist.weighttype.v01_01.WeightTypeType;


/**
 * <p>Java class for WeightType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="WeightType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{urn:rosettanet:specification:universal:PhysicalDimension:xsd:schema:01.04}MeasureType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Type" type="{urn:rosettanet:specification:universal:WeightType:xsd:codelist:01.01}WeightTypeType" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeightType", propOrder = {
    "type"
})
public class WeightType
    extends MeasureType
{

    @XmlElement(name = "Type")
    protected WeightTypeType type;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link WeightTypeType }
     *     
     */
    public WeightTypeType getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link WeightTypeType }
     *     
     */
    public void setType(WeightTypeType value) {
        this.type = value;
    }

}
