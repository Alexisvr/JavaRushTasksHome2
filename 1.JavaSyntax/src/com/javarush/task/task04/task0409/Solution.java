package com.javarush.task.task04.task0409;

/* 
Ближайшее к 10
*/

public class Solution {
    public static void main(String[] args) {
        closeToTen(8, 11);
        closeToTen(14, 7);
    }

    public static void closeToTen(int a, int b) {
        int q1 = abs(10 - a);
        int q2 = abs(10 - b);

        if (q1 > q2)
            System.out.println(b);
        else if (q1 < q2)
            System.out.println(a);
        else
            System.out.println(a);


    }

    public static int abs(int a) {
        if (a < 0) {
            return -a;
        } else {
            return a;
        }
    }
}