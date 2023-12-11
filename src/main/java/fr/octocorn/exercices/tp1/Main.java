package fr.octocorn.exercices.tp1;

import fr.octocorn.exercices.tp1.exercice1.Moyenne;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        double[] notes = {10, 10, 21};
        System.out.println(Moyenne.getMoyenne(notes));
    }
}
