package com.javarush.task.task25.task2502;

import java.util.*;

/* 
Машину на СТО не повезем!
*/
public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() throws IllegalArgumentException {
            //init wheels here
            wheels = new ArrayList<Wheel>();
            String[] strings = this.loadWheelNamesFromDB();
            if (strings.length != 4) throw new IllegalArgumentException();

                for (String string : strings) {
                    wheels.add(Wheel.valueOf(string));
                }

            /*wheels = new ArrayList<>();
            String[] s = loadWheelNamesFromDB();

            if (s.length < 4) throw new IllegalArgumentException();
            for (Wheel wheel : Wheel.values()) {
                if ((!s[0].equals(wheel)) || (!s[1].equals(wheel)) || (!s[2].equals(wheel)) || (!s[3].equals(wheel)))
                    throw new IllegalArgumentException();
            }

            for (String s1 : s) {
                wheels.add(Wheel.valueOf(s1));
            }*/
        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
        new Car();
    }
}
