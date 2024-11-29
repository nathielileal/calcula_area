package com.lpoo.atividade01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AreaTest {

    public AreaTest() {
    }

    @Test
    public void testCalculaAreaRetanguloValoresPositivos() {
        assertEquals(20.0, Area.calculaAreaRetangulo(4, 5), 0.0001);
    }

    @Test
    public void testCalculaAreaRetanguloValoresNegativos() {
        assertEquals(20.0, Area.calculaAreaRetangulo(-4, 5), 0.0001);
    }

    @Test
    public void testCalculaAreaCircunferenciaRaioPositivo() {
        assertEquals(Math.PI * 9, Area.calculaAreaCircunferencia(3), 0.0001);
    }

    @Test
    public void testCalculaAreaCircunferenciaRaioNegativo() {
        assertEquals(Math.PI * 9, Area.calculaAreaCircunferencia(-3), 0.0001);
    }

    @Test
    public void testCalculaAreaTrianguloValoresPositivos() {
        assertEquals(10.0, Area.calculaAreaTriangulo(4, 5), 0.0001);
    }

    @Test
    public void testCalculaAreaTrianguloValoresNegativos() {
        assertEquals(10.0, Area.calculaAreaTriangulo(-4, 5), 0.0001);
    }

}
