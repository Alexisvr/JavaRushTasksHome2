package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String num = reader.readLine();

        int intNum= Integer.parseInt(num);

        if (intNum == 1)
            System.out.println("понедельник");
        else if(intNum == 2)
            System.out.println("вторник");
        else if(intNum == 3)
            System.out.println("среда");
        else if(intNum == 4)
            System.out.println("четрверг");
        else if(intNum == 5)
            System.out.println("пятница");
        else if(intNum == 6)
            System.out.println("суббота");
        else if(intNum == 7)
            System.out.println("воскресенье");
        else
            System.out.println("такого дня недели не существует");

    }
}