package com.javarush.task.task05.task0509;

/* 
Создать класс Friend
*/

public class Friend {
    //напишите тут ваш код
    String name;
    int age;
    char sex;

    public void initialize(String Name) {
        this.name = Name;
    }

    public void initialize(String Name, int Age) {
        this.name = Name;
        this.age = Age;
    }

    public void initialize(String Name, int Age, char Sex) {
        this.name = Name;
        this.age = Age;
        this.sex = Sex;
    }

    public static void main(String[] args) {

    }
}
