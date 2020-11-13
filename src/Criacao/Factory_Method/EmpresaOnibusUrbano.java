package Criacao.Factory_Method;

import java.time.LocalDateTime;
import java.util.Calendar;

public class EmpresaOnibusUrbano extends Empresa{
    @Override
    public Passagem emitirPassagem(String origem, String destino, String dataHoraDaPartida) {
        return new PassagemOnibusUrbana(origem,destino,dataHoraDaPartida);
    }
}
