package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DecimalFormat;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(args[0]);
/*        int p1 = inputStream.toString().length();
        int p2 = p1 - inputStream.toString().replaceAll(" ", "").length();
        double otv = (double) (p2 / p1) * 100;

        String pattern = "##0.00";
        DecimalFormat decimalFormat = new DecimalFormat(pattern);
        String formatOtv = decimalFormat.format(otv);
        System.out.println(formatOtv);
        inputStream.close();*/

        int count = 0;
        int spaceCount = 0;
        double result;

        while (fileInputStream.available() > 0) {
            int data = fileInputStream.read();
            count++;
            if (data == 32)
                spaceCount++;
        }

        result = (double) spaceCount/count * 100;
        System.out.println(String.format("%.2f",result));

        fileInputStream.close();
    }
}
