package org.example;

public class Mobile extends Setor{

    public Mobile(int salarioBase, ICargo iCargo){
        super(salarioBase, iCargo);
    }

    public double calcularSalario(){return this.salarioBase + (1.5 * this.ICargo.aumentoSalarial());}
}
