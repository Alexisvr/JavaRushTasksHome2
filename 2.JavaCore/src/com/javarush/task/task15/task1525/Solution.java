package com.javarush.task.task15.task1525;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Файл в статическом блоке
*/

public class Solution {
    public static List<String> lines = new ArrayList<String>();

    static {
        BufferedReader readLine = null;

        try {
            readLine = new BufferedReader(new FileReader(Statics.FILE_NAME));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            while (readLine.ready()) {
                lines.add(readLine.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {




            System.out.println(lines);
        }
}
