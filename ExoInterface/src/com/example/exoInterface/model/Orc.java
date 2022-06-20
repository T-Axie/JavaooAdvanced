package com.example.exoInterface.model;

import com.example.exoInterface.interfaces.IGold;

public class Orc extends Monster implements IGold {
    private final int gold = Helpers.dice4();
    public Orc() {
        super();
    }

    @Override
    public int getGold() {
        return gold;
    }

    @Override
    public int getStrenght() {
        return super.getStrenght() +1;
    }
}
