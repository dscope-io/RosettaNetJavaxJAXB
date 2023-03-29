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

package io.dscope.rosettanet.system.standarddocumentheader.v01_10;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import io.dscope.rosettanet.system.codelist.tpirfiletype.v01_01.TPIRFileTypeType;


/**
 * <p>Java class for TpirPipIdentificationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TpirPipIdentificationType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="FileType" type="{urn:rosettanet:specification:system:TPIRFileType:xsd:codelist:01.01}TPIRFileTypeType" minOccurs="0"/&gt;
 *         &lt;element name="PartnerId" type="{urn:rosettanet:specification:universal:DataType:xsd:schema:01.03}DUNSPlus4Type"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.10}PipIdentifier"/&gt;
 *         &lt;element ref="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.10}PipVersion"/&gt;
 *         &lt;element name="TpirBusinessProcessIdentifier" type="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.10}BusinessProcessIdentifierType" minOccurs="0"/&gt;
 *         &lt;element name="TpirPipVersion" type="{urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.10}VersionIdentifierType"/&gt;
 *         &lt;element name="Uri" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/&gt;
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
@XmlType(name = "TpirPipIdentificationType", propOrder = {
    "fileType",
    "partnerId",
    "pipIdentifier",
    "pipVersion",
    "tpirBusinessProcessIdentifier",
    "tpirPipVersion",
    "uri"
})
public class TpirPipIdentificationType {

    @XmlElement(name = "FileType")
    protected TPIRFileTypeType fileType;
    @XmlElement(name = "PartnerId", required = true)
    protected String partnerId;
    @XmlElementRef(name = "PipIdentifier", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.10", type = PipIdentifier.class)
    protected PipIdentifier pipIdentifier;
    @XmlElementRef(name = "PipVersion", namespace = "urn:rosettanet:specification:system:StandardDocumentHeader:xsd:schema:01.10", type = PipVersion.class)
    protected PipVersion pipVersion;
    @XmlElement(name = "TpirBusinessProcessIdentifier")
    protected String tpirBusinessProcessIdentifier;
    @XmlElement(name = "TpirPipVersion", required = true)
    protected String tpirPipVersion;
    @XmlElement(name = "Uri")
    @XmlSchemaType(name = "anyURI")
    protected String uri;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the fileType property.
     * 
     * @return
     *     possible object is
     *     {@link TPIRFileTypeType }
     *     
     */
    public TPIRFileTypeType getFileType() {
        return fileType;
    }

    /**
     * Sets the value of the fileType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPIRFileTypeType }
     *     
     */
    public void setFileType(TPIRFileTypeType value) {
        this.fileType = value;
    }

    /**
     * Gets the value of the partnerId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPartnerId() {
        return partnerId;
    }

    /**
     * Sets the value of the partnerId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPartnerId(String value) {
        this.partnerId = value;
    }

    /**
     * Gets the value of the pipIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link PipIdentifier }
     *     
     */
    public PipIdentifier getPipIdentifier() {
        return pipIdentifier;
    }

    /**
     * Sets the value of the pipIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link PipIdentifier }
     *     
     */
    public void setPipIdentifier(PipIdentifier value) {
        this.pipIdentifier = value;
    }

    /**
     * Gets the value of the pipVersion property.
     * 
     * @return
     *     possible object is
     *     {@link PipVersion }
     *     
     */
    public PipVersion getPipVersion() {
        return pipVersion;
    }

    /**
     * Sets the value of the pipVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link PipVersion }
     *     
     */
    public void setPipVersion(PipVersion value) {
        this.pipVersion = value;
    }

    /**
     * Gets the value of the tpirBusinessProcessIdentifier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpirBusinessProcessIdentifier() {
        return tpirBusinessProcessIdentifier;
    }

    /**
     * Sets the value of the tpirBusinessProcessIdentifier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpirBusinessProcessIdentifier(String value) {
        this.tpirBusinessProcessIdentifier = value;
    }

    /**
     * Gets the value of the tpirPipVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpirPipVersion() {
        return tpirPipVersion;
    }

    /**
     * Sets the value of the tpirPipVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpirPipVersion(String value) {
        this.tpirPipVersion = value;
    }

    /**
     * Gets the value of the uri property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUri() {
        return uri;
    }

    /**
     * Sets the value of the uri property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUri(String value) {
        this.uri = value;
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
