package Jour01.job12;

import java.util.Scanner;

public class SwapStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        // Swap without using a third variable
        str1 = str1 + str2;
        str2 = str1.substring(0, str1.length() - str2.length());
        str1 = str1.substring(str2.length());

        System.out.println("After swapping:");
        System.out.println("First string: " + str1);
        System.out.println("Second string: " + str2);
    }
}

