package com.example.demo.exeption;

public class NotSubscribeException extends RuntimeException{
    public NotSubscribeException() {
        super("Not in the list!");
    }
}
