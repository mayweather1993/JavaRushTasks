package com.javarush.task.task21.task2113;

public class Horse {
    String name;
    double speed;
    double distance;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }


    public void print() {

        if (distance != 0) {
            String distDots = String.format("%0" + (int) distance + "d", 0);
            String lul = distDots.replaceAll("0", ".");
            System.out.print(lul + name);
        }
    }

    public void move() {
        distance += (speed * Math.random());
    }

}
