package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());
        String hue = ",";
        int temp = 0;
        while (inputStream.available() > 0) {
            if (inputStream.read() == hue.charAt(0)) temp++;
        }
        reader.close();
        inputStream.close();
        System.out.println(temp);
    }
}
