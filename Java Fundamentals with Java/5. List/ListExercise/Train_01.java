package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> wagons = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();
        while (!command.equals("end")){
            //add passengers //count passengers
            String [] commandData = command.split(" ");
            if (commandData[0].equals("Add")){
                int passengers = Integer.parseInt(commandData[1]);
                wagons.add(passengers);

            }else{
                //count passengers
                int passengersToAdd =Integer.parseInt(commandData[0]);
                for (int index = 0; index < wagons.size() ; index++) {
                    int currentWagon = wagons.get(index);
                    if (currentWagon + passengersToAdd <= maxCapacity){
                        wagons.set(index, currentWagon + passengersToAdd);

                        break;
                    }
                }

            }

            command = scanner.nextLine();

        }

        for (int wagon: wagons) {
            System.out.print(wagon + " ");
        }

    }
}
