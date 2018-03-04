package com.sda.sorting.generics.classes;

public class Car implements ICar {
    private String name;
    private String brand;
    private int pojemnosc;

    public Car(String name, String brand, int pojemnosc) {
        this.name = name;
        this.brand = brand;
        this.pojemnosc = pojemnosc;
    }

    @Override
    public void drive() {
        System.out.println("Car drive");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", pojemnosc=" + pojemnosc +
                '}';
    }
}
