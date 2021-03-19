
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
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}closingLevel"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}expectedN"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}varianceAmount"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}varianceStrikePrice"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}varianceCap"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}vegaNotionalAmount"/>
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
    "closingLevel",
    "expectedN",
    "varianceAmount",
    "varianceStrikePrice",
    "varianceCap",
    "vegaNotionalAmount"
})
@XmlRootElement(name = "variance", namespace = "http://www.fpml.org/FpML-5/confirmation")
public class Variance {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String closingLevel;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String expectedN;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected VarianceAmount varianceAmount;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String varianceStrikePrice;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String varianceCap;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String vegaNotionalAmount;

    /**
     * Gets the value of the closingLevel property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClosingLevel() {
        return closingLevel;
    }

    /**
     * Sets the value of the closingLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClosingLevel(String value) {
        this.closingLevel = value;
    }

    /**
     * Gets the value of the expectedN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpectedN() {
        return expectedN;
    }

    /**
     * Sets the value of the expectedN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpectedN(String value) {
        this.expectedN = value;
    }

    /**
     * Gets the value of the varianceAmount property.
     * 
     * @return
     *     possible object is
     *     {@link VarianceAmount }
     *     
     */
    public VarianceAmount getVarianceAmount() {
        return varianceAmount;
    }

    /**
     * Sets the value of the varianceAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link VarianceAmount }
     *     
     */
    public void setVarianceAmount(VarianceAmount value) {
        this.varianceAmount = value;
    }

    /**
     * Gets the value of the varianceStrikePrice property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVarianceStrikePrice() {
        return varianceStrikePrice;
    }

    /**
     * Sets the value of the varianceStrikePrice property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVarianceStrikePrice(String value) {
        this.varianceStrikePrice = value;
    }

    /**
     * Gets the value of the varianceCap property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVarianceCap() {
        return varianceCap;
    }

    /**
     * Sets the value of the varianceCap property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVarianceCap(String value) {
        this.varianceCap = value;
    }

    /**
     * Gets the value of the vegaNotionalAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVegaNotionalAmount() {
        return vegaNotionalAmount;
    }

    /**
     * Sets the value of the vegaNotionalAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVegaNotionalAmount(String value) {
        this.vegaNotionalAmount = value;
    }

}
