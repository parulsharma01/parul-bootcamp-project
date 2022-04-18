package com.parul.bootcamp.project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Role {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private Enum authority;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Enum getAuthority() {
    return authority;
  }

  public void setAuthority(Enum authority) {
    this.authority = authority;
  }
}
