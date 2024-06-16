package Jour03.job06;

import java.util.Random;

public class TableauAleatoire {
        public static void main(String[] args) {
        // Déclaration et initialisation du tableau
        int[] tableau = new int[10];
        
        // Création d'un objet Random pour générer des nombres aléatoires
        Random random = new Random();
        
        // Remplissage du tableau avec des nombres aléatoires
        for (int i = 0; i < tableau.length; i++) {
            tableau[i] = random.nextInt(100); // Génère un nombre aléatoire entre 0 et 99
        }
        
        // Affichage des valeurs du tableau
        System.out.print("Les valeurs du tableau sont : ");
        for (int valeur : tableau) {
            System.out.print(valeur + " ");
        }
    }
}
