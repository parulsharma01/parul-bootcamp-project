package com.parul.bootcamp.project.entities;

import com.parul.bootcamp.project.entities.enums.OrderStatusEnum;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class OrderStatus {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @OneToOne
  @JoinColumn
  private OrderProduct orderProductId;

  @Enumerated(EnumType.STRING)
  private OrderStatusEnum fromStatus;
  @Enumerated(EnumType.STRING)
  private OrderStatusEnum toStatus;
  private String transitionNotesComments;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public OrderProduct getOrderProductId() {
    return orderProductId;
  }

  public void setOrderProductId(OrderProduct orderProductId) {
    this.orderProductId = orderProductId;
  }

  public OrderStatusEnum getFromStatus() {
    return fromStatus;
  }

  public void setFromStatus(OrderStatusEnum fromStatus) {
    this.fromStatus = fromStatus;
  }

  public OrderStatusEnum getToStatus() {
    return toStatus;
  }

  public void setToStatus(OrderStatusEnum toStatus) {
    this.toStatus = toStatus;
  }

  public String getTransitionNotesComments() {
    return transitionNotesComments;
  }

  public void setTransitionNotesComments(String transitionNotesComments) {
    this.transitionNotesComments = transitionNotesComments;
  }
}
