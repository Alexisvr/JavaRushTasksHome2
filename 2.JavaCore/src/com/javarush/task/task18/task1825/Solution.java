package com.javarush.task.task18.task1825;

/* 
Собираем файл
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList<String> list = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String s = reader.readLine();
        while (!s.equals("end")) {
            list.add(s);
            s = reader.readLine();
        }

        Collections.sort(list);

        String mainFileName =  list.get(0).substring(0, list.get(0).lastIndexOf(".part"));

        FileOutputStream outputStream = new FileOutputStream(mainFileName);


        for (String fileName: list) {
            FileInputStream inputStream = new FileInputStream(fileName);
            byte[] buffer = new byte[inputStream.available()];
            inputStream.read(buffer);
            inputStream.close();
            outputStream.write(buffer);
        }

        outputStream.close();


    }
}
