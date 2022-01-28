package com.tdd.exercise;

public class MessageUtil {

    public String generateMessage(String name){
        return "Subject: Happy birthday!" + "\n" + "Happy birthday, dear ".concat(name+"!");
    }
    
}
