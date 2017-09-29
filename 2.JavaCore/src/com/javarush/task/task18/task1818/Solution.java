package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = reader.readLine();
        String secondFile = reader.readLine();
        String thirdFile = reader.readLine();
        FileOutputStream fileOutputStream = new FileOutputStream(firstFile);
        FileInputStream fileInputStream = new FileInputStream(secondFile);
        FileInputStream fileInputStream2 = new FileInputStream(thirdFile);


        byte [] buffer = new byte[fileInputStream.available()];
        while (fileInputStream.available() > 0){
            int count = fileInputStream.read(buffer);
            fileOutputStream.write(buffer , 0 , count);
        }
        while(fileInputStream2.available() > 0){
            int count = fileInputStream2.read(buffer);
            fileOutputStream.write(buffer , 0 , count);
        }
        fileInputStream.close();
        fileInputStream2.close();
        fileOutputStream.close();


        /*  byte[] bt1 = new byte[fis1.available()];
        byte[] bt2 = new byte[fis2.available()];

        fis1.read(bt1);
        fis1.close();
        fis2.read(bt2);
        fis2.close();

        fos.write(bt1);
        fos.write(bt2);
        fos.close();
*/
    }
}
