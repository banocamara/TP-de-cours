import java.time.LocalDate;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        // =====================================
        // 1. CREATION DE LA FORMATION
        // =====================================

        formation f1 = new formation(
            "Génie logiciel et Administration des réseaux",
            "Développement et conception de logiciels",
            "Monsieur Madiop",
            12,
            425000,
            180
        );

        // =====================================
        // 2. CREATION DES CINQ ETUDIANTS
        // =====================================

        etudiant[] etudiants = new etudiant[5];

        etudiants[0] = new etudiant(
            1, "Camara", "Bano", f1
        );

        etudiants[1] = new etudiant(
            2, "Seye", "Gora", f1
        );

        etudiants[2] = new etudiant(
            3, "Cisse", "Fousseinou", f1
        );

        etudiants[3] = new etudiant(
            4, "Traoré", "Almoudou", f1
        );

        etudiants[4] = new etudiant(
            5, "Sow", "Abdoullaye", f1
        );

        // =====================================
        // 3. ENREGISTREMENT DES PAIEMENTS
        // =====================================

        for (int i = 0; i < etudiants.length; i++) {

            for (int j = 0; j < 5; j++) {

                paiement p = new paiement(
                    j + 1,
                    85000,
                    LocalDate.of(2026, j + 1, 10),
                    "Espèces"
                );

                etudiants[i].ajouterPaiement(p);
            }
        }

        // =====================================
        // 4. CREATION DES SOUTENANCES
        // =====================================

        for (int i = 0; i < etudiants.length; i++) {

            soutenance s = new soutenance(
                i + 1,
                LocalDate.of(2026, 12, 15 + i),
                LocalTime.of(9 + i, 0),
                "Salle " + (i + 1),
                "Monsieur Dahmane",
                "Monsieur Dioup",
                15 + i
            );

            etudiants[i].setSoutenance(s);
        }

        // =====================================
        // 5. AFFICHAGE DES INFORMATIONS
        // =====================================

        for (int i = 0; i < etudiants.length; i++) {

            System.out.println("\n");
            System.out.println("========================================");
            System.out.println("          ETUDIANT NUMERO " + (i + 1));
            System.out.println("========================================");

            // Informations de l'étudiant
            etudiants[i].afficherInformations();

            // Historique des paiements
            etudiants[i].afficherPaiements();

            // Informations de soutenance
            etudiants[i].afficherSoutenance();

            System.out.println("\nFin des informations de cet étudiant.");
        }

        // =====================================
        // 6. MESSAGE FINAL
        // =====================================

        System.out.println("\n========================================");
        System.out.println("          RESUME DU PROGRAMME");
        System.out.println("========================================");

        System.out.println("Nombre total d'étudiants : " + etudiants.length);
        System.out.println("Nombre de paiements par étudiant : 5");
        System.out.println("Nombre total de paiements : " + (etudiants.length * 5));

        System.out.println("\nProgramme terminé avec succès !");
    }
}
