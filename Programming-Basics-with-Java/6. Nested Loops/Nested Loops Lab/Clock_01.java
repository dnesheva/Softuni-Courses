package NestedLoops;

import java.util.Scanner;

public class Clock_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int hour = 0; hour <= 23 ; hour++) {
            for (int min = 0; min <= 59 ; min++) {

                System.out.printf("%02d:%02d%n",hour,min);
            }

        }


    }
}
