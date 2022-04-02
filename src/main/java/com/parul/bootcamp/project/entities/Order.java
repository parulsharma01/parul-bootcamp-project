package com.parul.bootcamp.project.entities;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity(name = "Orders")
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @ManyToOne
  private Customer customer;

  @OneToMany
  @JoinColumn
  List<OrderProduct> orderProducts;

  private Double amtPaid;
  @Temporal(TemporalType.DATE)
  private Date dateCreated;
  private String paymentMethod;
  private String custAddCity;
  private String custAddState;
  private String custAddCountry;
  private String custAddAddressLine;
  private String custAddZipCode;
  private String custAddLabel;

  public List<OrderProduct> getOrderProducts() {
    return orderProducts;
  }

  public void setOrderProducts(
      List<OrderProduct> orderProducts) {
    this.orderProducts = orderProducts;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
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
