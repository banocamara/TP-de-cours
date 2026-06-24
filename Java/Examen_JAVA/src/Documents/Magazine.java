package Documents;

public class Magazine extends Documents {

    // Attribut
    private int numero;

    // Constructeur
    public Magazine(String titre, String auteur, int annee, int numero) {

        super(titre, auteur, annee);

        this.numero = numero;
    }

    // Getter
    public int getNumero() {
        return numero;
    }

    // Setter
    public void setNumero(int numero) {
        this.numero = numero;
    }

    // Redéfinition
    @Override
    public void afficherDetails() {

        super.afficherDetails();

        System.out.println("Numéro : " + numero);
    }
}