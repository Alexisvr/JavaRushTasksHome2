package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] num = new int[20];
        int[] num1 = new int[10];
        int[] num2 = new int[10];

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < num.length ; i++) {
            num[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < num1.length; i++) {
            num1[i] = num[i];
        }
        for (int i = 0; i < num2.length; i++) {
            num2[i] = num[i+10];
            System.out.println(num2[i]);
        }


    }
}
