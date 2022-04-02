package com.parul.bootcamp.project.entities;

import javax.persistence.Id;

public class Cart {
    @Id
    private int id;
    private Customer customerId;
    private int quantity;
    private boolean isWishlistItem;

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

    public ProductVariation getProductVariationId() {
        return productVariationId;
    }

    public void setProductVariationId(ProductVariation productVariationId) {
        this.productVariationId = productVariationId;
    }

    private ProductVariation productVariationId;
}
