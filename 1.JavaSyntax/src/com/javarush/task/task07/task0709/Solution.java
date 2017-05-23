package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Выражаемся покороче
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            list.add(reader.readLine());
        }

        int min = 100000000;


        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() < min)
               min = list.get(i).length();
        }

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() == min)
                System.out.println(list.get(i));
        }
    }
}
