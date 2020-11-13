package Criacao.Factory_Method;

import java.time.LocalDateTime;
import java.util.Calendar;

public class PassagemOnibusUrbana extends Passagem {


    public PassagemOnibusUrbana(String origem, String destino, String dataHoraDaPartida) {
        super(origem, destino, dataHoraDaPartida);
    }

    @Override
    public void detalhes() {
        System.out.println("Passagem de Onibus Urbana: \n"+this.getOrigem() +" Para "+ this.getDestino()+ " ás "+this.getDataHoraDaPartida());

    }
}
