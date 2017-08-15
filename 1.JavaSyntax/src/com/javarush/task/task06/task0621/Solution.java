package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String gradfatherName = reader.readLine(); // дедушка Вася
        Cat grandfather = new Cat(gradfatherName); // Cat name is дедушка Вася, no mother, no father

        String gradmotherName = reader.readLine(); //бабушка Мурка
        Cat grandmother = new Cat(gradmotherName); //Cat name is бабушка Мурка, no mother, no father

        String fatherName = reader.readLine();  //папа Котофей
        Cat father = new Cat(fatherName, grandfather, null); //Cat name is папа Котофей, no mother, father is дедушка Вася

        String motherName = reader.readLine(); // мама Василиса
        Cat mother = new Cat(motherName, null, grandmother); // Cat name is мама Василиса, mother is бабушка Мурка, no father

        String sonName = reader.readLine(); //сын Мурчик
        Cat son = new Cat(sonName, father, mother); // Cat name is сын Мурчик, mother is мама Василиса, father is папа Котофей

        String daughterName = reader.readLine();  // дочь Пушинка
        Cat daughter = new Cat(daughterName, father, mother); // Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей

        System.out.println(grandfather.toString());
        System.out.println(grandmother.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(son.toString());
        System.out.println(daughter.toString());

    }

    public static class Cat {
        private String name;
        private Cat parentMother;
        private Cat parentFather;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat parentFather, Cat parentMother) {
            this.name = name;
            this.parentFather = parentFather;
            this.parentMother = parentMother;
        }



        @Override
        public String toString() {
            if ((parentFather == null) && (parentMother == null))
                return "Cat name is " + name + ", no mother,  no father";
            else if (parentFather == null)
                return "Cat name is " + name + ", mother is " + parentMother.name + ",  no father"; // Cat name is мама Василиса, mother is бабушка Мурка, no father
            else if (parentMother == null)
                return "Cat name is " + name + ", no mother, father is " + parentFather.name;
            else
                return "Cat name is " + name + ", mother is " + parentMother.name + ", father is " + parentFather.name; // Cat name is дочь Пушинка, mother is мама Василиса, father is папа Котофей
        }
    }

}
