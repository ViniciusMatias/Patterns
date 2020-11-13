package Criacao.Factory_Method;

import java.util.Calendar;

public class EmpresaOnibusUrbano extends Empresa{
    @Override
    public Passagem emitirPassagem(String origem, String destino, Calendar dataHoraDaPartida) {
        return new PassagemOnibusUrbana(origem,destino,dataHoraDaPartida);
    }
}
