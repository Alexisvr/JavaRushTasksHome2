package com.javarush.task.task18.task1812;

import java.io.*;

/* 
Расширяем AmigoOutputStream
*/

public class QuestionFileOutputStream implements AmigoOutputStream {

    private AmigoOutputStream originalAmigo;

    public QuestionFileOutputStream(AmigoOutputStream originalAmigo) {
        this.originalAmigo = originalAmigo;
    }

    @Override
    public void flush() throws IOException {
        originalAmigo.flush();
    }

    @Override
    public void write(int b) throws IOException {
        originalAmigo.write(b);
    }

    @Override
    public void write(byte[] b) throws IOException {
        originalAmigo.write(b);
    }

    @Override
    public void write(byte[] b, int off, int len) throws IOException {
        originalAmigo.write(b,off,len);
    }

    @Override
    public void close() throws IOException {

       System.out.println("Вы действительно хотите закрыть поток? Д/Н");

       BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String answer = reader.readLine();

       if(answer.equals("Д")) originalAmigo.close();

    }
}

