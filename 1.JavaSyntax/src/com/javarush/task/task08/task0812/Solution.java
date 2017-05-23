package com.javarush.task.task08.task0812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

/* 
Cамая длинная последовательность
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < 10; i++) {
            list.add(Integer.parseInt(bufferedReader.readLine()));
        }
        int max = 1;
        int k = 1;
        for(int i = 0; i < list.size() - 1; i++) {
            if (Objects.equals(list.get(i + 1), list.get(i))) {
                k++;
                if(k>max) max = k;
            }
            else k = 1;
        }
        System.out.println(max);

    }
}