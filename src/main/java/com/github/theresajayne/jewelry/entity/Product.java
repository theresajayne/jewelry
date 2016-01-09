package com.github.theresajayne.jewelry.entity;

import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.awt.*;

/**
 * Created by Theresa on 27/12/2015.
 */
@Entity
public class Product
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private long Id;
    @ManyToOne
    private Category category;
    @Column(name = "TITLE")
    private String title;
    @Column(name = "DESCRIPTION")
    private String description;
    @Column(name = "QUANTITY")
    private long quantity;
    @Column(name = "PRICE")
    private long price; //In pence we will do the math on entry.
    @Column(name = "COST")
    private long cost; //The cost so we can automate the price generation based on markup and perform profit/ loss from the DB
    @Column(name = "CARAT")
    private float carat;
    @Column(name = "CUT")
    private String cut;
    @Column(name = "CLARITY")
    private String clarity;
    @Column(name = "SHAPE")
    private String shape;
    @Lob
    @Column(name = "IMAGE")
    private Image photo;


    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
        this.quantity = quantity;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getCost() {
        return cost;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public float getCarat() {
        return carat;
    }

    public void setCarat(float carat) {
        this.carat = carat;
    }

    public String getCut() {
        return cut;
    }

    public void setCut(String cut) {
        this.cut = cut;
    }

    public String getClarity() {
        return clarity;
    }

    public void setClarity(String clarity) {
        this.clarity = clarity;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }
}
