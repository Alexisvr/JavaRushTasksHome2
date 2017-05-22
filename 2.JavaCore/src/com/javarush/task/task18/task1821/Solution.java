package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[0]);

        TreeMap< Byte, Integer > map = new TreeMap<>();

        for (Byte aByte : map.keySet()) {
            if (!map.containsKey(aByte))
                map.put(aByte, 1);
            else map.put(aByte, map.get(aByte)+1);
        }

        /*for (Byte b : bt){
            if (!map.containsKey(b))
                map.put(b, 1);
            else map.put(b, map.get(b)+1);
        }*/

        for (Map.Entry e : map.entrySet()){
            char c = (char)Integer.parseInt(e.getKey().toString());
            System.out.println(c+" "+e.getValue());
        }


        inputStream.close();

    }
}
