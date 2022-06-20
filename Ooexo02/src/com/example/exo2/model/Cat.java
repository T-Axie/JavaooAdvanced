package com.example.exo2.model;

import com.example.exo2.enums.Sexe;

public class Cat extends Animal{
    String caractere;
    boolean clawCut;
    boolean longhair;

    public Cat(String name, int weight, int size, Sexe sexe, int age, String caractere, boolean clawCut, boolean longhair) {
        super(name, weight, size, sexe, age);
        this.caractere = caractere;
        this.clawCut = clawCut;
        this.longhair = longhair;
        this.setProbabilityToDie(50);
    }

    //region Getter & Setter

    public String getCaractere() {
        return caractere;
    }

    public void setCaractere(String caractere) {
        this.caractere = caractere;
    }

    public boolean isClawCut() {
        return clawCut;
    }

    public void setClawCut(boolean clawCut) {
        this.clawCut = clawCut;
    }

    public boolean isLonghair() {
        return longhair;
    }

    public void setLonghair(boolean longhair) {
        this.longhair = longhair;
    }

    //endregion

    @Override
    public void yell() {
        System.out.println("Miaouuu");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "caractere='" + caractere + '\'' +
                ", clawCut=" + clawCut +
                ", longhair=" + longhair +
                "} " + super.toString();
    }
}

