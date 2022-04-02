package com.parul.bootcamp.project.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Category {

  @Id
  private int id;
  private String name;
  private Category parentCategory;

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

  public Category getParentCategory() {
    return parentCategory;
  }

  public void setParentCategory(Category parentCategory) {
    this.parentCategory = parentCategory;
  }
}
