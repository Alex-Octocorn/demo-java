package fr.octocorn.demos.adapter.adapter;

import fr.octocorn.demos.adapter.adaptee.LegacyUser;
import fr.octocorn.demos.adapter.target.Adresse;
import fr.octocorn.demos.adapter.target.Entreprise;
import fr.octocorn.demos.adapter.target.Utilisateur;

public class LegacyUserAdapter extends Utilisateur {

    private LegacyUser legacyUser;

    public LegacyUserAdapter(LegacyUser legacyUser) {
        this.legacyUser = legacyUser;
    }

    @Override
    public Utilisateur getUtilisateur() {
        this.setId(legacyUser.getId());
        this.setNom(legacyUser.getLastName());
        this.setPrenom(legacyUser.getFirstName());
        this.setEntreprise(
                new Entreprise(
                        legacyUser.getEntreprise(),
                        legacyUser.getPhone(),
                        new Adresse(
                                legacyUser.getStreet(),
                                legacyUser.getZipCode(),
                                legacyUser.getCity(),
                                legacyUser.getCountry()
                        )
                )
        );
        return this;
    }
}
