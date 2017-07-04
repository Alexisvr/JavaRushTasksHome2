package com.javarush.task.task31.task3110;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Archiver {
    public static void main(String[] args) {
        System.out.println("Введите полный путь архива:");
        BufferedReader readerFullPath = new BufferedReader(new InputStreamReader(System.in));
        ZipFileManager zipFileManager = null;
        try {
            zipFileManager = new ZipFileManager(Paths.get(readerFullPath.readLine()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Введите путь к файлу, который будем архивировать:");
        BufferedReader readerPathToAdd = new BufferedReader(new InputStreamReader(System.in));
        try {
            zipFileManager.createZip(Paths.get(readerPathToAdd.readLine()));
        } catch (Exception e) {
            e.printStackTrace();
        }

       /* System.out.println("Enter full path to archive file:");
       // ConsoleHelper.writeMessage("Enter full path to archive file:");
        BufferedReader zipFileName = new BufferedReader(new InputStreamReader(System.in));
        //String zipFileName = ConsoleHelper.readString();
        ZipFileManager zipFileManager = new ZipFileManager(Paths.get(String.valueOf(zipFileName)));
        System.out.println("Enter full path to file:");
        //ConsoleHelper.writeMessage("Enter full path to file:");
        String fileName = ConsoleHelper.readString();
        zipFileManager.createZip(Paths.get(fileName));*/


    }
}
