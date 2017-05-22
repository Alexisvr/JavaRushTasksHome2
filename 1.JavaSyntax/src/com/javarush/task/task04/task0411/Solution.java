package com.javarush.task.task04.task0411;

/* 
Времена года на Терре
*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
    }

    public static void checkSeason(int month) {
        if ((12 == month) || (1 == month) || (2 == month))
            System.out.println("зима");
        if ((3 == month) || (4 == month) || (5 == month))
            System.out.println("весна");
        if ((6 == month) || (7 == month) || (8 == month))
            System.out.println("лето");
        if ((9 == month) || (10 == month) || (11 == month))
            System.out.println("осень");

    }
}