package br.edu.insper.desagil.pi.freela;

import java.util.HashMap;
import java.util.Map;

public class Data extends Momento{
    private int ano;
    private int mes;
    private int dia;
    private Map<Integer, Integer> limite;

    public Data() {
        this.ano = 1970;
        this.mes = 1;
        this.dia = 1;
        Map<Integer, Integer> limite = new HashMap<>();
        limite.put(1, 31);
        limite.put(2, 28);
        limite.put(3, 31);
        limite.put(4, 30);
        limite.put(5, 31);
        limite.put(6, 30);
        limite.put(7, 31);
        limite.put(8, 31);
        limite.put(9, 30);
        limite.put(10, 31);
        limite.put(11, 30);
        limite.put(12, 31);
        this.limite = limite;
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void atualiza(int hora, int minuto){
        if (hora < 0 | hora >23){
            ajusta(hora,0,23);
        }
        if (minuto<0| minuto>59){
            ajusta(minuto,0,59);
        }
    }

    @Override
    public int minuto() {
        int dias=0;
        int x=0;
        int a = (ano - 1970)*365*24*60;
        for (int m: limite.keySet()) {
            if (mes < m){
                dias += limite.get(m);
            }
            if (mes == m){
                x = limite.get(m) - dia;
            }
        }
        return a + dias*24*60 + x*24*60  ;
    }
}
