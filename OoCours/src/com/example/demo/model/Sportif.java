package com.example.demo.model;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Sportif {
    String name;
    String firstName;
    DateFormat birth;
    Integer winNumber;

    public Sportif(String name, String firstName, DateFormat birth) {
        this.name = name;
        this.firstName = firstName;
        this.birth = new DateFormat() {
            @Override
            public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
                return null;
            }

            @Override
            public Date parse(String source, ParsePosition pos) {
                return null;
            }
        };
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

    public DateFormat getBirth() {
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
        return rd.nextInt(1, 100);
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


