package dev.vehiculo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class VehiculoTest {

    @Test
    void testnosepuedeinstanciarVehiculoSolo() {

        Coche coche = new Coche("1234ABC");
        assertEquals("1234ABC", coche.getPlaca());
        
    }

}
