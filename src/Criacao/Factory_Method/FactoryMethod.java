package Criacao.Factory_Method;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class FactoryMethod {
    public static void main(String[] args) {
        String dataDeAgora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("d/M/y h:mm:s"));

        Empresa empresaOnibusUrbano = new EmpresaOnibusUrbano();
        Passagem passagemUrbano = empresaOnibusUrbano.emitirPassagem("Guarabira", "Rio tinto",dataDeAgora );
        passagemUrbano.detalhes();

        Empresa empresaInterestadual = new EmpresaOnibusInterestadual();
        Passagem passagemInterestadual = empresaInterestadual.emitirPassagem("Guarabira", "Recife",dataDeAgora );
        passagemInterestadual.detalhes();

    }
}
