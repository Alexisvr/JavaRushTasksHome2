package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] num = new int[15];
        int k1 = 0, k2 = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 15; i++) {
            num[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < 15; i++) {
            if ((double)i%2 == 0 ) {
                k1 = k1 + num[i];
            }
            else k2 = k2 + num [i];
        }

        if (k1 < k2) System.out.println("В домах с нечетными номерами проживает больше жителей.");
        else System.out.println("В домах с четными номерами проживает больше жителей.");


    }
}
