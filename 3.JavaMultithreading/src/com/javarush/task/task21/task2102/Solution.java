package com.javarush.task.task21.task2102;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/* 
Сравниваем модификаторы
*/
public class Solution {
    public static void main(String[] args) {
        int modifiersOfThisClass = Solution.class.getModifiers();
        System.out.println(isAllModifiersContainSpecificModifier(modifiersOfThisClass, Modifier.PUBLIC));   //true
        System.out.println(isAllModifiersContainSpecificModifier(modifiersOfThisClass, Modifier.STATIC));   //false

        int modifiersOfMethod = getMainMethod().getModifiers();
        System.out.println(isAllModifiersContainSpecificModifier(modifiersOfMethod, Modifier.STATIC));      //true
    }

    public static boolean isAllModifiersContainSpecificModifier(int allModifiers, int specificModifier) {

        return (allModifiers ^ specificModifier) == 0;

    }



    private static Method getMainMethod() {
        Method[] methods = Solution.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.getName().equalsIgnoreCase("main")) return method;
        }

        return null;
    }
}

    /* Задача я вляется несколько туповатой
* Смысл задачи сводится к определению типов модификаторов, которые содержит класс и его методы
* Задачу можно разделить на две части. В первой части мы определяем тип модификатора класса Solution.
* Это делается при помощи метода getModifiers() (Solution.class.getModifiers();). Полученным результатом
 * будет целое число, которое соответствует одному из модификаторов. Это число хронится в таблице JVM.
  * Так для модификатора public оно равно 1, а для static равно 8.
  * Но само полученное число модификатора класса, нам ничего не говорит о типе модификатора, поэтаму
  * мы должны провести сравнение полученного числа модификатора класса с самими числовыми значениями
  * интересующих нас модификатирами. Для этого  мы запрашиваем. Какое число имеет модификатор типа
  * PUBLIC ?( Modifier.PUBLIC). Теперь значение двух полученных аргументов можно передавать в метод
  * для сравнения. В методе можно использовать различные приемы сравнения числовых значений, но лучше
  * всего ипользовать побитовое сравнение с использованием такого оператора, при котором
   * наложение одиноковых битов двух аргументов дает 0. Пример (1?1 = 0; 0?0 = 0), что в свою очередь и будет
   * означать полное совпадение двух аргументоа*.
   * Во второй части модераторы показывают нам, как находить значения модификатора для метода main  класса Solution.
   * Для этого они создали метод getMainMethod(). Так как класс Solution имеет 3 метода, а нас интересует
   * только модификатор метода main, то они (модераторы) сначало находят и помещают все заявленные методы
   * класса Solution в созданный массив  Method[] methods = Solution.class.getDeclaredMethods();
   * Далее все просто. Используя цикл перебора методов и условие, находят метод main, возвращают его значение
   * и определяют числовое значение его модифыкатора. И снова отправляют на сравнение с интересующим нас модификатором.
   *   The end*/