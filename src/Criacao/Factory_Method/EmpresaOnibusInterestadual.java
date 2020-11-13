package Criacao.Factory_Method;

import java.util.Calendar;

public class EmpresaOnibusInterestadual extends Empresa {

    @Override
    public Passagem emitirPassagem(String origem, String destino, Calendar dataHoraDaPartida) {
        return new PassagemOnibusInterestadual(origem,destino,dataHoraDaPartida);
    }
}
