package Criacao.Factory_Method;

import java.util.Calendar;

public abstract  class Empresa {

    public  abstract Passagem emitirPassagem(String origem, String destino, Calendar dataHoraDaPartida);
}
