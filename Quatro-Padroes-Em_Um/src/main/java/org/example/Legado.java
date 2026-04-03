package org.example;

public class Legado extends Setor{

    public Legado(int salarioBase, ICargo iCargo){
        super(salarioBase, iCargo);
    }

    public double calcularSalario(){return this.salarioBase + (0.5 * this.ICargo.aumentoSalarial());}
}
