package com.example.exoInterface.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public abstract class Personnage {
    private int stamina;
    private int strenght;
    private int life;

    public Personnage() {
        Helpers helpers = new Helpers();
        this.stamina = helpers.diceStats(new Random());
        this.strenght = helpers.diceStats(new Random());
        this.life = helpers.modifyStats(this.stamina) + this.stamina;

    }

    //region Getter & Setter
    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
    //endregion

    public void hitTarget (Personnage personnage) {
        Random rd = new Random();
        Helpers help = new Helpers();
        int dmg = rd.nextInt(1, 4);
        dmg = dmg + help.modifyStats(personnage.getStrenght());
        personnage.setLife(personnage.getLife() - dmg);
    }
}