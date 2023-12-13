package fr.octocorn.demos.heritage;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Salarie michel = new Salarie(
                "Quezak",
                "Michel",
                LocalDate.of(1980, 12, 31),
                30,
                LocalDate.now()
        );


        System.out.println(michel);
    }
}
