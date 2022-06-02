package ArraysLab;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String lineInput = scanner.nextLine();
        int [] numberArr = Arrays
                     .stream(lineInput.split(" "))
                     .mapToInt(Integer::parseInt)
                     .toArray();
        int sum = 0;
        for (int i = 0; i < numberArr.length; i++) {
            int currentElement = numberArr[i];
            if (currentElement % 2 == 0){
                sum += currentElement;
            }

        }
        System.out.println(sum);

    }
}
