package Documents;

	public class Livre extends Documents{

	    // Attribut
	    private int nombrePages;

	    // Constructeur
	    public Livre(String titre, String auteur, int annee, int nombrePages) {

	        // Appel du constructeur de Document
	        super(titre, auteur, annee);

	        this.nombrePages = nombrePages;
	    }

	    // Getter
	    public int getNombrePages() {
	        return nombrePages;
	    }

	    // Setter
	    public void setNombrePages(int nombrePages) {
	        this.nombrePages = nombrePages;
	    }

	    // Redéfinition de afficherDetails()
	    @Override
	    public void afficherDetails() {

	        super.afficherDetails();

	        System.out.println("Nombre de pages : " + nombrePages);
	    }
	}

