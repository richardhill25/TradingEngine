
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
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}relativeDate"/>
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
    "relativeDate"
})
@XmlRootElement(name = "settlementDate", namespace = "http://www.fpml.org/FpML-5/confirmation")
public class SettlementDate {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected RelativeDate relativeDate;

    /**
     * Gets the value of the relativeDate property.
     * 
     * @return
     *     possible object is
     *     {@link RelativeDate }
     *     
     */
    public RelativeDate getRelativeDate() {
        return relativeDate;
    }

    /**
     * Sets the value of the relativeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link RelativeDate }
     *     
     */
    public void setRelativeDate(RelativeDate value) {
        this.relativeDate = value;
    }

}
