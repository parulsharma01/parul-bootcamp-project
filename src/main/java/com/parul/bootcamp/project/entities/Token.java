package com.parul.bootcamp.project.entities;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Token {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String userEmail;
    private String activationToken;
    private LocalDateTime createdAt = LocalDateTime.now();

    @Override
    public String toString() {
        return "Token{" +
                "id=" + id +
                ", userEmail='" + userEmail + '\'' +
                ", activationToken='" + activationToken + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getActivationToken() {
        return activationToken;
    }

    public void setActivationToken(String activationToken) {
        this.activationToken = activationToken;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
