package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstfile = bufferedReader.readLine();
        String secondfile = bufferedReader.readLine();

        BufferedReader filereader = new BufferedReader(new FileReader(firstfile));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(secondfile));
        String withEverything = null;
        while (filereader.ready()){
            withEverything = filereader.readLine();
            String goodString = withEverything.replaceAll("\\W","");
            bufferedWriter.write(goodString);
        }







        filereader.close();
        bufferedReader.close();
        bufferedWriter.close();
    }

}
