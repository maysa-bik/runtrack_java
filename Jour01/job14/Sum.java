package Jour01.job14;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        try (// Create a scanner object to read input from the terminal
        Scanner scanner = new Scanner(System.in)) {
            // Prompt the user to enter the first number
            System.out.print("Enter the first number: ");
            int num1 = scanner.nextInt();

            // Prompt the user to enter the second number
            System.out.print("Enter the second number: ");
            int num2 = scanner.nextInt();

            // Calculate the sum of the two numbers
            int sum = num1 + num2;

            // Display the result
            System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
        }
    }
}


