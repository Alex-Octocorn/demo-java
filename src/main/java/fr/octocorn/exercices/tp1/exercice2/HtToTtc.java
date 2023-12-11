package fr.octocorn.exercices.tp1.exercice2;

public class HtToTtc {

    /**
     * Taux de TVA à 20%
     */
    public static final double TVA_RATE = 1.20;

    /**
     * Calcule la TVA et l'ajoute au prix donné.
     * @param prixHt double - Prix
     * @return le prix + TVA
     */
    public static double calculerTaxes(int  prixHt) {
        verifierSiPrixPositif(prixHt);

        return ajouterTvaAuPrix(prixHt);
    }

    /**
     * Ajoute 20% à la valeur passée.
     * @param prixHt : double - prix à augmenter
     * @return double - prix + 20%.
     */
    private static double ajouterTvaAuPrix(int prixHt) {
        return prixHt * TVA_RATE;
    }

    /**
     * Vérifie si le prix est bien supérieur à 0.
     * @param prixHt double : Prix à vérifier
     */
    private static void verifierSiPrixPositif(int prixHt) {
        if (prixHt < 0) {
            throw new IllegalArgumentException("Le prix doit être positif");
        }
    }
}
