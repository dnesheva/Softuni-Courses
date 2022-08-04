package Exams;

import java.util.Scanner;

public class WorldTour_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String stops = scanner.nextLine();
        StringBuilder stopBuilder = new StringBuilder(stops);
        String command = scanner.nextLine();


        while (!command.equals("Travel")){
            //команда
            if (command.contains("Add Stop")){
                //1. command = "Add Stop:7:Rome".split(":") -> ["Add Stop", "7", "Rome"]
                int index = Integer.parseInt(command.split(":")[1]);
                String stopName = command.split(":")[2];
                //валидиране на индекс
                if (isValidIndex(index,stopBuilder)){
                    stopBuilder.insert(index, stopName);
                }

            }else if (command.contains("Remove Stop")){
                //2. command = "Remove Stop:11:16".split(":") -> ["Remove Stop", "11", "16"]
                int startIndex = Integer.parseInt(command.split(":")[1]);
                int endIndex = Integer.parseInt(command.split(":")[2]);
                if (isValidIndex(startIndex,stopBuilder) && isValidIndex(endIndex,stopBuilder)){
                    stopBuilder.delete(startIndex,endIndex + 1); //до крайния индекс + 1
                }

            }else if (command.contains("Switch")){
                //3. command = "Switch:Hawai:Bulgaria".split(":") -> ["Switch", "Hawai", "Bulgaria"]
                String oldStop = command.split(":")[1];
                String newStop = command.split(":")[2];
                //проверка и правим замяната само ако имаме стар текст
                if (stops.contains(oldStop)){
                    String updatedStop = stopBuilder.toString().replace(oldStop,newStop);
                    stopBuilder = new StringBuilder(updatedStop);
                }


            }
            System.out.println(stopBuilder);

            command = scanner.nextLine();
        }
        System.out.println("Ready for world tour! Planned stops: " + stopBuilder);


    }
    //метод, който валидира индекс в текста StopBuilder
    public static boolean isValidIndex(int index, StringBuilder builder){
        return index >= 0 && index <= builder.length() -1;
    }
}
