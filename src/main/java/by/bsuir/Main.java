package by.bsuir;

import by.bsuir.classes.Ball;
import by.bsuir.classes.Bucket;

import java.util.Scanner;

public class Main {
    static Integer firstOption = 1;
    static Integer lastOption = 6;
    static Scanner scan = new Scanner(System.in);
    private static Integer getChoice() {
        int option = 0;
        boolean isCorrect;
        do {
           isCorrect = true;
           try {
               option = Integer.parseInt(scan.nextLine());
               if (option > lastOption || option < firstOption) {
                   throw new Exception();
               }
           }
           catch(Exception e) {
               isCorrect = false;
               System.err.println("Wrong value!");
           }
        } while(!isCorrect);
        return option;
    }
    public static void main(String[] args) {
        boolean isRunning = true;
        Integer option;
        Bucket bucket = new Bucket();
        do {
            System.out.println("1.Add a ball\r\n2.Show balls weight\r\n3.Show number of blue balls\r\n4.Clear the bucket\r\n5.Show balls\r\n6.Exit");
            option = getChoice();
            switch (option) {
                case 1 -> bucket.addBall(new Ball(scan));
                case 2 -> System.out.println("Weight: " + bucket.getAllBallsWeight());
                case 3 -> System.out.println("Number of blue balls: " + bucket.getNumberOfBallsByColor(Ball.Color.BLUE));
                case 4 -> {
                    bucket.clear();
                    System.out.println("The bucket was cleared");
                }
                case 5 -> bucket.show();
                case 6 -> isRunning = false;
                default -> System.out.println("No such option!");
            }
        } while(isRunning);
        scan.close();
    }
}