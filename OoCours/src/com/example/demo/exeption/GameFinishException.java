package com.example.demo.exeption;

public class GameFinishException extends RuntimeException{
    public GameFinishException() {
        super("The game is already done!");
    }
}