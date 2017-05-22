package com.javarush.task.task06.task0612;

/* 
Калькулятор
*/

public class Calculator {
    public static int plus(int a, int b) {
        //напишите тут ваш код
        int sum = a+ b;
        return sum;
    }

    public static int minus(int a, int b) {
        //напишите тут ваш код
        int m = a - b;
        return m;
    }

    public static int multiply(int a, int b) {
        //напишите тут ваш код
        int mm = a * b;
        return mm;
    }

    public static double division(int a, int b) {
        //напишите тут ваш код
        double d = (double)a / b;
        return d;
    }

    public static double percent(int a, int b) {
        //напишите тут ваш код
        return (((double)a * b) /100);
    }

    public static void main(String[] args) {

    }
}