package Criacao.Factory_Method;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract  class Passagem {

    private String origem;
    private String destino;
    private Calendar dataHoraDaPartida;

    protected SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public Passagem(String origem, String destino, Calendar dataHoraDaPartida) {
        this.origem = origem;
        this.destino = destino;
        this.dataHoraDaPartida = dataHoraDaPartida;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Calendar getDataHoraDaPartida() {
        return dataHoraDaPartida;
    }

    public void setDataHoraDaPartida(Calendar dataHoraDaPartida) {
        this.dataHoraDaPartida = dataHoraDaPartida;
    }
    public abstract  void detalhes();
}
