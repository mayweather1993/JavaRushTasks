package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        reader.close();


        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        while (bufferedReader.ready()){
            String line = bufferedReader.readLine();
            StringBuffer a = new StringBuffer(line);
            System.out.println(a.reverse());
        }
        bufferedReader.close();
    }
}
