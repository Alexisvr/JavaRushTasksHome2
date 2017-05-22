package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        char[] charrarray = s.toCharArray();
        charrarray[0] = Character.toUpperCase(charrarray[0]);

        for (int i = 1; i < charrarray.length; i++) {

            if (charrarray[i - 1] == ' ')
                charrarray[i] = Character.toUpperCase(charrarray[i]);
        }

        for (int i = 0; i < charrarray.length; i++) {
            System.out.print(charrarray[i]);
        }

    }
}

