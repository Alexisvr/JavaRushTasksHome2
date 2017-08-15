package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(reader.readLine());
        int numbers[] = new int[n];

        for (int i = 0; i < n ; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        int maximum = numbers[0];

        for (int number : numbers) {
            if (number > maximum) maximum = number;
        }

        System.out.println(maximum);
    }
}
