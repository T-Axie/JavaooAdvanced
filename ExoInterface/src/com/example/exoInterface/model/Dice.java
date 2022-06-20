package com.example.exoInterface.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Dice {
    private ArrayList<Integer> diceList;

    //region Getter & Setter
    public Dice() {
        this.diceList = new ArrayList<>();
    }

    public ArrayList<Integer> getDiceList() {
        return diceList;
    }

    public void setDiceList(ArrayList<Integer> diceList) {
        this.diceList = diceList;
    }
    //endregion

    public int diceStats ()  {
        Random rd = new Random();
        int number = 0;
        for (int i = 0; i < 4; i++) {
            diceList.add(rd.nextInt(1, 6));

        }
        Collections.sort(diceList);
        diceList.remove(0);
        for (int element : diceList) {
            number += element;
        }
        return number;
    }
    public int lifeStats (int endurance) {
        if (endurance < 5) {
            endurance -= 1;
            return endurance;
        }
        else if (endurance < 10) {
            return endurance;
        }
        else if (endurance < 15) {
            endurance += 1;
            return endurance;
        }
        else {
            endurance += 2;
            return endurance;
        }
    }
}
