package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String alphabetUpper = alphabet.toUpperCase();
        FileReader reader = new FileReader(args[0]);
        int count = 0;

        while(reader.ready()){
            char s = (char) reader.read();

            if(alphabet.indexOf(s) > -1 || alphabetUpper.indexOf(s) > -1)count++;
        }
        reader.close();
        System.out.println(count);
    }
}
