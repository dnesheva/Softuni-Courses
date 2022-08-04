package BasicSyntaxExercise;

import java.util.Scanner;

public class StrongNumber_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //цяло число
        int number = Integer.parseInt(scanner.nextLine());
        int startNumber = number;
        //разбивам го на цифри
        //винаги разделяме % 10 и ще получим неговата
        //последна цифра и  я махаме делим на / 10 повтаряме число > 0 и спираме при <= 0
        int sumFact = 0;
        while (number > 0){
            int lastDigit = number % 10;
            int fact = 1;
            for (int i = 1; i <= lastDigit ; i++) {
                fact = fact * i;


            }
          sumFact += fact;
            number = number / 10;
        }
        //намирам факториела на всяка цифра
        //сумирам факториелите
        //проверка за стронг ако сумата е = на самото число

        if (sumFact == startNumber){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
}
