package Documents;

import java.util.ArrayList;

public class Bibliotheque {

    // Liste des documents
    private ArrayList<Documents> documents;

    // Constructeur
    public Bibliotheque() {
        documents = new ArrayList<>();
    }

    // Ajouter un document
    public void ajouterDocuments(Documents doc) {

        documents.add(doc);

        System.out.println("Document ajouté avec succès.");
    }

    // Supprimer un document
    public void supprimerDocuments(String titre) {

        for (Documents doc : documents) {

            if (doc.getTitre().equalsIgnoreCase(titre)) {

                documents.remove(doc);

                System.out.println("Document supprimé.");

                return;
            }
        }

        System.out.println("Document introuvable.");
    }

    // Afficher tous les documents
    public void afficherTous() {

        if (documents.isEmpty()) {

            System.out.println("La bibliothèque est vide.");

            return;
        }

        for (Documents doc : documents) {

            System.out.println("-------------------");

            doc.afficherDetails();
        }
    }

    // Rechercher un document
    public void rechercherDocument(String titre) {

        for (Documents doc : documents) {

            if (doc.getTitre().equalsIgnoreCase(titre)) {

                System.out.println("Document trouvé :");

                doc.afficherDetails();

                return;
            }
        }

        System.out.println("Document non trouvé.");
    }
}