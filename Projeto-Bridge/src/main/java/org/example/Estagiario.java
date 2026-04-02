package org.example;

public class Estagiario implements Cargo{

    private static Estagiario instance = new Estagiario();
    private Estagiario() {}
    public static Estagiario getInstance() {
        return instance;
    }
    public int aumentoSalarial() {
        return 0;
    }
}
