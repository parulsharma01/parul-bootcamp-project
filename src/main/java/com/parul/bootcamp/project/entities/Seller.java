package com.parul.bootcamp.project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Seller {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String gst;
  private String companyContact;
  private String companyName;

  @OneToOne
  private User user;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getGst() {
    return gst;
  }

  public void setGst(String gst) {
    this.gst = gst;
  }

  public String getCompanyContact() {
    return companyContact;
  }

  public void setCompanyContact(String companyContact) {
    this.companyContact = companyContact;
  }

  public String getCompanyName() {
    return companyName;
  }

  public void setCompanyName(String companyName) {
    this.companyName = companyName;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }
}
