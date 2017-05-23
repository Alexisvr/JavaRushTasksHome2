package com.javarush.task.task15.task1505;

import java.util.ArrayList;
import java.util.List;

/* 
ООП - исправь ошибки в наследовании
*/

public class Solution {
    public static interface Alive {
        Object containsBones();
    }

    public static class BodyPart implements Alive {
        private String name;

        public BodyPart(String name) {
            this.name = name;
        }

        public Object containsBones() {
            return "Yes";
        }

        //6. Метод toString в классе BodyPart должен возвращать строку формата "name(имя части тела) содержит кости", если метод containsBones возвращает "Yes" для этой части тела,
        // а если "No", то строку формата "name(имя части тела) не содержит кости".
        public String toString() {
            if (containsBones()=="Yes") {
                return name + " содержит кости";
            }
            else if (containsBones()=="No") {
                return name + " не содержит кости";
            }
            return null;
        }
    }

    public static class Finger extends BodyPart {
        private boolean isArtificial;

        public Finger(String name, boolean isArtificial) {
            super(name);
            this.isArtificial = isArtificial;
        }

        public Object containsBones() {
            //Метод containsBones в классе Finger должен возвращать строку "Yes",
            // если метод containsBones в классе BodyPart возвращает "Yes" и флаг isArtificial равен false,
            // если приведенное условие не выполняется - вернуть "No".
            if (super.containsBones()=="Yes" && !isArtificial) {
                return "Yes";
            }
            else return "No";

        }
    }

    public static void main(String[] args) {
        printlnFingers();
        printlnBodyParts();
        printlnAlives();
    }

    private static void printlnAlives() {
        System.out.println(new BodyPart("Рука").containsBones());
    }

    private static void printlnBodyParts() {
        List<BodyPart> bodyParts = new ArrayList<BodyPart>(5);
        bodyParts.add(new BodyPart("Рука"));
        bodyParts.add(new BodyPart("Нога"));
        bodyParts.add(new BodyPart("Голова"));
        bodyParts.add(new BodyPart("Тело"));
        System.out.println(bodyParts.toString());
    }

    private static void printlnFingers() {
        List<Finger> fingers = new ArrayList<Finger>(5);
        fingers.add(new Finger("Большой", true));
        fingers.add(new Finger("Указательный", true));
        fingers.add(new Finger("Средний", true));
        fingers.add(new Finger("Безымянный", false));
        fingers.add(new Finger("Мизинец", true));
        System.out.println(fingers.toString());
    }
}

