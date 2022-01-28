package com.tdd.exercise;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class EmailUtilTest {

    @Test
    void emailSendMessageNull() throws Exception{
        String message = null;
        EmailUtil emailUtil = new EmailUtil();
        Exception exception = assertThrows(Exception.class, ()->emailUtil.emailSend(message,null));
        assertEquals("Message cannot be null.", exception.getMessage());
    }

    @Test
    void emailSendEmailNull() throws Exception{
        String message = "Subject: Happy birthday!" + "\n" + "Happy birthday, dear Andy!";
        EmailUtil emailUtil = new EmailUtil();
        Exception exception = assertThrows(Exception.class, ()->emailUtil.emailSend(message,null));
        assertEquals("Email cannot be null.", exception.getMessage());
    }

    @Test
    void emailSend() throws Exception{
        String message = "Subject: Happy birthday!" + "\n" + "Happy birthday, dear Andy!";        
        EmailUtil emailUtil = new EmailUtil();
        String emailMsg = emailUtil.emailSend(message,"andy@opencast.com");
        assertEquals("Email sent to andy@opencast.com", emailMsg);
    }

}
