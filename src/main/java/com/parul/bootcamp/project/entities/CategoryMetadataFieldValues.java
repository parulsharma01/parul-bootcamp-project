package com.parul.bootcamp.project.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CategoryMetadataFieldValues {

  @Id
  int id;
  private CategoryMetadataField categoryMetadataFieldId;
  private Category categoryId;
  private String values;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public CategoryMetadataField getCategoryMetadataFieldId() {
    return categoryMetadataFieldId;
  }

  public void setCategoryMetadataFieldId(CategoryMetadataField categoryMetadataFieldId) {
    this.categoryMetadataFieldId = categoryMetadataFieldId;
  }

  public Category getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Category categoryId) {
    this.categoryId = categoryId;
  }

  public String getValues() {
    return values;
  }

  public void setValues(String values) {
    this.values = values;
  }
}
