package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //String num1 = reader.readLine();
        //String num2 = reader.readLine();


        int num1 = Integer.parseInt(reader.readLine());
        int num2 = Integer.parseInt(reader.readLine());


        if (num1 < num2)
            System.out.print(num1);
        else if (num2 < num1)
            System.out.print(num2);
        else
            System.out.print(num1);

    }
}