//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2022.01.14 at 12:36:57 AM IST 
//


package com.trabeya.bank_integration.accounts;

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
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="source_user_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="source_account_no" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="destination_user_id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="destination_account_no" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="transfer_amount" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sourceUserId",
    "sourceAccountNo",
    "destinationUserId",
    "destinationAccountNo",
    "transferAmount"
})
@XmlRootElement(name = "otherFundTransfer")
public class OtherFundTransfer {

    @XmlElement(name = "source_user_id", required = true)
    protected String sourceUserId;
    @XmlElement(name = "source_account_no", required = true)
    protected String sourceAccountNo;
    @XmlElement(name = "destination_user_id", required = true)
    protected String destinationUserId;
    @XmlElement(name = "destination_account_no", required = true)
    protected String destinationAccountNo;
    @XmlElement(name = "transfer_amount")
    protected double transferAmount;

    /**
     * Gets the value of the sourceUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceUserId() {
        return sourceUserId;
    }

    /**
     * Sets the value of the sourceUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceUserId(String value) {
        this.sourceUserId = value;
    }

    /**
     * Gets the value of the sourceAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceAccountNo() {
        return sourceAccountNo;
    }

    /**
     * Sets the value of the sourceAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceAccountNo(String value) {
        this.sourceAccountNo = value;
    }

    /**
     * Gets the value of the destinationUserId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationUserId() {
        return destinationUserId;
    }

    /**
     * Sets the value of the destinationUserId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationUserId(String value) {
        this.destinationUserId = value;
    }

    /**
     * Gets the value of the destinationAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestinationAccountNo() {
        return destinationAccountNo;
    }

    /**
     * Sets the value of the destinationAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestinationAccountNo(String value) {
        this.destinationAccountNo = value;
    }

    /**
     * Gets the value of the transferAmount property.
     * 
     */
    public double getTransferAmount() {
        return transferAmount;
    }

    /**
     * Sets the value of the transferAmount property.
     * 
     */
    public void setTransferAmount(double value) {
        this.transferAmount = value;
    }

}
