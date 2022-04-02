package com.parul.bootcamp.project.entities;

import javax.persistence.Id;

public class ProductVariation {

    @Id
    private int id;
    private String price;
    private String qty;
    private String image;
    private boolean isActive;
    private Product productId;
    private String metadata;
}
