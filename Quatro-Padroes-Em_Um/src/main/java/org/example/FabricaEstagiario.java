package org.example;

public class FabricaEstagiario implements FabricaAbstrata{

    @Override
    public Setor createSetor(int SalarioBase) {return new Web(SalarioBase, createCargo());}

    @Override
    public ICargo createCargo() {return new CargoEstagiario();}
}
