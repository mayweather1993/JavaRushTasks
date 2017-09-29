package com.javarush.task.task19.task1904;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            fileScanner = new Scanner(new File("matrix.txt"));
           String line= fileScanner.nextLine();
           String [] strings = line.split(" ");
           Date date = new Date((Integer.parseInt(strings[3])), Integer.parseInt(strings[4]) , Integer.parseInt(strings[5]));
             return new Person(strings[0] , strings[1] , strings[2] , date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
