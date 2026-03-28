package org.example;

public abstract class Setor {

    protected Cargo cargo;

    protected int salarioBase;

    public Setor (int salarioBase) {this.salarioBase = salarioBase;}

    public void setCargo(Cargo cargo){this.cargo = cargo;}

    public void setSalarioBase(int salarioBase){this.salarioBase = salarioBase;}

    public abstract double calcularSalario();

}
