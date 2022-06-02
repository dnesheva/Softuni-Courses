package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] mainArr = Arrays
                     .stream(scanner.nextLine().split(" "))
                     .mapToInt(Integer::parseInt)
                     .toArray();

        while (mainArr.length > 1){
            int[] newArr = new int[mainArr.length - 1];
            for (int i = 0; i < mainArr.length - 1; i++)
            {
                newArr[i] = mainArr[i] + mainArr[i + 1];
            }
            mainArr = newArr;
        }
        System.out.println(mainArr[0]);
    }
        }


