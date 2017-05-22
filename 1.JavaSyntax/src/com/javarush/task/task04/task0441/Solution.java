package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine()),Integer.parseInt(reader.readLine())};
        Arrays.sort(arr);
        System.out.println(arr[1]);

    }
}
