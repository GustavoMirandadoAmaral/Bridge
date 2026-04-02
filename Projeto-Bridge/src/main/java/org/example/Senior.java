package org.example;

public class Senior implements Cargo{

    private static Senior instance = new Senior();
    private Senior() {}
    public static Senior getInstance() {
        return instance;
    }
    public int aumentoSalarial() {
        return 2000;
    }
}
