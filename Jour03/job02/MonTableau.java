package Jour03.job02;

public class MonTableau {
    public static void main(String[] args) {
        // Déclaration et initialisation du tableau avec les valeurs initiales
        int[] monTableau = {12, 6, 76, 89};

        // Affichage des valeurs initiales du tableau
        System.out.print("Valeurs initiales du tableau: ");
        for (int i = 0; i < monTableau.length; i++) {
            System.out.print(monTableau[i] + " ");
        }
        System.out.println();

        // Réassignation de nouvelles valeurs au tableau
        monTableau[0] = 34;
        monTableau[1] = 78;
        monTableau[2] = 56;
        monTableau[3] = 90;

        // Affichage des nouvelles valeurs du tableau
        System.out.print("Nouvelles valeurs du tableau: ");
        for (int i = 0; i < monTableau.length; i++) {
            System.out.print(monTableau[i] + " ");
        }
        System.out.println();
    }
}
