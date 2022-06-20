package com.example.exoInterface;

import com.example.exoInterface.model.*;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        while (choice != 2) {
            System.out.println("What do you want to do?\n" +
                    "1. Make a new player and fight!\n" +
                    "2. Leave the game\n");
            choice = Integer.parseInt(sc.nextLine());
            Heroes heroes = new Human();
            switch (choice) {
                case 1 -> {
                    System.out.println("What kind of personnage do you want to try? Human - Dwarf");
                    String type = sc.nextLine();
                    if (type.equals("Human")) {
                        heroes = new Human();
                        System.out.println("Launch a fight with a human");
                    }
                    if (type.equals("Dwarf")) {
                        heroes = new Dwarf();
                        System.out.println("Launch a fight with a human");
                    }
                    else {
                        System.out.println("Error");
                    }
                }
                case 2 -> System.out.println("See you next time bro!");
            }
            Monster monster = generateMonster();
            makeAFight(heroes, monster);
        }
    }

    private static Monster generateMonster() {
        return new Drake();
    }

    public static void makeAFight (Heroes heroes, Monster monster) {
        while (heroes.getLife() >= 0 || (monster.getLife() >= 0)) {
            heroes.hitTarget(monster);
            monster.hitTarget(heroes);
            System.out.println(heroes.getLife());
            System.out.println(monster.getLife());
        }
    }
}
