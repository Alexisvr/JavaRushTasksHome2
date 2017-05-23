package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20 ; i++) {
            int input = Integer.parseInt(reader.readLine());
            list.add(i,input);
        }

        for (Integer aList : list) {
            if (aList%3 == 0)  {
                list1.add(aList);
            }
            if (aList%2 == 0) {
                list2.add(aList);
            }
            if (aList%3 != 0 && aList % 2 != 0) {
                list3.add(aList);
            }


        }

        printList(list1);
        printList(list2);
        printList(list3);


    }

    public static void printList(List list) {
        for (Object aList : list) {
            System.out.println(aList);
        }
    }
}
