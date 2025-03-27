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

    @Test
    public void testCamion4Ejes() {
        Camion camion = new Camion("1234JKL", 4);
        assertEquals(200.00, camion.calcularPeaje());
    }

    @Test
    public void testCamion5Ejes() {
        Camion camion = new Camion("1234JUL", 5);
        assertEquals(250.00, camion.calcularPeaje());
    }

    @Test
    void testCamionGuardaPlaca() {   
            Camion camion = new Moto("1234DEW");
            assertEquals("1234DEW", camion.getPlaca());
        }
}
