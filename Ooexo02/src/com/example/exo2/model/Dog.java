package com.example.exo2.model;

import com.example.exo2.enums.Sexe;

public class Dog extends Animal{
    String collarCollor;
    boolean dresser;
    String race;

    public Dog(String name, int weight, int size, Sexe sexe, int age, String collarCollor, boolean dresser, String race) {
        super(name, weight, size, sexe, age);
        this.collarCollor = collarCollor;
        this.dresser = dresser;
        this.race = race;
        this.setProbabilityToDie(1);
    }

    //region Getter & Setter

    public String getCollarCollor() {
        return collarCollor;
    }

    public void setCollarCollor(String collarCollor) {
        this.collarCollor = collarCollor;
    }

    public boolean isDresser() {
        return dresser;
    }

    public void setDresser(boolean dresser) {
        this.dresser = dresser;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    //endregion

    @Override
    public void yell() {
        System.out.println("Whaouf!");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "collarCollor='" + collarCollor + '\'' +
                ", dresser=" + dresser +
                ", race='" + race + '\'' +
                "} " + super.toString();
    }
}
