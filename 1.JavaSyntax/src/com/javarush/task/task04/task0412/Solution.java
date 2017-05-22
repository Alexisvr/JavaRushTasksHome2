package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String num = reader.readLine();

        int intNum= Integer.parseInt(num);

        if (intNum > 0)
            intNum = intNum * 2;
        else if (intNum < 0)
            intNum = intNum + 1;

        System.out.println(intNum);

    }

}