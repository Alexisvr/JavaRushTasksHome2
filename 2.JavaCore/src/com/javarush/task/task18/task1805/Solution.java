package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        Map<Integer, Integer> map = new TreeMap<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream streamReader = new FileInputStream(br.readLine());

        while (streamReader.available()>0) {
            map.put(streamReader.read(),1);
        }



        for (Integer x: map.keySet()){
            System.out.print(x + " ");
        }
        streamReader.close();
    }


}
