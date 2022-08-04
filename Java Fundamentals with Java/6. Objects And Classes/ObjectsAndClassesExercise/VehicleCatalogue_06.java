package ObjectsAndClassesExercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VehicleCatalogue_06 {

    static class Vehicle {
        //poleta s harakteristiki
        private String type;
        private String model;
        private String color;
        private int hp;

        //konstruktor
        public String getModel() {
            return this.model;
        }

        @Override
        public String toString() {
            String formattedType = "";
            if (this.type.equals("car")){
                formattedType = "Car";
            }else if (this.type.equals("truck")){
                formattedType = "Truck";
            }
            return String.format("Type: %s%nModel: %s%nColor: %s%nHorsepower: %d", formattedType, this.model, this.color, this.hp);

        }

        public String getType() {
            return type;
        }

        public int getHp() {
            return hp;
        }

        public Vehicle(String type, String model, String color, int hp) {
            this.type = type;
            this.model = model;
            this.color = color;
            this.hp = hp;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<Vehicle> vehicleList = new ArrayList<>();
        while (!input.equals("End")) {
            String[] inputData = input.split(" ");
            String type = inputData[0];
            String model = inputData[1];
            String color = inputData[2];
            int hp = Integer.parseInt(inputData[3]);
            Vehicle vehicle = new Vehicle(type, model, color, hp);
            vehicleList.add(vehicle);


            input = scanner.nextLine();

        }
        String enteredModel = scanner.nextLine();
        while (!enteredModel.equals("Close the Catalogue")) {
            for (Vehicle vehicle : vehicleList) {
                if (enteredModel.equals(vehicle.getModel())) {
                    System.out.println(vehicle);
                    break;
                }
            }


            enteredModel = scanner.nextLine();
        }
        System.out.printf("Cars have average horsepower of: %.2f.%n", getAverageHp(vehicleList, "cars"));
        System.out.printf("Trucks have average horsepower of: %.2f.", getAverageHp(vehicleList, "trucks"));

    }

    private static double getAverageHp(List<Vehicle> vehicleList, String type) {
        double sum = 0;
        int count = 0;

        if (type.equals("cars")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getType().equals("car")) {
                    sum += vehicle.getHp();
                    count++;
                }

            }

        } else if (type.equals("trucks")) {
            for (Vehicle vehicle : vehicleList) {
                if (vehicle.getType().equals("truck")) {
                    sum += vehicle.getHp();
                    count++;
                }

            }

        }
        if (sum == 0){
            return 0;
        }
        return sum / count;


    }
}


