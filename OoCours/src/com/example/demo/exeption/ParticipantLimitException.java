package com.example.demo.exeption;

public class ParticipantLimitException extends IllegalAccessException{

    public ParticipantLimitException() {
    super("Already Full!");
    }
}
