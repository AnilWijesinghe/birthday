package com.tdd.exercise;

public class EmailUtil {

    public String emailSend(String message,String email) throws Exception{
        if(message==null) throw new Exception("Message cannot be null.");   
        if(email==null) throw new Exception("Email cannot be null.");        
        return "Email sent to ".concat(email);
    }
    
}
