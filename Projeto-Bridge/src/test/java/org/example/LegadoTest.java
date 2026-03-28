package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LegadoTest {

    static Legado legado;

    @BeforeAll
    static void setUp(){ legado = Legado.getInstance(1000);}

    @Test
    void deveRetornarSalarioLegadoDeCargoEstagiario(){
        Cargo cargo = new Estagiario();
        legado.setCargo(cargo);
        assertEquals(1000, legado.calcularSalario());
    }

    @Test
    void deveRetornarSalarioLegadoDeCargoJunior(){
        Cargo cargo = new Junior();
        legado.setCargo(cargo);
        assertEquals(1250, legado.calcularSalario());
    }

    @Test
    void deveRetornarSalarioLegadoDeCargoPleno(){
        Cargo cargo = new Pleno();
        legado.setCargo(cargo);
        assertEquals(1750, legado.calcularSalario());
    }

    @Test
    void deveRetornarSalarioLegadoDeCargoSenior(){
        Cargo cargo = new Senior();
        legado.setCargo(cargo);
        assertEquals(2000, legado.calcularSalario());
    }
}