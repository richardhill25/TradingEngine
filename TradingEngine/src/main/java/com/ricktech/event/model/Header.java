
package com.ricktech.event.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}messageId"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}sentBy"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}sendTo"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}creationTimestamp"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "messageId",
    "sentBy",
    "sendTo",
    "creationTimestamp"
})
@XmlRootElement(name = "header", namespace = "http://www.fpml.org/FpML-5/confirmation")
public class Header {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected MessageId messageId;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String sentBy;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String sendTo;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String creationTimestamp;

    /**
     * Gets the value of the messageId property.
     * 
     * @return
     *     possible object is
     *     {@link MessageId }
     *     
     */
    public MessageId getMessageId() {
        return messageId;
    }

    /**
     * Sets the value of the messageId property.
     * 
     * @param value
     *     allowed object is
     *     {@link MessageId }
     *     
     */
    public void setMessageId(MessageId value) {
        this.messageId = value;
    }

    /**
     * Gets the value of the sentBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSentBy() {
        return sentBy;
    }

    /**
     * Sets the value of the sentBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSentBy(String value) {
        this.sentBy = value;
    }

    /**
     * Gets the value of the sendTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSendTo() {
        return sendTo;
    }

    /**
     * Sets the value of the sendTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSendTo(String value) {
        this.sendTo = value;
    }

    /**
     * Gets the value of the creationTimestamp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreationTimestamp() {
        return creationTimestamp;
    }

    /**
     * Sets the value of the creationTimestamp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreationTimestamp(String value) {
        this.creationTimestamp = value;
    }

}
