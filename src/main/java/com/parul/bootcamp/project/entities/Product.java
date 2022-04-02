package com.parul.bootcamp.project.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Product {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;
  private String description;
  private boolean isCancellable;
  private boolean isReturnable;
  private String brand;
  private boolean isActive;
  private boolean isDeleted;
  @OneToOne
  private Seller seller;

  @OneToMany
  @JoinColumn(name = "product_id")
  private List<ProductReview> productReviews;

  @OneToOne
  private Category category;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public boolean isCancellable() {
    return isCancellable;
  }

  public void setCancellable(boolean cancellable) {
    isCancellable = cancellable;
  }

  public boolean isReturnable() {
    return isReturnable;
  }

  public void setReturnable(boolean returnable) {
    isReturnable = returnable;
  }

  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public boolean isActive() {
    return isActive;
  }

  public void setActive(boolean active) {
    this.isActive = active;
  }

  public boolean isDeleted() {
    return isDeleted;
  }

  public void setDeleted(boolean deleted) {
    this.isDeleted = deleted;
  }

  public Seller getSeller() {
    return seller;
  }

  public void setSeller(Seller seller) {
    this.seller = seller;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }
}
