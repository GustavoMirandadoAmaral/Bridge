package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MobileTest {

    @Test
    void deveRetornarSalarioMobileDeCargoEstagiario(){
        Cargo cargo = new Estagiario();
        Mobile mobile = new Mobile(2000);
        mobile.setCargo(cargo);
        assertEquals(2000, mobile.calcularSalario());
    }

    @Test
    void deveRetornarSalarioMobileDeCargoJunior(){
        Cargo cargo = new Junior();
        Mobile mobile = new Mobile(2000);
        mobile.setCargo(cargo);
        assertEquals(2750, mobile.calcularSalario());
    }

    @Test
    void deveRetornarSalarioMobileDeCargoPleno(){
        Cargo cargo = new Pleno();
        Mobile mobile = new Mobile(2000);
        mobile.setCargo(cargo);
        assertEquals(4250, mobile.calcularSalario());
    }

    @Test
    void deveRetornarSalarioMobileDeCargoSenior(){
        Cargo cargo = new Senior();
        Mobile mobile = new Mobile(2000);
        mobile.setCargo(cargo);
        assertEquals(5000, mobile.calcularSalario());
    }
}