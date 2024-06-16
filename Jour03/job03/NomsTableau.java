package Jour03.job03;

public class NomsTableau {
    public static void main(String[] args) {
        // Déclaration et initialisation du tableau de chaînes de caractères
        String[] noms = {"Josette", "John", "Myrtille", "Marc"};

        // Affichage de la valeur "John" dans le terminal
        System.out.println("Valeur à l'index 1: " + noms[1]);

        // Changement de la valeur "Myrtille" par "Mireille"
        noms[2] = "Mireille";

        // Affichage des valeurs du tableau dans le terminal
        System.out.print("Valeurs du tableau: ");
        for (int i = 0; i < noms.length; i++) {
            System.out.print(noms[i] + " ");
        }
        System.out.println();
    }
}
