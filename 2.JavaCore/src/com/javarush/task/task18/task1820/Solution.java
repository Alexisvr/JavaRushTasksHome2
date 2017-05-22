package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = consoleReader.readLine();
        String file2 = consoleReader.readLine();
        consoleReader.close();

        FileInputStream inFile1 = new FileInputStream(file1);
        FileOutputStream outFile1 = new FileOutputStream(file2);

        StringBuilder str = new StringBuilder();
        while (inFile1.available() > 0) {
            str.append(Character.toChars(inFile1.read()));
        }
        String[] numbers = str.toString().split(" ");

        for (String number : numbers) {
            int digit = Math.round(Float.parseFloat(number));
            outFile1.write(Integer.toString(digit).getBytes());
            outFile1.write(32);
        }



        inFile1.close();
        outFile1.close();

    }
}
