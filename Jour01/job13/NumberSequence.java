package Jour01.job13;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();

            for (int i = 1; i <= number; i++) {
                System.out.print(i + " ");
            }
        }
    }
}

