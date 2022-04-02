package com.parul.bootcamp.project.entities;

import javax.persistence.Id;

public class OrderStatus {
    @Id
    private int id;
    private Order orderProductId;
    private String fromStatus;
    private String toStatus;
    private String transitionNotesComments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Order getOrderProductId() {
        return orderProductId;
    }

    public void setOrderProductId(Order orderProductId) {
        this.orderProductId = orderProductId;
    }

    public String getFromStatus() {
        return fromStatus;
    }

    public void setFromStatus(String fromStatus) {
        this.fromStatus = fromStatus;
    }

    public String getToStatus() {
        return toStatus;
    }

    public void setToStatus(String toStatus) {
        this.toStatus = toStatus;
    }

    public String getTransitionNotesComments() {
        return transitionNotesComments;
    }

    public void setTransitionNotesComments(String transitionNotesComments) {
        this.transitionNotesComments = transitionNotesComments;
    }
}
