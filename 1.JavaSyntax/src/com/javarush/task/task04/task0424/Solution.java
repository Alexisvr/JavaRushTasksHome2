package com.javarush.task.task04.task0424;

/* 
Три числа
*/


import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader text = new BufferedReader (new InputStreamReader (System.in));
        int a = Integer.parseInt( text.readLine());
        int b = Integer.parseInt( text.readLine());
        int c = Integer.parseInt( text.readLine());
        if (((a == b) || (b == c) || (a == c))&& !( (a == b) && (b == c) && (a == c) ) ){
            if (a == b)
                System.out.println("3");
            if (c == b)
                System.out.println("1");
            if (a == c)
                System.out.println("2");

        }

    }
}