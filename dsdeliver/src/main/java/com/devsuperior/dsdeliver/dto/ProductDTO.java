package com.devsuperior.dsdeliver.dto;

import com.devsuperior.dsdeliver.entities.Product;

public class ProductDTO {

    private Long id;
    private String name;
    private Double price;
    private String description;
    private String imageUri;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, Double price, String desciption, String imageUri) {
        this.description = desciption;
        this.id = id;
        this.imageUri = imageUri;
        this.name = name;
        this.price = price;
    }

    public ProductDTO(Product entity) {
        this.description = entity.getDescription();
        this.id = entity.getId();
        this.imageUri = entity.getImageUrl();
        this.name = entity.getName();
        this.price = entity.getPrice();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUri() {
        return imageUri;
    }

    public void setImageUri(String imageUri) {
        this.imageUri = imageUri;
    }
}
