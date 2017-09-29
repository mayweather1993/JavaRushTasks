package com.javarush.task.task06.task0609;


/* 
Расстояние между двумя точками
*/

public class Util {
    public static double getDistance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(sqr(x1 - x2) + sqr(y1 - y2));
    }

    public static double sqr(int a) {
        return a * a;
    }

    public static void main(String[] args) {

    }
}