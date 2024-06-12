package Jour01.job11;

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter une duree en minutes : ");
        int totalMinutes = scanner.nextInt();

        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;

        // Corrected printf statement
        System.out.printf("%02d:%02d est equivalent à %02d heures et %02d minutes.\n", hours, minutes, hours, minutes);
    }
}


