package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String key = null;
        try {
            key = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] list = key.split("\\?");
        list = list[1].split("&");
        String value = null;

        for (int i = 0; i < list.length; i++) {
            if (list[i].split("=")[0].equals("obj")) {
                value = list[i].split("=")[1];
            }
            System.out.print(list[i].split("=")[0]+ " ");
        }

        if (value != null) {
            try { System.out.println(); alert(Double.parseDouble(value));
            }
            catch (Exception e) {
                System.out.println(); alert(value); }
        }


    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}
