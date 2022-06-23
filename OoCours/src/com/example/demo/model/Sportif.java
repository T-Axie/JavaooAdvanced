package com.example.demo.model;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;

public class Sportif {
    private String name;
    private String firstName;
    private final LocalDate birth;
    private Integer winNumber;

    public Sportif(String name, String firstName, LocalDate birth) {
        this.name = name;
        this.firstName = firstName;
        this.birth = birth;
        this.winNumber = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public Integer getWinNumber() {
        return winNumber;
    }

    public void setWinNumber() {
        this.winNumber = getNumber();
    }

    public static int getNumber() {
        Random rd = new Random();
        return rd.nextInt(1, 101);
    }

    @Override
    public String toString() {
        return "Sportif{" +
                "name='" + name + '\'' +
                ", firstName='" + firstName + '\'' +
                ", birth=" + birth +
                ", winNumber=" + winNumber +
                '}';
    }
}


