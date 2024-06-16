package Jour02.job12;

public interface CombinaisonsDes {
    public static void main(String[] args) {
        int count = 0;

        // Parcours toutes les combinaisons possibles pour les trois dés
        for (int de1 = 1; de1 <= 6; de1++) {
            for (int de2 = 1; de2 <= 6; de2++) {
                for (int de3 = 1; de3 <= 6; de3++) {
                    // Affiche la combinaison actuelle
                    System.out.println(de1 + ", " + de2 + ", " + de3);
                    count++;
                }
            }
        }

        // Affiche le nombre total de combinaisons possibles
        System.out.println("Nombre total de combinaisons possibles : " + count);
    }
}
