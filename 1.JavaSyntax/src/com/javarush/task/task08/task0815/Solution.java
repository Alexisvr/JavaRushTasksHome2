package com.javarush.task.task08.task0815;

import java.util.*;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String,String> map = new HashMap<>();
        map.put("Doe", "John");
        map.put("Malder", "Fox");
        map.put("Pop", "Iggy");
        map.put("Cobain", "Curt");
        map.put("Gorbunov", "Anton");
        map.put("Bona", "Richard");
        map.put("Feraud", "Hadrien");
        map.put("Garrison", "Matthew");
        map.put("Jackson", "Antony");
        map.put("West", "Matthew");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;

        for(Map.Entry entry : map.entrySet() )

            if (entry.getValue().equals(name)) count ++;

        return count;
    }


    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;

        for(Map.Entry entry : map.entrySet() )

            if (entry.getKey().equals(lastName)) count ++;

        return count;
    }



    public static void main(String[] args) {

    }
}
