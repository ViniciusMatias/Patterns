package Criacao.Factory_Method;

import java.time.LocalDateTime;
import java.util.Calendar;

public class PassagemOnibusInterestadual  extends  Passagem{
    public PassagemOnibusInterestadual(String origem, String destino, String dataHoraDaPartida) {
        super(origem, destino, dataHoraDaPartida);
    }


    @Override
    public void detalhes() {
        System.out.println("Passagem de Onibus Interestadual: \n "+this.getOrigem() +" até "+ this.getDestino()+" ás "+this.getDataHoraDaPartida());

    }
}
