package dev.celia.vehiculo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CocheTest {

    @Test
    void testCochePaga100() {

        Coche coche = new Coche("1234ABC");
        
        double peaje = coche.calcularPeaje();
        assertEquals(100, peaje);
        
    }

    @Test
    void testCocheGuardaPlaca() {   
            Coche coche = new Coche("1234ABC");
            assertEquals("1234ABC", coche.getPlaca());
        }
}
