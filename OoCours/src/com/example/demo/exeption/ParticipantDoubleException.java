package com.example.demo.exeption;

public class ParticipantDoubleException extends RuntimeException{
    public ParticipantDoubleException() {
        super("The game is already done!");
    }
}