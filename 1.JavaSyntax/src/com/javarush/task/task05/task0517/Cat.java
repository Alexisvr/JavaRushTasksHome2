package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    String name;
    int age;
    String color;
    String address;
    int weight;


    public Cat(String name){
        this(name,2);
    }

    public Cat(String name,int age){
        this(name,5,age);
    }

    public Cat(String name, int weight, int age){
        this(name,age,"black",null,weight);
    }

    public Cat(int weight,String color){
        this(weight,color,null);
    }

    public Cat(int weight,String color,String address){
        this(null,2,color,address,weight);
    }

    public Cat(String name, int age, String color, String address, int weight) {
        this.name = name;
        this.age = age;
        this.color = color;
        this.address = address;
        this.weight = weight;
    }

    public static void main(String[] args) {

    }
}
