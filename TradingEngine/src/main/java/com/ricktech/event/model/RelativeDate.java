
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
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}periodMultiplier"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}period"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}dayType"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}businessDayConvention"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}dateRelativeTo"/>
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
    "periodMultiplier",
    "period",
    "dayType",
    "businessDayConvention",
    "dateRelativeTo"
})
@XmlRootElement(name = "relativeDate", namespace = "http://www.fpml.org/FpML-5/confirmation")
public class RelativeDate {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String periodMultiplier;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String period;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String dayType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String businessDayConvention;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected DateRelativeTo dateRelativeTo;

    /**
     * Gets the value of the periodMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodMultiplier() {
        return periodMultiplier;
    }

    /**
     * Sets the value of the periodMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodMultiplier(String value) {
        this.periodMultiplier = value;
    }

    /**
     * Gets the value of the period property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriod() {
        return period;
    }

    /**
     * Sets the value of the period property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(String value) {
        this.period = value;
    }

    /**
     * Gets the value of the dayType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDayType() {
        return dayType;
    }

    /**
     * Sets the value of the dayType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDayType(String value) {
        this.dayType = value;
    }

    /**
     * Gets the value of the businessDayConvention property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBusinessDayConvention() {
        return businessDayConvention;
    }

    /**
     * Sets the value of the businessDayConvention property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBusinessDayConvention(String value) {
        this.businessDayConvention = value;
    }

    /**
     * Gets the value of the dateRelativeTo property.
     * 
     * @return
     *     possible object is
     *     {@link DateRelativeTo }
     *     
     */
    public DateRelativeTo getDateRelativeTo() {
        return dateRelativeTo;
    }

    /**
     * Sets the value of the dateRelativeTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link DateRelativeTo }
     *     
     */
    public void setDateRelativeTo(DateRelativeTo value) {
        this.dateRelativeTo = value;
    }

}
