package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Запись в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String address = bf.readLine();
        BufferedWriter bw = new BufferedWriter(new FileWriter(address));
        while (true) {
            String str = bf.readLine();
            bw.write(str);
            bw.newLine();
            if (str.equals("exit")) break;
        }
        bf.close();
        bw.close();
    }
}
