package com.javarush.task.task18.task1824;

import java.io.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String fileName;
        FileInputStream fis = null;
        while (true) {
            fileName = br.readLine();
            try {
                fis = new FileInputStream(fileName);
                fis.close();
            } catch (FileNotFoundException e) {
                 br.close();
                 System.out.println(fileName);
                  break;
            }
        }
    }
}