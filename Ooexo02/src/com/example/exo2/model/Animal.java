package com.example.exo2.model;

import com.example.exo2.enums.Sexe;

import java.time.LocalDate;

public abstract class   Animal {
    protected String name;
    private int weight;
    private int size;
    private Sexe sexe;
    private int age;
    private LocalDate arrivalDate;
    private int ageHuman;
    private double probabilityToDie;

    public Animal(String name, int weight, int size, Sexe sexe, int age) {
        this.name = name;
        this.weight = weight;
        this.size = size;
        this.sexe = sexe;
        this.age = age;
        this.arrivalDate = LocalDate.now();

    }

    //region Getter & Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(LocalDate arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public int getAgeHuman() {
        return ageHuman;
    }

    public void setAgeHuman(int ageHuman) {
        this.ageHuman = ageHuman;
    }

    public double getProbabilityToDie() {
        return probabilityToDie;
    }

    public void setProbabilityToDie(double probabilityToDie) {
        this.probabilityToDie = probabilityToDie;
    }

    //endregion

    public abstract void yell();

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", size=" + size +
                ", sexe=" + sexe +
                ", age=" + age +
                ", arrivalDate=" + arrivalDate +
                ", ageHuman=" + ageHuman +
                '}';
    }
}
