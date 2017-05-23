package com.javarush.task.task16.task1630;

import java.io.*;

public class Solution {
    public static String firstFileName;
    public static String secondFileName;
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    //add your code here - добавьте код тут
    static {
        try {
            firstFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            secondFileName = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static class ReadFileThread extends Thread implements ReadFileInterface {
        String filename, content="";

        @Override
        public void run() {
            try {
                BufferedReader reader = new BufferedReader(new FileReader(filename));
                try {
                    while (reader.ready()){
                        content += reader.readLine()+" ";
                    }
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        @Override
        public void setFileName(String fullFileName) {
            filename = fullFileName;
        }

        @Override public String getFileContent() {
            return content.trim();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        systemOutPrintln(firstFileName);
        systemOutPrintln(secondFileName);
    }

    public static void systemOutPrintln(String fileName) throws InterruptedException {
        ReadFileInterface f = new ReadFileThread();
        f.setFileName(fileName);
        f.start();
        //add your code here - добавьте код тут
        f.join();
        System.out.println(f.getFileContent());
    }

    public interface ReadFileInterface {

        void setFileName(String fullFileName);

        String getFileContent();

        void join() throws InterruptedException;

        void start();
    }

    //add your code here - добавьте код тут
}
