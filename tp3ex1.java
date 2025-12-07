import java.util.Arrays;
import java.util.Scanner;

public class Exercice1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tab = new int[5];

        // 1) Remplissage du tableau
        for (int i = 0; i < tab.length; i++) {
            System.out.print("Donner un entier : ");
            tab[i] = sc.nextInt();
        }

        // 2) Affichage du tableau
        System.out.println("\nContenu du tableau : ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }

        // 3) Tri croissant
        Arrays.sort(tab);

        // 4) Affichage du tableau trié
        System.out.println("\nTableau trié : ");
        for (int i = 0; i < tab.length; i++) {
            System.out.print(tab[i] + " ");
        }

        sc.close();
    }
}
