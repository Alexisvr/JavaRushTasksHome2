package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;

public class Solution {

    public static boolean isNumeric(String s) {
        return s.matches("[-+]?\\d*\\.?\\d+");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = bufferedReader2.readLine();
        String filename2 = bufferedReader2.readLine();
        bufferedReader2.close();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename1));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename2));

        while (bufferedReader.ready()) {
            String ops2 = bufferedReader.readLine();
            String[] ops3 = ops2.split(" ");
            for (String ops : ops3) {
                if (isNumeric(ops)) {
                    bufferedWriter.write(ops);
                    bufferedWriter.write(" ");
                }
            }
        }

        bufferedWriter.close();
        bufferedReader.close();
    }
}