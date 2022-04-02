package com.parul.bootcamp.project.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {

  @Id
  private int id;
  private String name;
  private String description;
  private boolean isCancellable;
  private boolean isReturnable;
  private String brand;
  private boolean isActive;
  private boolean isDeleted;
  private Seller sellerId;
  private Category categoryId;

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

  public Seller getSellerId() {
    return sellerId;
  }

  public void setSellerId(Seller sellerId) {
    this.sellerId = sellerId;
  }

  public Category getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Category categoryId) {
    this.categoryId = categoryId;
  }
}
