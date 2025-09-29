package br.edu.insper.desagil.pi.freela;

public class DataHorario extends Momento {
    private int hora;
    private int minuto;
    private Data data;

    public DataHorario(Data data) {
        this.hora = 0;
        this.minuto = 0;
        this.data = data;
    }

    public int getHora() {
        return hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void atualiza(int nhora, int nminuto){
        this.hora = ajusta(nhora,0,23);
        this.minuto= ajusta(nminuto,0,59);
    }

    @Override
    public int minuto() {
        return data.minuto() + hora*60 + minuto;
    }
}
