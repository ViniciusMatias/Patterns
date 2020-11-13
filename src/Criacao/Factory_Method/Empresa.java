package Criacao.Factory_Method;

import java.time.LocalDateTime;
import java.util.Calendar;

public abstract  class Empresa {

    public  abstract Passagem emitirPassagem(String origem, String destino, String dataHoraDaPartida);
}
