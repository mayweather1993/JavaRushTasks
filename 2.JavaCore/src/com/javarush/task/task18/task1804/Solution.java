package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        HashMap<Integer, Integer> mapOfBytes = new HashMap<Integer, Integer>();

        int value = 0;
        Integer count = 0;
        while (inputStream.available() > 0) {
            value = inputStream.read();
            count = mapOfBytes.get(value);
            if (count != null) {
                count++;
            } else count = 0;
            mapOfBytes.put(value, count);
        }
        inputStream.close();

        boolean first = true;
        int min = 0;
        for (int amountByte :
                mapOfBytes.values()) {
            if (first){
                min = amountByte;
                first = false;
            }
            if(min > amountByte)min = amountByte;
        }
        for (Map.Entry pair :
                mapOfBytes.entrySet()) {
            if(min ==(int) pair.getValue()){
                System.out.print(" " + pair.getKey());
            }
            
        }
    }
}