package Criacao.Factory_Method;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Calendar;

public abstract  class Passagem {

    private String origem;
    private String destino;
    private String dataHoraDaPartida;



    public Passagem(String origem, String destino, String dataHoraDaPartida) {
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

    public String getDataHoraDaPartida() {
        return dataHoraDaPartida;
    }

    public void setDataHoraDaPartida(String dataHoraDaPartida) {
        this.dataHoraDaPartida = dataHoraDaPartida;
    }
    public abstract  void detalhes();
}
