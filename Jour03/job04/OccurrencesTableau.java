package Jour03.job04;

import java.util.HashMap;
import java.util.Map;

public class OccurrencesTableau {
    public static void main(String[] args) {
        // Initialisation du tableau avec les valeurs spécifiées
        int[] tableau = {3, 7, 3, 9, 8};

        // Utilisation d'une HashMap pour compter les occurrences de chaque nombre
        Map<Integer, Integer> occurrences = new HashMap<>();

        for (int i = 0; i < tableau.length; i++) {
            int nombre = tableau[i];
            if (occurrences.containsKey(nombre)) {
                occurrences.put(nombre, occurrences.get(nombre) + 1);
            } else {
                occurrences.put(nombre, 1);
            }
        }

        // Affichage des résultats dans le terminal
        for (Map.Entry<Integer, Integer> entry : occurrences.entrySet()) {
            System.out.println("Nombre " + entry.getKey() + " : " + entry.getValue() + " occurrence(s)");
        }
    }
}
