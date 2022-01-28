package com.tdd.exercise;

import java.util.Map;
import java.util.stream.Collectors;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BirthdayWish {

    public List<String> sendBirthdayWishes(List<Map<String,String>> friendsDetails) throws Exception{
        MessageUtil messageUtil = new MessageUtil();
        EmailUtil emailUtil = new EmailUtil();
        List<String> wishedFriends = new ArrayList<>();
        LocalDate localDate = LocalDate.now();
        String day = String.valueOf(localDate.getDayOfMonth());
        String month = String.valueOf(localDate.getMonth().getValue());

        List<Map<String,String>> birthdayFreinds = friendsDetails.stream()
            .filter((friend)->friend.get("dob").substring(5,7).contains(month) 
            && friend.get("dob").substring(8).contains(day)).collect(Collectors.toList());
            
        for (Map<String,String> friend : birthdayFreinds) {
            String message = messageUtil.generateMessage(friend.get("fName"));
            emailUtil.emailSend(message,friend.get("email")); 
            wishedFriends.add(friend.get("fName"));           
        }
       return wishedFriends;
    }
    
}
