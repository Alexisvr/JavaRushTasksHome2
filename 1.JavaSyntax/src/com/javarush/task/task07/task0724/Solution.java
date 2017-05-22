package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human ded1 = new Human ("Иван", true, 60/*, null, null*/);
        Human ded2 = new Human ("Игорь", true, 65/*, null, null*/);
        Human bab1 = new Human ("Нина", false, 55/*, null, null*/);
        Human bab2 = new Human ("Вера", false, 50/*, null, null*/);
        Human otc = new Human ("Петр", true, 40, ded1, bab1);
        Human mam = new Human ("Таня", false, 38, ded2, bab2);
        Human det1 = new Human ("Ира", false, 14, otc, mam);
        Human det2 = new Human ("Яна", false, 10, otc, mam);
        Human det3 = new Human ("Коля", true, 5, otc, mam);

        System.out.println(ded1.toString());
        System.out.println(bab1.toString());
        System.out.println(ded2.toString());
        System.out.println(bab2.toString());
        System.out.println(otc.toString());
        System.out.println(mam.toString());
        System.out.println(det1.toString());
        System.out.println(det2.toString());
        System.out.println(det3.toString());

    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String s, boolean b, int i) {
            name = s;
            sex = b;
            age = i;
        }

        public Human(String s, boolean b, int i, Human h1, Human h2) {
            name = s;
            sex = b;
            age = i;
            father = h1;
            mother = h2;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















