package fr.octocorn.demos.polymorphisme;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        Carre michel = new Carre(2);
        TriangleRectangle robert = new TriangleRectangle(3, 5);
        Cercle cunegonde = new Cercle(5);

        List<Forme> mesSuperListeDeFormes = new ArrayList<>();
        mesSuperListeDeFormes.add(michel);
        mesSuperListeDeFormes.add(robert);
        mesSuperListeDeFormes.add(cunegonde);

        for (Forme forme : mesSuperListeDeFormes) {
            System.out.println("L'aire est de " + forme.getAire());
        }

    }
}
