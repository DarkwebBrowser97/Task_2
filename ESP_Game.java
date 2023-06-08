package ch4java6thedition;

import java.util.Random;
import java.util.Scanner;

public class ESP_Game {
    public static void main (String [] args) {
        // Variables
        int	randomNumber,
                total = 1,   // Since there will always be one try
                userChoice;
        String color = "";

        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Create a Random object
        Random randy = new Random();

        System.out.println("The computer will test your ESP skills by "
                + " randomly generating one of five colors:\n"
                + "Red = 0, Green = 1, Blue = 2, Orange = 3, Yellow = 4.\n"
                + "Try to guess which color the computer is thinking of\n"
                + "by entering the number for the color you think is correct.");

        // Loop 10 times to test the magic
        for(int i = 1; i <= 10; i++)
        {

            // Create a random variable with the Random object
            randomNumber = randy.nextInt(5);

            // Prompt user for color choice
            System.out.println("Enter the number of your color choice:");
            userChoice = input.nextInt();

            switch (randomNumber)
            {
                case 0:
                {
                    color = "Red";
                    break;
                }
                case 1:
                {
                    color = "Green";
                    break;
                }
                case 2:
                {
                    color = "Blue";
                    break;
                }
                case 3:
                {
                    color = "Orange";
                    break;
                }
                case 4:
                {
                    color = "Yellow";
                    break;
                }
                default:
                    System.out.println("Something's wrong..");
            }

            // Create conditional statements to increment total
            if (userChoice == randomNumber)
            {
                System.out.println("You got one right!");
                total += 1;
            }
            else
            {
                System.out.println("The correct answer was " + color
                        + ", but try again!");
            }
        }

        System.out.println("After 10 tries, you got the color correct " + total + " times.");
    }
}