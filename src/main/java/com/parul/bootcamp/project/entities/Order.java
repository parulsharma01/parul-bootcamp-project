package com.parul.bootcamp.project.entities;

import javax.persistence.Id;
import java.util.Date;

public class Order {
    @Id
    private int id;
    private Customer customerId;
    private Double amtPaid;
    private Date dateCreated;
    private String paymentMethod;
    private String custAddCity;
    private String custAddState;
    private String custAddCountry;
    private String custAddAddressLine;
    private String custAddZipCode;
    private String custAddLabel;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Customer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Customer customerId) {
        this.customerId = customerId;
    }

    public Double getAmtPaid() {
        return amtPaid;
    }

    public void setAmtPaid(Double amtPaid) {
        this.amtPaid = amtPaid;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getCustAddCity() {
        return custAddCity;
    }

    public void setCustAddCity(String custAddCity) {
        this.custAddCity = custAddCity;
    }

    public String getCustAddState() {
        return custAddState;
    }

    public void setCustAddState(String custAddState) {
        this.custAddState = custAddState;
    }

    public String getCustAddCountry() {
        return custAddCountry;
    }

    public void setCustAddCountry(String custAddCountry) {
        this.custAddCountry = custAddCountry;
    }

    public String getCustAddAddressLine() {
        return custAddAddressLine;
    }

    public void setCustAddAddressLine(String custAddAddressLine) {
        this.custAddAddressLine = custAddAddressLine;
    }

    public String getCustAddZipCode() {
        return custAddZipCode;
    }

    public void setCustAddZipCode(String custAddZipCode) {
        this.custAddZipCode = custAddZipCode;
    }

    public String getCustAddLabel() {
        return custAddLabel;
    }

    public void setCustAddLabel(String custAddLabel) {
        this.custAddLabel = custAddLabel;
    }
}
