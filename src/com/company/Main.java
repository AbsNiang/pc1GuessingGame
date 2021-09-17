package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int generatedNumber = random.nextInt(11);
        System.out.println("I am thinking of a number between 1 and 10, type a guess.");
        Scanner input = new Scanner(System.in);
        int guess = input.nextInt();
        int numberOfAttempts = 0;
        while (guess != generatedNumber) {
            System.out.println("Guess again");
            guess = input.nextInt();
            numberOfAttempts++;
        }
        System.out.println("Congrats you got it right!");
        System.out.print("It took you ");
        System.out.print(numberOfAttempts);
        System.out.print(" tries!");
    }
}
