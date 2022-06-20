package com.example.demo.model;

public class Circuit {
    private String name;
    private int fullTurnKm;

    public Circuit(String name, int fullTurnKm) {
        this.name = name;
        this.fullTurnKm = fullTurnKm;
    }

    //region Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFullTurnKm() {
        return fullTurnKm;
    }

    public void setFullTurnKm(int fullTurnKm) {
        this.fullTurnKm = fullTurnKm;
    }
    //endregion
}
