package org.example;

public interface FabricaAbstrata {
    Setor createSetor(int salarioBase);
    ICargo createCargo();
}
