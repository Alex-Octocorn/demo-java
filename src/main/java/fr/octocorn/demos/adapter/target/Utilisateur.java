package fr.octocorn.demos.adapter.target;

public class Utilisateur {

    private int id;
    private String nom;
    private String prenom;

    private Entreprise entreprise;

    public Utilisateur(
            int id,
            String nom,
            String prenom,
            Entreprise entreprise
    ) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.entreprise = entreprise;
    }

    public Utilisateur() {
    }

    public Utilisateur getUtilisateur() {
        return this;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Entreprise getEntreprise() {
        return entreprise;
    }

    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }
}
