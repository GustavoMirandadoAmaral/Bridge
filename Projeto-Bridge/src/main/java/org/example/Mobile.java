package org.example;

public class Mobile extends Setor{

    public Mobile(int salarioBase){super(salarioBase);}

    public double calcularSalario(){return this.salarioBase + (1.5 * this.cargo.aumentoSalarial());}
}
