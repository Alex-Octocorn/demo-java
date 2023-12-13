package fr.octocorn;


import fr.octocorn.exercices.tp2.Thermometre;

public class Main {
    public static void main(String[] args) {
        Thermometre thermometreDeCorrinne = new Thermometre();
        Thermometre autreThermometreDeCorrinne = new Thermometre(12);

        System.out.println("Le thermomètre de ces animaux d'anglais affiche : " + thermometreDeCorrinne.getFahrenheit());

        System.out.println("Le thermomètre des gens civilisés affiche : " + autreThermometreDeCorrinne.getCelsius());
    }
}
