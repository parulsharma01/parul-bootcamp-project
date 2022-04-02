package com.parul.bootcamp.project.entities;

import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Cart {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  private int quantity;
  private boolean isWishlistItem;

  @OneToMany
  @JoinColumn(name = "cart_id")
  private List<ProductVariation> productVariations;

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

  public boolean isWishlistItem() {
    return isWishlistItem;
  }

  public void setWishlistItem(boolean wishlistItem) {
    isWishlistItem = wishlistItem;
  }

  public List<ProductVariation> getProductVariations() {
    return productVariations;
  }

  public void setProductVariations(
      List<ProductVariation> productVariations) {
    this.productVariations = productVariations;
  }
}
