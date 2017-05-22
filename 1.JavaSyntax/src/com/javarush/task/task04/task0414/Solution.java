package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String Syear = reader.readLine();
        int year = Integer.parseInt(Syear);
        int x = 365;

        if (((year % 4) == 0) && ((year % 100) != 0)) {
            x = 366;
        }
        if (((year % 400) == 0) && ((year % 100) == 0)) {
            x = 366;
        }
        System.out.println("количество дней в году: " + x);
    }
}