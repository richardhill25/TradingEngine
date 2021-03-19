
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
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}tradeHeader"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}varianceOptionTransactionSupplement"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}documentation"/>
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
    "tradeHeader",
    "varianceOptionTransactionSupplement",
    "documentation"
})
@XmlRootElement(name = "trade", namespace = "http://www.fpml.org/FpML-5/confirmation")
public class Trade {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected TradeHeader tradeHeader;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected VarianceOptionTransactionSupplement varianceOptionTransactionSupplement;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected Documentation documentation;

    /**
     * Gets the value of the tradeHeader property.
     * 
     * @return
     *     possible object is
     *     {@link TradeHeader }
     *     
     */
    public TradeHeader getTradeHeader() {
        return tradeHeader;
    }

    /**
     * Sets the value of the tradeHeader property.
     * 
     * @param value
     *     allowed object is
     *     {@link TradeHeader }
     *     
     */
    public void setTradeHeader(TradeHeader value) {
        this.tradeHeader = value;
    }

    /**
     * Gets the value of the varianceOptionTransactionSupplement property.
     * 
     * @return
     *     possible object is
     *     {@link VarianceOptionTransactionSupplement }
     *     
     */
    public VarianceOptionTransactionSupplement getVarianceOptionTransactionSupplement() {
        return varianceOptionTransactionSupplement;
    }

    /**
     * Sets the value of the varianceOptionTransactionSupplement property.
     * 
     * @param value
     *     allowed object is
     *     {@link VarianceOptionTransactionSupplement }
     *     
     */
    public void setVarianceOptionTransactionSupplement(VarianceOptionTransactionSupplement value) {
        this.varianceOptionTransactionSupplement = value;
    }

    /**
     * Gets the value of the documentation property.
     * 
     * @return
     *     possible object is
     *     {@link Documentation }
     *     
     */
    public Documentation getDocumentation() {
        return documentation;
    }

    /**
     * Sets the value of the documentation property.
     * 
     * @param value
     *     allowed object is
     *     {@link Documentation }
     *     
     */
    public void setDocumentation(Documentation value) {
        this.documentation = value;
    }

}
