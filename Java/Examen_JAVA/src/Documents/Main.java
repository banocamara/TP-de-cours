package Documents;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Bibliotheque bibliotheque = new Bibliotheque();

        int choix;

        do {

            System.out.println("\n===== MENU =====");

            System.out.println("1. Ajouter un document");
            System.out.println("2. Supprimer un document");
            System.out.println("3. Rechercher un document");
            System.out.println("4. Afficher tous les documents");
            System.out.println("0. Quitter");

            System.out.print("Votre choix : ");

            choix = scanner.nextInt();
            scanner.nextLine();

            switch (choix) {

                case 1:

                    System.out.println("\n1. Livre");
                    System.out.println("2. DVD");
                    System.out.println("3. Magazine");

                    System.out.print("Choix : ");

                    int type = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Titre : ");
                    String titre = scanner.nextLine();

                    System.out.print("Auteur : ");
                    String auteur = scanner.nextLine();

                    System.out.print("Année : ");
                    int annee = scanner.nextInt();

                    if (type == 1) {

                        System.out.print("Nombre de pages : ");

                        int pages = scanner.nextInt();

                        Livre livre = new Livre(
                                titre,
                                auteur,
                                annee,
                                pages
                        );

                        bibliotheque.ajouterDocuments(livre);

                    } else if (type == 2) {

                        System.out.print("Durée : ");

                        int duree = scanner.nextInt();

                        DVD dvd = new DVD(
                                titre,
                                auteur,
                                annee,
                                duree
                        );

                        bibliotheque.ajouterDocuments(dvd);

                    } else if (type == 3) {

                        System.out.print("Numéro : ");

                        int numero = scanner.nextInt();

                        Magazine magazine = new Magazine(
                                titre,
                                auteur,
                                annee,
                                numero
                        );

                        bibliotheque.ajouterDocuments(magazine);
                    }

                    break;

                case 2:

                    System.out.print("Titre du document à supprimer : ");

                    String titreSupp = scanner.nextLine();

                    bibliotheque.supprimerDocuments(titreSupp);

                    break;

                case 3:

                    System.out.print("Titre du document à rechercher : ");

                    String titreRecherche = scanner.nextLine();

                    bibliotheque.rechercherDocument(titreRecherche);

                    break;

                case 4:

                    bibliotheque.afficherTous();

                    break;

                case 0:

                    System.out.println("Fin du programme.");

                    break;

                default:

                    System.out.println("Choix invalide.");
            }

        } while (choix != 0);

        scanner.close();
    }
}