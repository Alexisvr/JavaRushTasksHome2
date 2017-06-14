package com.javarush.task.task18.task1826;

/* 
Шифровка
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream(args[1]);
        FileOutputStream out = new FileOutputStream(args[2]);

        switch (args[0]) {
            case "-e":
                encode(in, out);
                break;
            case "-d":
                decode(in,out);

                break;


        }

        in.close();
        out.close();

    }


    public static void encode(FileInputStream fileInName, FileOutputStream fileOutname) throws IOException {
        while (fileInName.available() > 0)
            fileOutname.write(fileInName.read()+1);
       }

    public static void decode(FileInputStream fileInName, FileOutputStream fileOutname) throws IOException {
        while (fileInName.available() > 0)
            fileOutname.write(fileInName.read()-1);

    }

}
