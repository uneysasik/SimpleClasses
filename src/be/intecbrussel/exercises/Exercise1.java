package be.intecbrussel.exercises;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number Please!");
        if (keyboard.hasNextInt()) {
            String input = keyboard.next();
            System.out.println("The integer value of your input is: " + Integer.valueOf(input));
            System.out.println("The bit value of your input is: " + Integer.bitCount(Integer.parseInt(input)));
            System.out.println("The byte value of your input is: " + Integer.valueOf(input).byteValue());
        } else {
            System.out.println("Try again. This time just press int number.");

        }
        System.out.println("Do you want to go again?");

    }
}
