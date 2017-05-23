package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("1", 1);
        hashMap.put("2", 2);
        hashMap.put("3", 3);
        hashMap.put("4", 4);
        hashMap.put("5", 5);
        hashMap.put("6", 6);
        hashMap.put("7", 7);
        hashMap.put("800", 800);
        hashMap.put("900", 900);
        hashMap.put("1111", 1111);

        return hashMap;
    }

    public static void removeItemFromMap(HashMap map) {
        HashMap<String, Integer> copy = new HashMap<>(map);
        for (Map.Entry pair : copy.entrySet()) {
            if ((Integer)pair.getValue()<500) map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {

    }
}