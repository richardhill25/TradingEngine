
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
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}valuationDate"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}futuresPriceValuation"/>
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
    "valuationDate",
    "futuresPriceValuation"
})
@XmlRootElement(name = "valuation", namespace = "http://www.fpml.org/FpML-5/confirmation")
public class Valuation {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected ValuationDate valuationDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String futuresPriceValuation;

    /**
     * Gets the value of the valuationDate property.
     * 
     * @return
     *     possible object is
     *     {@link ValuationDate }
     *     
     */
    public ValuationDate getValuationDate() {
        return valuationDate;
    }

    /**
     * Sets the value of the valuationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ValuationDate }
     *     
     */
    public void setValuationDate(ValuationDate value) {
        this.valuationDate = value;
    }

    /**
     * Gets the value of the futuresPriceValuation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFuturesPriceValuation() {
        return futuresPriceValuation;
    }

    /**
     * Sets the value of the futuresPriceValuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFuturesPriceValuation(String value) {
        this.futuresPriceValuation = value;
    }

}
