package org.example;

public class FabricaJunior implements FabricaAbstrata{

    @Override
    public Setor createSetor(int SalarioBase) {return new Mobile(SalarioBase, createCargo());}

    @Override
    public ICargo createCargo() {return new CargoJunior();}
}
