package com.example.exoInterface.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Helpers {

    private ArrayList<Integer> listDice;

    public Helpers() {
        this.listDice = new ArrayList<>();
    }

    //region Getter & Setter
    public ArrayList<Integer> getListDice() {
        return listDice;
    }

    public void setListDice(ArrayList<Integer> listDice) {
        this.listDice = listDice;
    }
    //endregion

    public static int dice4 () {
        Random rd = new Random();
        return rd.nextInt(1, 4);
    }
    public static int dice6 () {
        Random rd = new Random();
        return rd.nextInt(1, 4);
    }
    public int diceStats (Random rd)  {
        int number = 0;
        for (int i = 0; i < 4; i++) {
            listDice.add(rd.nextInt(1, 6));
        }
        Collections.sort(listDice);
        listDice.remove(0);
        for (int element : listDice) {
            number += element;
        }
        return number;
    }

    public int modifyStats (int endurance) {
        int counter = 0;
        if (endurance < 5) {
            counter -= 1;
            return counter;
        }
        else if (endurance < 10) {
            return counter;
        }
        else if (endurance < 15) {
            counter += 1;
            return counter;
        }
        else {
            counter += 2;
            return counter;
        }
    }
}
