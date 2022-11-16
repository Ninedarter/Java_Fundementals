package day14_1113;

import java.time.LocalDate;

public class Car {
    private Integer id;
    private String brand;
    private String model;
    private String color;
    private int weight;
    private String country;
    private LocalDate createdDate;


    public Car() {
    }

    public Car(int id, String brand, String model, String color, int weight, String country, LocalDate createdDate) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.weight = weight;
        this.country = country;
        this.createdDate = createdDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(LocalDate createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", country='" + country + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }
}




