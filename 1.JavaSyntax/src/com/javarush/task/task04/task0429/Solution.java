package com.javarush.task.task04.task0429;

/* 
Положительные и отрицательные числа
*/


import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());
        int g = 0, b = 0;
        if (x<0) g++;
        if (x>0) b++;
        if (y<0) g++;
        if (y>0) b++;
        if (z<0) g++;
        if (z>0) b++;
        System.out.println("количество отрицательных чисел: " + g);
        System.out.println("количество положительных чисел: " + b);
    }
}
