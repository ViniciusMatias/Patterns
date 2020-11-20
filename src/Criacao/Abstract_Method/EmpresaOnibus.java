package Criacao.Abstract_Method;

public abstract class EmpresaOnibus {
    public  abstract PassagemOnibusUrbana emitirPassagemOnibusUrbano(String origem, String destino, String dataHora);
    public  abstract PassagemOnibusInterestadual emitirPassagemOnibusInterestadual(String origem, String destino, String dataHora);
}
