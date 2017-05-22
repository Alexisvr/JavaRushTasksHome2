package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int s = 0; int i = 0;
        while (i != -1){
            i = Integer.parseInt(reader.readLine());
            s = s + i;
        }
        System.out.println(s);
    }
}





