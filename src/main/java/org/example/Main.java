package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean shouldWakeUp(boolean isBarking, int clock) {

        if(isBarking) {
            if(clock >= 20 && clock <= 23) {
                return true;
            } else if (clock >= 0 && clock < 8) {
                return true;
            } else {
                return false;
            }
        }
        return isBarking;

    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge) {

        boolean first = firstAge >= 13 && firstAge <= 19;
        boolean second = secondAge >= 13 && secondAge <= 19;
        boolean third = thirdAge >= 13 && thirdAge <= 19;
        return first || second || third;
    }

    public static boolean isCatPlaying(boolean isSummer, int temp) {

        int tempDown = 25;
        int tempUp = 35;
        if(isSummer) {
            tempDown = 35;
            tempUp = 45;
        }
        return temp >= tempDown && temp <= tempUp;
    }

    public static double area(double width, double height) {
       if(width < 0 || height < 0) {
           return -1;
       }
        return width * height;
    }

    public static double area(double radius) {
        if(radius < 0) {
            return -1;
        }
        return radius*radius*Math.PI;
    }
}

