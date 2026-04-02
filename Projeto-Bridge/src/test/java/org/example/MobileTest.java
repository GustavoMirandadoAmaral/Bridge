package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MobileTest {

    @Test
    void deveRetornarSalarioMobileDeCargoEstagiario(){
        Mobile mobile = new Mobile(2000);
        mobile.setCargo(Estagiario.getInstance());
        assertEquals(2000, mobile.calcularSalario());
    }

    @Test
    void deveRetornarSalarioMobileDeCargoJunior(){
        Mobile mobile = new Mobile(2000);
        mobile.setCargo(Junior.getInstance());
        assertEquals(2750, mobile.calcularSalario());
    }

    @Test
    void deveRetornarSalarioMobileDeCargoPleno(){
        Mobile mobile = new Mobile(2000);
        mobile.setCargo(Pleno.getInstance());
        assertEquals(4250, mobile.calcularSalario());
    }

    @Test
    void deveRetornarSalarioMobileDeCargoSenior(){
        Mobile mobile = new Mobile(2000);
        mobile.setCargo(Senior.getInstance());
        assertEquals(5000, mobile.calcularSalario());
    }
}