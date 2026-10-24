import java.time.LocalDate;

public class paiement {

    private int id;
    private double montant;
    private LocalDate date_paiement;
    private String mode_paiement;

    // Constructeur
    public paiement(int id, double montant,
                    LocalDate date_paiement,
                    String mode_paiement) {

        this.id = id;
        this.montant = montant;
        this.date_paiement = date_paiement;
        this.mode_paiement = mode_paiement;
    }

    // Getters
    public int getId() {
        return id;
    }

    public double getMontant() {
        return montant;
    }

    public LocalDate getDatePaiement() {
        return date_paiement;
    }

    public String getModePaiement() {
        return mode_paiement;
    }

    // Méthode d'affichage
    public void afficherPaiement() {
        System.out.println("ID du paiement : " + id);
        System.out.println("Montant payé : " + montant + " FCFA");
        System.out.println("Date du paiement : " + date_paiement);
        System.out.println("Mode de paiement : " + mode_paiement);
    }
}
