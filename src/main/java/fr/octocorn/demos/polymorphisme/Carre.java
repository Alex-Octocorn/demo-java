package fr.octocorn.demos.polymorphisme;

public class Carre implements Forme {
    private double cote;

    public Carre(double cote) {
        this.cote = cote;
    }


    @Override
    public double getAire() {
        return this.cote * this.cote;
    }
}
