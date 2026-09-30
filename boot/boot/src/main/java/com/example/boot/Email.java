package com.example.boot;

public class Email implements MessageService{
    @Override
    public String getMessage() {
        return "you have got email";
    }
}
