package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        String name = bufferedReader.readLine(); //читаем строку с клавиатуры

        String yy = bufferedReader.readLine(); //читаем строку с клавиатуры
        int y = Integer.parseInt(yy); //преобразовываем строку в число.

        String mm = bufferedReader.readLine(); //читаем строку с клавиатуры
        int m = Integer.parseInt(mm); //преобразовываем строку в число.

        String dd = bufferedReader.readLine(); //читаем строку с клавиатуры
        int d = Integer.parseInt(dd); //преобразовываем строку в число.

        System.out.println("Меня зовут "+name+".");
        System.out.print("Я родился "+d+"."+m+"."+y);
    }
}
