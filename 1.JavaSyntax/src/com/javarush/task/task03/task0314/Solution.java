package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        for (int i = 1; i<= 10; i++) {
            for (int a = 1; a <= 10; a++) {
                System.out.print(i*a + " ");
            }
            System.out.println();
        }
    }
}
