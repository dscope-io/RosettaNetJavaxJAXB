/*-
 * ===LICENSE_START===
 * RosettaNet JAXB
 * ===
 * Copyright (C) 2023 Exilor Inc.
 * ===
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *    http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ===LICENSE_END===
 */

package io.dscope.rosettanet.system.standarddocumentheader.v01_23;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DocumentIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Identifier" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Type" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;choice&gt;
 *           &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.23}StandardDocumentIdentification"/&gt;
 *           &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.23}TpirPipIdentification"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="schemaVersion" type="{http://www.w3.org/2001/XMLSchema}token" /&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentIdentificationType", propOrder = {
    "identifier",
    "type",
    "standardDocumentIdentification",
    "tpirPipIdentification"
})
public class DocumentIdentificationType {

    @XmlElement(name = "Identifier", required = true)
    protected String identifier;
    @XmlElement(name = "Type")
    protected String type;
    @XmlElementRef(name = "StandardDocumentIdentification", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.23", type = StandardDocumentIdentification.class, required = false)
    protected StandardDocumentIdentification standardDocumentIdentification;
    @XmlElementRef(name = "TpirPipIdentification", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.23", type = TpirPipIdentification.class, required = false)
    protected TpirPipIdentification tpirPipIdentification;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the identifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Sets the value of the identifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdentifier(String value) {
        this.identifier = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the standardDocumentIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link StandardDocumentIdentification }
     *     
     */
    public StandardDocumentIdentification getStandardDocumentIdentification() {
        return standardDocumentIdentification;
    }

    /**
     * Sets the value of the standardDocumentIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardDocumentIdentification }
     *     
     */
    public void setStandardDocumentIdentification(StandardDocumentIdentification value) {
        this.standardDocumentIdentification = value;
    }

    /**
     * Gets the value of the tpirPipIdentification property.
     * 
     * @return
     *     possible object is
     *     {@link TpirPipIdentification }
     *     
     */
    public TpirPipIdentification getTpirPipIdentification() {
        return tpirPipIdentification;
    }

    /**
     * Sets the value of the tpirPipIdentification property.
     * 
     * @param value
     *     allowed object is
     *     {@link TpirPipIdentification }
     *     
     */
    public void setTpirPipIdentification(TpirPipIdentification value) {
        this.tpirPipIdentification = value;
    }

    /**
     * Gets the value of the schemaVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaVersion() {
        return schemaVersion;
    }

    /**
     * Sets the value of the schemaVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaVersion(String value) {
        this.schemaVersion = value;
    }

}
