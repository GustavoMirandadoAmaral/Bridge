package org.example;

public class Web extends Setor{

    public Web(int salarioBase, ICargo iCargo){
        super(salarioBase, iCargo);
    }

    public double calcularSalario(){return this.salarioBase + this.ICargo.aumentoSalarial();}
}
