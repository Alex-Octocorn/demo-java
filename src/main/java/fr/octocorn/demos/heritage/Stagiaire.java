package fr.octocorn.demos.heritage;

import java.time.LocalDate;
import java.time.Period;

public class Stagiaire extends Collaborateur {

    private LocalDate debutStage;
    private LocalDate finStage;

    public Stagiaire(
            String nom,
            String prenom,
            LocalDate dateNaissance,
            LocalDate debutStage,
            LocalDate finStage
    ) {
        super(nom, prenom, dateNaissance);
        this.debutStage = debutStage;
        this.finStage = finStage;
    }

    public LocalDate getDebutStage() {
        return debutStage;
    }

    public void setDebutStage(LocalDate debutStage) {
        this.debutStage = debutStage;
    }

    public LocalDate getFinStage() {
        return finStage;
    }

    public void setFinStage(LocalDate finStage) {
        this.finStage = finStage;
    }

    /**
     * Indique ce que fait le stagiaire.
     */
    public void travailler() {
        System.out.println(this.prenom + "fait le café et les photocopies (gratuitement)");
    }

    /**
     * Mets fin prématurément au stage
     */
    public void licencier() {
        this.finStage = LocalDate.now();
        System.out.println( this.prenom +  " a mal fait le café");
    }

    public int getDureeStage() {
        return Period.between(this.debutStage, this.finStage).getDays();
    }
}
