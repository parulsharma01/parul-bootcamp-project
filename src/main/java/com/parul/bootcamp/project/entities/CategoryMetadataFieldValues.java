package com.parul.bootcamp.project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class CategoryMetadataFieldValues {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  int id;

  @OneToOne
  private CategoryMetadataField categoryMetadataField;

  @OneToOne
  private Category category;

  private String multipleValues;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public CategoryMetadataField getCategoryMetadataField() {
    return categoryMetadataField;
  }

  public void setCategoryMetadataField(
      CategoryMetadataField categoryMetadataField) {
    this.categoryMetadataField = categoryMetadataField;
  }

  public Category getCategory() {
    return category;
  }

  public void setCategory(Category category) {
    this.category = category;
  }


  public String getMultipleValues() {
    return multipleValues;
  }

  public void setMultipleValues(String multipleValues) {
    this.multipleValues = multipleValues;
  }
}
