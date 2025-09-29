package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TarefaTest {

    @Test
    void constroi() {
        Tarefa t = new Tarefa(1);
        assertEquals(1,t.getId());
        assertEquals("", t.getDescricao());
        assertNull(t.getInicio());
        assertNull(t.getFim());
    }

    @Test
    void mudaDescricao() {
        Tarefa t = new Tarefa(2);
        t.setDescricao("bla");
        assertEquals("bla", t.getDescricao());
    }

    @Test
    void momentosValidos() {
    }

    @Test
    void momentosInvalidos() {
        Tarefa t = new Tarefa(3);
        Momento m1 = mock(Momento.class);
        when(m1.minuto()).thenReturn(10);
        Momento m2 = mock(Momento.class);
        when(m2.minuto()).thenReturn(20);
        IllegalArgumentException e = assertThrows(IllegalArgumentException.class,()->{
            t.atualiza(m2,m1);
        });
        assertEquals("INICIO>FIM",e.getMessage());
    }
}
