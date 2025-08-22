package com.example.coffeeShop_backend.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "feedback")
public class Feedback {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String email;

    @Column(nullable = false)
    private Integer rating;

    private String visitDate;

    @Column(length = 2000)
    private String comments;


    public Feedback() {

    }

    public Feedback(String name, String email, Integer rating, String visitDate, String comments) {
        this.name = name;
        this.email = email;
        this.rating = rating;
        this.visitDate = visitDate;
        this.comments = comments;
    }


    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Integer getRating() { return rating; }
    public void setRating(Integer rating) { this.rating = rating; }

    public String getVisitDate() { return visitDate; }
    public void setVisitDate(String visitDate) { this.visitDate = visitDate; }

    public String getComments() { return comments; }
    public void setComments(String comments) { this.comments = comments; }
}
