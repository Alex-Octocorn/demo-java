package fr.octocorn.exercices.tp1.exercice1;

public class Moyenne {

    public static double getMoyenne(double[] notes) throws IllegalAccessException {

        verifierSiContientTroisNotes(notes);

        verifierSiNotesCorrectes(notes);

        return calculerMoyenne(notes);
    }

    /**
     * Calcule la moyenne en fonction des notes saisies
     * @param notes double - notes
     * @return double - la moyenne de l'élève
     */
    private static int calculerMoyenne(double[] notes) {
        int somme = 0;

        for (double note: notes) {
            somme += note;
        }

        return somme / notes.length;
    }

    /**
     * Vérifie si toutes les notes sont bien comprises entre 0 et 20
     * @param notes double : les notes
     * @throws IllegalAccessException : si les valeurs sont incorrectes
     */
    private static void verifierSiNotesCorrectes(double[] notes) throws IllegalArgumentException {
        for (double note: notes) {
            if (note < 0 || note > 20) {
                throw new IllegalArgumentException("Les notes doivent être comprises entre 0 et 20 !");
            }
        }
    }

    /**
     * Lève une exception si le nombre de notes est différent de trois.
     * @param notes double : Le carnet de notes de l'élève
     * @throws IllegalAccessException si n'a pas trois notes
     */
    private static void verifierSiContientTroisNotes(double[] notes) throws IllegalAccessException {
        if (notes.length != 3) {
            throw new IllegalAccessException("Il doit y avoir 3 notes !!");
        }
    }
}
