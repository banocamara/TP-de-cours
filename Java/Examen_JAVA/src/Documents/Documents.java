package Documents;

public class Documents {

	    // Attributs
	    private String titre;
	    private String auteur;
	    private int annee;

	    // Constructeur
	    public Documents(String titre, String auteur, int annee) {
	        this.titre = titre;
	        this.auteur = auteur;
	        this.annee = annee;
	    }

	    // Getters
	    public String getTitre() {
	        return titre;
	    }

	    public String getAuteur() {
	        return auteur;
	    }

	    public int getAnnee() {
	        return annee;
	    }

	    // Setters
	    public void setTitre(String titre) {
	        this.titre = titre;
	    }

	    public void setAuteur(String auteur) {
	        this.auteur = auteur;
	    }

	    public void setAnnee(int annee) {
	        this.annee = annee;
	    }

	    // Méthode afficherDetails()
	    public void afficherDetails() {
	        System.out.println("Titre : " + titre);
	        System.out.println("Auteur : " + auteur);
	        System.out.println("Année : " + annee);
	    }
	}

