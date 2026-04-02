package org.example;

public class Legado extends Setor{

    public Legado(int salarioBase){super(salarioBase);}

    public double calcularSalario(){return this.salarioBase + (0.5 * this.cargo.aumentoSalarial());}
}
