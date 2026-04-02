package org.example;

public class Pleno implements Cargo {

    private static Pleno instance = new Pleno();
    private Pleno() {}
    public static Pleno getInstance() {
        return instance;
    }
    public int aumentoSalarial() {
        return 1500;
    }
}
