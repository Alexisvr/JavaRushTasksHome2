package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();

        while (true) {
            String s = reader.readLine();

            if (Objects.equals(s, "end")) break;
            else list.add(s);
            }

        for (String aList:list) {
            System.out.println(aList);

        }

    }
}