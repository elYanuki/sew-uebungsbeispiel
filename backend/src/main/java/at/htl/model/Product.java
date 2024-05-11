package at.htl.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Product {
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    @Id
    private
    Long id;
    private String name;
    private Double price;

    public Product( String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
