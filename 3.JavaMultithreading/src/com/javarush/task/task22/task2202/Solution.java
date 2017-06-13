package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/
public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string)  {
        if(string == null) throw new TooShortStringException();
        String s1 = string;
        String s2 = s1.replaceAll(" ", "");
        if ( (s1.length() - s2.length()) < 4 ) {
            throw new TooShortStringException();
        }

        else /*{
            int indexBegin = string.indexOf(" ");
            int indexEnd = indexBegin;
            for (int i = 0; i < 4; i++) {
                indexEnd = string.indexOf(" ", indexEnd+1);
            }

            return string.substring(indexBegin, indexEnd );
        }*/
        {String s[] = string.split(" ");
        String s11 = s[1] + " " + s[2] + " " + s[3] + " " +  s[4];
        return s11;}
    }

    public static class TooShortStringException extends RuntimeException{
    }
}
