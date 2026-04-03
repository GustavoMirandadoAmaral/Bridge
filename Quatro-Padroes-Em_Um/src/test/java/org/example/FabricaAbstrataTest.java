package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FabricaAbstrataTest {

    @Test
    void deveRetornarOSalarioDeUmEstagiarioQueTrabalhaNoSetorWeb(){
        FabricaAbstrata fabricaAbstrata = new FabricaEstagiario();
        Setor setor = fabricaAbstrata.createSetor(1500);
        assertEquals(1500, setor.calcularSalario());
    }

    @Test
    void deveRetornarOSalarioDeUmJuniorQueTrabalhaNoSetorMobile(){
        FabricaAbstrata fabricaAbstrata = new FabricaJunior();
        Setor setor = fabricaAbstrata.createSetor(2000);
        assertEquals(2750, setor.calcularSalario());
    }

    @Test
    void deveRetornarOSalarioDeUmPlenoQueTrabalhaNoSetorWeb(){
        FabricaAbstrata fabricaAbstrata = new FabricaPleno();
        Setor setor = fabricaAbstrata.createSetor(1500);
        assertEquals(3000, setor.calcularSalario());
    }

    @Test
    void deveRetornarOSalarioDeUmSeniorQueTrabalhaNoSetorLegado(){
        FabricaAbstrata fabricaAbstrata = new FabricaSenior();
        Setor setor = fabricaAbstrata.createSetor(6000);
        assertEquals(7000, setor.calcularSalario());
    }
}