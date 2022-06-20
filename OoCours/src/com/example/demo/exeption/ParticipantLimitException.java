package com.example.demo.exeption;

public class ParticipantLimitException extends RuntimeException{
    public ParticipantLimitException() {
    super("Already Full!");
    }
}
