package com.javarush.task.task05.task0510;

/* 
Кошкоинициация
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int weight = 1;
    int age = 1;
    String color = "red";
    String address;

    public void initialize (String Name) {
        this.name = Name;
    }

    public void initialize (String Name, int Weight, int Age) {
        this.name = Name;
        this.weight = Weight;
        this.age = Age;
    }

    public void initialize (String Name, int Age) {
        this.name = Name;
        this.age = Age;
    }
    public void initialize (int Weight, String Color) {
        this.weight = Weight;
        this.color = Color;
    }

    public void initialize (int Weight, String Color, String Address) {
        this.weight = Weight;
        this.color = Color;
        this.address = Address;
    }


    public static void main(String[] args) {

    }
}
