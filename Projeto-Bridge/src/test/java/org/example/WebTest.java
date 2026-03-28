package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebTest {

    @Test
    void deveRetornarSalarioWebDeCargoEstagiario(){
        Cargo cargo = new Estagiario();
        Web web = new Web(1500);
        web.setCargo(cargo);
        assertEquals(1500, web.calcularSalario());
    }

    @Test
    void deveRetornarSalarioWebDeCargoJunior(){
        Cargo cargo = new Junior();
        Web web = new Web(1500);
        web.setCargo(cargo);
        assertEquals(2000, web.calcularSalario());
    }

    @Test
    void deveRetornarSalarioWebDeCargoPleno(){
        Cargo cargo = new Pleno();
        Web web = new Web(1500);
        web.setCargo(cargo);
        assertEquals(3000, web.calcularSalario());
    }

    @Test
    void deveRetornarSalarioWebDeCargoSenior(){
        Cargo cargo = new Senior();
        Web web = new Web(1500);
        web.setCargo(cargo);
        assertEquals(3500, web.calcularSalario());
    }
}