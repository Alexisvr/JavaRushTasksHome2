package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<Thread>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static class Thread1 extends Thread {
        public void run () {
            while (true) {}
        }
    }
    public static class Thread2 extends Thread {
        public void run () {
            try{
                while (!isInterrupted())
                {

                }
                throw new InterruptedException();
            }catch (InterruptedException e)
            {
                System.out.println("InterruptedException");
            }
        }
    }
    public static class Thread3 extends Thread {
        public void run () {
            while (true) {
                try {
                    System.out.println("Ура");
                    Thread.sleep(500);
                } catch (InterruptedException ignore) {/*NOP*/}
            }
        }
    }
    public static class Thread4 extends Thread implements Message {
        public void showWarning() {
            this.interrupt();
            try
            {
                this.join();
            }
            catch(InterruptedException ignore)
            {/*NOP*/}
        }
        public void run () {
            Thread current = currentThread();
            while (!current.isInterrupted()) {}
        }
    }
    public static class Thread5 extends Thread {
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String s;
            int summa = 0;
            try {
                while (!( (s = reader.readLine() ).equals("N"))){
                    summa += Integer.parseInt(s);
                }
                reader.close();
            } catch (IOException e) {
            }
            System.out.println(summa);
        }
    }
}