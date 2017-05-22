package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human child1 = new Human("child1", true, 10, new ArrayList<>());
        Human child2 = new Human("child2", false, 12, new ArrayList<>());
        Human child3 = new Human("child3", false, 23, new ArrayList<>());

        ArrayList<Human> fatherChild = new ArrayList<>();
        fatherChild.add(child1);
        fatherChild.add(child2);
        fatherChild.add(child3);
        Human father = new Human("father", true, 36, fatherChild);

        ArrayList<Human> motherChild = new ArrayList<>();
        motherChild.add(child1);
        motherChild.add(child2);
        motherChild.add(child3);
        Human mother = new Human("mother", false, 36, motherChild);

        ArrayList<Human> grandFather1Child = new ArrayList<>();
        grandFather1Child.add(mother);
        ArrayList<Human> grandMother1Child = new ArrayList<>();
        grandMother1Child.add(mother);
        ArrayList<Human> grandFather2Child = new ArrayList<>();
        grandFather2Child.add(father);
        ArrayList<Human> grandMother2Child = new ArrayList<>();
        grandMother2Child.add(father);


        Human grandFather1 = new Human("grandFather1", true, 80, grandFather1Child);
        Human grandFather2 = new Human("grandFather2", true, 82, grandFather2Child);
        Human grandMother1 = new Human("grandMother1", false, 70, grandMother1Child);
        Human grandMother2 = new Human("grandMother2", false, 74, grandMother2Child);



        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());



    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children = new ArrayList<>();

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }



        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
