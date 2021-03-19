
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
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}varianceLeg"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}multipleExchangeIndexAnnexFallback"/>
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
    "varianceLeg",
    "multipleExchangeIndexAnnexFallback"
})
@XmlRootElement(name = "varianceSwapTransactionSupplement", namespace = "http://www.fpml.org/FpML-5/confirmation")
public class VarianceSwapTransactionSupplement {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected VarianceLeg varianceLeg;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String multipleExchangeIndexAnnexFallback;

    /**
     * Gets the value of the varianceLeg property.
     * 
     * @return
     *     possible object is
     *     {@link VarianceLeg }
     *     
     */
    public VarianceLeg getVarianceLeg() {
        return varianceLeg;
    }

    /**
     * Sets the value of the varianceLeg property.
     * 
     * @param value
     *     allowed object is
     *     {@link VarianceLeg }
     *     
     */
    public void setVarianceLeg(VarianceLeg value) {
        this.varianceLeg = value;
    }

    /**
     * Gets the value of the multipleExchangeIndexAnnexFallback property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMultipleExchangeIndexAnnexFallback() {
        return multipleExchangeIndexAnnexFallback;
    }

    /**
     * Sets the value of the multipleExchangeIndexAnnexFallback property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMultipleExchangeIndexAnnexFallback(String value) {
        this.multipleExchangeIndexAnnexFallback = value;
    }

}
