package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        String filename = args[0];
        HashMap<String, Double> hashMap = new HashMap<String, Double>();
        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(filename));
            while (fileReader.ready()) {
                String[] znachenia = fileReader.readLine().split(" ");
                if (hashMap.containsKey(znachenia[0])) {
                    hashMap.put(znachenia[0], (hashMap.get(znachenia[0]) + Double.parseDouble(znachenia[1])));
                } else hashMap.put(znachenia[0], Double.parseDouble(znachenia[1]));
            }
            fileReader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        TreeMap<String, Double> treeMap = new TreeMap<String, Double>(hashMap);

        for (Map.Entry<String, Double> znach : treeMap.entrySet()) {
            System.out.println(znach.getKey() + " " + znach.getValue());
        }
    }
}