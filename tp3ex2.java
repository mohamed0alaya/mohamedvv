import java.util.Scanner;

public class Exercice2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] tab = {3, 7, 2, 7, 9, 7};

        System.out.print("Donner un entier à chercher : ");
        int x = sc.nextInt();

        int dernierIndice = -1;

        // Parcours pour chercher la dernière occurrence
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == x) {
                dernierIndice = i;
            }
        }

        if (dernierIndice == -1) {
            System.out.println("L'entier n'existe pas dans le tableau.");
        } else {
            System.out.println("Dernière occurrence à l'indice : " + dernierIndice);
        }

        sc.close();
    }
}
