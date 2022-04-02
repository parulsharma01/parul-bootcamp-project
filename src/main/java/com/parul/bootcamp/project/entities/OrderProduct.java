package com.parul.bootcamp.project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class OrderProduct {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private int quantity;
  private Double price;

  @OneToOne
  @JoinColumn
  private ProductVariation productVariationId;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  public ProductVariation getProductVariationId() {
    return productVariationId;
  }

  public void setProductVariationId(ProductVariation productVariationId) {
    this.productVariationId = productVariationId;
  }

}
