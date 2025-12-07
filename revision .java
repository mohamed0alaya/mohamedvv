public class Specialite {

    private int num;
    private String libelle;

    // Constructeur
    public Specialite(int num, String libelle) {
        this.num = num;
        this.libelle = libelle;
    }

    // Getters - Setters
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    // Méthode d'affichage
    public void afficher() {
        System.out.println("Numéro : " + num + " | Libellé : " + libelle);
    }
}public class Etudiant {

    public String nom;
    public String prenom;
    public Specialite spec;
    public int niveau;
    public double moy;

    public static double som_moy = 0;
    public static int cpt = 0;

    // Constructeur
    public Etudiant(String nom, String prenom, Specialite spec, int niveau, double moy) {
        this.nom = nom;
        this.prenom = prenom;
        this.spec = spec;
        this.niveau = niveau;
        this.moy = moy;

        cpt++;          // compteur étudiants
        som_moy += moy; // somme des moyennes
    }

    // Affichage
    public void affiche() {
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Spécialité : " + spec.getLibelle());
        System.out.println("Niveau : " + niveau);
        System.out.println("Moyenne : " + moy);
        System.out.println("----------------------------");
    }
}
public class Test {

    public static void main(String[] args) {

        // Tableau de 10 spécialités
        Specialite[] T = new Specialite[10];

        // Remplissage avec 5 spécialités
        T[0] = new Specialite(1, "Réseau");
        T[1] = new Specialite(2, "MDW");
        T[2] = new Specialite(3, "Génie logiciel");
        T[3] = new Specialite(4, "IA");
        T[4] = new Specialite(5, "cybersécurité");

        // Affichage des spécialités
        System.out.println("=== Liste des Spécialités ===");
        for (int i = 0; i < 5; i++) {
            T[i].afficher();
        }

        System.out.println("\n--------------------------------");

        // Modifier "Réseau"
        T[0].setLibelle("Réseau et télécommunication");
        System.out.println("Après modification :");
        T[0].afficher();

        System.out.println("\n--------------------------------");

        // Afficher numéro de "IA"
        System.out.println("Numéro de la spécialité IA : " + T[3].getNum());

        System.out.println("\n--------------------------------");

        // Création étudiants
        Etudiant e1 = new Etudiant("Ali", "Ben Ali", T[2], 3, 14.5);
        Etudiant e2 = new Etudiant("Sana", "Trabelsi", T[4], 2, 16.0);

        // Spécialité de e2
        System.out.println("Spécialité de l'étudiant e2 : " + e2.spec.getLibelle());

        System.out.println("\n--------------------------------");

        // Nombre étudiants
        System.out.println("Nombre total des étudiants : " + Etudiant.cpt);

        // Somme des moyennes
        System.out.println("Somme des moyennes : " + Etudiant.som_moy);

        // Moyenne générale
        double moyenneGenerale = Etudiant.som_moy / Etudiant.cpt;
        System.out.println("Moyenne générale des étudiants : " + moyenneGenerale);
    }
}


