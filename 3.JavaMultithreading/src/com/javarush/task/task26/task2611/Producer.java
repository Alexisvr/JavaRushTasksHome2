package com.javarush.task.task26.task2611;

import java.util.concurrent.ConcurrentHashMap;

public class Producer implements Runnable {
    private ConcurrentHashMap<String, String> map;

    public Producer(ConcurrentHashMap<String, String> map) {
        this.map = map;
    }

    @Override
    public void run() {
        String key;
        String value;

        try {
            for (int i = 1; i < 6; ++i) {
                key = Integer.toString(i);
                value = "Some text for " + key;
                map.put(key, value);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("[" + Thread.currentThread().getName() + "] thread was terminated");
        }
    }
}
