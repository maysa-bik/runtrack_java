package Jour02.job05;

import java.util.Scanner;

public class WorkingAgeCheker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Demander à l'utilisateur son âge
        System.out.print("Entrez votre âge : ");
        int age = scanner.nextInt();
        
        // Vérifier l'âge et afficher le message approprié
        if (age < 16) {
            System.out.println("Vous êtes trop jeune pour travailler.");
        } else if (age > 55 && age < 67) {
            System.out.println("Vous aurez du mal à trouver un emploi.");
        } else if (age >= 67) {
            System.out.println("Vous êtes à la retraite.");
        } else {
            System.out.println("Vous êtes en âge de travailler.");
        }
        
        // Fermer le scanner
        scanner.close();
    }
}


