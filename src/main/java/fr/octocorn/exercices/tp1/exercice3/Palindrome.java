package fr.octocorn.exercices.tp1.exercice3;

public class Palindrome {

    /**
     * Vérifie si le nombre est un palindrome ou non.
     * @param nombre long - Nombre à vérifier
     * @return Boolean - True si oui, False si non.
     */
    public static boolean estUnPalindrome(long nombre) {

        verifierSiNombreEstDeDeuxChiffres(nombre);

        long renverse = renverserNombre(nombre);

        return nombre == renverse;
    }

    /**
     * Renverse le nombre donné.
     * Ex : 123 est renversé en 321
     * @param nombre long : nombre à renverser
     * @return long - le nombre renversé
     */
    private static long renverserNombre(long nombre) {
        long nombreRenverse = 0;
        long decompte = nombre; // Ce qu'il reste à renverser.

        while (decompte != 0) {
            long reste = decompte % 10;

            nombreRenverse = nombreRenverse * 10 + reste;

            decompte /= 10;
        }
        return nombreRenverse;
    }

    /**
     * Lève une exception si le nombre fait moins de deux chiffres.
     * @param nombre long - le nombre à vérifier.
     */
    private static void verifierSiNombreEstDeDeuxChiffres(long nombre) {
        if (nombre < 9) {
            throw new IllegalArgumentException("Le nombre doit contenir au moins deux chiffres");
        }
    }
}
