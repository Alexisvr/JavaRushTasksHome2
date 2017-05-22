package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = consoleReader.readLine();
        String file2 = consoleReader.readLine();
        consoleReader.close();

        FileInputStream inFile1 = new FileInputStream(file1); //открываем для чтения первый файл

        ArrayList<Integer> buffer = new ArrayList<>(); //сюда мы пока запишем первый файл
        while (inFile1.available() > 0)
        {
            buffer.add(inFile1.read()); //записываем первый файл
        }
        inFile1.close(); //закрываем первый файл

        FileInputStream inFile2 = new FileInputStream(file2); //открываем для чтения второй файл
        FileOutputStream outFile1 = new FileOutputStream(file1); //открываем для записи первый файл

        while (inFile2.available() > 0)
        {
            //int data = inFile2.read(); //читаем второй файл
            outFile1.write(inFile2.read()); //записываем первый файл
        }
        inFile2.close(); //закрываем второй файл

        for (Integer integer : buffer) {
            outFile1.write(integer); //записываем первый файл после второго
        }
        outFile1.close(); //закрываем первый файл


    }
}
