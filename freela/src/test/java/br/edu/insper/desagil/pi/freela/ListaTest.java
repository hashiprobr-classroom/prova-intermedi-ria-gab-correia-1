package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListaTest {
    private Lista l;
    @BeforeEach
    void setUp() {
        l = new Lista();
    }

    @Test
    void constroi() {
        assertTrue(l.getTarefas().isEmpty());
    }
    @Test
    void adicionaIguais() {
        Tarefa t1 = mock(Tarefa.class);
        when(t1.getId()).thenReturn(1);
        Tarefa t2 = mock(Tarefa.class);
        when(t2.getId()).thenReturn(1);
        l.adiciona(t1);
        l.adiciona(t2);
        assertEquals(1,l.getTarefas().size());
    }
    @Test
    void adicionaDiferentes() {
        Tarefa t1 = mock(Tarefa.class);
        when(t1.getId()).thenReturn(1);
        Tarefa t2 = mock(Tarefa.class);
        when(t2.getId()).thenReturn(2);
        l.adiciona(t1);
        l.adiciona(t2);
        assertEquals(2,l.getTarefas().size());
    }
}
