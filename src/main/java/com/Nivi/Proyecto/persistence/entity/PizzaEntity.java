package com.Nivi.Proyecto.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Table(name="pizza")
@Getter
@Setter
@NoArgsConstructor
public class PizzaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pizza", nullable = false,columnDefinition = "INT(8)")
    private Integer idPizza;

    @Column(nullable = false, length = 30, unique = true)
    private String name;

    @Column(nullable = false, length = 150)
    private String description;

    @Column(nullable = false, columnDefinition = "Decimal(5,2)")
    private Double price;

    @Column
    private Boolean vegetarian;

    @Column
    private Boolean vegan;

    @Column(nullable = false)
    private Boolean available;


    //Getters y Setters
    public Integer getIdPizza() {
        return idPizza;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public Boolean getVegetarian() {
        return vegetarian;
    }

    public Boolean getVegan() {
        return vegan;
    }

    public Boolean getAvailable() {
        return available;
    }


}