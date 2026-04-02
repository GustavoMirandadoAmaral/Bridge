package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WebTest {

    @Test
    void deveRetornarSalarioWebDeCargoEstagiario(){
        Web web = new Web(1500);
        web.setCargo(Estagiario.getInstance());
        assertEquals(1500, web.calcularSalario());
    }

    @Test
    void deveRetornarSalarioWebDeCargoJunior(){
        Web web = new Web(1500);
        web.setCargo(Junior.getInstance());
        assertEquals(2000, web.calcularSalario());
    }

    @Test
    void deveRetornarSalarioWebDeCargoPleno(){
        Web web = new Web(1500);
        web.setCargo(Pleno.getInstance());
        assertEquals(3000, web.calcularSalario());
    }

    @Test
    void deveRetornarSalarioWebDeCargoSenior(){
        Web web = new Web(1500);
        web.setCargo(Senior.getInstance());
        assertEquals(3500, web.calcularSalario());
    }
}