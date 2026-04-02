package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LegadoTest {


    @Test
    void deveRetornarSalarioLegadoDeCargoEstagiario(){
        Legado legado = new Legado(1000);
        legado.setCargo(Estagiario.getInstance());
        assertEquals(1000, legado.calcularSalario());
    }

    @Test
    void deveRetornarSalarioLegadoDeCargoJunior(){
        Legado legado = new Legado(1000);
        legado.setCargo(Junior.getInstance());
        assertEquals(1250, legado.calcularSalario());
    }

    @Test
    void deveRetornarSalarioLegadoDeCargoPleno(){
        Legado legado = new Legado(1000);
        legado.setCargo(Pleno.getInstance());
        assertEquals(1750, legado.calcularSalario());
    }

    @Test
    void deveRetornarSalarioLegadoDeCargoSenior(){
        Legado legado = new Legado(1000);
        legado.setCargo(Pleno.getInstance());
        assertEquals(1750, legado.calcularSalario());
    }
}