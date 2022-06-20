package com.example.demo.model;

import java.util.Random;

public class Car {
    private String model;
    private String brand;
    private int speedMin;
    private int speedMax;

    private final Random rd = new Random();

    public Car(String model, String brand, int speedMin, int speedMax) {
        this.model = model;
        this.brand = brand;
        this.speedMin = speedMin;
        this.speedMax = speedMax;
    }

    //#region Getter & Setter
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeedMin() {
        return speedMin;
    }

    public void setSpeedMin(int speedMin) {
        this.speedMin = speedMin;
    }

    public int getSpeedMax() {
        return speedMax;
    }

    public void setSpeedMax(int speedMax) {
        this.speedMax = speedMax;
    }
    //endregion

    public int randomSpeed() {
        Random rd = new Random();
        return  rd.nextInt(speedMin, speedMax);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", brand='" + brand + '\'' +
                ", speedMin=" + speedMin +
                ", speedMax=" + speedMax +
                '}';
    }
}
