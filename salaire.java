import java.util.Scanner;

public class Exercice2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Variable qui va garder le salaire le plus grand
        double maxSalaire = 0;

        // Variable pour contrôler si l'utilisateur veut ajouter un autre employé
        char choix;

        do {
            // ======= 1. Saisie des informations de l’employé ========

            System.out.print("Donner le nom : ");
            String nom = sc.next();

            System.out.print("Donner le prénom : ");
            String prenom = sc.next();

            System.out.print("Donner l'âge : ");
            int age = sc.nextInt();

            System.out.print("Donner le salaire : ");
            double salaire = sc.nextDouble();

            // ======= 2. Mise à jour du salaire maximum ========

            if (salaire > maxSalaire) {
                maxSalaire = salaire;  // On garde seulement le plus grand
            }

            // ======= 3. Demander si on veut ajouter un autre employé ========

            System.out.print("Voulez-vous ajouter un autre employé ? (o/n) : ");
            choix = sc.next().charAt(0);

        } while (choix == 'o' || choix == 'O');  // Tant que l'utilisateur dit OUI

        // ======= 4. Affichage du résultat ========

        System.out.println("\n-------------------------------------");
        System.out.println("➡ Le salaire le plus grand est : " + maxSalaire);
        System.out.println("-------------------------------------");

        sc.close();
    }
}
