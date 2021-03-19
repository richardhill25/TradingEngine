
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
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}underlyer"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}settlementType"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}settlementDate"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}settlementCurrency"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}valuation"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}amount"/>
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
    "underlyer",
    "settlementType",
    "settlementDate",
    "settlementCurrency",
    "valuation",
    "amount"
})
@XmlRootElement(name = "varianceLeg", namespace = "http://www.fpml.org/FpML-5/confirmation")
public class VarianceLeg {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected PayerPartyReference payerPartyReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected ReceiverPartyReference receiverPartyReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected Underlyer underlyer;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String settlementType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected SettlementDate settlementDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String settlementCurrency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected Valuation valuation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected Amount amount;

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
     * Gets the value of the underlyer property.
     * 
     * @return
     *     possible object is
     *     {@link Underlyer }
     *     
     */
    public Underlyer getUnderlyer() {
        return underlyer;
    }

    /**
     * Sets the value of the underlyer property.
     * 
     * @param value
     *     allowed object is
     *     {@link Underlyer }
     *     
     */
    public void setUnderlyer(Underlyer value) {
        this.underlyer = value;
    }

    /**
     * Gets the value of the settlementType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementType() {
        return settlementType;
    }

    /**
     * Sets the value of the settlementType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementType(String value) {
        this.settlementType = value;
    }

    /**
     * Gets the value of the settlementDate property.
     * 
     * @return
     *     possible object is
     *     {@link SettlementDate }
     *     
     */
    public SettlementDate getSettlementDate() {
        return settlementDate;
    }

    /**
     * Sets the value of the settlementDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link SettlementDate }
     *     
     */
    public void setSettlementDate(SettlementDate value) {
        this.settlementDate = value;
    }

    /**
     * Gets the value of the settlementCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSettlementCurrency() {
        return settlementCurrency;
    }

    /**
     * Sets the value of the settlementCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSettlementCurrency(String value) {
        this.settlementCurrency = value;
    }

    /**
     * Gets the value of the valuation property.
     * 
     * @return
     *     possible object is
     *     {@link Valuation }
     *     
     */
    public Valuation getValuation() {
        return valuation;
    }

    /**
     * Sets the value of the valuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Valuation }
     *     
     */
    public void setValuation(Valuation value) {
        this.valuation = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     * @return
     *     possible object is
     *     {@link Amount }
     *     
     */
    public Amount getAmount() {
        return amount;
    }

    /**
     * Sets the value of the amount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Amount }
     *     
     */
    public void setAmount(Amount value) {
        this.amount = value;
    }

}
