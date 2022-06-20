package com.example.exo2;

import com.example.exo2.enums.Habitat;
import com.example.exo2.enums.Sexe;
import com.example.exo2.model.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cat cat1 = new Cat("Kity", 3500, 40, Sexe.MALE, 36, "switty", false, true);
        Cat cat2 = new Cat("Zelda", 4000, 35, Sexe.FEMELLE, 36, "agressif", true, true);
        Dog dog1 = new Dog("Doggy", 15000, 90, Sexe.MALE, 72, "blue", false, "Pitcher");
        Bird bird1 = new Bird("Titi", 55, 5, Sexe.FEMELLE, 2, "blue", Habitat.AVIARY);

        System.out.println("Which kind of animal do you want to insert in the DB? (CAT,DOG,BIRD)");
        AnimalList ani = new AnimalList();
        ani.addAnimal(cat1);
        ani.addAnimal(cat2);
        ani.addAnimal(dog1);
        ani.DieOrNotDie(cat1);
        System.out.println(ani.showNumberOfAnimal("cat"));

    }
    //region Standard question
    public String getName (Scanner sc) {
        System.out.println("Name: ");
        return sc.nextLine();
    }
    public int getWeight (Scanner sc) {
        System.out.println("Weight in gramme: ");
        return Integer.parseInt(sc.nextLine());
    }

    public int getSize (Scanner sc) {
        System.out.println("Size in cm: ");
        return Integer.parseInt(sc.nextLine());
    }
    public Sexe getSexe (Scanner sc) {
        System.out.println("Sexe: M/F ");
        if (sc.nextLine().equals("M")) {
            return Sexe.MALE;
        }
        if (sc.nextLine().equals("F")) {
            return Sexe.FEMELLE;
        }
        return Sexe.MALE;
    }
    public int getAge (Scanner sc) {
        System.out.println("Age: ");
        return Integer.parseInt(sc.nextLine());
    }
    //endregion

    //region Cat question
    public String getCaractere (Scanner sc) {
        System.out.println("Type of caractere: ");
        return sc.nextLine();
    }
}
