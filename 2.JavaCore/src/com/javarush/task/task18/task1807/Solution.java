package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }

        int count = 0;
        while(fileInputStream.available() > 0) {
            if (",".charAt(0) == (char)fileInputStream.read())
                count++;
        }
        System.out.println(count);
        fileInputStream.close();




    }
}
