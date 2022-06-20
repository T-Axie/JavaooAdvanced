package com.example.exoInterface.model;

public class Human extends  Heroes{
    public Human() {
        super();
    }

    @Override
    public int getStamina() {
        return super.getStamina() + 1;
    }

    @Override
    public int getStrenght() {
        return super.getStrenght() + 1;
    }
}
