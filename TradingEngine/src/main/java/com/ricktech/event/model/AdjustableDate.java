
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
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}unadjustedDate"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}dateAdjustments"/>
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
    "unadjustedDate",
    "dateAdjustments"
})
@XmlRootElement(name = "adjustableDate", namespace = "http://www.fpml.org/FpML-5/confirmation")
public class AdjustableDate {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String unadjustedDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected DateAdjustments dateAdjustments;

    /**
     * Gets the value of the unadjustedDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnadjustedDate() {
        return unadjustedDate;
    }

    /**
     * Sets the value of the unadjustedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnadjustedDate(String value) {
        this.unadjustedDate = value;
    }

    /**
     * Gets the value of the dateAdjustments property.
     * 
     * @return
     *     possible object is
     *     {@link DateAdjustments }
     *     
     */
    public DateAdjustments getDateAdjustments() {
        return dateAdjustments;
    }

    /**
     * Sets the value of the dateAdjustments property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateAdjustments }
     *     
     */
    public void setDateAdjustments(DateAdjustments value) {
        this.dateAdjustments = value;
    }

}
