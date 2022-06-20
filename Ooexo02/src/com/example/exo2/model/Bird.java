package com.example.exo2.model;

import com.example.exo2.enums.Habitat;
import com.example.exo2.enums.Sexe;

public class Bird extends Animal{
    String color;
    Habitat habitat;

    public Bird(String name, int weight, int size, Sexe sexe, int age, String color, Habitat habitat) {
        super(name, weight, size, sexe, age);
        this.color = color;
        this.habitat = habitat;
        this.setProbabilityToDie(3);
    }

    //region Getter & Setter

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    //endregion

    @Override
    public void yell() {
        System.out.println("KiQuikikiQuiquikiki");
    }

    @Override
    public String toString() {
        return "Bird{" +
                "color='" + color + '\'' +
                ", habitat=" + habitat +
                "} " + super.toString();
    }
}
