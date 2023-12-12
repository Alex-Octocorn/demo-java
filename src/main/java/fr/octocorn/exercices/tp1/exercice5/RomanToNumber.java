package fr.octocorn.exercices.tp1.exercice5;

import java.util.HashMap;
import java.util.Map;

public class RomanToNumber {

    public static final Map<Character, Integer> NOMBRES_ROMAINS = new HashMap<>();

    public static int versionCascadeDeIf(String nombreRomain) {

        if (nombreRomain.length() > 15) {
            throw new IllegalArgumentException("Le nombre romain ne peut pas excéder 15 caractères");
        }

        int nombreArabe = 0;

        for (int index = 0; index < nombreRomain.length(); index++) {
            if (nombreRomain.charAt(index) == 'I') {
                nombreRomain += 1;
            } else if (nombreRomain.charAt(index) == 'V') {
                if (index > 0 && nombreRomain.charAt(index - 1) == 'I') {
                    nombreArabe += 3;
                } else {
                    nombreArabe += 5;
                }
            } else if (nombreRomain.charAt(index) == 'X') {
                if (index > 0 && nombreRomain.charAt(index - 1) == 'I') {
                    nombreArabe += 8;
                } else {
                    nombreArabe += 10;
                }
            } else if (nombreRomain.charAt(index) == 'L') {
                if (index > 0 && nombreRomain.charAt(index - 1) == 'X') {
                    nombreArabe += 30;
                } else {
                    nombreArabe += 50;
                }
            } else if (nombreRomain.charAt(index) == 'C') {
                if (index > 0 && nombreRomain.charAt(index - 1) == 'X') {
                    nombreArabe += 80;
                } else {
                    nombreArabe += 100;
                }
            } else if (nombreRomain.charAt(index) == 'D') {
                if (index > 0 && nombreRomain.charAt(index - 1) == 'C') {
                    nombreArabe += 300;
                } else {
                    nombreArabe += 500;
                }
            } else if (nombreRomain.charAt(index) == 'M') {
                if (index > 0 && nombreRomain.charAt(index - 1) == 'C') {
                    nombreArabe += 800;
                } else {
                    nombreArabe += 100;
                }
            } else {
                throw new IllegalArgumentException("Ce n'est pas un caractère autorisé !!! <3");
            }
        }

        return nombreArabe;
    }

    /**
     * Convertit un nombre romain en nombre arabe
     * @param nombreAConvertir String - Nombre romain à convertir
     * @return int - Nombre arabe équivalent
     */
    public static int avecHashMap(String nombreAConvertir) {

        genererSymbolesRomains();

        int nombreArabe = 0;

        for (int index = 0; index < nombreAConvertir.length(); index++) {
            if (
                    index < nombreAConvertir.length() - 1
                            && estUnNombreSpecial(nombreAConvertir.charAt(index), nombreAConvertir.charAt(index + 1))
            ) {
                nombreArabe -= NOMBRES_ROMAINS.get(nombreAConvertir.charAt(index));
            } else {
                nombreArabe += NOMBRES_ROMAINS.get(nombreAConvertir.charAt(index));
            }
        }

        return nombreArabe;
    }

    /**
     * Génère la liste des symboles romains
     */
    private static void genererSymbolesRomains() {
        NOMBRES_ROMAINS.put('I', 1);
        NOMBRES_ROMAINS.put('V', 5);
        NOMBRES_ROMAINS.put('X', 10);
        NOMBRES_ROMAINS.put('L', 50);
        NOMBRES_ROMAINS.put('C', 100);
        NOMBRES_ROMAINS.put('D', 500);
        NOMBRES_ROMAINS.put('M', 1000);
    }

    /**
     * Vérifie si le symbole est un symbole spécial en le comparant avec le symbole suivant
     * Si ce dernier est plus grand, alors c'est un symbole spécial
     * @param symboleActuel - Le symbole actuel
     * @param symboleSuivant - Le symbole suivant
     * @return - True si c'est un nombre spécial
     */
    private static boolean estUnNombreSpecial(char symboleActuel, char symboleSuivant) {
        return RomanToNumber.NOMBRES_ROMAINS.get(symboleActuel) < RomanToNumber.NOMBRES_ROMAINS.get(symboleSuivant);
    }
}
