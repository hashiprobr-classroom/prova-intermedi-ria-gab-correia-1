package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataTest {
    @Test
    void constroi() {
        Data d = new Data();
        assertEquals(1,d.getDia());
        assertEquals(1,d.getMes());
        assertEquals(1970,d.getAno());
        assertEquals(0,d.minuto());
    }
    @Test
    void dataBaixa() {
        Data d = new Data();
        d.atualiza(0,0,1970);
        assertEquals(1,d.getDia());
        assertEquals(1,d.getMes());
        assertEquals(1970,d.getAno());
        assertEquals(0,d.minuto());

    }
    @Test
    void dataAlta() {
        Data d = new Data();
        d.atualiza(32,13,2071);
        assertEquals(31,d.getDia());
        assertEquals(12,d.getMes());
        assertEquals(2070,d.getAno());
        assertEquals(53084160,d.minuto());
    }
}
