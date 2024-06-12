package Jour01.job08;

public class Facture {
    public static void main(String[] args) {
        // Déclaration des variables
        double prix = 49.99; // Prix unitaire du produit
        int quantite = 3;    // Quantité achetée

        // Calcul du montant hors taxe
        double tarifHT = prix * quantite;

        // Déclaration et initialisation de la TVA
        double tva = 0.20; // 20%

        // Calcul du montant de la TVA
        double montantTVA = tarifHT * tva;

        // Calcul du montant total TTC
        double tarifTTC = tarifHT + montantTVA;

        // Affichage des résultats
        System.out.println("Le montant total est : " + tarifHT);
        System.out.println("Le montant de la taxe est : " + montantTVA);
        System.out.println("Le montant total à payer est : " + tarifTTC);
    }
}

