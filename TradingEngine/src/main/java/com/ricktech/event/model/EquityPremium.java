
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
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}payerPartyReference"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}receiverPartyReference"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}paymentAmount"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}paymentDate"/>
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
    "payerPartyReference",
    "receiverPartyReference",
    "paymentAmount",
    "paymentDate"
})
@XmlRootElement(name = "equityPremium", namespace = "http://www.fpml.org/FpML-5/confirmation")
public class EquityPremium {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected PayerPartyReference payerPartyReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected ReceiverPartyReference receiverPartyReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected PaymentAmount paymentAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected PaymentDate paymentDate;

    /**
     * Gets the value of the payerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link PayerPartyReference }
     *     
     */
    public PayerPartyReference getPayerPartyReference() {
        return payerPartyReference;
    }

    /**
     * Sets the value of the payerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayerPartyReference }
     *     
     */
    public void setPayerPartyReference(PayerPartyReference value) {
        this.payerPartyReference = value;
    }

    /**
     * Gets the value of the receiverPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link ReceiverPartyReference }
     *     
     */
    public ReceiverPartyReference getReceiverPartyReference() {
        return receiverPartyReference;
    }

    /**
     * Sets the value of the receiverPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReceiverPartyReference }
     *     
     */
    public void setReceiverPartyReference(ReceiverPartyReference value) {
        this.receiverPartyReference = value;
    }

    /**
     * Gets the value of the paymentAmount property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentAmount }
     *     
     */
    public PaymentAmount getPaymentAmount() {
        return paymentAmount;
    }

    /**
     * Sets the value of the paymentAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentAmount }
     *     
     */
    public void setPaymentAmount(PaymentAmount value) {
        this.paymentAmount = value;
    }

    /**
     * Gets the value of the paymentDate property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentDate }
     *     
     */
    public PaymentDate getPaymentDate() {
        return paymentDate;
    }

    /**
     * Sets the value of the paymentDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentDate }
     *     
     */
    public void setPaymentDate(PaymentDate value) {
        this.paymentDate = value;
    }

}
