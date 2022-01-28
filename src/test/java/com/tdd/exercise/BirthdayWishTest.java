package com.tdd.exercise;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

public class BirthdayWishTest {

        

    @Test
    void testSendBirthdayWishes() throws Exception{
        Map<String,String> andyDet = new HashMap<>();
        andyDet.put("fName", "Andy");
        andyDet.put("lName", "Chilton");
        andyDet.put("dob", "1988 01 27");
        andyDet.put("email", "andy@opencast.com");
        Map<String,String> chrisDet = new HashMap<>();
        chrisDet.put("fName", "Chris");
        chrisDet.put("lName", "Chapman");
        chrisDet.put("dob", "1989 01 27");
        chrisDet.put("email", "chris@opencast.com");
        Map<String,String> anilDet = new HashMap<>();
        anilDet.put("fName", "Chris");
        anilDet.put("lName", "Chapman");
        anilDet.put("dob", "1990 11 10");
        anilDet.put("email", "chris@opencast.com");
        List<Map<String,String>> friendDetails = new ArrayList<>();
        friendDetails.add(andyDet);
        friendDetails.add(chrisDet);
        friendDetails.add(anilDet);
        BirthdayWish birthdayWish = new BirthdayWish();
        List<String> wishedFriends = birthdayWish.sendBirthdayWishes(friendDetails);
        assertEquals(Arrays.asList("Andy","Chris"), wishedFriends);
    }
}
