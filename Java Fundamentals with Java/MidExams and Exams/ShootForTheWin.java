package MidExam;

import java.util.Arrays;
import java.util.Scanner;

public class ShootForTheWin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] targets = Arrays
                     .stream(scanner.nextLine().split(" "))
                     .mapToInt(Integer::parseInt)
                     .toArray();
        String command = scanner.nextLine();
        int totalShot = 0;
        while (!command.equals("End")){
            int targetIndex = Integer.parseInt(command);
            if (isValidIndex(targets, targetIndex)){
                int shotTarget = targets[targetIndex];
                if (shotTarget != -1){
                    totalShot++;
                    targets[targetIndex] = -1;
                    registerTargetHit(targets, shotTarget);
                }
            }


            command = scanner.nextLine();
        }
        System.out.printf("Shot targets: %d -> ", totalShot);
        printArray(targets,  " ");


    }
    private static void registerTargetHit(int[] targets, int shotTarget){
        for (int i = 0; i < targets.length ; i++) {
            if (targets[i] != -1){
                if (targets[i] > shotTarget){

                    targets[i] -= shotTarget;

                }else{
                    targets[i] += shotTarget;
                }
            }

        }

    }
    private static boolean isValidIndex(int[] targets, int targetIndex){
        return targetIndex>= 0 && targetIndex < targets.length;
    }
    private static void printArray(int[] array,String separator){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1){
                System.out.print(separator);
            }

        }
        System.out.println();

    }

    }

