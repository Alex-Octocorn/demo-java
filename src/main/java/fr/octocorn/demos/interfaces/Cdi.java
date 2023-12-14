package fr.octocorn.demos.interfaces;

public class Cdi extends Collaborateur implements Remunerable {

    private double tauxHoraire;

    @Override
    public void payer(double heures) {
        System.out.println("il a gagné : " + this.getTauxHoraire() * heures);
    }

    @Override
    public void payer() {
        System.out.println("il a gagné : " + this.getTauxHoraire() * this.NOMBRE_HEURES_MENSUELLES_NORMAL);
    }

    @Override
    public double getTauxHoraire() {
        return this.tauxHoraire;
    }

    public void setTauxHoraire(double nouveauTaux) {
        this.tauxHoraire = nouveauTaux;
    }

    @Override
    public double calculerRemunerationHeuresSupplementaires(double heuresTravaillees) {
        double salaire = 0;
        salaire += NOMBRE_HEURES_MENSUELLES_NORMAL * this.getTauxHoraire();
        salaire += (heuresTravaillees - NOMBRE_HEURES_MENSUELLES_NORMAL) * this.getTauxHoraire() * 1.5;

        return salaire;
    }
}
