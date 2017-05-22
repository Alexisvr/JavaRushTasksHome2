package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int a = 1, b = 1;
        while (a < 11) {
            while (b < 11) {
                System.out.print(a*b + " ");
                b++;
            }
            b = 1;
            System.out.println();
            a++;
        }

    }
}
