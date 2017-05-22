package com.javarush.task.task03.task0319;

/* 
Предсказание на будущее
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name = reader.readLine();
        String gross = reader.readLine();
        String year = reader.readLine();


        int intGross = Integer.parseInt(gross);
        int intYear = Integer.parseInt(year);

        System.out.print(name + " получает " + intGross + " через " + intYear + " лет.");
    }
}
