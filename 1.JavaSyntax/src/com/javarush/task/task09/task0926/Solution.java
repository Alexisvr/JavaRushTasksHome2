package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш коl
        ArrayList<int[]> arrayList = new ArrayList<>();

        int[] mas1 = new int[]{1,6,9,3,2};
        arrayList.add(mas1);
        int[] mas2 = new int[]{5,3};
        arrayList.add(mas2);
        int[] mas3 = new int[]{5,3,54,1};
        arrayList.add(mas3);
        int[] mas4 = new int[]{5,3,1,3,8,6,4};
        arrayList.add(mas4);
        int[] mas5 = new int[]{};
        arrayList.add(mas5);

        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
