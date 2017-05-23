package com.javarush.task.task13.task1309;

/* 
Наследование интерфейса
*/

public class Solution {
    public static void main(String[] args) throws Exception {
    }

    private interface Movable {
        Double speed();
    }

    private interface Flyable extends Movable {
        Double speed(Flyable flyable);
    }
}