package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws IOException {

        ArrayList list = new ArrayList();
        String file;
        int line = 0;
        BufferedReader redfilename = new BufferedReader(new InputStreamReader(System.in));
        file = redfilename.readLine();
        BufferedReader readfile = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        while (readfile.ready()) {
            try {
                line = Integer.parseInt(readfile.readLine());
            } catch (NumberFormatException e) {
                e.printStackTrace();
                continue;
            }
            if ((line % 2) == 0) {
                list.add(line);
            }
        }
        Collections.sort(list);
        for (Object i : list) {
            System.out.println(i);
        }
        readfile.close();

    }
}
