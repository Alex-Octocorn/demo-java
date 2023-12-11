package fr.octocorn.demos.hashmap;

import java.util.HashMap;

public class Hashmap {
    public static void main(String[] args) {
        Eleve[] eleves = new Eleve[5];
        eleves[0] = new Eleve("Dupont", "Jean", "Java");
        eleves[1] = new Eleve("Dupont", "Jean", "Java");
        eleves[2] = new Eleve("Dupont", "Jean", "React");
        eleves[3] = new Eleve("Dupont", "Jean", "React");
        eleves[4] = new Eleve("Dupont", "Jean", "Angular");

        compteurSansHashmap(eleves);
        compteurAvecHashmap(eleves);

    }

    public static void compteurSansHashmap(Eleve[] eleves) {
        int elevesJava = 0;
        int elevesReact = 0;
        int elevesAngular = 0;

        for(Eleve eleve : eleves) {
            if (eleve.classe.equals("Java")) {
                elevesJava++;
            } else if (eleve.classe.equals("React")) {
                elevesReact++;
            } else if (eleve.classe.equals("Angular")) {
                elevesAngular++;
            }
        }
        System.out.println("Eleves Java : " + elevesJava);
        System.out.println("Eleves Angular : " + elevesAngular);
        System.out.println("Eleves React : " + elevesReact);
    }

    public static void compteurAvecHashmap(Eleve[] eleves) {
        HashMap<String, Integer> elevesParClasse = new HashMap<>();

        for (Eleve eleve: eleves) {
            if (elevesParClasse.containsKey(eleve.classe)) {
                elevesParClasse.put(eleve.classe, elevesParClasse.get(eleve.classe) + 1);
            } else {
                elevesParClasse.put(eleve.classe, 1);
            }

            // elevesParClasse.put(eleve.classe, elevesParClasse.getOrDefault(eleve.classe, 0) + 1);
        }

        System.out.println("Eleves Java : " + elevesParClasse.get("Java"));
        System.out.println("Eleves React : " + elevesParClasse.get("React"));
        System.out.println("Eleves Angular : " + elevesParClasse.get("Angular"));
    }
}
