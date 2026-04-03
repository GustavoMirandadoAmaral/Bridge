package org.example;

public abstract class Setor {

    protected ICargo ICargo;

    protected int salarioBase;

    public Setor (int salarioBase, ICargo iCargo) {
        this.salarioBase = salarioBase;
        this.ICargo = iCargo;
    }

    public void setCargo(ICargo ICargo){this.ICargo = ICargo;}

    public void setSalarioBase(int salarioBase){this.salarioBase = salarioBase;}

    public abstract double calcularSalario();

}
