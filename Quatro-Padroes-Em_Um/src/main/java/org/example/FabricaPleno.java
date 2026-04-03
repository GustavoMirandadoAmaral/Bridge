package org.example;

public class FabricaPleno implements FabricaAbstrata {

    @Override
    public Setor createSetor(int SalarioBase) {return new Web(SalarioBase, createCargo());}

    @Override
    public ICargo createCargo() {return new CargoPleno();}
}
