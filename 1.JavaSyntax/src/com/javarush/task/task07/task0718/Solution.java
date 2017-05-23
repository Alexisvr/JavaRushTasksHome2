package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            list.add(i, reader.readLine());
        }

        int min = list.get(0).length();
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i).length() > min) {
                min = list.get(i).length();
            } else {
                System.out.println(list.indexOf(list.get(i)));
                break;

            }
        }
    }
}

