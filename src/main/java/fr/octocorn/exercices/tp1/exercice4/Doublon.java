package fr.octocorn.exercices.tp1.exercice4;

import java.util.Arrays;
import java.util.HashMap;

public class Doublon {
    public static boolean bruteForce(int[] nombres) {
        // Méthode bourrine dont les ressources utilisées seront exponentielles en fonction du nombres d'éléments

        // On parcourt chaque élément du tableau...
        for (int mainIndex = 0; mainIndex < nombres.length; mainIndex++) {
            // ... avec chaque élément du tableau
            for (int comparaisonIndex = mainIndex + 1; comparaisonIndex < nombres.length; comparaisonIndex++) {
                if (nombres[mainIndex] == nombres[comparaisonIndex]) {
                    // Et on sort si on trouve un nombre égal.
                    return true;
                }
            }
        }

        return false;
    }


    public static  boolean trier(int[] nombres) {
        // Méthode "magique" pour trier un tableau
        Arrays.sort(nombres);

        // On peut ensuite le parcourir en partant du second élément
        for (int index = 1; index < nombres.length; index ++) {
            // Qu'on compare avec l'élément précédent
            if (nombres[index] == nombres[index -1]) {
                // Et on return true si on les 2 sont égaux.
                return true;
            }
        }
        return false;
    }

    public static boolean hashMap(int[] nombres) {
        // On déclare le hashmap
        HashMap<Integer, Integer> vues = new HashMap<>();

        // Puis, on parcourt le tableau de nombres
        // --> Ici c'est une syntaxe for-each, plus rapide à écrire,
        // et préférable car ici nous n'avons pas besoin de l'index
        for (int nombre : nombres) {
            // Si le nombres est déjà présent dans le tableau
            if (vues.containsKey(nombre) && vues.get(nombre) >= 1) {
                // On return true
                return true;
            }
            // Si non, on l'ajoute avec une valeur par défaut à 1.
            vues.put(nombre, vues.getOrDefault(nombre, 0) + 1);
        }

        return false;
    }

}
