package com.javarush.task.task22.task2210;

import java.util.StringTokenizer;

/*
StringTokenizer
*/
public class Solution {
    public static void main(String[] args) {
        String query = "level22.lesson13.task01";
        String delimiter = ".";
        String[] test = getTokens(query, delimiter);

        for (String s : test) {
            System.out.println(s);
        }
    }

    public static String[] getTokens(String query, String delimiter) {

        int i = 0;
        StringTokenizer tokenizer =
                new StringTokenizer(query, delimiter);
        String[] s = new String[tokenizer.countTokens()];
        while (tokenizer.hasMoreTokens()) {
            s[i] = tokenizer.nextToken();
            i++;
        }

        return s;
    }
}
