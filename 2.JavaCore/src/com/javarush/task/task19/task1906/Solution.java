package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();

        FileReader reared = new FileReader(fileName1);
        FileWriter writer = new FileWriter(fileName2);

        ArrayList<Integer> list = new ArrayList<>();

        while (reared.ready()) {
            int x = reared.read();
            list.add(x);
        }

        for (int i = 1; i < list.size(); i = i + 2) {
            writer.write(list.get(i));
        }

        bufferedReader.close();
        reared.close();
        writer.close();
    }
}