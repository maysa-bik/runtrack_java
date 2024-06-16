package Jour02.job08;

import java.util.Scanner;

public class CompteChiffres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Demande à l'utilisateur d'entrer un nombre
        System.out.print("Entrez un nombre: ");
        int numero = scanner.nextInt();

        // Convertir le nombre en chaîne de caractères
        String numeroString = Integer.toString(numero);

        // Compter le nombre de chiffres
        int nombreDeChiffres = numeroString.length();

        // Afficher le résultat
        System.out.println("Le nombre de chiffres dans " + numero + " est : " + nombreDeChiffres);
    }
}

