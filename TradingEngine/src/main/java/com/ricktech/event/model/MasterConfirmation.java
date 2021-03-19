
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
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}masterConfirmationType"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}masterConfirmationDate"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}masterConfirmationAnnexDate"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}masterConfirmationAnnexType"/>
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
    "masterConfirmationType",
    "masterConfirmationDate",
    "masterConfirmationAnnexDate",
    "masterConfirmationAnnexType"
})
@XmlRootElement(name = "masterConfirmation", namespace = "http://www.fpml.org/FpML-5/confirmation")
public class MasterConfirmation {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String masterConfirmationType;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String masterConfirmationDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String masterConfirmationAnnexDate;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String masterConfirmationAnnexType;

    /**
     * Gets the value of the masterConfirmationType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterConfirmationType() {
        return masterConfirmationType;
    }

    /**
     * Sets the value of the masterConfirmationType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterConfirmationType(String value) {
        this.masterConfirmationType = value;
    }

    /**
     * Gets the value of the masterConfirmationDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterConfirmationDate() {
        return masterConfirmationDate;
    }

    /**
     * Sets the value of the masterConfirmationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterConfirmationDate(String value) {
        this.masterConfirmationDate = value;
    }

    /**
     * Gets the value of the masterConfirmationAnnexDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterConfirmationAnnexDate() {
        return masterConfirmationAnnexDate;
    }

    /**
     * Sets the value of the masterConfirmationAnnexDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterConfirmationAnnexDate(String value) {
        this.masterConfirmationAnnexDate = value;
    }

    /**
     * Gets the value of the masterConfirmationAnnexType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMasterConfirmationAnnexType() {
        return masterConfirmationAnnexType;
    }

    /**
     * Sets the value of the masterConfirmationAnnexType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMasterConfirmationAnnexType(String value) {
        this.masterConfirmationAnnexType = value;
    }

}
