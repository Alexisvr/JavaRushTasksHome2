package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = consoleReader.readLine();
        String file2 = consoleReader.readLine();
        String file3 = consoleReader.readLine();


        FileOutputStream outputStream1 = new FileOutputStream(file1);
        FileInputStream inputStream2 = new FileInputStream(file2);
        FileInputStream inputStream3 = new FileInputStream(file3);

        byte[] buffer = new byte[1000];
        while (inputStream2.available() > 0) //пока есть еще непрочитанные байты
        {
            // прочитать очередной блок байт в переменную buffer и реальное количество в count
            int count = inputStream2.read(buffer);
            outputStream1.write(buffer, 0, count); //записать блок(часть блока)
        }

        while (inputStream3.available() > 0) //пока есть еще непрочитанные байты
        {
            // прочитать очередной блок байт в переменную buffer и реальное количество в count
            int count = inputStream3.read(buffer);
            outputStream1.write(buffer, 0, count); //записать блок(часть блока)
        }

        outputStream1.close();
        inputStream2.close();
        inputStream3.close();


    }
}
