package com.example.exoInterface.model;

import com.example.exoInterface.interfaces.IGold;
import com.example.exoInterface.interfaces.ILeather;

import java.util.Random;

public class Drake extends Monster implements IGold, ILeather {
    private final int gold = Helpers.dice6();
    private final int leather = Helpers.dice4();

    public Drake() {
        super();
    }


    @Override
    public int getStamina() {
        return super.getStamina() +1;
    }
    @Override
    public int getLeather() {;
        return leather;
    }
    @Override
    public int getGold() {
        return gold;
    }
}
