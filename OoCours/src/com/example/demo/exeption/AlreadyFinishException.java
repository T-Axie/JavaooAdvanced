package com.example.demo.exeption;

public class AlreadyFinishException extends RuntimeException{
    public AlreadyFinishException() {
        super("The game is already Finish!");
    }
}
