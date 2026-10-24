import java.util.ArrayList;

public class etudiant {

    // Attributs
    private int id;
    private String nom;
    private String prenom;
    private formation formation;

    // Liste des paiements de l'étudiant
    private ArrayList<paiement> paiements = new ArrayList<>();

    // Soutenance de l'étudiant
    private soutenance soutenance;

    // Constructeur
    public etudiant(int id, String nom, String prenom, formation formation) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.formation = formation;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public formation getFormation() {
        return formation;
    }

    public soutenance getSoutenance() {
        return soutenance;
    }

    // Setters
    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setFormation(formation formation) {
        this.formation = formation;
    }

    public void setSoutenance(soutenance soutenance) {
        this.soutenance = soutenance;
    }

    // Ajouter un paiement
    public void ajouterPaiement(paiement paiement) {

        if (paiements.size() < 5) {
            paiements.add(paiement);
        } else {
            System.out.println(
                "Cet étudiant a déjà effectué 5 paiements."
            );
        }
    }

    // Calculer le total payé
    public double calculerTotalPaye() {

        double total = 0;

        for (paiement p : paiements) {
            total = total + p.getMontant();
        }

        return total;
    }

    // Calculer le reste à payer
    public double calculerResteAPayer() {

        return formation.getCout() - calculerTotalPaye();
    }

    // Afficher les informations de l'étudiant
    public void afficherInformations() {

        System.out.println("Identifiant : " + id);
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);

        System.out.println("\n--- FORMATION ---");
        formation.afficherFormation();
    }

    // Afficher tous les paiements
    public void afficherPaiements() {

        System.out.println("\n--- HISTORIQUE DES PAIEMENTS ---");

        if (paiements.isEmpty()) {
            System.out.println("Aucun paiement enregistré.");
        }

        for (paiement p : paiements) {
            p.afficherPaiement();
            System.out.println("--------------------------");
        }

        System.out.println("Nombre de paiements : " + paiements.size());
        System.out.println(
            "Total payé : " + calculerTotalPaye() + " FCFA"
        );
        System.out.println(
            "Reste à payer : " + calculerResteAPayer() + " FCFA"
        );
    }

    // Afficher les informations de soutenance
    public void afficherSoutenance() {

        System.out.println("\n--- INFORMATIONS DE SOUTENANCE ---");

        if (soutenance != null) {
            soutenance.afficherSoutenance();
        } else {
            System.out.println("Aucune soutenance enregistrée.");
        }
    }
}
