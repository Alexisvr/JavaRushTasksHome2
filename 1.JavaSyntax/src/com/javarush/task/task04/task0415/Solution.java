package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();

        int intA = Integer.parseInt(a);
        int intB = Integer.parseInt(b);
        int intC = Integer.parseInt(c);

      //  if (((intA + intB) < intC) || ((intC + intB) < intA) || ((intA + intC) < intB))
        //    System.out.println("Треугольник не существует.");
        //else
          //  System.out.println("Треугольник существует.");

        if(((intA+intB)>intC) && ((intA+intC)>intB) && ((intB+intC)>intA))
            System.out.println("Треугольник существует.");
        else
            System.out.println("Треугольник не существует.");

    }
}