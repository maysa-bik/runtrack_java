package Jour04.job06;

import java.util.ArrayList;
import java.util.Scanner;

public class SequentialSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander la taille du tableau
        System.out.print("Entrez la taille du tableau : ");
        int taille = scanner.nextInt();

        // Initialiser la liste
        ArrayList<Integer> tableau = new ArrayList<>();

        // Demander à l'utilisateur de saisir les éléments du tableau
        System.out.println("Entrez les éléments du tableau :");
        for (int i = 0; i < taille; i++) {
            tableau.add(scanner.nextInt());
        }

        // Mesurer le temps de début d'exécution
        long startTime = System.currentTimeMillis();

        // Calculer la somme des éléments du tableau
        int somme = 0;
        for (int nombre : tableau) {
            somme += nombre;
        }

        // Mesurer le temps de fin d'exécution
        long endTime = System.currentTimeMillis();
        long durationMs = endTime - startTime;

        // Afficher la somme totale et le temps d'exécution
        System.out.println("La somme des éléments du tableau est : " + somme);
        System.out.println("Temps d'exécution total : " + durationMs + " ms");

        scanner.close();
    }
}

