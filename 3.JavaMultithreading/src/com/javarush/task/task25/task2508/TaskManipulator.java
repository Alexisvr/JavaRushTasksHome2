package com.javarush.task.task25.task2508;

public class TaskManipulator implements CustomThreadManipulator, Runnable {

    Thread thread;
    String threadName;

    @Override
    public void run() {
        try {
            while (!thread.isInterrupted()) {
                Thread.sleep(0);
                System.out.println(threadName);
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
        }
    }

    @Override
    public void start(String threadName) {
        this.threadName = threadName;
        thread = new Thread(this, threadName);
        thread.start();
    }

    @Override
    public void stop() {
        thread.interrupt();
    }
}
