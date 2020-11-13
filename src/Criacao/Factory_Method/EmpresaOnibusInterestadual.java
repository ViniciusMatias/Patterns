package Criacao.Factory_Method;

import java.time.LocalDateTime;
import java.util.Calendar;

public class EmpresaOnibusInterestadual extends Empresa {

    @Override
    public Passagem emitirPassagem(String origem, String destino, String dataHoraDaPartida) {
        return new PassagemOnibusInterestadual(origem,destino,dataHoraDaPartida);
    }
}
