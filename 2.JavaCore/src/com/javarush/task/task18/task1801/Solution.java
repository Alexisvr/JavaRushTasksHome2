package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String nameFile = reader.readLine();

        FileInputStream inputStream = new FileInputStream(nameFile);
        int data1 = 0;
        int maxbyte = 0;

        while (inputStream.available() > 0) {
            data1 = inputStream.read();
            if (data1>maxbyte) maxbyte = data1;
        }
        inputStream.close();
        System.out.println(maxbyte);

    }
}
