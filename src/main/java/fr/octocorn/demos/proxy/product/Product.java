package fr.octocorn.demos.proxy.product;

import java.util.List;

public class Product {
    private String nom;
    private String description;

    private String sku;

    private List<Offer> offres;

    public Product(
            String nom,
            String description,
            String sku,
            List<Offer> offres
    ) {
        this.nom = nom;
        this.description = description;
        this.sku = sku;
        this.offres = offres;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public List<Offer> getOffres() {
        return offres;
    }

    public void setOffres(List<Offer> offres) {
        this.offres = offres;
    }
}
