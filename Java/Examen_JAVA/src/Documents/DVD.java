package Documents;
public class DVD extends Documents {

    // Attribut
    private int duree;

    // Constructeur
    public DVD(String titre, String auteur, int annee, int duree) {

        super(titre, auteur, annee);

        this.duree = duree;
    }

    // Getter
    public int getDuree() {
        return duree;
    }

    // Setter
    public void setDuree(int duree) {
        this.duree = duree;
    }

    // Redéfinition
    @Override
    public void afficherDetails() {

        super.afficherDetails();

        System.out.println("Durée : " + duree + " minutes");
    }
}