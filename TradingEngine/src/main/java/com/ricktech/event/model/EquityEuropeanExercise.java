
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
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}expirationDate"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}equityExpirationTimeType"/>
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
    "expirationDate",
    "equityExpirationTimeType"
})
@XmlRootElement(name = "equityEuropeanExercise", namespace = "http://www.fpml.org/FpML-5/confirmation")
public class EquityEuropeanExercise {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected ExpirationDate expirationDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String equityExpirationTimeType;

    /**
     * Gets the value of the expirationDate property.
     * 
     * @return
     *     possible object is
     *     {@link ExpirationDate }
     *     
     */
    public ExpirationDate getExpirationDate() {
        return expirationDate;
    }

    /**
     * Sets the value of the expirationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpirationDate }
     *     
     */
    public void setExpirationDate(ExpirationDate value) {
        this.expirationDate = value;
    }

    /**
     * Gets the value of the equityExpirationTimeType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEquityExpirationTimeType() {
        return equityExpirationTimeType;
    }

    /**
     * Sets the value of the equityExpirationTimeType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEquityExpirationTimeType(String value) {
        this.equityExpirationTimeType = value;
    }

}
