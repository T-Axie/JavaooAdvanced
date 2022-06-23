package com.example.demo;

import com.example.demo.exeption.ParticipantLimitException;
import com.example.demo.model.Competition;
import com.example.demo.model.Sportif;

public class Main {
    public static void main(String[] args) {
        Sportif David = new Sportif("Demeyer", "David", null);
        Sportif Charles = new Sportif("Dupont", "Charles", null);
        Sportif Henri = new Sportif("Pinard", "Henri", null);
        Sportif Jacques = new Sportif("Dubois", "Jacques", null);
        Sportif Daniel = new Sportif("Serrano", "Daniel", null);
        Sportif Jessica = new Sportif("Dupuis", "Jessica", null);
        Sportif Marion = new Sportif("Nitelet", "Marion", null);
        Sportif Aurelie = new Sportif("Macron", "Aurelie", null);

        Competition Tennis = new Competition(3);
        try {
            Tennis.subscribe(David);
            Tennis.subscribe(Charles);
            Tennis.subscribe(Henri);
        } catch (IllegalArgumentException ex) {
            throw new IllegalArgumentException();
        } catch (ParticipantLimitException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Tennis.getParticipant());
    }
}

