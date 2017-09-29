package com.javarush.task.task20.task2003;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* 
Знакомство с properties
*/
public class Solution {
    public static Map<String, String> properties = new HashMap<>();
    public static Properties properties2 = new Properties();
    public static String filName;

    public void fillInPropertiesMap() throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        filName = bufferedReader.readLine();
        bufferedReader.close();
        FileInputStream fileInputStream = new FileInputStream(filName);
        load(fileInputStream);
        fileInputStream.close();
        //implement this method - реализуйте этот метод
    }

    public void save(OutputStream outputStream) throws Exception {

        properties2.clear();
        for (Map.Entry<String, String> pair :
                properties.entrySet()) {
            properties2.put(pair.getKey(), pair.getValue());
        }

        properties2.store(outputStream , "");
        //implement this method - реализуйте этот метод
    }

    public void load(InputStream inputStream) throws Exception {
        properties2.load(inputStream);
        for (Map.Entry<Object , Object> pair :
                properties2.entrySet()) {
            properties.put((String) pair.getKey() , (String) pair.getValue());
        }
        //implement this method - реализуйте этот метод
    }

    public static void main(String[] args) {

    }
}
