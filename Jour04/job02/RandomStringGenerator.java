package Jour04.job02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class RandomStringGenerator {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demander à l'utilisateur la longueur de la chaîne
        System.out.print("Entrez la longueur de la chaîne de caractères aléatoire à générer : ");
        int length = scanner.nextInt();

        // Mesurer le temps de début d'exécution
        long startTime = System.nanoTime();

        // Générer la chaîne de caractères aléatoire
        String randomString = generateRandomString(length);

        // Écrire la chaîne de caractères dans un fichier
        writeStringToFile(randomString);

        // Mesurer le temps de fin d'exécution
        long endTime = System.nanoTime();
        long durationMs = (endTime - startTime) / 1_000_000; // Convertir en millisecondes

        // Afficher le temps d'exécution
        System.out.println("Temps d'exécution total : " + durationMs + " ms");

        scanner.close();
    }

    // Méthode pour générer une chaîne de caractères aléatoire de la longueur spécifiée
    private static String generateRandomString(int length) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder(length);
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";

        for (int i = 0; i < length; i++) {
            char randomChar = characters.charAt(random.nextInt(characters.length()));
            sb.append(randomChar);
        }

        return sb.toString();
    }

    // Méthode pour écrire une chaîne de caractères dans un fichier
    private static void writeStringToFile(String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("Jour04/job02/output.txt"))) {
            writer.write(content);
        } catch (IOException e) {
            System.err.println("Erreur lors de l'écriture dans le fichier : " + e.getMessage());
        }
    }
}
