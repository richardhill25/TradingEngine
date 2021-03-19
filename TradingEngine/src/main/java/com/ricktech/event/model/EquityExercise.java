
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
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}equityEuropeanExercise"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}automaticExercise"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}equityValuation"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}settlementCurrency"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}settlementType"/>
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
    "equityEuropeanExercise",
    "automaticExercise",
    "equityValuation",
    "settlementCurrency",
    "settlementType"
})
@XmlRootElement(name = "equityExercise", namespace = "http://www.fpml.org/FpML-5/confirmation")
public class EquityExercise {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected EquityEuropeanExercise equityEuropeanExercise;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String automaticExercise;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected EquityValuation equityValuation;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String settlementCurrency;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String settlementType;

    /**
     * Gets the value of the equityEuropeanExercise property.
     * 
     * @return
     *     possible object is
     *     {@link EquityEuropeanExercise }
     *     
     */
    public EquityEuropeanExercise getEquityEuropeanExercise() {
        return equityEuropeanExercise;
    }

    /**
     * Sets the value of the equityEuropeanExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityEuropeanExercise }
     *     
     */
    public void setEquityEuropeanExercise(EquityEuropeanExercise value) {
        this.equityEuropeanExercise = value;
    }

    /**
     * Gets the value of the automaticExercise property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAutomaticExercise() {
        return automaticExercise;
    }

    /**
     * Sets the value of the automaticExercise property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAutomaticExercise(String value) {
        this.automaticExercise = value;
    }

    /**
     * Gets the value of the equityValuation property.
     * 
     * @return
     *     possible object is
     *     {@link EquityValuation }
     *     
     */
    public EquityValuation getEquityValuation() {
        return equityValuation;
    }

    /**
     * Sets the value of the equityValuation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EquityValuation }
     *     
     */
    public void setEquityValuation(EquityValuation value) {
        this.equityValuation = value;
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

}
