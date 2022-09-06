package org.barrientos.junit5app.ejemplos.models;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class CuentaTest {

    @Test
    void testNombreCuenta() {
        Cuenta cuenta = new Cuenta("Ismael", new BigDecimal("1000.1231"));
//        cuenta.setPersona("Ismael");
        String esperado = "Ismael";
        String actual = cuenta.getPersona();
        assertEquals(esperado,actual);
        assertTrue(actual.endsWith("Ismael"));
    }
    
    @Test
    void testSaldoCuenta(){
        Cuenta cuenta = new Cuenta("Ismael", new BigDecimal("1000.12345"));
        assertEquals(1000.12345, cuenta.getSaldo().doubleValue());
        assertFalse(cuenta.getSaldo().compareTo(BigDecimal.ZERO) < 0);
    }

    @Test
    void testReferenciaCuenta() {
        Cuenta cuenta = new Cuenta("John Doe", new BigDecimal("8900.9997"));
        Cuenta cuenta2 = new Cuenta("John Doe", new BigDecimal("8900.9997"));
        //assertNotEquals(cuenta2, cuenta);
        assertEquals(cuenta2, cuenta);

    }
}