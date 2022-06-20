package com.example.exo2.model;

import java.util.ArrayList;
import java.util.Random;

public class AnimalList {
    ArrayList<Animal> animals;

    public AnimalList() {
        this.animals = new ArrayList<>();
    }

    //region getter & setter
    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void setAnimals(ArrayList<Animal> animals) {
        this.animals = animals;
    }
    //endregion

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }
    public int showNumberOfAnimal(String bete) {
        int count = 0;

        if (bete.equals("cat")) {
            for (Animal animal : this.animals) {
                if (animal instanceof Cat) {
                    count++;
                }
            }
            return count;
        }

        if (bete.equals("dog")) {
            for (Animal animal : this.animals) {
                if (animal instanceof Dog) {
                    count++;
                }
            }
            return count;
        }


        if (bete.equals("bird")) {
            for (Animal animal : this.animals) {
                if (animal instanceof Bird) {
                    count++;
                }
            }
        }
        return count;
    }
    public void DieOrNotDie (Animal animal) {
        Random rd = new Random();
        int number = rd.nextInt(1, 1000);
        if (number < animal.getProbabilityToDie() * 10) {
            System.out.println(animal.name +" is dead");
        }
        else {
            System.out.println(animal.name +" is to strong to die today...");
        }
    }
}
