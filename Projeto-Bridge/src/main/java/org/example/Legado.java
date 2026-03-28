package org.example;

public class Legado extends Setor{

    private static Legado instance;
    private Legado(int salarioBase) { super(salarioBase);};
    public static Legado getInstance(int salarioBase){
        if (instance == null){
            instance = new Legado(salarioBase);
        }
        return instance;
    }

    public double calcularSalario(){return this.salarioBase + (0.5 * this.cargo.aumentoSalarial());}
}
