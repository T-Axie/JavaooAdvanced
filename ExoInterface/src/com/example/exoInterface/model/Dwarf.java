package com.example.exoInterface.model;

public class Dwarf extends Heroes{
    public Dwarf() {
        super();
    }

    @Override
    public int getStamina() {
        return super.getStamina() + 2;
    }
}
