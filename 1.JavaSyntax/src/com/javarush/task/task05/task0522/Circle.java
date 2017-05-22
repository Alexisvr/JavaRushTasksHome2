package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    //напишите тут ваш код

    public  Circle() {
        this.radius = 1;
        this.x = 1;
        this.y = 1;
    }

    public Circle(double v, double v1, double v2) {
        this.x = v;
        this.y = v1;
        this.radius = v2;

    }

    public Circle(double v, double v1) {
        this.x = v;
        this.y = v1;
        this.radius = 2;
    }

    public Circle(double v) {
        this.x = v;
        this.y = 3;
        this.radius = 3;

    }

    public static void main(String[] args) {

    }
}