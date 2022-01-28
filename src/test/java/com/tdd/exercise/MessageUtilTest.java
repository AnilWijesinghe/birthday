package com.tdd.exercise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MessageUtilTest {

    @Test
    void generateMessage(){
        String name = "Andy";
        MessageUtil messageUtil = new MessageUtil();
        String message = messageUtil.generateMessage(name);
        assertEquals("Subject: Happy birthday!" + "\n" + "Happy birthday, dear Andy!", message);
    }


}
