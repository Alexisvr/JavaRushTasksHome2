package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

/*
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        InputStream inputStream = System.in;
        Reader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int summ=0;
        while (true)
        {
            String aa = bufferedReader.readLine();

            if(!aa.equals("сумма")) {
                int a = Integer.parseInt(aa); //преобразовываем строку в число.
                summ = summ+a;
            }
            else
            {
                System.out.print(summ);
                break;
            }

        }
    }
}
