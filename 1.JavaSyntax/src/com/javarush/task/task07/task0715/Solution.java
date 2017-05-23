package com.javarush.task.task07.task0715;

import java.util.ArrayList;
import java.util.Collections;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "мама", "мыла", "раму");
        int n = list.size();
        for (int i = 0; i < n; i++){
            list.add(i * 2 + 1, "именно");
        }
        for (int i = 0; i < list.size(); i++)
            System.out.println(list.get(i));
    }

    }

