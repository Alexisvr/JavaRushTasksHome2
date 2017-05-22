package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String ss = reader.readLine();

        return ss;


    }

    public static int readInt() throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(reader.readLine());

        return num1;
    }

    public static double readDouble() throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        double dd = Double.parseDouble(reader.readLine());
        return  dd;


    }

    public static boolean readBoolean() throws Exception {
        //напишите тут ваш код

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean bool = Boolean.parseBoolean(reader.readLine());

        return bool;



    }

    public static void main(String[] args) {

    }
}
