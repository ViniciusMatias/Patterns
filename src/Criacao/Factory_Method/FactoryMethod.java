package Criacao.Factory_Method;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class FactoryMethod {
    public static void main(String[] args) {
        Empresa empresaOnibusUrbano = new EmpresaOnibusUrbano();
        Passagem passagemUrbano = empresaOnibusUrbano.emitirPassagem("Guarabira", "Rio tinto", new GregorianCalendar(2020, Calendar.MARCH, 13,11,0));
        passagemUrbano.detalhes();
    }
}
