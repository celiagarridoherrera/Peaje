package dev.celia.vehiculo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CamionTest {

    @Test
    public void testCamion2Ejes() {
        Camion camion = new Camion("1234GHI", 2);
        assertEquals(100.00, camion.calcularPeaje());
    }

    @Test
    public void testCamion3Ejes() {
        Camion camion = new Camion("1234GHI", 3);
        assertEquals(150.00, camion.calcularPeaje());
    }

}
