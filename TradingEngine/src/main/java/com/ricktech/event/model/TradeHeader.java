
package com.ricktech.event.model;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}partyTradeIdentifier" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}tradeDate"/>
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
    "partyTradeIdentifier",
    "tradeDate"
})
@XmlRootElement(name = "tradeHeader", namespace = "http://www.fpml.org/FpML-5/confirmation")
public class TradeHeader {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation")
    protected List<PartyTradeIdentifier> partyTradeIdentifier;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String tradeDate;

    /**
     * Gets the value of the partyTradeIdentifier property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the partyTradeIdentifier property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPartyTradeIdentifier().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PartyTradeIdentifier }
     * 
     * 
     */
    public List<PartyTradeIdentifier> getPartyTradeIdentifier() {
        if (partyTradeIdentifier == null) {
            partyTradeIdentifier = new ArrayList<PartyTradeIdentifier>();
        }
        return this.partyTradeIdentifier;
    }

    /**
     * Gets the value of the tradeDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTradeDate() {
        return tradeDate;
    }

    /**
     * Sets the value of the tradeDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTradeDate(String value) {
        this.tradeDate = value;
    }

}
