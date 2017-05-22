package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String numbmer = reader.readLine();
        String name = reader.readLine();

        int intNumber = Integer.parseInt(numbmer);

        System.out.print(name + " захватит мир через " + intNumber + " лет. Му-ха-ха!");
    }
}
