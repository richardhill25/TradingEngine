
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
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}instrumentId"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}description"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}exchangeId"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}relatedExchangeId"/>
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
    "instrumentId",
    "description",
    "exchangeId",
    "relatedExchangeId"
})
@XmlRootElement(name = "index", namespace = "http://www.fpml.org/FpML-5/confirmation")
public class Index {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected InstrumentId instrumentId;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String description;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected ExchangeId exchangeId;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected RelatedExchangeId relatedExchangeId;

    /**
     * Gets the value of the instrumentId property.
     * 
     * @return
     *     possible object is
     *     {@link InstrumentId }
     *     
     */
    public InstrumentId getInstrumentId() {
        return instrumentId;
    }

    /**
     * Sets the value of the instrumentId property.
     * 
     * @param value
     *     allowed object is
     *     {@link InstrumentId }
     *     
     */
    public void setInstrumentId(InstrumentId value) {
        this.instrumentId = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the exchangeId property.
     * 
     * @return
     *     possible object is
     *     {@link ExchangeId }
     *     
     */
    public ExchangeId getExchangeId() {
        return exchangeId;
    }

    /**
     * Sets the value of the exchangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExchangeId }
     *     
     */
    public void setExchangeId(ExchangeId value) {
        this.exchangeId = value;
    }

    /**
     * Gets the value of the relatedExchangeId property.
     * 
     * @return
     *     possible object is
     *     {@link RelatedExchangeId }
     *     
     */
    public RelatedExchangeId getRelatedExchangeId() {
        return relatedExchangeId;
    }

    /**
     * Sets the value of the relatedExchangeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelatedExchangeId }
     *     
     */
    public void setRelatedExchangeId(RelatedExchangeId value) {
        this.relatedExchangeId = value;
    }

}
