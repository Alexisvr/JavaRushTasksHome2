package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
//напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        int count = 0;
        boolean isTrue = true;
        while(isTrue) {
            double a = Double.parseDouble(bf.readLine());
            if (a == -1) {
                sum += 1;
                count -= 1;
                isTrue = false;
            }
            sum += a;
            count++;
        }
        double result = sum / count;
        System.out.println(result);
    }
}