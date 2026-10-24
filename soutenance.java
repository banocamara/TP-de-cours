import java.time.LocalDate;
import java.time.LocalTime;

public class soutenance {

    private int id;
    private LocalDate date_soutenance;
    private LocalTime heure_soutenance;
    private String salle;
    private String president_jury;
    private String encadreur;
    private double note;

    // Constructeur
    public soutenance(int id,
                      LocalDate date_soutenance,
                      LocalTime heure_soutenance,
                      String salle,
                      String president_jury,
                      String encadreur,
                      double note) {

        this.id = id;
        this.date_soutenance = date_soutenance;
        this.heure_soutenance = heure_soutenance;
        this.salle = salle;
        this.president_jury = president_jury;
        this.encadreur = encadreur;
        this.note = note;
    }

    // Getters
    public int getId() {
        return id;
    }

    public LocalDate getDateSoutenance() {
        return date_soutenance;
    }

    public LocalTime getHeureSoutenance() {
        return heure_soutenance;
    }

    public String getSalle() {
        return salle;
    }

    public String getPresidentJury() {
        return president_jury;
    }

    public String getEncadreur() {
        return encadreur;
    }

    public double getNote() {
        return note;
    }

    // Méthode d'affichage
    public void afficherSoutenance() {
        System.out.println("ID de la soutenance : " + id);
        System.out.println("Date : " + date_soutenance);
        System.out.println("Heure : " + heure_soutenance);
        System.out.println("Salle : " + salle);
        System.out.println("Président du jury : " + president_jury);
        System.out.println("Encadreur : " + encadreur);
        System.out.println("Note obtenue : " + note + "/20");
    }
}
