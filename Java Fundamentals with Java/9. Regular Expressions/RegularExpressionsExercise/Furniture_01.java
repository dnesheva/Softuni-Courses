package RegularExpressionsExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Furniture_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        List<String> furniture = new ArrayList<>();
        double totalSum = 0;
        String regex = ">>(?<furnitureName>[A-Za-z]+)<<(?<price>[0-9]+.?[0-9]*)!(?<quantity>[0-9]*)";
        //[0-9] <-> \\d
        //[A-Za-z] <-> \\w
        //+ -> 1 или повече пъти
        // * -> нула или повече
        //? -> 0 или 1 пъту
        Pattern pattern = Pattern.compile(regex);
        String input = scanner.nextLine();
        while (!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);
            if (matcher.find()){
                String furnitureName = matcher.group("furnitureName");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));
                furniture.add(furnitureName);
                double currentFurniturePrice = price * quantity;
                totalSum += currentFurniturePrice;
            }


            input = scanner.nextLine();
        }
        System.out.println("Bought furniture:");
        furniture.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", totalSum);

        }


    }

