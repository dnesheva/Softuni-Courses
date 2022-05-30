package ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class TransportPrice_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countKm = Integer.parseInt(scanner.nextLine());
        String word = scanner.nextLine();
        //•	Такси. Начална такса: 0.70 лв. Дневна тарифа: 0.79 лв. / км. Нощна тарифа: 0.90 лв. / км.
        //•	Автобус. Дневна / нощна тарифа: 0.09 лв. / км. Може да се използва за разстояния минимум 20 км.
        //•	Влак. Дневна / нощна тарифа: 0.06 лв. / км. Може да се използва за разстояния минимум 100 км.
        double taxiPriceStart = 0.70;
        double taxiPriceDay = 0.79;
        double taxiPriceNight = 0.90;
        double busPrice = 0.09;
        double trainPrice = 0.06;
        double DayTotalWithTaxi = taxiPriceStart + countKm * taxiPriceDay;
        double NightTotalWithTaxi = taxiPriceStart + countKm * taxiPriceNight;
        double TotalWithBus = countKm * busPrice;
        double TotalWithTrain = countKm * trainPrice;
        if (countKm < 20 && word.equalsIgnoreCase("day")) {
            System.out.printf("%.2f", DayTotalWithTaxi);
        } else if (countKm < 20 && word.equalsIgnoreCase("night")) {
            System.out.printf("%.2f", NightTotalWithTaxi);

        } else if (countKm < 100) {
            System.out.printf("%.2f", TotalWithBus);
        } else  {
            System.out.printf("%.2f", TotalWithTrain);
        }
    }
}
