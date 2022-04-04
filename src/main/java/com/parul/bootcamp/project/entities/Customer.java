package com.parul.bootcamp.project.entities;

import java.util.List;
import javax.persistence.*;

@Entity
public class Customer {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String contact;

  @OneToOne(cascade = CascadeType.ALL)
  @JoinColumn
  private User user;

  @OneToMany
  @JoinColumn
  List<Order> orders;

  public List<Order> getOrders() {
    return orders;
  }

  @OneToOne
  private Cart cart;

  public void setOrders(List<Order> orders) {
    this.orders = orders;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getContact() {
    return contact;
  }

  public void setContact(String contact) {
    this.contact = contact;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public Cart getCart() {
    return cart;
  }

  public void setCart(Cart cart) {
    this.cart = cart;
  }
}
