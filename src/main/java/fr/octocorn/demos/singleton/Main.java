package fr.octocorn.demos.singleton;

public class Main {
    public static void main(String[] args) {
        new Thread(() -> {
            Singleton singleton1 = Singleton.getInstance("Hello World ! Thread 1");
            System.out.println(singleton1.message);
        }).start();

        new Thread(() -> {
            Singleton singleton2 = Singleton.getInstance("Bonjour <3 ! Thread 2");
            System.out.println(singleton2.message);
        }).start();

    }
}
