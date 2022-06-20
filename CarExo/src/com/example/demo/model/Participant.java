package com.example.demo.model;

import java.util.ArrayList;

public class Participant {
    String name;
    Car car;
    ArrayList<Integer> timeList;

    public Participant(String name, Car car) {
        this.name = name;
        this.car = car;
        this.timeList = new ArrayList<Integer>();
    }

    //region Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public ArrayList<Integer> getTimeList() {
        return timeList;
    }

 //endregion
    public void makeTurn(int circuitKM) {
        int averageSpeed = this.car.randomSpeed();
        int turn = (averageSpeed / circuitKM) * 60;
        timeList.add(turn);
    }
    public int getFullTime () {
        int total = 0;
        for (int t : this.timeList) {
            total += t;
        }
        return total;
    }
}
