package Jour03.job08;

import java.util.Arrays;

public class TriMatrice {
        public static void main(String[] args) {
        // Déclaration et initialisation de la matrice
        int[][] tableau = { {5, 9, 3}, {7, 2, 8}, {1, 6, 4} };

        // Affichage de la matrice avant le tri
        System.out.println("Matrice avant le tri :");
        afficherMatrice(tableau);

        // Tri de chaque ligne de la matrice
        trierMatrice(tableau);

        // Affichage de la matrice après le tri
        System.out.println("\nMatrice après le tri :");
        afficherMatrice(tableau);
    }

    // Méthode pour afficher une matrice
    public static void afficherMatrice(int[][] matrice) {
        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Méthode pour trier chaque ligne de la matrice
    public static void trierMatrice(int[][] matrice) {
        // Trier chaque ligne de la matrice
        for (int i = 0; i < matrice.length; i++) {
            Arrays.sort(matrice[i]);
        }

        // Trier chaque colonne de la matrice
        for (int j = 0; j < matrice[0].length; j++) {
            for (int i = 0; i < matrice.length - 1; i++) {
                for (int k = i + 1; k < matrice.length; k++) {
                    if (matrice[i][j] > matrice[k][j]) {
                        // Échanger les éléments si nécessaire
                        int temp = matrice[i][j];
                        matrice[i][j] = matrice[k][j];
                        matrice[k][j] = temp;
                    }
                }
            }
        }
    }
}
