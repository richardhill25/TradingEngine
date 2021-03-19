
package com.ricktech.event.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}header"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}isCorrection"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}correlationId"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}sequenceNumber"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}trade"/>
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}party" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="fpmlVersion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "header",
    "isCorrection",
    "correlationId",
    "sequenceNumber",
    "trade",
    "party"
})
@XmlRootElement(name = "requestConfirmation", namespace = "http://www.fpml.org/FpML-5/confirmation")
public class RequestConfirmation {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected Header header;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String isCorrection;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected CorrelationId correlationId;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected String sequenceNumber;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected Trade trade;
    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation")
    protected List<Party> party;
    @XmlAttribute(name = "fpmlVersion")
    protected String fpmlVersion;

    /**
     * Gets the value of the header property.
     * 
     * @return
     *     possible object is
     *     {@link Header }
     *     
     */
    public Header getHeader() {
        return header;
    }

    /**
     * Sets the value of the header property.
     * 
     * @param value
     *     allowed object is
     *     {@link Header }
     *     
     */
    public void setHeader(Header value) {
        this.header = value;
    }

    /**
     *  5.0 Messaging: added
     *                     <isCorrection>
     *                     <correlationId>
     *                     <sequenceNumber>
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIsCorrection() {
        return isCorrection;
    }

    /**
     * Sets the value of the isCorrection property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIsCorrection(String value) {
        this.isCorrection = value;
    }

    /**
     * Gets the value of the correlationId property.
     * 
     * @return
     *     possible object is
     *     {@link CorrelationId }
     *     
     */
    public CorrelationId getCorrelationId() {
        return correlationId;
    }

    /**
     * Sets the value of the correlationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link CorrelationId }
     *     
     */
    public void setCorrelationId(CorrelationId value) {
        this.correlationId = value;
    }

    /**
     * Gets the value of the sequenceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * Sets the value of the sequenceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSequenceNumber(String value) {
        this.sequenceNumber = value;
    }

    /**
     * Gets the value of the trade property.
     * 
     * @return
     *     possible object is
     *     {@link Trade }
     *     
     */
    public Trade getTrade() {
        return trade;
    }

    /**
     * Sets the value of the trade property.
     * 
     * @param value
     *     allowed object is
     *     {@link Trade }
     *     
     */
    public void setTrade(Trade value) {
        this.trade = value;
    }

    /**
     * Gets the value of the party property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the party property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getParty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Party }
     * 
     * 
     */
    public List<Party> getParty() {
        if (party == null) {
            party = new ArrayList<Party>();
        }
        return this.party;
    }

    /**
     * Gets the value of the fpmlVersion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFpmlVersion() {
        return fpmlVersion;
    }

    /**
     * Sets the value of the fpmlVersion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFpmlVersion(String value) {
        this.fpmlVersion = value;
    }

}
