package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream(args[0]);
        int count = 0;
        int n;
        while ((n = inputStream.read()) != -1){
            String s = String.valueOf((char)n);
            Boolean b = Pattern.matches("[a-zA-Z]", s); if (b) count++;
        }
        System.out.print(count);
        inputStream.close();

    }
}
