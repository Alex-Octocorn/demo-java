package fr.octocorn.demos.singleton;

public class Singleton {
    private static Singleton instance;
    public String message;

    private Singleton(String message) {
        try {
            Thread.sleep(20000);
        } catch (InterruptedException ignored) {

        }
        this.message = message;
    }

    public static Singleton getInstance(String message) {
        if (instance == null) {
            instance = new Singleton(message);
        }

        return instance;
    }
}
