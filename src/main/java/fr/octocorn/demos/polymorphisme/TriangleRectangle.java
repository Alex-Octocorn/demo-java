package fr.octocorn.demos.polymorphisme;

public class TriangleRectangle implements  Forme {
    private double longueur;
    private double largeur;

    public TriangleRectangle(double longueur, double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }


    @Override
    public double getAire() {
        return this.largeur * this.longueur / 2;
    }
}
