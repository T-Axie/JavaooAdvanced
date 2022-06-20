package com.example.exoInterface.model;

import com.example.exoInterface.interfaces.ILeather;

import java.util.Random;

public class Wolf extends Monster implements ILeather {
    private final int leather = Helpers.dice4();
    public Wolf() {
        super();
    }

    @Override
    public int getLeather() {
        return leather;
    }
}
