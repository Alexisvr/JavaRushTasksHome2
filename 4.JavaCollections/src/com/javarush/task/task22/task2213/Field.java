package com.javarush.task.task22.task2213;

/**
 * Created by vorobev on 23.05.2017.
 */
public class Field {
    int width;
    int height;
    int[][] matrix;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public  void initMatrix(int width, int height) {
     /*    public Field(int width, int height)
        {
            this.width = width;
            this.height = height;*/
            matrix = new int[height][width];
        //}
    }
}
