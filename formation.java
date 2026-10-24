public class formation {

    private String nom_formation;
    // private int id_formation;
    private String description_formation;
    private String nom_formateur;
    private int duree_formation;
    private int cout_formation;
    private int nbre_credits;

    // Constructeur
    public formation(String nom_formation,
                     String description_formation,
                     String nom_formateur,
                     int duree_formation,
                     int cout_formation,
                     int nbre_credits) {

        this.nom_formation = nom_formation;
        this.description_formation = description_formation;
        this.nom_formateur = nom_formateur;
        setDuree(duree_formation);
        setCout(cout_formation);
        setNbreCredits(nbre_credits);
    }

    // Getters
    public String getNomFormation() {
        return nom_formation;
    }

    public String getDescriptionFormation() {
        return description_formation;
    }

    public String getNomFormateur() {
        return nom_formateur;
    }

    public int getDuree() {
        return duree_formation;
    }

    public int getCout() {
        return cout_formation;
    }

    public int getNbreCredits() {
        return nbre_credits;
    }

    // Setters
    public void setDuree(int duree) {
        if (duree > 0) {
            this.duree_formation = duree;
        } else {
            System.out.println(
                "La durée de la formation doit être supérieure à zéro."
            );
        }
    }

    public void setCout(int cout) {
        if (cout > 0) {
            this.cout_formation = cout;
        } else {
            System.out.println(
                "Le coût de la formation doit être supérieur à zéro."
            );
        }
    }

    public void setNbreCredits(int nbre_credits) {
        if (nbre_credits > 0) {
            this.nbre_credits = nbre_credits;
        } else {
            System.out.println(
                "Le nombre de crédits doit être supérieur à zéro."
            );
        }
    }

    // Méthode d'affichage
    public void afficherFormation() {
        System.out.println("Nom de la formation : " + nom_formation);
        System.out.println("Description : " + description_formation);
        System.out.println("Formateur : " + nom_formateur);
        System.out.println("Durée : " + duree_formation + " mois");
        System.out.println("Coût : " + cout_formation + " FCFA");
        System.out.println("Nombre de crédits : " + nbre_credits);
    }
}
