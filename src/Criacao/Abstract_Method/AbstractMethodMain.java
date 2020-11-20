package Criacao.Abstract_Method;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AbstractMethodMain {
    public static void main(String[] args) {
        String dataDeAgora = LocalDateTime.now().format(DateTimeFormatter.ofPattern("d/M/y h:mm:s"));

        EmpresaOnibus viacao = new ConcreteEmpresaOnibus();
        PassagemOnibusUrbana passagemOnibusUrbana = viacao.emitirPassagemOnibusUrbano("Guarabira","Pilõezinhos", dataDeAgora);
        passagemOnibusUrbana.detalhes();


        PassagemOnibusInterestadual passagemOnibusInterestadual = viacao.emitirPassagemOnibusInterestadual("Guarabira","Rio Tinto", dataDeAgora);
        passagemOnibusInterestadual.detalhes();
    }
}
