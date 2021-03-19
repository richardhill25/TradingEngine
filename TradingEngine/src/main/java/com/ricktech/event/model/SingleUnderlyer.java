
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
 *         &lt;element ref="{http://www.fpml.org/FpML-5/confirmation}index"/>
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
    "index"
})
@XmlRootElement(name = "singleUnderlyer", namespace = "http://www.fpml.org/FpML-5/confirmation")
public class SingleUnderlyer {

    @XmlElement(namespace = "http://www.fpml.org/FpML-5/confirmation", required = true)
    protected Index index;

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link Index }
     *     
     */
    public Index getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link Index }
     *     
     */
    public void setIndex(Index value) {
        this.index = value;
    }

}
