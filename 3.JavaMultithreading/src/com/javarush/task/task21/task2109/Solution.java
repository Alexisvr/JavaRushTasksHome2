package com.javarush.task.task21.task2109;

/* 
Запретить клонирование
*/
public class Solution {
    public static class A implements Cloneable {
        private int i;
        private int j;

        public A(int i, int j) {
            this.i = i;
            this.j = j;
        }

        public A() {
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }
    }

    public static class B extends A {
        private String name;

        public B(int i, int j, String name) {
            super(i, j);
            this.name = name;
        }

        public B() {

        }

        public String getName() {
            return name;
        }

        public B clone() throws CloneNotSupportedException{
            throw new CloneNotSupportedException();
        }
    }

    public static class C extends B {
        public C(int i, int j, String name) {
            super(i, j, name);
        }

        public C() {
            super();
        }

        public  C clone () {
            C c = new C();
            c.getI();
            c.getJ();
            c.getName();
            return c;
        }
    }

    public static void main(String[] args) {

    }
}
