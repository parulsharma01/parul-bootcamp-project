package com.parul.bootcamp.project.entities;

import javax.persistence.Id;

public class OrderProduct {
    @Id
    private int id;
    private Order orderId;
    private int quantity;
    private Double price;
    private ProductVariation productVariationId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order getOrderId() {
        return orderId;
    }

    public void setOrderId(Order orderId) {
        this.orderId = orderId;
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
