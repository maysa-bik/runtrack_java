package Jour03.job05;

import java.util.HashSet;
import java.util.Set;

public class ValeursUniques {
        public static void main(String[] args) {
        // Initialisation du tableau avec des valeurs (vous pouvez changer les valeurs pour tester)
        int[] tableau = {3, 7, 3, 9, 8, 7, 1};

        // Utilisation d'un HashSet pour stocker les valeurs uniques
        Set<Integer> valeursUniques = new HashSet<>();

        // Parcours du tableau et ajout des valeurs dans le HashSet
        for (int valeur : tableau) {
            valeursUniques.add(valeur);
        }

        // Affichage des valeurs uniques
        System.out.println("Les valeurs uniques du tableau sont : " + valeursUniques);
    }
}
