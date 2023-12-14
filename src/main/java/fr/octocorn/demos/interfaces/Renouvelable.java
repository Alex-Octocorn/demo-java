package fr.octocorn.demos.interfaces;

import java.time.LocalDate;

public interface Renouvelable {
    /**
     * Prolonge le contrat jusqu'à une date donnée.
     * @param nouvelleDateDeFin LocalDate - La nouvelle date de fin.
     */
    public void prolongerContrat(LocalDate nouvelleDateDeFin);
}
