package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        FileInputStream file = new FileInputStream(new BufferedReader(new InputStreamReader(System.in)).readLine());
        Set set = new TreeSet();
        int data;
        while (file.available() > 0) {
            data = file.read();
            set.add(data);
        }
        file.close();

        for (Object e : set) {
            System.out.print(e + " ");
        }
    }
}
