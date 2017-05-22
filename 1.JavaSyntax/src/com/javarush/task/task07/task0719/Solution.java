package com.javarush.task.task07.task0719;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/* 
Вывести числа в обратном порядке
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();


        for (int i = 0; i < 10; i++) {
            list.add(i, Integer.parseInt(reader.readLine()));
        }

        Collections.reverse(list);
        list2 = list;

        for (int z = 0; z < list.size(); z++) {
            list2.add(list.size() - z - 1, list.get(z));
        }

        for (Integer aList2 : list2) {
            System.out.println(aList2);
        }


    }
}
