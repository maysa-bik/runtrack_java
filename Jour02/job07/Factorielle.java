package Jour02.job07;

import java.util.Scanner;

public class Factorielle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur d'entrer un nombre
        System.out.print("Entrez un nombre: ");
        int nombre = scanner.nextInt();

        // Calcul de la factorielle
        long factorielle = 1;
        for (int i = 1; i <= nombre; i++) {
            factorielle *= i;
        }

        // Affiche le résultat
        System.out.println("La factorielle du nombre " + nombre + " est : " + factorielle);
    }
}

