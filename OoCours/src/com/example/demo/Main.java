package com.example.demo;

import com.example.demo.model.Competition;
import com.example.demo.model.Sportif;

public class Main {
    public static void main(String[] args) {
        Sportif David = new Sportif("Demeyer","David", 01/01/2000);
        Sportif Charles = new Sportif("Dupont","Charles", 17012000);
        Sportif Henri = new Sportif("Pinard","Henri", 17012000);
        Sportif Jacques = new Sportif("Dubois","Jacques", 17012000);
        Sportif Daniel = new Sportif("Serrano","Daniel", 17012000);
        Sportif Jessica = new Sportif("Dupuis","Jessica", 17012000);
        Sportif Marion = new Sportif("Nitelet","Marion", 17012000);
        Sportif Aurelie = new Sportif("Macron","Aurelie", 17012000);

        Competition Tennis = new Competition(3);

        Tennis.subscribe(David);
        Tennis.subscribe(Charles);
        Tennis.subscribe(Henri);

        System.out.println(Tennis.getListParticipant());
        }
    }
}
