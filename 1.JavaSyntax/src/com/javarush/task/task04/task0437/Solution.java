package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        for(int i=1;i<=10;i++) {
            for (int b = 1; b <= 10; b++) {
                System.out.print("8");
                if (b == i) break;
            }
            System.out.println();
        }
    }
}
