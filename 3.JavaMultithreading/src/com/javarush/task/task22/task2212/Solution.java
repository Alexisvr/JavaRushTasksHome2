package com.javarush.task.task22.task2212;

/* 
Проверка номера телефона
*/
public class Solution {

    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null) return false;
        String tel = telNumber.replaceAll(" ", "");
        if (!tel.matches("\\+?[0-9]*\\(?[0-9]{3}\\)?[0-9]+-?[0-9]+-?[0-9]+")) return false;
        if ((tel.contains("(") || tel.contains(")")) && !tel.matches(".*\\(.*\\).*")) return false;
        int n = tel.replaceAll("\\D", "").length();
        if (n != 10 && !(tel.charAt(0) == '+' && n == 12)) return false;
        return true;
    }

    public static void main(String[] args) {
        System.out.println(checkTelNumber("+380501234567"));
        System.out.println(checkTelNumber("+38(050)1234567"));
        System.out.println(checkTelNumber("+38050123-45-67"));
        System.out.println(checkTelNumber("050123-4567"));
        System.out.println(checkTelNumber("+38)050(1234567"));
        System.out.println(checkTelNumber("+38(050)1-23-45-6-7"));
        System.out.println(checkTelNumber("050ххх4567"));
        System.out.println(checkTelNumber("050123456"));
        System.out.println(checkTelNumber("(0)501234567"));
    }
}