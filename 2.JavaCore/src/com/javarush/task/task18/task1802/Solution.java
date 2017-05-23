package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();

        FileInputStream inputStream = new FileInputStream(nameFile);
        int data1;
        int minbyte = inputStream.read();

        while (inputStream.available() > 0) {
            data1 = inputStream.read();
            if (data1<minbyte) minbyte = data1;
        }
        inputStream.close();
        System.out.println(minbyte);

    }
}
