package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(System.in));
        String filename1 = bufferedReader2.readLine();
        String filename2 = bufferedReader2.readLine();
        bufferedReader2.close();

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(filename1));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename2, true));

            while (bufferedReader.ready()) {
                String k = bufferedReader.readLine();
                String[] kmas = k.split("\\.");
                for (int i = 0; i < kmas.length; i++) {
                    bufferedWriter.write(kmas[i]);
                    if (i != kmas.length - 1)
                        bufferedWriter.write("!");
                }
            }
            bufferedReader.close();
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}