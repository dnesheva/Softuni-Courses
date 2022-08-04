package MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class TheLift_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waitingPeople = Integer.parseInt(scanner.nextLine());
        int[] currentState = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int maxCapacity = 4;
        boolean noMorePeople = false;
        for (int i = 0; i < currentState.length; i++) {
            int currentWagon = currentState[i];
            if (waitingPeople - (maxCapacity - currentWagon) == 0) {
                waitingPeople -= maxCapacity - currentWagon;
                currentState[i] = 4;
                noMorePeople = true;
                break;
            } else if (waitingPeople - (maxCapacity - currentWagon) < 0) {
                currentState[i] = waitingPeople;
                waitingPeople = 0;
                noMorePeople = true;
                break;
            } else {
                waitingPeople -= maxCapacity - currentWagon;
                currentState[i] = 4;
            }
        }
        boolean emptyCabins = false;
        for (int j : currentState) {
            if (j < 4) {
                emptyCabins = true;
                break;
            }

        }
        if (noMorePeople && emptyCabins) {
            System.out.println("The lift has empty spots!");
            for (int item : currentState) {
                System.out.print(item + " ");
            }

        } else if (waitingPeople > 0 && !emptyCabins) {
            System.out.printf("There isn't enough space! %d people in a queue!%n", waitingPeople);
            for (int item : currentState) {
                System.out.print(item + " ");
            }

        } else if (waitingPeople == 0 && !emptyCabins) {
            for (int item : currentState) {
                System.out.print(item + " ");
            }


        }


    }
}