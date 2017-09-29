package com.javarush.task.task19.task1915;

/* 
Дублируем текст
*/

import java.io.*;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();


        PrintStream printStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream printStream1 = new PrintStream(byteArrayOutputStream);
        System.setOut(printStream1);
        testString.printSomething();

//return to previous one
        System.setOut(printStream);


        //write to file

        FileOutputStream outfile = new FileOutputStream(filename);
        byteArrayOutputStream.writeTo(outfile);
        System.out.println(byteArrayOutputStream.toString());
        outfile.close();

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}

