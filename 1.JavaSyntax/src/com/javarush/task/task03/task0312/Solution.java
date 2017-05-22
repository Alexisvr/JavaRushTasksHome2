package com.javarush.task.task03.task0312;

/* 
Конвертируем время
*/

public class Solution {
    public static int convertToSeconds(int hour) {
        int seconds = hour *3600;
        return seconds;
    }

    public static void main(String[] args) {
       int s1 = convertToSeconds (10);
       int s2 = convertToSeconds(100);
       System.out.println(s1);
       System.out.println(s2);
    }
}
