package com.javarush.task.task17.task1713;

import java.util.*;

/* 
Общий список
*/

public abstract class Solution implements List<Long> {
    private ArrayList<Long> original = new ArrayList<Long>();

    public static void main(String[] args) {

    }

    public synchronized void trimToSize() {
        original.trimToSize();
    }

    public synchronized void ensureCapacity(int minCapacity) {
        original.ensureCapacity(minCapacity);
    }
}
