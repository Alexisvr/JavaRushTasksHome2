package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private String surname;
        private int age;
        private boolean sex;
        private int height;
        private int weight;

        public Human(String name, String surname, int age, boolean sex, int height, int weight) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, String surname, int age, boolean sex) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
        }

        public Human(String name, String surname, int age, boolean sex, int weight) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
        }

        public Human(String name, String surname, boolean sex, int height, int weight) {
            this.name = name;
            this.surname = surname;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, int age, boolean sex, int height, int weight) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, String surname, int age, int height, int weight) {
            this.name = name;
            this.surname = surname;
            this.age = age;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name, String surname) {
            this.name = name;
            this.surname = surname;
        }

        public Human(String name, String surname, int height, int weight) {
            this.name = name;
            this.surname = surname;
            this.height = height;
            this.weight = weight;
        }

        public Human(int age, boolean sex, int height, int weight) {
            this.age = age;
            this.sex = sex;
            this.height = height;
            this.weight = weight;
        }

        public Human(String name) {
            this.name = name;
        }
    }
}
