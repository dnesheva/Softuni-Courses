package MidExam;

import java.util.Scanner;

public class Mu_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] roomsArr = scanner.nextLine().split("\\|");
        int health = 100;
        int bitcoin = 0;
        boolean isDead = false;
        for (int i = 0; i < roomsArr.length ; i++) {
            String [] room = roomsArr[i].split(" ");
            String command = room[0];
            int num = Integer.parseInt(room[1]);
            switch (command){
                case "potion":
                    int diffHealth = 100 - health;
                    health = health + num;
                    if (health > 100){
                        num = diffHealth;
                        health = 100;
                    }
                    System.out.printf("You healed for %d hp.%n", num);
                    System.out.printf("Current health: %d hp.%n", health);
                    break;
                case "chest":
                    System.out.printf("You found %d bitcoins.%n", num);
                    bitcoin = bitcoin + num;
                    break;
                default:
                    health = health - num;
                    if (health <= 0){
                        isDead = true;
                        System.out.printf("You died! Killed by %s.%n", command);
                        System.out.printf("Best room: %d%n", i + 1);
                    }else{
                        System.out.printf("You slayed %s.%n", command);
                    }
                    break;


            }
            if (isDead){
                break;
            }

        }
        if (!isDead){
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoin);
            System.out.printf("Health: %d", health);
        }

    }
}
