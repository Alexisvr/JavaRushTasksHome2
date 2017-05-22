package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        //напишите тут ваш код
        char[] c = s.toCharArray();
        ArrayList alc = new ArrayList<>();
        for (char ch: c) {
            alc.add(ch);
        }
        for (int i = 0; i < 40; i++)  {
            for (Object chr: alc)
        { System.out.print(chr); }
        System.out.println();
            alc.remove(0);
        }
    }

}

