package org.example;

public class FabricaSenior implements FabricaAbstrata {

    @Override
    public Setor createSetor(int SalarioBase) {return new Legado(SalarioBase, createCargo());}

    @Override
    public ICargo createCargo() {return new CargoSenior();}
}
