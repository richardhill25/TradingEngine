
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
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}buyerPartyReference"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}sellerPartyReference"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}optionType"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}equityPremium"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}equityExercise"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}varianceSwapTransactionSupplement"/>
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
    "buyerPartyReference",
    "sellerPartyReference",
    "optionType",
    "equityPremium",
    "equityExercise",
    "varianceSwapTransactionSupplement"
})
@XmlRootElement(name = "varianceOptionTransactionSupplement", namespace = "http://www.fpml.org/FpML-5/confirmation")
public class VarianceOptionTransactionSupplement {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected BuyerPartyReference buyerPartyReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected SellerPartyReference sellerPartyReference;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String optionType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected EquityPremium equityPremium;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected EquityExercise equityExercise;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected VarianceSwapTransactionSupplement varianceSwapTransactionSupplement;

    /**
     * Gets the value of the buyerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link BuyerPartyReference }
     *     
     */
    public BuyerPartyReference getBuyerPartyReference() {
        return buyerPartyReference;
    }

    /**
     * Sets the value of the buyerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link BuyerPartyReference }
     *     
     */
    public void setBuyerPartyReference(BuyerPartyReference value) {
        this.buyerPartyReference = value;
    }

    /**
     * Gets the value of the sellerPartyReference property.
     * 
     * @return
     *     possible object is
     *     {@link SellerPartyReference }
     *     
     */
    public SellerPartyReference getSellerPartyReference() {
        return sellerPartyReference;
    }

    /**
     * Sets the value of the sellerPartyReference property.
     * 
     * @param value
     *     allowed object is
     *     {@link SellerPartyReference }
     *     
     */
    public void setSellerPartyReference(SellerPartyReference value) {
        this.sellerPartyReference = value;
    }

    /**
     * Gets the value of the optionType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOptionType() {
        return optionType;
    }

    /**
     * Sets the value of the optionType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOptionType(String value) {
        this.optionType = value;
    }

    /**
     * Gets the value of the equityPremium property.
     * 
     * @return
     *     possible object is
     *     {@link EquityPremium }
     *     
     */
    public EquityPremium getEquityPremium() {
        return equityPremium;
    }

    /**
     * Sets the value of the equityPremium property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityPremium }
     *     
     */
    public void setEquityPremium(EquityPremium value) {
        this.equityPremium = value;
    }

    /**
     * Gets the value of the equityExercise property.
     * 
     * @return
     *     possible object is
     *     {@link EquityExercise }
     *     
     */
    public EquityExercise getEquityExercise() {
        return equityExercise;
    }

    /**
     * Sets the value of the equityExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityExercise }
     *     
     */
    public void setEquityExercise(EquityExercise value) {
        this.equityExercise = value;
    }

    /**
     * Gets the value of the varianceSwapTransactionSupplement property.
     * 
     * @return
     *     possible object is
     *     {@link VarianceSwapTransactionSupplement }
     *     
     */
    public VarianceSwapTransactionSupplement getVarianceSwapTransactionSupplement() {
        return varianceSwapTransactionSupplement;
    }

    /**
     * Sets the value of the varianceSwapTransactionSupplement property.
     * 
     * @param value
     *     allowed object is
     *     {@link VarianceSwapTransactionSupplement }
     *     
     */
    public void setVarianceSwapTransactionSupplement(VarianceSwapTransactionSupplement value) {
        this.varianceSwapTransactionSupplement = value;
    }

}
