package com.javarush.task.task06.task0622;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Числа по возрастанию
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numbers[] = new int[5];
        int buffer = 0;
        //напишите тут ваш код
        for (int i = 0; i < 5; i++) {
            numbers[i] = Integer.parseInt(reader.readLine());
        }

        /*for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }*/

        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 4; i++) {
                if (numbers[i] > numbers[i + 1]) {
                    buffer = numbers[i + 1];
                    numbers[i + 1] = numbers[i];
                    numbers[i] = buffer;
                }
            }
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(numbers[i]);
        }
    }
}
