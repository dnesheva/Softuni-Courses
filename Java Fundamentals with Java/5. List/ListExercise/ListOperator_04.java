package ListExercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListOperator_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = Arrays.stream(scanner.nextLine().split(" "))
                        .map(Integer::parseInt)
                        .collect(Collectors.toList());

        String command = scanner.nextLine();
        while (!command.equals("End")){
            if (command.contains("Add")){
            //add 4 - add number at the end
                int numberToAdd = Integer.parseInt(command.split(" ")[1]);
                numbers.add(numberToAdd);
            }else if (command.contains("Insert")){
            //Insert 4 0 - insert number of given index
                int numberToInsert = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);
                //проверка за индекс дали е валиден-добавяме елемента, ако не
                //отпечатваме "Invalid index"
                if (isIndexValid(index, numbers.size())){
                    numbers.add(index, numberToInsert);
                }else{
                    System.out.println("Invalid index");
                }
            }else if (command.contains("Remove")){
                //remove 1 - remove that index
                int indexToRemove = Integer.parseInt(command.split(" ")[1]);
                if (isIndexValid(indexToRemove, numbers.size())){
                    numbers.remove(indexToRemove);
                }else{
                    System.out.println("Invalid index");
                }

            }else if (command.contains("Shift left")){
                //Shift left 2 - first number becomes last 2 times
                int countLeft = Integer.parseInt(command.split(" ")[2]);
                //powtarqme countLeft na broj pyti
                for (int time = 1; time <= countLeft ; time++) {
                    //first number becomes last
                    //firstNumber = 3 -> index na lastnumber (дължина-1)
                    int firstNumber = numbers.get(0);
                    numbers.add(firstNumber);
                    numbers.remove(0);
                }
            }else if (command.contains("Shift right")){
                //shift right 3 - last number becomes first 3 times
                int countRight = Integer.parseInt(command.split(" ")[2]);
                //поватаряме countRight на брой пъти
                for (int time = 1; time <= countRight ; time++) {
                    //last number becomes first
                    int lastNumber = numbers.get(numbers.size()- 1);
                    numbers.add(0,lastNumber);
                    numbers.remove(numbers.size()- 1);
                }
            }

            command = scanner.nextLine();
        }
        for (int number: numbers) {
            System.out.print(number + " ");
        }

    }
    //метод, който валидира индекса
    public static boolean isIndexValid(int index, int sizeOfList){
        return index >= 0 && index <= sizeOfList -1;
    }
}
