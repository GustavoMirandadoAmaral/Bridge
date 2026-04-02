package org.example;

public class Junior implements Cargo {

    private static Junior instance = new Junior();
    private Junior() {}
    public static Junior getInstance() {
        return instance;
    }
    public int aumentoSalarial() {
        return 500;
    }
}

