package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String filename = reader.readLine();
        String filename2 = reader.readLine();

        reader.close();

        BufferedReader filereader = new BufferedReader(new FileReader(filename));

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename2));
        while(filereader.ready()){

            String firstFileWithEverything = filereader.readLine();
            bufferedWriter.write(firstFileWithEverything.replace('.' , '!'));
        }
        filereader.close();
        bufferedWriter.close();
    }
}
