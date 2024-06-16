package Jour02.job10;

public class SommeChiffres {
    public static void main(String[] args) {
        int nombre = 1234;
        int somme = 0;

        // Boucle pour additionner les chiffres
        while (nombre != 0) {
            somme += nombre % 10; // Ajoute le chiffre de droite à la somme
            nombre = nombre / 10;  // Retire le chiffre de droite du nombre
        }

        System.out.println("La somme des chiffres est : " + somme);
    }
}

