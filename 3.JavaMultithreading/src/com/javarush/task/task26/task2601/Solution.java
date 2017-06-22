package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Comparator;

import static java.lang.Math.abs;

/*
Почитать в инете про медиану выборки
*/
public class Solution {

    public static void main(String[] args) {
    }

    public static Integer[] sort(Integer[] array) {
        final double mediana;
        //Соритируем массив по возрастанию для удобство нахождения медианы
        Arrays.sort(array);
        if (array.length % 2 == 0)
            mediana = ((double) array[array.length / 2 - 1] + (double) array[array.length / 2]) / 2;
        else
            mediana = array[array.length / 2];
        //Соритруем элементы с помощью компаратора.
        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Double.compare(abs(o1 - mediana), abs(o2 - mediana));
            }
        });
        return array;
    }
}
