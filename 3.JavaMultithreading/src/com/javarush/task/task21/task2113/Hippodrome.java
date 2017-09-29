package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    private List<Horse> horses;

    public static void main(String[] args) {
        game = new Hippodrome(new ArrayList<>());
        Horse horse1 = new Horse("jovani", 3, 0);
        Horse horse2 = new Horse("hue", 3, 0);
        Horse horse3 = new Horse("pidrila", 3, 0);
        game.getHorses().add(horse1);
        game.getHorses().add(horse2);
        game.getHorses().add(horse3);
        try {
            game.run();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        game.printWinner();

    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }

    }

    public void print() {
        for (Horse horse :
                horses) {
            horse.print();
        }
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
    }

    public void move() {
        for (Horse horse :
                horses) {
            horse.move();
        }
    }

    public Horse getWinner() {
        int indexOfHorseMaxDistance = 0;
        for (int i = 0; i < horses.size(); i++) {
            if (horses.get(i).distance > horses.get(indexOfHorseMaxDistance).distance) {
                indexOfHorseMaxDistance = i;

            }
        }
        return horses.get(indexOfHorseMaxDistance);
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}
