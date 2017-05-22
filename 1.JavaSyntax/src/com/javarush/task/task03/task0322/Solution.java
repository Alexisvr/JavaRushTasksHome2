package com.javarush.task.task03.task0322;


/* 
Большая и чистая
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name1 = reader.readLine();
        String name2 = reader.readLine();
        String name3 = reader.readLine();
        //   String gross = reader.readLine();
        //String year = reader.readLine();


        //  int intGross = Integer.parseInt(gross);
        //  int intYear = Integer.parseInt(year);

        System.out.print(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
    }
}