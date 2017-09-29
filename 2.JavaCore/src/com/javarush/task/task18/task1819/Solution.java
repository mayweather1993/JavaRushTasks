package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = reader.readLine();
        String secondFile = reader.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream(firstFile, true);
        FileInputStream fileInputStream = new FileInputStream(secondFile);
        byte[] buffer = new byte[fileInputStream.available()];

        while (fileInputStream.available() > 0) {
            int count = fileInputStream.read(buffer);
            fileOutputStream.write(buffer, 0, count);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
