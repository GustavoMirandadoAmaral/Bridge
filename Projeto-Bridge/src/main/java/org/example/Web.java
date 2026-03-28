package org.example;

public class Web extends Setor{

    public Web(int salarioBase){super(salarioBase);}

    public double calcularSalario(){return this.salarioBase + this.cargo.aumentoSalarial();}
}
