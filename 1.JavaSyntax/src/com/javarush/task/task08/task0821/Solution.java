package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("В","1");
        hashMap.put("A","1");
        hashMap.put("T","1");
        hashMap.put("N","1");
        hashMap.put("Q","2");
        hashMap.put("E","2");
        hashMap.put("E","3");
        hashMap.put("E","4");
        hashMap.put("E","5");
        hashMap.put("E","6");
        return hashMap;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
