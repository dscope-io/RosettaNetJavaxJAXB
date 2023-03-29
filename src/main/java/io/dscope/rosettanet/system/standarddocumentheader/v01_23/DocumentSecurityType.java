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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for DocumentSecurityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DocumentSecurityType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="NonRepudiableReceipt" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PersistentEncryption" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *         &lt;element name="PersistentSignature" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
@XmlType(name = "DocumentSecurityType", propOrder = {
    "nonRepudiableReceipt",
    "persistentEncryption",
    "persistentSignature"
})
public class DocumentSecurityType {

    @XmlElement(name = "NonRepudiableReceipt")
    protected boolean nonRepudiableReceipt;
    @XmlElement(name = "PersistentEncryption")
    protected boolean persistentEncryption;
    @XmlElement(name = "PersistentSignature")
    protected boolean persistentSignature;
    @XmlAttribute(name = "schemaVersion")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaVersion;

    /**
     * Gets the value of the nonRepudiableReceipt property.
     * 
     */
    public boolean isNonRepudiableReceipt() {
        return nonRepudiableReceipt;
    }

    /**
     * Sets the value of the nonRepudiableReceipt property.
     * 
     */
    public void setNonRepudiableReceipt(boolean value) {
        this.nonRepudiableReceipt = value;
    }

    /**
     * Gets the value of the persistentEncryption property.
     * 
     */
    public boolean isPersistentEncryption() {
        return persistentEncryption;
    }

    /**
     * Sets the value of the persistentEncryption property.
     * 
     */
    public void setPersistentEncryption(boolean value) {
        this.persistentEncryption = value;
    }

    /**
     * Gets the value of the persistentSignature property.
     * 
     */
    public boolean isPersistentSignature() {
        return persistentSignature;
    }

    /**
     * Sets the value of the persistentSignature property.
     * 
     */
    public void setPersistentSignature(boolean value) {
        this.persistentSignature = value;
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
