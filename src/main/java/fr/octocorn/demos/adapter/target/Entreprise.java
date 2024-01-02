package fr.octocorn.demos.adapter.target;

public class Entreprise {
    private String denomination;

    private String telephone;

    private Adresse adresse;

    public Entreprise(String denomination, String telephone, Adresse adresse) {
        this.denomination = denomination;
        this.telephone = telephone;
        this.adresse = adresse;
    }

    public String getDenomination() {
        return denomination;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }
}
