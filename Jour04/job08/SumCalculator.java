package Jour04.job08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SumCalculator {
        private static final int MAX_NUM = 10_000_000;
    private static final int NUM_THREADS = 10; // Nombre de threads à utiliser

    public static void main(String[] args) {
        // Créer un pool de threads avec une taille fixe
        ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);

        // Diviser la tâche en parties
        int step = MAX_NUM / NUM_THREADS;
        int start = 1;
        int end = step;

        // Lancer les tâches pour chaque partie
        for (int i = 0; i < NUM_THREADS; i++) {
            int finalStart = start;
            int finalEnd = end;
            executor.submit(() -> {
                long sum = calculateSum(finalStart, finalEnd);
                System.out.println("Sum from " + finalStart + " to " + finalEnd + " is: " + sum);
            });
            start = end + 1;
            end = start + step - 1;
            if (end > MAX_NUM) {
                end = MAX_NUM;
            }
        }

        // Arrêter le pool de threads
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES); // Attendre jusqu'à ce que tous les threads terminent
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Calcul terminé.");
    }

    // Méthode pour calculer la somme dans une plage donnée
    private static long calculateSum(int start, int end) {
        long sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
        }
        return sum;
    }
}
