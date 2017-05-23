package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        // 1. Считать с консоли имя файла.
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();
        reader.close();

        //Создаем поток-чтения-байт-из-файла
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(new FileInputStream(nameFile)));

        while (inputStream.ready()) {
            String str = inputStream.readLine();
            if((str.substring(0, str.indexOf(' ')).equals(args[0])))
                System.out.println(str);

        }

        inputStream.close();
    }
}
