package fr.octocorn.demos.heritage;

import fr.octocorn.demos.encapsulation.Personne;

import java.time.LocalDate;
import java.time.Period;

public class Stagiaire extends Collaborateur {

    public Stagiaire(
            String nom,
            String prenom,
            LocalDate dateNaissance,
            LocalDate debutContrat,
            LocalDate finContrat
    ) {
        super(
                nom,
                prenom,
                dateNaissance,
                debutContrat,
                finContrat
        );
    }

    /**
     * Indique ce que fait le stagiaire.
     */
    public void travailler() {
        System.out.println(this.prenom + "fait le café et les photocopies (gratuitement)");
    }

    public int getDureeStage() {
        return Period.between(this.debutContrat, this.finContrat).getDays();
    }

    @Override
    public void danser(String danse) {
        System.out.println("Non mais il danse ?! Il eut être licencié ?");
    }
}
