package com.parul.bootcamp.project.entities;

import java.util.Date;
import java.util.List;
import java.util.Set;
import javax.persistence.*;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column(unique = true, nullable = false)
  private String email;
  @Column(nullable = false)
  private String firstName;
  private String middleName;
  private String lastName;
  @Column(nullable = false)
  private String password;
  private boolean isDeleted;
  private boolean isActive;
  private boolean isExpired;
  private boolean isLocked;
  private int invalidAttemptCount;
  private Date passwordUpdateDate;

  @OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
  @JoinColumn
  private Seller seller;

  @ManyToMany
  private Set<Role> roles;

  @OneToMany
  @JoinColumn(name = "user_id")
  private List<Address> addresses;

  public Seller getSeller() {
    return seller;
  }

  public void setSeller(Seller seller) {
    this.seller = seller;
  }

  public Set<Role> getRoles() {
    return roles;
  }

  public void setRoles(Set<Role> roles) {
    this.roles = roles;
  }

  public List<Address> getAddresses() {
    return addresses;
  }

  public void setAddresses(List<Address> addresses) {
    this.addresses = addresses;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getMiddleName() {
    return middleName;
  }

  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public boolean isDeleted() {
    return isDeleted;
  }

  public void setDeleted(boolean deleted) {
    isDeleted = deleted;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean active) {
    isActive = active;
  }

  public boolean isExpired() {
    return isExpired;
  }

  public void setExpired(boolean expired) {
    isExpired = expired;
  }

  public boolean isLocked() {
    return isLocked;
  }

  public void setLocked(boolean locked) {
    isLocked = locked;
  }

  public int getInvalidAttemptCount() {
    return invalidAttemptCount;
  }

  public void setInvalidAttemptCount(int invalidAttemptCount) {
    this.invalidAttemptCount = invalidAttemptCount;
  }

  public Date getPasswordUpdateDate() {
    return passwordUpdateDate;
  }

  public void setPasswordUpdateDate(Date passwordUpdateDate) {
    this.passwordUpdateDate = passwordUpdateDate;
  }
}
