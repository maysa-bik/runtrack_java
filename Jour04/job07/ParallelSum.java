package Jour04.job07;

import java.util.ArrayList;
import java.util.Scanner;

public class ParallelSum {
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

        // Convertir la liste en tableau pour un accès plus rapide
        int[] array = tableau.stream().mapToInt(i -> i).toArray();

        // Mesurer le temps de début d'exécution
        long startTime = System.currentTimeMillis();

        // Diviser le tableau en deux moitiés et créer deux threads
        int mid = array.length / 2;
        SumThread firstHalf = new SumThread(array, 0, mid);
        SumThread secondHalf = new SumThread(array, mid, array.length);

        // Démarrer les threads
        firstHalf.start();
        secondHalf.start();

        try {
            // Attendre que les threads finissent
            firstHalf.join();
            secondHalf.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Combiner les résultats
        int totalSum = firstHalf.getSum() + secondHalf.getSum();

        // Mesurer le temps de fin d'exécution
        long endTime = System.currentTimeMillis();
        long durationMs = endTime - startTime;

        // Afficher la somme totale et le temps d'exécution
        System.out.println("La somme des éléments du tableau est : " + totalSum);
        System.out.println("Temps d'exécution total : " + durationMs + " ms");

        scanner.close();
    }
}

class SumThread extends Thread {
    private int[] array;
    private int start;
    private int end;
    private int sum;

    public SumThread(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    public void run() {
        sum = 0;
        for (int i = start; i < end; i++) {
            sum += array[i];
        }
    }

    public int getSum() {
        return sum;
    }
}
    

