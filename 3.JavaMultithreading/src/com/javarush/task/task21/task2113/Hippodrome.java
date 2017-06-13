package com.javarush.task.task21.task2113;

import java.util.*;

/**
 * Created by Алексей on 11.06.2017.
 */
public class Hippodrome {

    static Hippodrome game;

    public static List<Horse> horses = new List<Horse>() {
        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Horse> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean add(Horse horse) {
            return false;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Horse> c) {
            return false;
        }

        @Override
        public boolean addAll(int index, Collection<? extends Horse> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }

        @Override
        public boolean equals(Object o) {
            return false;
        }

        @Override
        public int hashCode() {
            return 0;
        }

        @Override
        public Horse get(int index) {
            return null;
        }

        @Override
        public Horse set(int index, Horse element) {
            return null;
        }

        @Override
        public void add(int index, Horse element) {

        }

        @Override
        public Horse remove(int index) {
            return null;
        }

        @Override
        public int indexOf(Object o) {
            return 0;
        }

        @Override
        public int lastIndexOf(Object o) {
            return 0;
        }

        @Override
        public ListIterator<Horse> listIterator() {
            return null;
        }

        @Override
        public ListIterator<Horse> listIterator(int index) {
            return null;
        }

        @Override
        public List<Horse> subList(int fromIndex, int toIndex) {
            return null;
        }
    };

    public Hippodrome() {

    }

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args)  {
        game = new Hippodrome(new ArrayList<>());
        Horse first = new Horse("Sleven", 3, 0);
        Horse second = new Horse("Lucky", 3, 0);
        Horse third = new Horse("Gomer", 3, 0);

        game.horses.add(first);
        game.horses.add(second);
        game.horses.add(third);

        try {
            game.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        game.printWinner();

    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }

    }
    public void move() {

        for (int j = 0; j < getHorses().size(); j++) {
            horses.get(j).move();
        }
    }
    public void print() {
        for (int j = 0; j < getHorses().size(); j++) {
            horses.get(j).print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }
    public Horse getWinner() {

        Horse winner = new Horse(null, 0, 0);
        double winDist = 0;
        for (int j = 0; j < getHorses().size(); j++) {
            if (horses.get(j).distance > winDist)
                winner = horses.get(j);
        }

        return winner;
    }

    public void printWinner(){
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}
