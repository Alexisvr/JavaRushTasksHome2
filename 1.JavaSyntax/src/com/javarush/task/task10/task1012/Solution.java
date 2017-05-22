package com.javarush.task.task10.task1012;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Количество букв
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // алфавит
        String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
        char[] abcArray = abc.toCharArray();

        ArrayList<Character> alphabet = new ArrayList<Character>();
        for (int i = 0; i < abcArray.length; i++) {
            alphabet.add(abcArray[i]);
        }

        // ввод строк
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i < 10; i++) {
            String s = reader.readLine();
            list.add(s.toLowerCase());
        }

        int[] b = new int[33]; for (int i = 0; i < 33; i++) { b[i]=0; } for (int a = 0; a < alphabet.size(); a++) { for (int i = 0; i < list.size(); i++) { char[] ch = list.get(i).toCharArray(); for (int j = 0; j < list.get(i).length(); j++) { if (ch[j] == alphabet.get(a)) { b[a]++; } } } System.out.println(alphabet.get(a) + " " + b[a]); }


        // напишите тут ваш код
    }

}
