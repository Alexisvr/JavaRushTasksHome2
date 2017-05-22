package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {

        InputStream inStream = System.in;
        Reader inStreamReader = new InputStreamReader(inStream);
        BufferedReader inBufferedReader = new BufferedReader(inStreamReader);
        String as =inBufferedReader.readLine();
        int a = Integer.parseInt(as);
        String bs =inBufferedReader.readLine();
        int b = Integer.parseInt(bs);
        String cs =inBufferedReader.readLine();
        int c = Integer.parseInt(cs);
        int s = a+b+c;
        int min = Math.min(Math.min(a,b),Math.min(b,c));
// int avr = Math.Min(min,c);
        int max =Math.max(Math.max(a,b),Math.max(b,c));
        int avr = s-min - max;
        System.out.println(max+" "+avr+" "+min);


    }
}
