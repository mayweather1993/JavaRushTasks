package com.javarush.task.task06.task0610;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.BufferOverflowException;

/* 
Класс ConsoleReader
*/

public class ConsoleReader {
    public static String readString() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();
        return s;
        //напишите тут ваш код

    }

    public static int readInt() throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(read.readLine());
        return a;

        //напишите тут ваш код

    }

    public static double readDouble() throws Exception {
        BufferedReader read2 = new BufferedReader(new InputStreamReader(System.in));
        double b = Double.parseDouble(read2.readLine());
       return b;

    }

    public static boolean readBoolean() throws Exception {
        BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
        boolean c = Boolean.parseBoolean(reader2.readLine());
        return c;


        //напишите тут ваш код

    }

    public static void main(String[] args) {

    }
}
