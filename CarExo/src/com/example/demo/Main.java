package com.example.demo;

import com.example.demo.model.Car;
import com.example.demo.model.Circuit;
import com.example.demo.model.Participant;
import com.example.demo.model.Trial;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("207", "Peugeot", 50, 125);
        Car car2 = new Car("C3", "Mercedes", 60, 135);
        Car car3 = new Car("A2", "Ferrari", 70, 145);
        Car car4 = new Car("Punto", "Fiat", 45, 110);

        Circuit circuit = new Circuit("Spa-Francorchamps", 8);

        Participant Max = new Participant("Joey", car);
        Participant David = new Participant("Marty", car2);
        Participant Patricia = new Participant("Joey", car4);
        Participant Claire = new Participant("Joey", car3);

        Trial trial = new Trial("Marion", circuit, 8);
        trial.addParticipant(Max);
        trial.addParticipant(David);
        trial.addParticipant(Patricia);
        trial.addParticipant(Claire);



        trial.ShowOneTurn();
        System.out.println(Max.getTimeList());
        System.out.println(David.getTimeList());
        System.out.println(Patricia.getTimeList());
        System.out.println(Claire.getTimeList());

    }
}
